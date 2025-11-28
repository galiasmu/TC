package com.compilador;

import java.util.ArrayList;
import java.util.List;

/**
 * Analizador semántico basado en el AST.
 * - Tabla de símbolos con ámbitos.
 * - Verifica tipos, usos, declaraciones duplicadas.
 * - Soporta IF, ELSE, WHILE.
 * - Soporta operadores lógicos y comparaciones.
 */
public class AnalizadorSemantico {

    private final TablaDeSimbolos tabla = new TablaDeSimbolos();
    private final List<String> errores = new ArrayList<>();
    private final List<String> warnings = new ArrayList<>();

    public void analizar(NodoAST raiz) {
        if (raiz instanceof ProgramaNodo) {
            analizarPrograma((ProgramaNodo) raiz);
        }
        generarWarningsNoUsadas();
    }

    private void analizarPrograma(ProgramaNodo programa) {
        for (NodoAST nodo : programa.sentencias) {

            if (nodo instanceof DeclaracionVariableNodo) {
                declararVariable((DeclaracionVariableNodo) nodo, "variable");
            }
            else if (nodo instanceof FuncionNodo) {
                declararFuncion((FuncionNodo) nodo);
            }
        }
    }

    private void declararVariable(DeclaracionVariableNodo decl, String categoria) {
        boolean ok = tabla.declarar(decl.nombre, decl.tipo, categoria, decl.linea);
        if (!ok) {
            errores.add(String.format(
                "ERROR semántico: la %s '%s' ya fue declarada en este ámbito (línea %d)",
                categoria, decl.nombre, decl.linea));
        }
    }

    private void declararParametros(FuncionNodo fun) {
        for (ParametroNodo p : fun.parametros) {
            boolean ok = tabla.declarar(p.nombre, p.tipo, "parametro", p.linea);
            if (!ok) {
                errores.add(String.format(
                    "ERROR semántico: parámetro '%s' duplicado en función '%s' (línea %d)",
                    p.nombre, fun.nombre, p.linea));
            }
        }
    }

    private void declararFuncion(FuncionNodo fun) {
        boolean ok = tabla.declarar(fun.nombre, fun.tipoRetorno, "funcion", fun.linea);
        if (!ok) {
            errores.add(String.format(
                "ERROR semántico: función '%s' redeclarada (línea %d)",
                fun.nombre, fun.linea));
            return;
        }

        tabla.entrarAmbito();
        declararParametros(fun);

        for (NodoAST instr : fun.cuerpo) {
            analizarSentenciaEnFuncion(fun, instr);
        }

        tabla.salirAmbito();
    }

    private void analizarSentenciaEnFuncion(FuncionNodo fun, NodoAST nodo) {

        if (nodo instanceof DeclaracionVariableNodo) {
            declararVariable((DeclaracionVariableNodo) nodo, "variable");
        }

        else if (nodo instanceof AsignacionNodo) {
            analizarAsignacion((AsignacionNodo) nodo);
        }

        else if (nodo instanceof ReturnNodo) {
            analizarReturn(fun, (ReturnNodo) nodo);
        }

        /* ================================
         *       IF (nuevo)
         * ================================ */
        else if (nodo instanceof IfNodo) {
            IfNodo n = (IfNodo) nodo;

            String tipoCond = inferirTipoExpresion(n.condicion);
            if (tipoCond != null && !"bool".equals(tipoCond)) {
                errores.add(String.format(
                    "ERROR semántico: la condición del IF debe ser de tipo bool (línea %d)",
                    n.condicion.linea));
            }

            // THEN
            tabla.entrarAmbito();
            for (NodoAST s : n.bloqueThen) {
                analizarSentenciaEnFuncion(fun, s);
            }
            tabla.salirAmbito();

            // ELSE
            if (n.bloqueElse != null) {
                tabla.entrarAmbito();
                for (NodoAST s : n.bloqueElse) {
                    analizarSentenciaEnFuncion(fun, s);
                }
                tabla.salirAmbito();
            }
        }

        /* ================================
         *       WHILE (nuevo)
         * ================================ */
        else if (nodo instanceof WhileNodo) {
            WhileNodo n = (WhileNodo) nodo;

            String tipoCond = inferirTipoExpresion(n.condicion);
            if (tipoCond != null && !"bool".equals(tipoCond)) {
                errores.add(String.format(
                    "ERROR semántico: la condición del WHILE debe ser de tipo bool (línea %d)",
                    n.condicion.linea));
            }

            tabla.entrarAmbito();
            for (NodoAST s : n.cuerpo) {
                analizarSentenciaEnFuncion(fun, s);
            }
            tabla.salirAmbito();
        }
    }


    /* ======================================
     *      ASIGNACIÓN
     * ====================================== */
    private void analizarAsignacion(AsignacionNodo asig) {
        TablaDeSimbolos.Simbolo s = tabla.buscar(asig.nombreVariable);
        if (s == null) {
            errores.add(String.format(
                "ERROR semántico: variable '%s' usada sin declarar (línea %d)",
                asig.nombreVariable, asig.linea));
            return;
        }

        s.usado = true;

        String tipoExpr = inferirTipoExpresion(asig.expresion);
        if (tipoExpr != null && !tipoCompatible(s.tipo, tipoExpr)) {
            errores.add(String.format(
                "ERROR semántico: asignación incompatible. Variable '%s' es '%s' pero expresión es '%s' (línea %d)",
                s.nombre, s.tipo, tipoExpr, asig.linea));
        }
    }


    /* ======================================
     *      RETURN
     * ====================================== */
    private void analizarReturn(FuncionNodo fun, ReturnNodo ret) {
        if (ret.expresion == null) {
            if (!"void".equals(fun.tipoRetorno)) {
                errores.add(String.format(
                    "ERROR semántico: la función '%s' debe retornar '%s' (línea %d)",
                    fun.nombre, fun.tipoRetorno, ret.linea));
            }
            return;
        }

        String tipoRet = inferirTipoExpresion(ret.expresion);
        if (tipoRet != null && !tipoCompatible(fun.tipoRetorno, tipoRet)) {
            errores.add(String.format(
                "ERROR semántico: return incompatible en función '%s'. Esperado '%s', encontrado '%s' (línea %d)",
                fun.nombre, fun.tipoRetorno, tipoRet, ret.linea));
        }
    }


    /* ======================================
     *  INFERENCIA DE TIPOS (inciso 3.2)
     *  Soporta operadores lógicos y comparaciones
     * ====================================== */
    private String inferirTipoExpresion(ExpresionNodo expr) {
        if (expr == null) return null;

        /* ----- CASOS HOJA ----- */
        if (expr.hijos.isEmpty()) {
            String lex = expr.etiqueta;

            if (lex.matches("\\d+")) return "int";
            if (lex.matches("\\d+\\.\\d+")) return "double";
            if (lex.equals("true") || lex.equals("false")) return "bool";
            if (lex.startsWith("\"")) return "string";
            if (lex.startsWith("'")) return "char";

            TablaDeSimbolos.Simbolo s = tabla.buscar(lex);
            if (s != null) {
                s.usado = true;
                return s.tipo;
            }
            return null;
        }

        /* ----- OPERADORES RELACIONALES (<, >, ==, !=, <=, >=) ----- */
        switch (expr.etiqueta) {
            case "<": case ">": case "<=": case ">=": case "==": case "!=":
                String t1 = inferirTipoExpresion(expr.hijos.get(0));
                String t2 = inferirTipoExpresion(expr.hijos.get(1));
                if (t1 == null || t2 == null) return "bool";
                return "bool"; // siempre booleano
        }

        /* ----- OPERADORES LÓGICOS (&&, ||) ----- */
        switch (expr.etiqueta) {
            case "&&": case "||":
              //  String a = inferirTipoExpresion(expr.hijos.get(0));
               // String b = inferirTipoExpresion(expr.hijos.get(1));
                return "bool";
        }

        /* ----- NEGACIÓN LÓGICA (!) ----- */
        if (expr.etiqueta.equals("!")) {
            return "bool";
        }

        /* ----- ARITMÉTICA (+, -, *, /, %) ----- */
        if ("+-*/%".contains(expr.etiqueta) && expr.hijos.size() == 2) {
            String t1 = inferirTipoExpresion(expr.hijos.get(0));
            String t2 = inferirTipoExpresion(expr.hijos.get(1));
            if ("double".equals(t1) || "double".equals(t2)) return "double";
            return "int";
        }

        return null;
    }

    private boolean tipoCompatible(String tipoVar, String tipoExpr) {
        if (tipoExpr == null) return true;
        if (tipoVar.equals(tipoExpr)) return true;
        if (tipoVar.equals("double") && tipoExpr.equals("int")) return true;
        return false;
    }

    private void generarWarningsNoUsadas() {
        for (TablaDeSimbolos.Simbolo s : tabla.obtenerTodosLosSimbolos()) {
            if (("variable".equals(s.categoria) || "parametro".equals(s.categoria)) && !s.usado) {
                warnings.add(String.format(
                    "WARNING: %s '%s' declarada en línea %d pero nunca usada",
                    s.categoria, s.nombre, s.lineaDeclaracion));
            }
        }
    }

    public List<String> getErrores() { return errores; }
    public List<String> getWarnings() { return warnings; }
}
