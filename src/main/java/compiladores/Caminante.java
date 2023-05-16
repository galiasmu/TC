package compiladores;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladoresParser.AsignacionContext;

public class Caminante extends compiladoresBaseVisitor<String> {

    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        // TODO Auto-generated method stub
        System.out.println("SOy un nodo y tengo " + ctx.getChildCount() + "hijos");
        return super.visitAsignacion(ctx);
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        System.out.println("Soy una hoja y tengo el token" + node.getText());
        return super.visitTerminal(node);
    }
    
}

