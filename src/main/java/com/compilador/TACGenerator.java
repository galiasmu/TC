package com.compilador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class TACGenerator {

    private final List<String> instrucciones = new ArrayList<>();
    private int tempCount = 0;
    private int labelCount = 0;

    /**
     * Genera TAC "crudo" (sin optimizar).
     */
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

    /**
     * Genera TAC y además aplica optimizaciones simples
     * (propagación de constantes, constant folding, eliminación de código muerto).
     */
    public List<String> generarOptimizado(NodoAST raiz) {
        List<String> original = generar(raiz);
        List<String> copia = new ArrayList<>(original);
        return optimizar(copia);
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

    // ==============================
    // 1) Declaración de variable
    //    - sin inicialización -> nada
    //    - con inicialización -> var = expr
    // ==============================
    if (nodo instanceof DeclaracionVariableNodo) {
        DeclaracionVariableNodo d = (DeclaracionVariableNodo) nodo;

        // Si no tiene inicialización: int x;
        if (d.inicializacion == null) {
            return; // no generamos TAC
        }

        // Si tiene inicialización: int x = expr;
        String rhs = generarExpresion(d.inicializacion);
        instrucciones.add(d.nombre + " = " + rhs);
        return;
    }

    // ==============================
    // 2) Declaración de array
    //    Por ahora no generamos TAC (no hacemos reserva de memoria real)
    //    Solo existe a nivel semántico.
    // ==============================
    if (nodo instanceof DeclaracionArrayNodo) {
        // Podrías, si querés, dejar un comentario en TAC:
        // Declaración lógica de array, sin código.
        // DeclaracionArrayNodo arr = (DeclaracionArrayNodo) nodo;
        // instrucciones.add("// array " + arr.nombre + "[" + arr.tamanio + "]");
        return;
    }

    // ==============================
    // 3) Asignación simple: x = expr;
    // ==============================
    if (nodo instanceof AsignacionNodo) {
        AsignacionNodo a = (AsignacionNodo) nodo;
        String rhs = generarExpresion(a.expresion);
        instrucciones.add(a.nombreVariable + " = " + rhs);
        return;
    }

    // ==============================
    // 4) Asignación a array: arr[i] = expr;
    // ==============================
    if (nodo instanceof AsignacionArrayNodo) {
        AsignacionArrayNodo a = (AsignacionArrayNodo) nodo;

        // Generamos el índice y el valor
        String idx = generarExpresion(a.indice);
        String val = generarExpresion(a.valor);

        // arr[idx] = val
        instrucciones.add(a.nombreArray + "[" + idx + "] = " + val);
        return;
    }

    // ==============================
    // 5) Return
    // ==============================
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

    // ==============================
    // 6) If
    // ==============================
    if (nodo instanceof IfNodo) {
        generarIf((IfNodo) nodo);
        return;
    }

    // ==============================
    // 7) While
    // ==============================
    if (nodo instanceof WhileNodo) {
        generarWhile((WhileNodo) nodo);
        return;
    }

    // ==============================
    // 8) For
    // ==============================
    if (nodo instanceof ForNodo) {
        generarFor((ForNodo) nodo);
        return;
    }

    // ==============================
    // 9) Cualquier cosa no manejada
    //    (mejor ignorar que romper)
    // ==============================
    // Nada
}


    // ================== IF ==================

    private void generarIf(IfNodo n) {
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

    // ================== FOR ==================

    private void generarFor(ForNodo n) {
        // inicialización: se ejecuta una sola vez, antes del loop
        if (n.inicializacion != null) {
            generarSentencia(n.inicializacion);
        }

        String labelStart = nuevaLabel();
        String labelBody  = nuevaLabel();
        String labelEnd   = nuevaLabel();

        instrucciones.add(labelStart + ":");

        if (n.condicion != null) {
            String condTemp = generarExpresion(n.condicion);
            instrucciones.add("if " + condTemp + " goto " + labelBody);
            instrucciones.add("goto " + labelEnd);
        }
        // si no hay condición (for (;;)), cae directo al cuerpo: loop infinito salvo break

        instrucciones.add(labelBody + ":");
        if (n.cuerpo != null) {
            for (NodoAST s : n.cuerpo) {
                generarSentencia(s);
            }
        }
        if (n.actualizacion != null) {
            generarSentencia(n.actualizacion);
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

    // ================== OPTIMIZACIONES (PUNTO 5) ==================

    /**
     * Aplica optimizaciones locales sencillas:
     *  - Propagación de constantes.
     *  - Simplificación de expresiones (constant folding).
     *  - Eliminación de código muerto (temps nunca usados).
     */
    private List<String> optimizar(List<String> tac) {
        // 1) Propagación de constantes + constant folding en una pasada
        List<String> luegoDeConstantes = propagarYFoldearConstantes(tac);

        // 2) Eliminación de código muerto (temps nunca usados)
        List<String> sinMuertos = eliminarTempsMuertos(luegoDeConstantes);

        return sinMuertos;
    }

    /**
     * Propagación de constantes y constant folding sobre líneas con " = ".
     */
    private List<String> propagarYFoldearConstantes(List<String> tac) {
        Map<String, String> constMap = new HashMap<>();
        List<String> resultado = new ArrayList<>();

        for (String linea : tac) {
            String trimmed = linea.trim();

            // Líneas que no son asignaciones: copiar tal cual
            if (trimmed.isEmpty()
                    || trimmed.startsWith("func ")
                    || trimmed.equals("endfunc")
                    || trimmed.endsWith(":")
                    || trimmed.startsWith("goto ")
                    || trimmed.startsWith("if ")) {
                resultado.add(linea);
                continue;
            }

            int idx = linea.indexOf(" = ");
            if (idx < 0) {
                resultado.add(linea);
                continue;
            }

            String izquierda = linea.substring(0, idx).trim();
            String rhs = linea.substring(idx + 3).trim();

            // Reemplazar temps constantes en el RHS (propagación simple)
            for (Map.Entry<String, String> e : constMap.entrySet()) {
                String temp = e.getKey();
                String val = e.getValue();

                // reemplazos simples "t0" → "3", cuidando espacios
                rhs = rhs.replace(" " + temp + " ", " " + val + " ");
                if (rhs.startsWith(temp + " ")) {
                    rhs = val + rhs.substring(temp.length());
                }
                if (rhs.endsWith(" " + temp)) {
                    rhs = rhs.substring(0, rhs.length() - temp.length()) + val;
                }
                if (rhs.equals(temp)) {
                    rhs = val;
                }
            }

            // Intentar constant folding (simplificación de expresiones)
            String folded = intentarFoldear(rhs);
            if (folded != null) {
                rhs = folded;
            }

            // Actualizar mapa de constantes para el destino
            if (izquierda.startsWith("t")) {
                if (esConstanteSimple(rhs)) {
                    constMap.put(izquierda, rhs);
                } else {
                    constMap.remove(izquierda);
                }
            } else {
                // Asignación a variable "real": no la tratamos como temp constante
                constMap.remove(izquierda);
            }

            resultado.add(izquierda + " = " + rhs);
        }

        return resultado;
    }

    /**
     * Elimina asignaciones a temporales (tX) que nunca se usan.
     */
    private List<String> eliminarTempsMuertos(List<String> tac) {
        Set<String> usados = new HashSet<>();

        // Buscar todos los temps usados en RHS e instrucciones tipo if
        for (String linea : tac) {
            String trimmed = linea.trim();

            if (trimmed.isEmpty()
                    || trimmed.startsWith("func ")
                    || trimmed.equals("endfunc")
                    || trimmed.endsWith(":")) {
                continue;
            }

            String rhsParte = trimmed;

            int idx = trimmed.indexOf(" = ");
            if (idx >= 0) {
                rhsParte = trimmed.substring(idx + 3).trim();
            } else if (trimmed.startsWith("if ")) {
                // if cond goto Lx  -> tomamos "cond" como RHS aproximado
                rhsParte = trimmed.substring(3, trimmed.indexOf("goto")).trim();
            }

            String[] tokens = rhsParte.split("\\s+");
            for (String tok : tokens) {
                if (tok.startsWith("t")) {
                    usados.add(tok);
                }
            }
        }

        // Segunda pasada: eliminar asignaciones a temps no usados
        List<String> resultado = new ArrayList<>();
        for (String linea : tac) {
            String trimmed = linea.trim();
            int idx = trimmed.indexOf(" = ");
            if (idx >= 0) {
                String izquierda = trimmed.substring(0, idx).trim();
                if (izquierda.startsWith("t") && !usados.contains(izquierda)) {
                    // asignación a temp muerto → la eliminamos
                    continue;
                }
            }
            resultado.add(linea);
        }

        return resultado;
    }

    /**
     * Intenta evaluar expresiones del tipo:
     *   - a op b   con a y b constantes
     *   - -a      con a constante
     *   - !a      con a booleana
     * Devuelve null si no puede simplificar.
     */
    private String intentarFoldear(String rhs) {
        String[] parts = rhs.split("\\s+");
        if (parts.length == 2) {
            // unario: -a  o  !a
            String op = parts[0];
            String a  = parts[1];
            if (esNumero(a)) {
                try {
                    if ("-".equals(op)) {
                        if (a.contains(".")) {
                            double v = Double.parseDouble(a);
                            return Double.toString(-v);
                        } else {
                            int v = Integer.parseInt(a);
                            return Integer.toString(-v);
                        }
                    }
                } catch (NumberFormatException e) {
                    return null;
                }
            } else if ("!".equals(op) && esBooleano(a)) {
                boolean v = Boolean.parseBoolean(a);
                return Boolean.toString(!v);
            }
            return null;
        }

        if (parts.length == 3) {
            String a  = parts[0];
            String op = parts[1];
            String b  = parts[2];

            // booleanos
            if (esBooleano(a) && esBooleano(b)) {
                boolean va = Boolean.parseBoolean(a);
                boolean vb = Boolean.parseBoolean(b);
                switch (op) {
                    case "&&": return Boolean.toString(va && vb);
                    case "||": return Boolean.toString(va || vb);
                    case "==": return Boolean.toString(va == vb);
                    case "!=": return Boolean.toString(va != vb);
                    default: break;
                }
            }

            // numéricos
            if (esNumero(a) && esNumero(b)) {
                try {
                    boolean useDouble = a.contains(".") || b.contains(".");
                    if (useDouble) {
                        double da = Double.parseDouble(a);
                        double db = Double.parseDouble(b);
                        switch (op) {
                            case "+":  return Double.toString(da + db);
                            case "-":  return Double.toString(da - db);
                            case "*":  return Double.toString(da * db);
                            case "/":  return Double.toString(da / db);
                            case "%":  return Double.toString(da % db);
                            case "<":  return Boolean.toString(da < db);
                            case ">":  return Boolean.toString(da > db);
                            case "<=": return Boolean.toString(da <= db);
                            case ">=": return Boolean.toString(da >= db);
                            case "==": return Boolean.toString(da == db);
                            case "!=": return Boolean.toString(da != db);
                            default:   return null;
                        }
                    } else {
                        int ia = Integer.parseInt(a);
                        int ib = Integer.parseInt(b);
                        switch (op) {
                            case "+":  return Integer.toString(ia + ib);
                            case "-":  return Integer.toString(ia - ib);
                            case "*":  return Integer.toString(ia * ib);
                            case "/":  return Integer.toString(ia / ib);
                            case "%":  return Integer.toString(ia % ib);
                            case "<":  return Boolean.toString(ia < ib);
                            case ">":  return Boolean.toString(ia > ib);
                            case "<=": return Boolean.toString(ia <= ib);
                            case ">=": return Boolean.toString(ia >= ib);
                            case "==": return Boolean.toString(ia == ib);
                            case "!=": return Boolean.toString(ia != ib);
                            default:   return null;
                        }
                    }
                } catch (NumberFormatException e) {
                    return null;
                }
            }
        }

        return null;
    }

    private boolean esConstanteSimple(String s) {
        return esNumero(s) || esBooleano(s);
    }

    private boolean esNumero(String s) {
        try {
            if (s.contains(".")) {
                Double.parseDouble(s);
            } else {
                Integer.parseInt(s);
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean esBooleano(String s) {
        return "true".equals(s) || "false".equals(s);
    }

    // ================== HELPERS ==================

    private String nuevaTemp() {
        return "t" + (tempCount++);
    }

    private String nuevaLabel() {
        return "L" + (labelCount++);
    }
}
