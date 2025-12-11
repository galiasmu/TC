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
            for (MiniLenguajeParser.InstruccionContext ictx : bctx.instructions().instruccion()) {
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
        return visitDeclaracion(ctx.declaracion());
    }

    @Override
    public NodoAST visitInstrAsignacion(MiniLenguajeParser.InstrAsignacionContext ctx) {
        return visitAsignacion(ctx.asignacion());
    }

    @Override
    public NodoAST visitInstrReturn(MiniLenguajeParser.InstrReturnContext ctx) {
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

        ExpresionNodo condicion = construirExpresion(ctx.expresion());

        // THEN
        List<NodoAST> thenStmts = new ArrayList<>();
        MiniLenguajeParser.BloqueContext thenBloque = ctx.bloque(0);
        if (thenBloque.instructions() != null) {
            for (MiniLenguajeParser.InstruccionContext insCtx
                    : thenBloque.instructions().instruccion()) {
                thenStmts.add(visit(insCtx));
            }
        }

        // ELSE (opcional)
        List<NodoAST> elseStmts = null;
        if (ctx.bloque().size() > 1) {
            elseStmts = new ArrayList<>();
            MiniLenguajeParser.BloqueContext elseBloque = ctx.bloque(1);
            if (elseBloque.instructions() != null) {
                for (MiniLenguajeParser.InstruccionContext insCtx
                        : elseBloque.instructions().instruccion()) {
                    elseStmts.add(visit(insCtx));
                }
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
        MiniLenguajeParser.BloqueContext bctx = ctx.bloque();
        if (bctx.instructions() != null) {
            for (MiniLenguajeParser.InstruccionContext insCtx
                    : bctx.instructions().instruccion()) {
                cuerpo.add(visit(insCtx));
            }
        }

        return new WhileNodo(linea, columna, condicion, cuerpo);
    }

    // ===== declaración =====

    @Override
    public NodoAST visitDeclaracion(MiniLenguajeParser.DeclaracionContext ctx) {
    String tipo = ctx.TIPO().getText();
    String nombre = ctx.ID().getText();

    // ¿Es array?  TIPO ID [ NUMERO ] ...
    if (ctx.COR_IZQ() != null && ctx.COR_DER() != null && ctx.NUMERO() != null) {
        int tamanio = Integer.parseInt(ctx.NUMERO().getText());
        return new DeclaracionArrayNodo(linea(ctx), columna(ctx), tipo, nombre, tamanio);
    }

    // Variable simple, con o sin inicialización
    ExpresionNodo init = null;
    if (ctx.ASIGN() != null && ctx.expresion() != null) {
        init = construirExpresion(ctx.expresion());
    }

    return new DeclaracionVariableNodo(linea(ctx), columna(ctx), tipo, nombre, init);
}


    // ===== asignación =====

    @Override
    public NodoAST visitAsignacion(MiniLenguajeParser.AsignacionContext ctx) {
        MiniLenguajeParser.LvalueContext lctx = ctx.lvalue();
        ExpresionNodo rhs = construirExpresion(ctx.expresion());

        // ¿Es acceso a array? ID '[' expresion ']'
        if (lctx.COR_IZQ() != null) {
            String nombreArray = lctx.ID().getText();
            ExpresionNodo indice = construirExpresion(lctx.expresion());
            return new AsignacionArrayNodo(linea(ctx), columna(ctx), nombreArray, indice, rhs);
        }

        // Asignación simple a variable
        String nombre = lctx.ID().getText();
        return new AsignacionNodo(linea(ctx), columna(ctx), nombre, rhs);
    }

    // ===== expresiones =====

    private ExpresionNodo construirExpresion(MiniLenguajeParser.ExpresionContext ctx) {
        return construirExpresionRec(ctx);
    }

    private ExpresionNodo construirExpresionRec(ParserRuleContext ctx) {

        if (ctx == null) {
        return new ExpresionNodo(0, 0, "<error-expr>");
    }


        // --- 1) ATOMO (ID, ID[exp], literales, true/false) ---
        if (ctx instanceof MiniLenguajeParser.AtomoContext) {
            MiniLenguajeParser.AtomoContext actx = (MiniLenguajeParser.AtomoContext) ctx;

            // ID[exp] → AccesoArrayNodo
            if (actx.ID() != null && actx.COR_IZQ() != null) {
                String nombreArray = actx.ID().getText();
                ExpresionNodo indice = construirExpresionRec((ParserRuleContext) actx.expresion());
                return new AccesoArrayNodo(linea(actx), columna(actx), nombreArray, indice);
            }

            // ID simple
            if (actx.ID() != null) {
                return new ExpresionNodo(linea(actx), columna(actx), actx.ID().getText());
            }

            if (actx.NUMERO() != null) {
                return new ExpresionNodo(linea(actx), columna(actx), actx.NUMERO().getText());
            }

            if (actx.DECIMAL() != null) {
                return new ExpresionNodo(linea(actx), columna(actx), actx.DECIMAL().getText());
            }

            if (actx.CHAR() != null) {
                return new ExpresionNodo(linea(actx), columna(actx), actx.CHAR().getText());
            }

            if (actx.TRUE() != null) {
                return new ExpresionNodo(linea(actx), columna(actx), "true");
            }

            if (actx.FALSE() != null) {
                return new ExpresionNodo(linea(actx), columna(actx), "false");
            }
        }

        // --- 2) EXPRESION compuesta ---
        if (ctx instanceof MiniLenguajeParser.ExpresionContext) {
            MiniLenguajeParser.ExpresionContext ectx = (MiniLenguajeParser.ExpresionContext) ctx;

            int n = ectx.getChildCount();

            // Un solo hijo → bajar un nivel (paréntesis, atomo, etc.)
            if (n == 1) {
                ParseTree unico = ectx.getChild(0);
                if (unico instanceof ParserRuleContext) {
                    return construirExpresionRec((ParserRuleContext) unico);
                } else {
                    return new ExpresionNodo(linea(ectx), columna(ectx), unico.getText());
                }
            }

            // Unario: op expr  (ej: -x, !cond)
            if (n == 2) {
                String op = ectx.getChild(0).getText();
                ParserRuleContext exprCtx = (ParserRuleContext) ectx.getChild(1);
                ExpresionNodo hijo = construirExpresionRec(exprCtx);

                ExpresionNodo nodo = new ExpresionNodo(linea(ectx), columna(ectx), op);
                nodo.agregarHijo(hijo);
                return nodo;
            }

            // Binario: expr op expr
            if (n == 3) {
                ParserRuleContext izqCtx = (ParserRuleContext) ectx.getChild(0);
                ParseTree opNode = ectx.getChild(1);
                ParserRuleContext derCtx = (ParserRuleContext) ectx.getChild(2);

                String op = opNode.getText();
                ExpresionNodo nodo = new ExpresionNodo(linea(ectx), columna(ectx), op);
                nodo.agregarHijo(construirExpresionRec(izqCtx));
                nodo.agregarHijo(construirExpresionRec(derCtx));
                return nodo;
            }

            // Llamadas a función u otras formas más complejas:
            // lo tratamos como hoja con el texto completo (ej: miFuncion(5,3.14))
            return new ExpresionNodo(linea(ectx), columna(ectx), ectx.getText());
        }

        // Fallback genérico
        return new ExpresionNodo(linea(ctx), columna(ctx), ctx.getText());
    }
}
