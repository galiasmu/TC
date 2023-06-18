package compiladores;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores.compiladoresParser.ProgramaContext;

public class Escucha extends compiladoresBaseListener {
    private Integer nodos = 0;
    private Integer tokens = 0;
    private Integer rules = 0;
    private Integer error = 0;
    //hola

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("\tNueva asignacion: |" + ctx.getText() + "| - hijos = " + ctx.getChildCount() );
        super.enterPrograma(ctx);
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("\t --> Fin asignacion: |" + ctx.getText() + "| - hijos = " +  ctx.getChildCount() );
        super.exitPrograma(ctx);
        System.out.println("Se visitaron " + nodos + "nodos");
        System.out.println("Hay " + tokens + "Tokens");
        System.out.println("Hay " + error + "Errores");
        System.out.println("Hay " + rules + "Rules");
    }

    
        


    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        rules++;
        super.enterEveryRule(ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
        error++;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        tokens++;
        super.visitTerminal(node);
    }}
