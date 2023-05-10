// Generated from c:\Users\g-g-e\OneDrive - UNIVERSIDAD BLAS PASCAL\Facu\11-cuatri\TC\TPs\TC-1\src\main\java\compiladores\TP1.g4 by ANTLR 4.9.2
 
    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TP1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TP1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TP1Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TP1Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(TP1Parser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(TP1Parser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(TP1Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(TP1Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(TP1Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(TP1Parser.InicializacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#listaid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaid(TP1Parser.ListaidContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(TP1Parser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(TP1Parser.ComparacionContext ctx);
}