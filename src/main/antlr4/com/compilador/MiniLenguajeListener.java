// Generated from /home/galiasmu/Documents/Facu/TC/Compilador2025/demo/src/main/antlr4/com/compilador/MiniLenguaje.g4 by ANTLR 4.13.1
package com.compilador;
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
	 * Enter a parse tree produced by {@link MiniLenguajeParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(MiniLenguajeParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(MiniLenguajeParser.LvalueContext ctx);
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
	 * Enter a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLe}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprLe(MiniLenguajeParser.ExprLeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLe}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprLe(MiniLenguajeParser.ExprLeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(MiniLenguajeParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(MiniLenguajeParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAtom}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(MiniLenguajeParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAtom}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(MiniLenguajeParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNeg}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprNeg(MiniLenguajeParser.ExprNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNeg}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprNeg(MiniLenguajeParser.ExprNegContext ctx);
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
	 * Enter a parse tree produced by the {@code ExprGt}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprGt(MiniLenguajeParser.ExprGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprGt}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprGt(MiniLenguajeParser.ExprGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDiv}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprDiv(MiniLenguajeParser.ExprDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDiv}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprDiv(MiniLenguajeParser.ExprDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEq}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprEq(MiniLenguajeParser.ExprEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEq}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprEq(MiniLenguajeParser.ExprEqContext ctx);
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
	 * Enter a parse tree produced by the {@code ExprCall}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprCall(MiniLenguajeParser.ExprCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCall}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprCall(MiniLenguajeParser.ExprCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLt}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprLt(MiniLenguajeParser.ExprLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLt}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprLt(MiniLenguajeParser.ExprLtContext ctx);
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
	 * Enter a parse tree produced by the {@code ExprNeq}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprNeq(MiniLenguajeParser.ExprNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNeq}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprNeq(MiniLenguajeParser.ExprNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprSub(MiniLenguajeParser.ExprSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprSub(MiniLenguajeParser.ExprSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprGe}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprGe(MiniLenguajeParser.ExprGeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprGe}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprGe(MiniLenguajeParser.ExprGeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprMul(MiniLenguajeParser.ExprMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprMul(MiniLenguajeParser.ExprMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(MiniLenguajeParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(MiniLenguajeParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMod}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExprMod(MiniLenguajeParser.ExprModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMod}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExprMod(MiniLenguajeParser.ExprModContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLenguajeParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterAtomo(MiniLenguajeParser.AtomoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLenguajeParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitAtomo(MiniLenguajeParser.AtomoContext ctx);
}