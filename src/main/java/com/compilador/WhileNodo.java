package com.compilador;

import java.util.List;

public class WhileNodo extends NodoAST {
    public final ExpresionNodo condicion;
    public final List<NodoAST> cuerpo;

    public WhileNodo(int linea, int columna,
                     ExpresionNodo condicion,
                     List<NodoAST> cuerpo) {
        super(linea, columna);
        this.condicion = condicion;
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefijo).append("While\n");
        sb.append(prefijo).append("  Condicion:\n");
        if (condicion != null) {
            sb.append(condicion.toString(prefijo + "    "));
        }
        sb.append("\n").append(prefijo).append("  Cuerpo:\n");
        if (cuerpo != null) {
            for (NodoAST n : cuerpo) {
                sb.append(n.toString(prefijo + "    "));
            }
        }
        return sb.toString();
    }
}
