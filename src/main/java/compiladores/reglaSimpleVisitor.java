// Generated from c:\Users\g-g-e\OneDrive - UNIVERSIDAD BLAS PASCAL\Facu\11-cuatri\TC\TPs\TC-1\src\main\java\compiladores\reglaSimple.g4 by ANTLR 4.9.2
 
    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link reglaSimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface reglaSimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(reglaSimpleParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(reglaSimpleParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(reglaSimpleParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(reglaSimpleParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(reglaSimpleParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(reglaSimpleParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(reglaSimpleParser.InicializacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#listaid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaid(reglaSimpleParser.ListaidContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(reglaSimpleParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link reglaSimpleParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(reglaSimpleParser.ComparacionContext ctx);
}