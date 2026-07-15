package com.compilador;

public class LlamadaNodo extends ExpresionNodo {

    public final String nombreFuncion;

    public LlamadaNodo(int linea, int columna, String nombreFuncion) {
        super(linea, columna, nombreFuncion);
        this.nombreFuncion = nombreFuncion;
        // los argumentos se agregan como hijos vía agregarHijo(), igual que AccesoArrayNodo
    }

    @Override
    public String toString() {
        return "Llamada(" + nombreFuncion + ", " + hijos.size() + " argumento(s))";
    }
}
