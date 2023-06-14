package compiladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class TablaSimbolos {  
    private static TablaSimbolos instancia = new TablaSimbolos();
    private List<Map<String, Id>> ts;

    private TablaSimbolos() {
        ts = new ArrayList<>();
        addContexto();
    }

    public static TablaSimbolos getInstance() {
        return instancia;
    }

    public void addSimbolo(Id id) {
        Map<String, Id> contextoActual = ts.get(ts.size() - 1);
        contextoActual.put(id.getNombre(), id);
    }

    public Id buscarSimbolo(String nombre) {
        for (int i = ts.size() - 1; i >= 0; i--) {
            Map<String, Id> contexto = ts.get(i);
            if (contexto.containsKey(nombre)) {
                return contexto.get(nombre);
            }
        }
        return null;
    }

    public void addContexto() {
        ts.add(new HashMap<>());
    }

    public void delContexto() {
        ts.remove(ts.size() - 1);
    }
}