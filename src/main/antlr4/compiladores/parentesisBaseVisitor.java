// Generated from /home/galiasmu/Documents/Facu/TC/TC/src/main/antlr4/compiladores/parentesis.g4 by ANTLR 4.13.1

package compiladores;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link parentesisVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class parentesisBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements parentesisVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSi(parentesisParser.SiContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitS(parentesisParser.SContext ctx) { return visitChildren(ctx); }
}