package com.compilador;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Visitor que construye un AST a partir del parse tree de ANTLR.
 */
public class ASTBuilder extends MiniLenguajeBaseVisitor<NodoAST> {

    private int linea(ParserRuleContext ctx) {
        return ctx.getStart().getLine();
    }

    private int columna(ParserRuleContext ctx) {
        return ctx.getStart().getCharPositionInLine();
    }

    // ===== programa =====

    @Override
    public NodoAST visitPrograma(MiniLenguajeParser.ProgramaContext ctx) {
        List<NodoAST> nodos = new ArrayList<>();

        // Recorremos todos los hijos y visitamos solo instrucciones y funciones
        for (ParseTree hijo : ctx.children) {
            if (hijo instanceof MiniLenguajeParser.InstruccionContext
                    || hijo instanceof MiniLenguajeParser.FuncionContext) {
                NodoAST n = (NodoAST) visit(hijo);
                if (n != null) {
                    nodos.add(n);
                }
            }
        }

        return new ProgramaNodo(linea(ctx), columna(ctx), nodos);
    }

    // ===== función =====

    @Override
    public NodoAST visitFuncion(MiniLenguajeParser.FuncionContext ctx) {
        String tipoRetorno = ctx.TIPO().getText();
        String nombre = ctx.ID().getText();

        List<ParametroNodo> parametros = new ArrayList<>();
        if (ctx.parametros() != null) {
            for (MiniLenguajeParser.ParamContext pctx : ctx.parametros().param()) {
                String tipo = pctx.TIPO().getText();
                String nom = pctx.ID().getText();
                parametros.add(new ParametroNodo(linea(pctx), columna(pctx), tipo, nom));
            }
        }

        List<NodoAST> cuerpo = new ArrayList<>();
        MiniLenguajeParser.BloqueContext bctx = ctx.bloque();
        if (bctx != null && bctx.instructions() != null) {
            MiniLenguajeParser.InstructionsContext insts = bctx.instructions();
            for (MiniLenguajeParser.InstruccionContext ictx : insts.instruccion()) {
                NodoAST n = (NodoAST) visit(ictx);
                if (n != null) {
                    cuerpo.add(n);
                }
            }
        }

        return new FuncionNodo(linea(ctx), columna(ctx), tipoRetorno, nombre, parametros, cuerpo);
    }

    // ===== instrucciones (alternativas etiquetadas) =====

    @Override
    public NodoAST visitInstrDeclaracion(MiniLenguajeParser.InstrDeclaracionContext ctx) {
        // instruccion : declaracion #InstrDeclaracion
        return visitDeclaracion(ctx.declaracion());
    }

    @Override
    public NodoAST visitInstrAsignacion(MiniLenguajeParser.InstrAsignacionContext ctx) {
        // instruccion : asignacion ';' #InstrAsignacion
        return visitAsignacion(ctx.asignacion());
    }

    @Override
    public NodoAST visitInstrReturn(MiniLenguajeParser.InstrReturnContext ctx) {
        // 'return' expresion? ';' #InstrReturn
        ExpresionNodo expr = null;
        MiniLenguajeParser.ExpresionContext ectx = ctx.expresion(); // puede ser null

        if (ectx != null) {
            expr = construirExpresion(ectx);
        }

        return new ReturnNodo(linea(ctx), columna(ctx), expr);
    }

    @Override
    public NodoAST visitInstrIf(MiniLenguajeParser.InstrIfContext ctx) {
        int linea = ctx.start.getLine();
        int columna = ctx.start.getCharPositionInLine();

        // 1) Construimos la expresión condicional
        ExpresionNodo condicion = construirExpresion(ctx.expresion());

        // 2) Construimos el bloque THEN
        List<NodoAST> thenStmts = new ArrayList<>();
        for (MiniLenguajeParser.InstruccionContext insCtx
                : ctx.bloque(0).instructions().instruccion()) {
            thenStmts.add(visit(insCtx));
        }

        // 3) Construimos (si existe) el bloque ELSE
        List<NodoAST> elseStmts = null;
        if (ctx.bloque().size() > 1) { // hay 'else'
            elseStmts = new ArrayList<>();
            for (MiniLenguajeParser.InstruccionContext insCtx
                    : ctx.bloque(1).instructions().instruccion()) {
                elseStmts.add(visit(insCtx));
            }
        }

        return new IfNodo(linea, columna, condicion, thenStmts, elseStmts);
    }

    @Override
    public NodoAST visitInstrWhile(MiniLenguajeParser.InstrWhileContext ctx) {
        int linea = ctx.start.getLine();
        int columna = ctx.start.getCharPositionInLine();

        ExpresionNodo condicion = construirExpresion(ctx.expresion());

        List<NodoAST> cuerpo = new ArrayList<>();
        for (MiniLenguajeParser.InstruccionContext insCtx
                : ctx.bloque().instructions().instruccion()) {
            cuerpo.add(visit(insCtx));
        }

        return new WhileNodo(linea, columna, condicion, cuerpo);
    }

    // ===== declaración =====

    @Override
    public NodoAST visitDeclaracion(MiniLenguajeParser.DeclaracionContext ctx) {
        String tipo = ctx.TIPO().getText();

        // La regla permite varias variables en una misma línea (int a, b, c;)
        // Por ahora tomamos solo la primera para simplificar
        String nombre = ctx.ID(0).getText();

        return new DeclaracionVariableNodo(linea(ctx), columna(ctx), tipo, nombre);
    }

    // ===== asignación =====

    @Override
    public NodoAST visitAsignacion(MiniLenguajeParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();

        // Hay al menos una expresión (la del lado derecho)
        ExpresionNodo expr = null;
        if (!ctx.expresion().isEmpty()) {
            expr = construirExpresion(ctx.expresion(0));
        }

        return new AsignacionNodo(linea(ctx), columna(ctx), nombre, expr);
    }

    // ===== expresiones =====

    /**
     * Construye un árbol de ExpresionNodo a partir de un ExpresionContext.
     */
    private ExpresionNodo construirExpresion(MiniLenguajeParser.ExpresionContext ctx) {
        return construirExpresionRec(ctx);
    }

    private ExpresionNodo construirExpresionRec(ParserRuleContext ctx) {
        if (ctx instanceof MiniLenguajeParser.ExpresionContext) {
            MiniLenguajeParser.ExpresionContext ectx = (MiniLenguajeParser.ExpresionContext) ctx;

            // Caso: un solo hijo
            if (ectx.getChildCount() == 1) {
                ParseTree unico = ectx.getChild(0);
                if (unico instanceof ParserRuleContext) {
                    return construirExpresionRec((ParserRuleContext) unico);
                } else {
                    String texto = unico.getText();
                    return new ExpresionNodo(linea(ectx), columna(ectx), texto);
                }
            }

            // Caso: expr op expr
            if (ectx.getChildCount() == 3) {
                ParserRuleContext izqCtx = (ParserRuleContext) ectx.getChild(0);
                ParseTree opNode = ectx.getChild(1);
                ParserRuleContext derCtx = (ParserRuleContext) ectx.getChild(2);

                String op = opNode.getText();
                ExpresionNodo nodo = new ExpresionNodo(linea(ectx), columna(ectx), op);
                nodo.agregarHijo(construirExpresionRec(izqCtx));
                nodo.agregarHijo(construirExpresionRec(derCtx));
                return nodo;
            }
        }

        // Fallback genérico: nodo hoja con el texto completo
        return new ExpresionNodo(linea(ctx), columna(ctx), ctx.getText());
    }
}
