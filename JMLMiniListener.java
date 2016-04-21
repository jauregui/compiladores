// Generated from JMLMini.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JMLMiniParser}.
 */
public interface JMLMiniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(JMLMiniParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(JMLMiniParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JMLMiniParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JMLMiniParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JMLMiniParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JMLMiniParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(JMLMiniParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(JMLMiniParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JMLMiniParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JMLMiniParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JMLMiniParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JMLMiniParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JMLMiniParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JMLMiniParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JMLMiniParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JMLMiniParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JMLMiniParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JMLMiniParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(JMLMiniParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(JMLMiniParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(JMLMiniParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(JMLMiniParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JMLMiniParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JMLMiniParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLMiniParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JMLMiniParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLMiniParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JMLMiniParser.AssignmentOperatorContext ctx);
}