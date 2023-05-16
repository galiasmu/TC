// Generated from c:\Users\g-g-e\OneDrive - UNIVERSIDAD BLAS PASCAL\Facu\11-cuatri\TC\TPs\TC-1\src\main\java\compiladores\TP1.g4 by ANTLR 4.9.2
 
    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TP1Parser}.
 */
public interface TP1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TP1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TP1Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TP1Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(TP1Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(TP1Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(TP1Parser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(TP1Parser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(TP1Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(TP1Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(TP1Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(TP1Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(TP1Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(TP1Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(TP1Parser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(TP1Parser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#listaid}.
	 * @param ctx the parse tree
	 */
	void enterListaid(TP1Parser.ListaidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#listaid}.
	 * @param ctx the parse tree
	 */
	void exitListaid(TP1Parser.ListaidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(TP1Parser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(TP1Parser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(TP1Parser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(TP1Parser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(TP1Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(TP1Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(TP1Parser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(TP1Parser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TP1Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TP1Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TP1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TP1Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TP1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TP1Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TP1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TP1Parser.FactorContext ctx);
}