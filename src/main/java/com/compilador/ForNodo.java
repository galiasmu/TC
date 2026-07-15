package com.compilador;

import java.util.List;

/**
 * Sentencia for: for (inicializacion; condicion; actualizacion) { cuerpo }
 * inicializacion puede ser una DeclaracionVariableNodo, una AsignacionNodo o null (for (;;)).
 * condicion puede ser null (equivale a "true", for infinito salvo break).
 * actualizacion puede ser null.
 */
public class ForNodo extends NodoAST {
    public final NodoAST inicializacion;
    public final ExpresionNodo condicion;
    public final AsignacionNodo actualizacion;
    public final List<NodoAST> cuerpo;

    public ForNodo(int linea, int columna,
                   NodoAST inicializacion,
                   ExpresionNodo condicion,
                   AsignacionNodo actualizacion,
                   List<NodoAST> cuerpo) {
        super(linea, columna);
        this.inicializacion = inicializacion;
        this.condicion = condicion;
        this.actualizacion = actualizacion;
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefijo).append("For\n");
        sb.append(prefijo).append("  Inicializacion:\n");
        if (inicializacion != null) {
            sb.append(inicializacion.toString(prefijo + "    "));
        }
        sb.append("\n").append(prefijo).append("  Condicion:\n");
        if (condicion != null) {
            sb.append(condicion.toString(prefijo + "    "));
        }
        sb.append("\n").append(prefijo).append("  Actualizacion:\n");
        if (actualizacion != null) {
            sb.append(actualizacion.toString(prefijo + "    "));
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
