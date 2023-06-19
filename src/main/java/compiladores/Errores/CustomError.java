package compiladores.Errores;

public class CustomError {
    private String mensaje;
    private boolean esSintactico;
    
    public CustomError(String mensaje, boolean esSintactico) {
        this.mensaje = mensaje;
        this.esSintactico = esSintactico;
    }
    
    public String getMensaje() {
        return mensaje;
    }
    
    public boolean esSintactico() {
        return esSintactico;
    }
}
