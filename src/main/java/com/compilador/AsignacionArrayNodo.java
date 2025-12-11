package com.compilador;

public class AsignacionArrayNodo extends NodoAST {

    public final String nombreArray;
    public final ExpresionNodo indice;
    public final ExpresionNodo valor;   // <-- ESTE CAMPO ES EL QUE FALTABA

    public AsignacionArrayNodo(int linea, int columna,
                               String nombreArray,
                               ExpresionNodo indice,
                               ExpresionNodo valor) {
        super(linea, columna);
        this.nombreArray = nombreArray;
        this.indice = indice;
        this.valor = valor;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefijo)
          .append("AsignacionArray(")
          .append(nombreArray)
          .append("[")
          .append(indice != null ? indice.etiqueta : "?")
          .append("] = ");

        if (valor != null) {
            sb.append(valor.etiqueta);
        } else {
            sb.append("?");
        }
        sb.append(")\n");
        return sb.toString();
    }
}
