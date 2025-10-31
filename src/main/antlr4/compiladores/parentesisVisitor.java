// Generated from /home/galiasmu/Documents/Facu/TC/TC/src/main/antlr4/compiladores/parentesis.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parentesisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parentesisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parentesisParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(parentesisParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link parentesisParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(parentesisParser.SContext ctx);
}