package com.compilador;

import java.util.*;

/**
 * Tabla de símbolos con soporte de ámbitos y arrays.
 */
public class TablaDeSimbolos {

    // ============================
    //     CLASE SIMBOLO
    // ============================
    public static class Simbolo {
        public final String nombre;
        public final String tipo;
        public final String categoria; // "variable", "funcion", "parametro"
        public final int lineaDeclaracion;
        public boolean usado = false;

        // 🔹 NUEVOS CAMPOS PARA ARRAYS
        public final boolean esArray;
        public final Integer tamanioArray; // null si no es array

        // Constructor clásico (variables simples, funciones)
        public Simbolo(String nombre, String tipo, String categoria, int lineaDeclaracion) {
            this(nombre, tipo, categoria, lineaDeclaracion, false, null);
        }

        // Constructor completo (incluye arrays)
        public Simbolo(String nombre, String tipo, String categoria,
                       int lineaDeclaracion, boolean esArray, Integer tamanioArray) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.categoria = categoria;
            this.lineaDeclaracion = lineaDeclaracion;
            this.esArray = esArray;
            this.tamanioArray = tamanioArray;
        }
    }

    // ============================
    //      PILA DE ÁMBITOS
    // ============================
    private final Deque<Map<String, Simbolo>> pila = new ArrayDeque<>();

    public TablaDeSimbolos() {
        entrarAmbito(); // ámbito global
    }

    public void entrarAmbito() {
        pila.push(new LinkedHashMap<>());
    }

    public void salirAmbito() {
        pila.pop();
    }

    // ============================
    //      DECLARACIONES
    // ============================

    /** Declarar variable o función normal */
    public boolean declarar(String nombre, String tipo, String categoria, int linea) {
        Map<String, Simbolo> actual = pila.peek();
        if (actual.containsKey(nombre)) return false;

        actual.put(nombre, new Simbolo(nombre, tipo, categoria, linea));
        return true;
    }

    /** Declarar array */
    public boolean declararArray(String nombre, String tipo, String categoria,
                                 int linea, int tamanio) {
        Map<String, Simbolo> actual = pila.peek();
        if (actual.containsKey(nombre)) return false;

        actual.put(nombre, new Simbolo(nombre, tipo, categoria, linea, true, tamanio));
        return true;
    }

    // ============================
    //      BÚSQUEDAS
    // ============================

    public Simbolo buscar(String nombre) {
        for (Map<String, Simbolo> ambito : pila) {
            Simbolo s = ambito.get(nombre);
            if (s != null) return s;
        }
        return null;
    }

    public List<Simbolo> obtenerTodosLosSimbolos() {
        List<Simbolo> todos = new ArrayList<>();
        for (Map<String, Simbolo> ambito : pila) {
            todos.addAll(ambito.values());
        }
        return todos;
    }
}
