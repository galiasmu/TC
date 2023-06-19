package compiladores.Errores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import compiladores.Id;


public class TablaSimbolos {
    private static TablaSimbolos instance;
    private List<Map<String, Id>> ts;
    
    private TablaSimbolos() {
        ts = new ArrayList<>();
    }
    
    public static TablaSimbolos getInstance() {
        if (instance == null) {
            instance = new TablaSimbolos();
        }
        return instance;
    }
    
    public void addSimbolo(Id var1) {
        Map<String, Id> contexto = ts.get(ts.size() - 1);
        contexto.put(var1.getNombre(), var1);
    }
    
    public Id buscarSimbolo(Variable var2) {
        for (int i = ts.size() - 1; i >= 0; i--) {
            Map<String, Id> contexto = ts.get(i);
            if (contexto.containsKey(var2)) {
                return contexto.get(var2);
            }
        }
        return null;
    }
    
    public void addContexto() {
        ts.add(new HashMap<>());
    }
    
    public void delContexto() {
        if (!ts.isEmpty()) {
            ts.remove(ts.size() - 1);
        }
    }
    
    public void mostrarTabla() {
        for (Map<String, Id> contexto : ts) {
            for (Id id : contexto.values()) {
                System.out.println("Nombre: " + id.getNombre() + ", Tipo: " + id.getTipoDato());
            }
        }
    }
}
