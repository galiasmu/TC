package com.compilador;

public class AccesoArrayNodo extends ExpresionNodo {

    public final String nombreArray;
    public final ExpresionNodo indice;

    public AccesoArrayNodo(int linea, int columna, String nombreArray, ExpresionNodo indice) {
        super(linea, columna, "[]");
        this.nombreArray = nombreArray;
        this.indice = indice;
        // opcional: lo agregamos como hijo por consistencia
        this.agregarHijo(indice);
    }

    @Override
    public String toString() {
        return "AccesoArray(" + nombreArray + "[" + indice + "])";
    }
}
