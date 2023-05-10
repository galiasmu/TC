// Generated from c:\Users\g-g-e\OneDrive - UNIVERSIDAD BLAS PASCAL\Facu\11-cuatri\TC\TPs\TC-1\src\main\java\compiladores\reglaSimple.g4 by ANTLR 4.9.2
 
    package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link reglaSimpleParser}.
 */
public interface reglaSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(reglaSimpleParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(reglaSimpleParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(reglaSimpleParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(reglaSimpleParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(reglaSimpleParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(reglaSimpleParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(reglaSimpleParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(reglaSimpleParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(reglaSimpleParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(reglaSimpleParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(reglaSimpleParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(reglaSimpleParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(reglaSimpleParser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(reglaSimpleParser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#listaid}.
	 * @param ctx the parse tree
	 */
	void enterListaid(reglaSimpleParser.ListaidContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#listaid}.
	 * @param ctx the parse tree
	 */
	void exitListaid(reglaSimpleParser.ListaidContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(reglaSimpleParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(reglaSimpleParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link reglaSimpleParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(reglaSimpleParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link reglaSimpleParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(reglaSimpleParser.ComparacionContext ctx);
}