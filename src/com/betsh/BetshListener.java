// Generated from /Users/ajc/Documents/projects/betsh/Betsh.g4 by ANTLR 4.7.2
package com.betsh;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BetshParser}.
 */
public interface BetshListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BetshParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BetshParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetshParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BetshParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link BetshParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BetshParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link BetshParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BetshParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arithmetic}
	 * labeled alternative in {@link BetshParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(BetshParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arithmetic}
	 * labeled alternative in {@link BetshParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(BetshParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link BetshParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(BetshParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link BetshParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(BetshParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ignore}
	 * labeled alternative in {@link BetshParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(BetshParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ignore}
	 * labeled alternative in {@link BetshParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(BetshParser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOp}
	 * labeled alternative in {@link BetshParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(BetshParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOp}
	 * labeled alternative in {@link BetshParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(BetshParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link BetshParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(BetshParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link BetshParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(BetshParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link BetshParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(BetshParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link BetshParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(BetshParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesized}
	 * labeled alternative in {@link BetshParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized(BetshParser.ParenthesizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesized}
	 * labeled alternative in {@link BetshParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized(BetshParser.ParenthesizedContext ctx);
	/**
	 * Enter a parse tree produced by {@link BetshParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(BetshParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BetshParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(BetshParser.StringExpressionContext ctx);
}