package com.compilador;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

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

    @Override
    public NodoAST visitInstrFor(MiniLenguajeParser.InstrForContext ctx) {
        int linea = ctx.start.getLine();
        int columna = ctx.start.getCharPositionInLine();

        // ----- inicialización: declaración, asignación o vacío -----
        NodoAST inicializacion = null;
        MiniLenguajeParser.ForInitContext initCtx = ctx.forInit();
        if (initCtx.TIPO() != null) {
            String tipo = initCtx.TIPO().getText();
            String nombre = initCtx.ID().getText();
            ExpresionNodo init = null;
            if (initCtx.ASIGN() != null && initCtx.expresion() != null) {
                init = construirExpresion(initCtx.expresion());
            }
            inicializacion = new DeclaracionVariableNodo(
                    linea(initCtx), columna(initCtx), tipo, nombre, init);
        } else if (initCtx.lvalue() != null) {
            String nombre = initCtx.lvalue().ID().getText();
            ExpresionNodo expr = construirExpresion(initCtx.expresion());
            inicializacion = new AsignacionNodo(
                    linea(initCtx), columna(initCtx), nombre, expr);
        }

        // ----- condición (opcional) -----
        ExpresionNodo condicion = null;
        if (ctx.expresion() != null) {
            condicion = construirExpresion(ctx.expresion());
        }

        // ----- actualización (opcional) -----
        AsignacionNodo actualizacion = null;
        MiniLenguajeParser.ForUpdateContext updCtx = ctx.forUpdate();
        if (updCtx.lvalue() != null) {
            String nombre = updCtx.lvalue().ID().getText();
            ExpresionNodo expr = construirExpresion(updCtx.expresion());
            actualizacion = new AsignacionNodo(
                    linea(updCtx), columna(updCtx), nombre, expr);
        }

        // ----- cuerpo -----
        List<NodoAST> cuerpo = new ArrayList<>();
        MiniLenguajeParser.BloqueContext bctx = ctx.bloque();
        if (bctx.instructions() != null) {
            for (MiniLenguajeParser.InstruccionContext insCtx
                    : bctx.instructions().instruccion()) {
                cuerpo.add(visit(insCtx));
            }
        }

        return new ForNodo(linea, columna, inicializacion, condicion, actualizacion, cuerpo);
    }

    @Override
    public NodoAST visitInstrBreak(MiniLenguajeParser.InstrBreakContext ctx) {
        return new BreakNodo(linea(ctx), columna(ctx));
    }

    @Override
    public NodoAST visitInstrContinue(MiniLenguajeParser.InstrContinueContext ctx) {
        return new ContinueNodo(linea(ctx), columna(ctx));
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

    /**
     * Construye el árbol de ExpresionNodo recorriendo MiniLenguajeParser.ExpresionContext.
     * NO usa ctx.atomo() ni constructores raros.
     */
    private ExpresionNodo construirExpresionRec(MiniLenguajeParser.ExpresionContext ctx) {
        if (ctx == null) {
            // No debería pasar en un programa bien formado, pero evitamos NPE.
            return new ExpresionNodo(0, 0, "<error-expr>");
        }

        int n = ctx.getChildCount();

        // ========= CASO: llamada a función: ID '(' argumentos? ')' =========
        // Árbol típico:
        // (expresion sumar ( (argumentos (expresion ...) , (expresion ...)) ))
        if (n >= 3
                && ctx.getChild(0) instanceof TerminalNode
                && "(".equals(ctx.getChild(1).getText())) {

            String nombreFun = ctx.getChild(0).getText();
            ExpresionNodo llamada = new ExpresionNodo(linea(ctx), columna(ctx), nombreFun);

            // Buscar subárbol de argumentos (si existe)
            for (int i = 0; i < n; i++) {
                ParseTree hijo = ctx.getChild(i);
                if (hijo instanceof MiniLenguajeParser.ArgumentosContext) {
                    MiniLenguajeParser.ArgumentosContext argsCtx =
                            (MiniLenguajeParser.ArgumentosContext) hijo;

                    for (MiniLenguajeParser.ExpresionContext ectx : argsCtx.expresion()) {
                        llamada.agregarHijo(construirExpresionRec(ectx));
                    }
                }
            }

            return llamada;
        }

        // ========= CASO: binario: expr op expr =========
        // ej: a + b, x < 3, a && b, etc.
        if (n == 3
                && ctx.getChild(0) instanceof MiniLenguajeParser.ExpresionContext
                && ctx.getChild(2) instanceof MiniLenguajeParser.ExpresionContext) {

            MiniLenguajeParser.ExpresionContext izqCtx =
                    (MiniLenguajeParser.ExpresionContext) ctx.getChild(0);
            MiniLenguajeParser.ExpresionContext derCtx =
                    (MiniLenguajeParser.ExpresionContext) ctx.getChild(2);

            String op = ctx.getChild(1).getText();

            ExpresionNodo izq = construirExpresionRec(izqCtx);
            ExpresionNodo der = construirExpresionRec(derCtx);

            ExpresionNodo nodo = new ExpresionNodo(linea(ctx), columna(ctx), op);
            nodo.agregarHijo(izq);
            nodo.agregarHijo(der);
            return nodo;
        }

        // ========= CASO: unario: op expr =========
        // ej: -x, !flag
        if (n == 2
                && ctx.getChild(1) instanceof MiniLenguajeParser.ExpresionContext) {

            String op = ctx.getChild(0).getText();
            MiniLenguajeParser.ExpresionContext hijoCtx =
                    (MiniLenguajeParser.ExpresionContext) ctx.getChild(1);

            ExpresionNodo hijo = construirExpresionRec(hijoCtx);

            ExpresionNodo nodo = new ExpresionNodo(linea(ctx), columna(ctx), op);
            nodo.agregarHijo(hijo);
            return nodo;
        }

        // ========= CASO: 1 solo hijo =========
        // Puede ser:
        //   - (expresion ...)
        //   - (atomo ...)
        if (n == 1) {
            ParseTree unico = ctx.getChild(0);

            // Sub-expresión (paréntesis): bajamos un nivel
            if (unico instanceof MiniLenguajeParser.ExpresionContext) {
                return construirExpresionRec((MiniLenguajeParser.ExpresionContext) unico);
            }

            // Atomo: lo manejamos aparte
            if (unico instanceof MiniLenguajeParser.AtomoContext) {
                return construirDesdeAtomo((MiniLenguajeParser.AtomoContext) unico);
            }

            // Token suelto raro → lo tomamos como literal/ID directo
            return new ExpresionNodo(linea(ctx), columna(ctx), unico.getText());
        }

        // ========= CASO FALLBACK =========
        // Si nada matcheó (formas no previstas), metemos el texto completo.
        return new ExpresionNodo(linea(ctx), columna(ctx), ctx.getText());
    }

    /**
     * Construye una ExpresionNodo a partir de un atomo:
     *  - ID
     *  - ID[expresion]  (→ AccesoArrayNodo)
     *  - literales (número, decimal, char, true/false)
     */
    private ExpresionNodo construirDesdeAtomo(MiniLenguajeParser.AtomoContext actx) {
        // ID[exp] → acceso a array
        if (actx.ID() != null && actx.COR_IZQ() != null) {
            String nombreArray = actx.ID().getText();
            MiniLenguajeParser.ExpresionContext idxCtx = actx.expresion();
            ExpresionNodo indice = null;
            if (idxCtx != null) {
                indice = construirExpresionRec(idxCtx);
            } else {
                indice = new ExpresionNodo(linea(actx), columna(actx), "0");
            }
            // AccesoArrayNodo debe extender ExpresionNodo
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

        // Fallback por si aparece algo raro
        return new ExpresionNodo(linea(actx), columna(actx), actx.getText());
    }
}
