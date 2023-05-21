// Generated from /home/galiasmu/Documents/TC/TC-1/src/main/java/compiladores/TP1.g4 by ANTLR 4.9.2
 
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
	 * Visit a parse tree produced by {@link TP1Parser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(TP1Parser.IncrementoContext ctx);
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
	 * Visit a parse tree produced by {@link TP1Parser#fi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFi(TP1Parser.FiContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#rof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRof(TP1Parser.RofContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(TP1Parser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(TP1Parser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(TP1Parser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TP1Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(TP1Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TP1Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(TP1Parser.FactorContext ctx);
}