package compiladores;

// Generated from c:\Users\g-g-e\OneDrive - UNIVERSIDAD BLAS PASCAL\Facu\11-cuatri\TC\TPs\TC-1\src\main\java\compiladores\parentesis.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parentesisParser}.
 */
public interface parentesisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parentesisParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(parentesisParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link parentesisParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(parentesisParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link parentesisParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(parentesisParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link parentesisParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(parentesisParser.SContext ctx);
}