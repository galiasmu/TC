package com.compilador;

import java.util.*;

/**
 * Tabla de símbolos con soporte de ámbitos (scope).
 */
public class TablaDeSimbolos {

    public static class Simbolo {
        public final String nombre;
        public final String tipo;
        public final String categoria; // "variable", "funcion", "parametro"
        public final int lineaDeclaracion;
        public boolean usado = false;

        public Simbolo(String nombre, String tipo, String categoria, int lineaDeclaracion) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.categoria = categoria;
            this.lineaDeclaracion = lineaDeclaracion;
        }
    }

    // pila de ámbitos (el tope es el ámbito actual)
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

    /**
     * Declara un símbolo en el ámbito actual.
     * Devuelve false si ya existía en ese mismo ámbito.
     */
    public boolean declarar(String nombre, String tipo, String categoria, int linea) {
        Map<String, Simbolo> actual = pila.peek();
        if (actual.containsKey(nombre)) {
            return false;
        }
        actual.put(nombre, new Simbolo(nombre, tipo, categoria, linea));
        return true;
    }

    /**
     * Busca un símbolo en la pila de ámbitos (de adentro hacia afuera).
     */
    public Simbolo buscar(String nombre) {
        for (Map<String, Simbolo> ambito : pila) {
            Simbolo s = ambito.get(nombre);
            if (s != null) {
                return s;
            }
        }
        return null;
    }

    /**
     * Devuelve todos los símbolos de todos los ámbitos (para warnings globales).
     */
    public List<Simbolo> obtenerTodosLosSimbolos() {
        List<Simbolo> todos = new ArrayList<>();
        for (Map<String, Simbolo> ambito : pila) {
            todos.addAll(ambito.values());
        }
        return todos;
    }
}
