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
	 * Visit a parse tree produced by the {@code InstrReturn}
	 * labeled alternative in {@link MiniLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrReturn(MiniLenguajeParser.InstrReturnContext ctx);
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
	 * Visit a parse tree produced by {@link MiniLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiniLenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(MiniLenguajeParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiniLenguajeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(MiniLenguajeParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLe}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLe(MiniLenguajeParser.ExprLeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(MiniLenguajeParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAtom}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(MiniLenguajeParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNeg}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(MiniLenguajeParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(MiniLenguajeParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprGt}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGt(MiniLenguajeParser.ExprGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDiv}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDiv(MiniLenguajeParser.ExprDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEq}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEq(MiniLenguajeParser.ExprEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(MiniLenguajeParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCall}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCall(MiniLenguajeParser.ExprCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLt}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLt(MiniLenguajeParser.ExprLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(MiniLenguajeParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNeq}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeq(MiniLenguajeParser.ExprNeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(MiniLenguajeParser.ExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprGe}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprGe(MiniLenguajeParser.ExprGeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMul(MiniLenguajeParser.ExprMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(MiniLenguajeParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMod}
	 * labeled alternative in {@link MiniLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMod(MiniLenguajeParser.ExprModContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLenguajeParser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomo(MiniLenguajeParser.AtomoContext ctx);
}