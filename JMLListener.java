// Generated from JML.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JMLParser}.
 */
public interface JMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JMLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(JMLParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(JMLParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(JMLParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(JMLParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JMLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JMLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(JMLParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(JMLParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(JMLParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(JMLParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(JMLParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(JMLParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(JMLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(JMLParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JMLParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JMLParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JMLParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JMLParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(JMLParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(JMLParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(JMLParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(JMLParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(JMLParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(JMLParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JMLParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JMLParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JMLParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JMLParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JMLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JMLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(JMLParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(JMLParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JMLParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JMLParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JMLParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JMLParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(JMLParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(JMLParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JMLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JMLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(JMLParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(JMLParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(JMLParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(JMLParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(JMLParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(JMLParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(JMLParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(JMLParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(JMLParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(JMLParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(JMLParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(JMLParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(JMLParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(JMLParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JMLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JMLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JMLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JMLParser.ProgramContext ctx);
}