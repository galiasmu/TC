package com.compilador;

import java.util.*;
import java.util.regex.*;

/**
 * Optimizador simple de código de tres direcciones (TAC).
 * Aplica:
 *  1) Propagación de constantes + constant folding
 *  2) Simplificación algebraica básica
 *  3) Eliminación de código muerto de temporales tN
 */
public class TACOptimizer {

    // ======= API pública =======

    public List<String> optimize(List<String> original) {
        List<String> tac = new ArrayList<>(original);

        tac = constantPropagationAndFolding(tac);   // 1)
        tac = simplifyExpressions(tac);            // 2)
        tac = deadCodeEliminationTemporaries(tac); // 3)

        return tac;
    }

       // ======= 1) Propagación de constantes + folding =======

    private static final Pattern ASSIGN_PATTERN =
            Pattern.compile("^\\s*(\\w+)\\s*=\\s*(.+)$");

    private static final Pattern CONST_PATTERN =
            Pattern.compile("^(-?\\d+(?:\\.\\d+)?|true|false)$");

    private static final Pattern BINARY_OP_PATTERN =
            Pattern.compile("^(-?\\d+(?:\\.\\d+)?|true|false)\\s*([+\\-*/<>]=?|==|!=|&&|\\|\\|)\\s*(-?\\d+(?:\\.\\d+)?|true|false)$");

    private List<String> constantPropagationAndFolding(List<String> tac) {
        Map<String, String> constMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String line : tac) {
            String code = line;

            // No tocamos encabezados ni labels ni goto ni if sin asignación
            if (isControlOrLabel(code)) {
                result.add(code);
                continue;
            }

            Matcher m = ASSIGN_PATTERN.matcher(code);
            if (!m.matches()) {
                result.add(code);
                continue;
            }

            String lhs = m.group(1);
            String rhs = m.group(2).trim();

            // 1.a) reemplazar variables conocidas por constantes en el RHS
            rhs = substituteConstants(rhs, constMap);

            // 1.b) intentar constant folding en rhs (si es todo constante)
            String folded = foldIfConstant(rhs);
            if (folded != null) {
                rhs = folded;
            }

            // reconstruimos la línea
            String newLine = lhs + " = " + rhs;
            result.add(newLine);

            // 1.c) actualizar mapa de constantes
            if (isPureConstant(rhs)) {
                constMap.put(lhs, rhs);
            } else {
                // ya no es constante conocida
                constMap.remove(lhs);
            }
        }

        return result;
    }

    private boolean isControlOrLabel(String code) {
        String trim = code.trim();
        return trim.startsWith("func ")
                || trim.startsWith("endfunc")
                || trim.startsWith("if ")
                || trim.startsWith("goto ")
                || trim.endsWith(":")
                || trim.startsWith("return");
    }

    private boolean isPureConstant(String rhs) {
        return CONST_PATTERN.matcher(rhs.trim()).matches();
    }

    private String substituteConstants(String rhs, Map<String, String> constMap) {
        String[] parts = rhs.split("\\s+");
        for (int i = 0; i < parts.length; i++) {
            String c = parts[i];
            if (constMap.containsKey(c)) {
                parts[i] = constMap.get(c);
            }
        }
        return String.join(" ", parts);
    }

    private String foldIfConstant(String rhs) {
        String trimmed = rhs.trim();

        // unary ! sobre booleano
        if (trimmed.startsWith("!") && CONST_PATTERN.matcher(trimmed.substring(1).trim()).matches()) {
            String inner = trimmed.substring(1).trim();
            if (inner.equals("true")) return "false";
            if (inner.equals("false")) return "true";
        }

        Matcher m = BINARY_OP_PATTERN.matcher(trimmed);
        if (!m.matches()) {
            return null;
        }

        String a = m.group(1);
        String op = m.group(2);
        String b = m.group(3);

        // booleanos
        if (a.equals("true") || a.equals("false") || b.equals("true") || b.equals("false")) {
            Boolean ba = parseBool(a);
            Boolean bb = parseBool(b);
            if (ba == null || bb == null) return null;

            switch (op) {
                case "&&":  return String.valueOf(ba && bb);
                case "||":  return String.valueOf(ba || bb);
                case "==":  return String.valueOf(ba.equals(bb));
                case "!=":  return String.valueOf(!ba.equals(bb));
                default:    return null;
            }
        }

        // numéricos
        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);

        switch (op) {
            case "+":  return formatNumber(da + db);
            case "-":  return formatNumber(da - db);
            case "*":  return formatNumber(da * db);
            case "/":
                if (db == 0) return null; // no dividir por cero
                return formatNumber(da / db);

            case ">":  return String.valueOf(da >  db);
            case "<":  return String.valueOf(da <  db);
            case ">=": return String.valueOf(da >= db);
            case "<=": return String.valueOf(da <= db);
            case "==": return String.valueOf(da == db);
            case "!=": return String.valueOf(da != db);
            default:   return null;
        }
    }

    private Boolean parseBool(String s) {
        if (s.equals("true"))  return true;
        if (s.equals("false")) return false;
        return null;
    }

    private String formatNumber(double d) {
        if (Math.floor(d) == d) {
            return String.valueOf((long) d);
        }
        return String.valueOf(d);
    }

    // ======= 2) Simplificación algebraica básica =======
    //
    // casos típicos:
    //   x = y + 0  -> x = y
    //   x = 0 + y  -> x = y
    //   x = y - 0  -> x = y
    //   x = y * 1  -> x = y
    //   x = 1 * y  -> x = y
    //   x = y * 0  -> x = 0
    //   x = 0 * y  -> x = 0

    private static final Pattern BINARY_ASSIGN_PATTERN =
            Pattern.compile("^\\s*(\\w+)\\s*=\\s*(\\S+)\\s*([+\\-*/])\\s*(\\S+)\\s*$");

    private List<String> simplifyExpressions(List<String> tac) {
        List<String> result = new ArrayList<>();

        for (String line : tac) {
            String code = line;

            if (isControlOrLabel(code)) {
                result.add(code);
                continue;
            }

            Matcher m = BINARY_ASSIGN_PATTERN.matcher(code);
            if (!m.matches()) {
                result.add(code);
                continue;
            }

            String lhs = m.group(1);
            String op  = m.group(3);
            String a   = m.group(2);
            String b   = m.group(4);

            String simplified = null;

            if (op.equals("+")) {
                if (b.equals("0")) simplified = lhs + " = " + a;
                else if (a.equals("0")) simplified = lhs + " = " + b;
            } else if (op.equals("-")) {
                if (b.equals("0")) simplified = lhs + " = " + a;
            } else if (op.equals("*")) {
                if (a.equals("1")) simplified = lhs + " = " + b;
                else if (b.equals("1")) simplified = lhs + " = " + a;
                else if (a.equals("0") || b.equals("0")) simplified = lhs + " = 0";
            }

            result.add(simplified != null ? simplified : code);
        }

        return result;
    }

    // ======= 3) Eliminación de código muerto de temporales tN =======
    //
    // Eliminamos líneas del tipo:
    //   tX = ...
    // cuando tX nunca se usa en ningún otro lado.

    private static final Pattern LHS_ASSIGN_PATTERN =
            Pattern.compile("^\\s*(\\w+)\\s*=.*$");

    private List<String> deadCodeEliminationTemporaries(List<String> tac) {
        Set<String> used = new HashSet<>();

        // 1) recolectar variables usadas en RHS y condiciones
        for (String line : tac) {
            String code = line.trim();

            // saltamos labels y encabezados
            if (code.startsWith("func ") || code.startsWith("endfunc") || code.endsWith(":")) {
                continue;
            }

            // tomamos todo menos el LHS de una asignación
            String rhsZone = code;
            Matcher assign = LHS_ASSIGN_PATTERN.matcher(code);
            if (assign.matches()) {
                int idx = code.indexOf('=');
                if (idx != -1 && idx + 1 < code.length()) {
                    rhsZone = code.substring(idx + 1);
                } else {
                    rhsZone = "";
                }
            }

            // palabras tipo identificador
            for (String token : rhsZone.split("[^A-Za-z0-9_]+")) {
                if (token.isEmpty()) continue;
                if (isKeywordOrBool(token)) continue;
                used.add(token);
            }
        }

        // 2) filtramos asignaciones a temporales tN no usados
        List<String> result = new ArrayList<>();

        for (String line : tac) {
            String code = line;
            Matcher assign = LHS_ASSIGN_PATTERN.matcher(code);
            if (assign.matches()) {
                String lhs = assign.group(1);
                if (lhs.matches("t\\d+") && !used.contains(lhs)) {
                    // temp nunca usado -> código muerto
                    continue;
                }
            }
            result.add(code);
        }

        return result;
    }

    private boolean isKeywordOrBool(String token) {
        switch (token) {
            case "if":
            case "goto":
            case "return":
            case "func":
            case "endfunc":
            case "true":
            case "false":
                return true;
            default:
                return false;
        }
    }

}