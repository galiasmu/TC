// Generated from /home/galiasmu/Documents/Facu/TC/Compilador2025/demo/src/main/antlr4/com/compilador/MiniLenguaje.g4 by ANTLR 4.13.1
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MiniLenguajeParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(MiniLenguajeParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MiniLenguajeParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MiniLenguajeParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(MiniLenguajeParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(MiniLenguajeParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstrDeclaracion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrDeclaracion(MiniLenguajeParser.InstrDeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstrAsignacion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrAsignacion(MiniLenguajeParser.InstrAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstrIf}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrIf(MiniLenguajeParser.InstrIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstrWhile}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrWhile(MiniLenguajeParser.InstrWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstrReturn}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrReturn(MiniLenguajeParser.InstrReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstrExpresion}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrExpresion(MiniLenguajeParser.InstrExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstrBloque}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrBloque(MiniLenguajeParser.InstrBloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiniLenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRelacional}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional(MiniLenguajeParser.ExprRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIgualdad}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIgualdad(MiniLenguajeParser.ExprIgualdadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCadena}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCadena(MiniLenguajeParser.ExprCadenaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNegativo}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNegativo(MiniLenguajeParser.ExprNegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(MiniLenguajeParser.ExprBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprChar(MiniLenguajeParser.ExprCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLlamada}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLlamada(MiniLenguajeParser.ExprLlamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(MiniLenguajeParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSumRest}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSumRest(MiniLenguajeParser.ExprSumRestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(MiniLenguajeParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParentesis}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParentesis(MiniLenguajeParser.ExprParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDecimal}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDecimal(MiniLenguajeParser.ExprDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(MiniLenguajeParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumero}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumero(MiniLenguajeParser.ExprNumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(MiniLenguajeParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(MiniLenguajeParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
}