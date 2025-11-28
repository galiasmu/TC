package com.compilador;

import java.util.ArrayList;
import java.util.List;

public class TACGenerator {

    private final List<String> instrucciones = new ArrayList<>();
    private int tempCount = 0;
    private int labelCount = 0;

    public List<String> generar(NodoAST raiz) {
        instrucciones.clear();
        tempCount = 0;
        labelCount = 0;

        if (raiz instanceof ProgramaNodo) {
            ProgramaNodo prog = (ProgramaNodo) raiz;
            for (NodoAST n : prog.sentencias) {
                if (n instanceof FuncionNodo) {
                    generarFuncion((FuncionNodo) n);
                }
                // Las declaraciones globales no generan TAC.
            }
        }

        return instrucciones;
    }

    // ================== FUNCIONES ==================

    private void generarFuncion(FuncionNodo fun) {
        instrucciones.add("func " + fun.nombre + ":");
        for (NodoAST n : fun.cuerpo) {
            generarSentencia(n);
        }
        instrucciones.add("endfunc");
        instrucciones.add(""); // línea en blanco
    }

    // ================== SENTENCIAS ==================

    private void generarSentencia(NodoAST nodo) {
        if (nodo instanceof DeclaracionVariableNodo) {
            // No generamos TAC para la declaración en sí.
            return;
        }

        if (nodo instanceof AsignacionNodo) {
            AsignacionNodo a = (AsignacionNodo) nodo;
            String rhs = generarExpresion(a.expresion);
            instrucciones.add(a.nombreVariable + " = " + rhs);
            return;
        }

        if (nodo instanceof ReturnNodo) {
            ReturnNodo r = (ReturnNodo) nodo;
            if (r.expresion == null) {
                instrucciones.add("return");
            } else {
                String val = generarExpresion(r.expresion);
                instrucciones.add("return " + val);
            }
            return;
        }

        if (nodo instanceof IfNodo) {
            generarIf((IfNodo) nodo);
            return;
        }

        if (nodo instanceof WhileNodo) {
            generarWhile((WhileNodo) nodo);
            return;
        }

        // Si aparece algo que no manejamos explícitamente, lo ignoramos
        // para no romper la ejecución.
    }

    // ================== IF ==================

    private void generarIf(IfNodo n) {
        // Puede venir null si hubo algún problema antes → lo protegemos
        String condTemp = generarExpresion(n.condicion);

        String labelThen = nuevaLabel();
        String labelElse = nuevaLabel();
        String labelEnd  = nuevaLabel();

        instrucciones.add("if " + condTemp + " goto " + labelThen);
        instrucciones.add("goto " + labelElse);

        // THEN
        instrucciones.add(labelThen + ":");
        if (n.bloqueThen != null) {
            for (NodoAST s : n.bloqueThen) {
                generarSentencia(s);
            }
        }
        instrucciones.add("goto " + labelEnd);

        // ELSE
        instrucciones.add(labelElse + ":");
        if (n.bloqueElse != null) {
            for (NodoAST s : n.bloqueElse) {
                generarSentencia(s);
            }
        }

        instrucciones.add(labelEnd + ":");
        instrucciones.add("");
    }

    // ================== WHILE ==================

    private void generarWhile(WhileNodo n) {
        String labelStart = nuevaLabel();
        String labelBody  = nuevaLabel();
        String labelEnd   = nuevaLabel();

        instrucciones.add(labelStart + ":");

        String condTemp = generarExpresion(n.condicion);
        instrucciones.add("if " + condTemp + " goto " + labelBody);
        instrucciones.add("goto " + labelEnd);

        instrucciones.add(labelBody + ":");
        if (n.cuerpo != null) {
            for (NodoAST s : n.cuerpo) {
                generarSentencia(s);
            }
        }
        instrucciones.add("goto " + labelStart);

        instrucciones.add(labelEnd + ":");
        instrucciones.add("");
    }

    // ================== EXPRESIONES ==================

    private String generarExpresion(ExpresionNodo expr) {
        // Protección extra para evitar NullPointerException
        if (expr == null) {
            return "0"; // valor dummy, no debería pasar en un AST bien formado
        }

        // Hoja: literal, identificador, llamada a función representada como texto
        if (expr.hijos.isEmpty()) {
            return expr.etiqueta;
        }

        // Unario: '!' o '-'
        if (expr.hijos.size() == 1) {
            String op = expr.etiqueta;
            String v = generarExpresion(expr.hijos.get(0));
            String t = nuevaTemp();
            instrucciones.add(t + " = " + op + " " + v);
            return t;
        }

        // Binario: +, -, *, /, %, <, >, <=, >=, ==, !=, &&, ||
        if (expr.hijos.size() == 2) {
            String op    = expr.etiqueta;
            String left  = generarExpresion(expr.hijos.get(0));
            String right = generarExpresion(expr.hijos.get(1));
            String t = nuevaTemp();
            instrucciones.add(t + " = " + left + " " + op + " " + right);
            return t;
        }

        // Caso raro: más de 2 hijos → lo colapsamos en una temp
        String t = nuevaTemp();
        instrucciones.add(t + " = " + expr.etiqueta);
        return t;
    }

    // ================== HELPERS ==================

    private String nuevaTemp() {
        return "t" + (tempCount++);
    }

    private String nuevaLabel() {
        return "L" + (labelCount++);
    }
}
