package com.compilador;

/**
 * Nodo AST para la declaración de un array:
 *   int numeros[3];
 */
public class DeclaracionArrayNodo extends NodoAST {

    public final String tipo;
    public final String nombre;
    public final int tamanio;

    public DeclaracionArrayNodo(int linea, int columna,
                                String tipo,
                                String nombre,
                                int tamanio) {
        super(linea, columna);
        this.tipo = tipo;
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    @Override
    public String toString(String prefijo) {
        // Formato similar al de DeclaracionVariableNodo
        return String.format(
            "%sDeclaracionArray(tipo=%s, nombre=%s, tamaño=%d, linea=%d, col=%d)",
            prefijo, tipo, nombre, tamanio, linea, columna
        );
    }
}
