package com.compilador;

import java.util.ArrayList;
import java.util.List;

/**
 * Nodo base para todos los nodos del AST.
 */
public abstract class NodoAST {
    public final int linea;
    public final int columna;

    public NodoAST() {
        this(0,0);
    }
    protected NodoAST(int linea, int columna) {
        this.linea = linea;
        this.columna = columna;
    }

    

    public abstract String toString(String prefijo);

    @Override
    public String toString() {
        return toString("");
    }
}

/**
 * Nodo raíz: representa todo el programa.
 */
class ProgramaNodo extends NodoAST {
    public final List<NodoAST> sentencias;

    public ProgramaNodo(int linea, int columna, List<NodoAST> sentencias) {
        super(linea, columna);
        this.sentencias = sentencias;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefijo).append("Programa\n");
        for (NodoAST n : sentencias) {
            sb.append(n.toString(prefijo + "  "));
        }
        return sb.toString();
    }
}

/**
 * Declaración de variable: int x;  double valor; etc.
 */
    class DeclaracionVariableNodo extends NodoAST {
    public final String tipo;
    public final String nombre;
    public final ExpresionNodo inicializacion; // puede ser null

    // Constructor sin inicialización (para cosas como: int x;)
    public DeclaracionVariableNodo(int linea, int columna, String tipo, String nombre) {
        this(linea, columna, tipo, nombre, null);
    }

    // Constructor con inicialización (para: int x = expr;)
    public DeclaracionVariableNodo(int linea, int columna, String tipo,
                                   String nombre, ExpresionNodo inicializacion) {
        super(linea, columna);
        this.tipo = tipo;
        this.nombre = nombre;
        this.inicializacion = inicializacion;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefijo)
          .append("DeclaracionVar(tipo=").append(tipo)
          .append(", nombre=").append(nombre)
          .append(", linea=").append(linea)
          .append(", col=").append(columna)
          .append(")");
        if (inicializacion != null) {
            sb.append("\n")
              .append(prefijo)
              .append("  Inicializacion:\n")
              .append(inicializacion.toString(prefijo + "    "));
        }
        return sb.toString();
    }
}


/**
 * Parámetro de función: int a, double b, etc.
 */
class ParametroNodo extends NodoAST {
    public final String tipo;
    public final String nombre;

    public ParametroNodo(int linea, int columna, String tipo, String nombre) {
        super(linea, columna);
        this.tipo = tipo;
        this.nombre = nombre;
    }

    @Override
    public String toString(String prefijo) {
        return String.format(
                "%sParametro(tipo=%s, nombre=%s)%n",
                prefijo, tipo, nombre
        );
    }
}

/**
 * Definición de función.
 */
class FuncionNodo extends NodoAST {
    public final String tipoRetorno;
    public final String nombre;
    public final List<ParametroNodo> parametros;
    public final List<NodoAST> cuerpo; // lista de instrucciones dentro de la función

    public FuncionNodo(int linea, int columna,
                       String tipoRetorno,
                       String nombre,
                       List<ParametroNodo> parametros,
                       List<NodoAST> cuerpo) {
        super(linea, columna);
        this.tipoRetorno = tipoRetorno;
        this.nombre = nombre;
        this.parametros = parametros;
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(
                String.format("%sFuncion %s %s()%n", prefijo, tipoRetorno, nombre)
        );
        if (!parametros.isEmpty()) {
            sb.append(prefijo).append("  Parametros:\n");
            for (ParametroNodo p : parametros) {
                sb.append(p.toString(prefijo + "    "));
            }
        }
        if (!cuerpo.isEmpty()) {
            sb.append(prefijo).append("  Cuerpo:\n");
            for (NodoAST n : cuerpo) {
                sb.append(n.toString(prefijo + "    "));
            }
        }
        return sb.toString();
    }
}

/**
 * Asignación: x = expr;
 */
class AsignacionNodo extends NodoAST {
    public final String nombreVariable;
    public final ExpresionNodo expresion;

    public AsignacionNodo(int linea, int columna, String nombreVariable, ExpresionNodo expresion) {
        super(linea, columna);
        this.nombreVariable = nombreVariable;
        this.expresion = expresion;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%sAsignacion(%s = )%n", prefijo, nombreVariable));
        if (expresion != null) {
            sb.append(expresion.toString(prefijo + "  "));
        }
        return sb.toString();
    }
}

/**
 * Sentencia return.
 */
class ReturnNodo extends NodoAST {
    public final ExpresionNodo expresion;

    public ReturnNodo(int linea, int columna, ExpresionNodo expresion) {
        super(linea, columna);
        this.expresion = expresion;
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefijo).append("Return\n");
        if (expresion != null) {
            sb.append(expresion.toString(prefijo + "  "));
        }
        return sb.toString();
    }
}

/**
 * Nodo genérico para expresiones.
 * Para simplificar, solo guardamos una etiqueta (operador, literal, identificador)
 * y una lista de hijos.
 */
class ExpresionNodo extends NodoAST {
    public final String etiqueta;
    public final List<ExpresionNodo> hijos;

    public ExpresionNodo(int linea, int columna, String etiqueta) {
        super(linea, columna);
        this.etiqueta = etiqueta;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(ExpresionNodo hijo) {
        hijos.add(hijo);
    }

    @Override
    public String toString(String prefijo) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%sExpr(%s)%n", prefijo, etiqueta));
        for (ExpresionNodo h : hijos) {
            sb.append(h.toString(prefijo + "  "));
        }
        return sb.toString();
    }
}
