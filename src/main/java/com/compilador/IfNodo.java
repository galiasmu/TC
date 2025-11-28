package com.compilador;

import java.util.List;

public class IfNodo extends NodoAST {
    public final ExpresionNodo condicion;
    public final List<NodoAST> bloqueThen;
    public final List<NodoAST> bloqueElse;

    public IfNodo(int linea, int columna,
                  ExpresionNodo condicion,
                  List<NodoAST> bloqueThen,
                  List<NodoAST> bloqueElse) {
        super(linea, columna);
        this.condicion = condicion;
        this.bloqueThen = bloqueThen;
        this.bloqueElse = bloqueElse;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefijo).append("If\n");
        sb.append(prefijo).append("  Condicion:\n");
        if (condicion != null) {
            sb.append(condicion.toString(prefijo + "    "));
        }
        sb.append("\n").append(prefijo).append("  Then:\n");
        if (bloqueThen != null) {
            for (NodoAST n : bloqueThen) {
                sb.append(n.toString(prefijo + "    "));
            }
        }
        if (bloqueElse != null) {
            sb.append("\n").append(prefijo).append("  Else:\n");
            for (NodoAST n : bloqueElse) {
                sb.append(n.toString(prefijo + "    "));
            }
        }
        return sb.toString();
    }
}
