// Generated from /home/galiasmu/Documents/TC/TC/test-gramatica/src/main/java/compiladores/parentesis.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parentesisParser}.
 */
public interface parentesisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parentesisParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(parentesisParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link parentesisParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(parentesisParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link parentesisParser#balanceo}.
	 * @param ctx the parse tree
	 */
	void enterBalanceo(parentesisParser.BalanceoContext ctx);
	/**
	 * Exit a parse tree produced by {@link parentesisParser#balanceo}.
	 * @param ctx the parse tree
	 */
	void exitBalanceo(parentesisParser.BalanceoContext ctx);
	/**
	 * Enter a parse tree produced by {@link parentesisParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(parentesisParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link parentesisParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(parentesisParser.ParensContext ctx);
}