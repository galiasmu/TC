package compiladores;

public abstract class Id {
    String nombre;
    Boolean inicializado;
    Boolean usado;
    String tipoDato;

    public Id(String nombre, Boolean inicializado, Boolean usado, String tipoDato) {
        this.nombre = nombre;
        this.inicializado = inicializado;
        this.usado = usado;
        this.tipoDato = tipoDato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getInicializado() {
        return inicializado;
    }

    public void setInicializado(Boolean inicializado) {
        this.inicializado = inicializado;
    }

    public Boolean getUsado() {
        return usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    
}

