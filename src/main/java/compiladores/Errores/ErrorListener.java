package compiladores.Errores;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;

import compiladores.compiladoresBaseListener;

public class ErrorListener extends compiladoresBaseListener {
    private List<CustomError> errores;
    
    public ErrorListener() {
        errores = new ArrayList<>();
    }
    
    public List<CustomError> getErrores() {
        return errores;
    }
    
    @Override
    public void visitErrorNode(ErrorNode node) {
        String mensaje = "Error: " + node.getText();
        boolean esSintactico = true;
        if (mensaje.contains("uso de un identificador no declarado")) {
            mensaje = "Error semántico: Uso de un identificador no declarado";
            esSintactico = false;
        } else if (mensaje.contains("uso de un identificador sin inicializar")) {
            mensaje = "Error semántico: Uso de un identificador sin inicializar";
            esSintactico = false;
        }
        errores.add(new CustomError(mensaje, esSintactico));
    }
}