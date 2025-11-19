// Generated from com/MiniLenguaje.g4 by ANTLR 4.9.3
package com;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLenguajeParser}.
 */
public interface MiniLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiniLenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiniLenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(MiniLenguajeParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(MiniLenguajeParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MiniLenguajeParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MiniLenguajeParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MiniLenguajeParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MiniLenguajeParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(MiniLenguajeParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(MiniLenguajeParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstrDeclaracion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstrDeclaracion(MiniLenguajeParser.InstrDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstrDeclaracion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstrDeclaracion(MiniLenguajeParser.InstrDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstrAsignacion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstrAsignacion(MiniLenguajeParser.InstrAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstrAsignacion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstrAsignacion(MiniLenguajeParser.InstrAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstrIf}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstrIf(MiniLenguajeParser.InstrIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstrIf}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstrIf(MiniLenguajeParser.InstrIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstrWhile}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstrWhile(MiniLenguajeParser.InstrWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstrWhile}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstrWhile(MiniLenguajeParser.InstrWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstrReturn}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstrReturn(MiniLenguajeParser.InstrReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstrReturn}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstrReturn(MiniLenguajeParser.InstrReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstrExpresion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstrExpresion(MiniLenguajeParser.InstrExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstrExpresion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstrExpresion(MiniLenguajeParser.InstrExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstrBloque}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstrBloque(MiniLenguajeParser.InstrBloqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstrBloque}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstrBloque(MiniLenguajeParser.InstrBloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiniLenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiniLenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRelacional}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(MiniLenguajeParser.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRelacional}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(MiniLenguajeParser.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIgualdad}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprIgualdad(MiniLenguajeParser.ExprIgualdadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIgualdad}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprIgualdad(MiniLenguajeParser.ExprIgualdadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCadena}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprCadena(MiniLenguajeParser.ExprCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCadena}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprCadena(MiniLenguajeParser.ExprCadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNegativo}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprNegativo(MiniLenguajeParser.ExprNegativoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNegativo}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprNegativo(MiniLenguajeParser.ExprNegativoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(MiniLenguajeParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(MiniLenguajeParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprChar(MiniLenguajeParser.ExprCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprChar(MiniLenguajeParser.ExprCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLlamada}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprLlamada(MiniLenguajeParser.ExprLlamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLlamada}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprLlamada(MiniLenguajeParser.ExprLlamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(MiniLenguajeParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(MiniLenguajeParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSumRest}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprSumRest(MiniLenguajeParser.ExprSumRestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSumRest}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprSumRest(MiniLenguajeParser.ExprSumRestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(MiniLenguajeParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(MiniLenguajeParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprParentesis(MiniLenguajeParser.ExprParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprParentesis(MiniLenguajeParser.ExprParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDecimal}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprDecimal(MiniLenguajeParser.ExprDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDecimal}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprDecimal(MiniLenguajeParser.ExprDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(MiniLenguajeParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(MiniLenguajeParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumero}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprNumero(MiniLenguajeParser.ExprNumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumero}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprNumero(MiniLenguajeParser.ExprNumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(MiniLenguajeParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(MiniLenguajeParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprID(MiniLenguajeParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprID(MiniLenguajeParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
}