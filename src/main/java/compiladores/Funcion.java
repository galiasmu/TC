package compiladores;

import java.util.List;

public class Funcion extends Id {
    public Funcion(String nombre, Boolean inicializado, Boolean usado, String tipoDato) {
        super(nombre, inicializado, usado, tipoDato);
        //TODO Auto-generated constructor stub
    }
    private List<String> argumentos;
}

//hola