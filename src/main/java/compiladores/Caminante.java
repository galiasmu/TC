package compiladores;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladoresParser.AsignacionContext;
import compiladores.compiladoresParser.ProgramaContext;

public class Caminante extends compiladoresBaseVisitor<String> {

    private Integer asignaciones = 0;

    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        System.out.println("Soy un nodo y tengo " +  ctx.getChildCount()  +  " hijos");
        System.out.println(" ->     Asignando valor a " + ctx.getChild( 0).getText());
        //return super.visitAsignacion(ctx);
        return ctx.getText();
    }

    @Override
    public String visitPrograma(ProgramaContext ctx) {
        // TODO Auto-generated method stub
        String ret = super.visitPrograma(ctx);
        System.out.println("Se realizaron " + asignaciones + " Asignaciones");
        return ret;
    }

    @Override
    public String visitTerminal(TerminalNode node) {
       // System.out.println("Soy una hoja y tengo el token " + node.getText());
        return super.visitTerminal(node);
    }
    
}


