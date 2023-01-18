// Generated from java-escape by ANTLR 4.11.1

package top.alumopper.mcfpp.lib;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mcfppParser}.
 */
public interface mcfppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mcfppParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(mcfppParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(mcfppParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDeclaration(mcfppParser.NamespaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDeclaration(mcfppParser.NamespaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(mcfppParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(mcfppParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#classOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassOrFunctionDeclaration(mcfppParser.ClassOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#classOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassOrFunctionDeclaration(mcfppParser.ClassOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(mcfppParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(mcfppParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(mcfppParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(mcfppParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(mcfppParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(mcfppParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(mcfppParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(mcfppParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCall(mcfppParser.ConstructorCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#constructorCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCall(mcfppParser.ConstructorCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(mcfppParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(mcfppParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(mcfppParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(mcfppParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(mcfppParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(mcfppParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mcfppParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mcfppParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(mcfppParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(mcfppParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(mcfppParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(mcfppParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(mcfppParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(mcfppParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(mcfppParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(mcfppParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(mcfppParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(mcfppParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(mcfppParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(mcfppParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(mcfppParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(mcfppParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(mcfppParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(mcfppParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(mcfppParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(mcfppParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(mcfppParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(mcfppParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasicExpression(mcfppParser.BasicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#basicExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasicExpression(mcfppParser.BasicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(mcfppParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(mcfppParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(mcfppParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(mcfppParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#varWithSelector}.
	 * @param ctx the parse tree
	 */
	void enterVarWithSelector(mcfppParser.VarWithSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#varWithSelector}.
	 * @param ctx the parse tree
	 */
	void exitVarWithSelector(mcfppParser.VarWithSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(mcfppParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(mcfppParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSuffix(mcfppParser.IdentifierSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSuffix(mcfppParser.IdentifierSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(mcfppParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(mcfppParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(mcfppParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(mcfppParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(mcfppParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(mcfppParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(mcfppParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(mcfppParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(mcfppParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(mcfppParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(mcfppParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(mcfppParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#selfAddOrMinusExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfAddOrMinusExpression(mcfppParser.SelfAddOrMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#selfAddOrMinusExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfAddOrMinusExpression(mcfppParser.SelfAddOrMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(mcfppParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(mcfppParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(mcfppParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(mcfppParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(mcfppParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(mcfppParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#forVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForVariableDeclaration(mcfppParser.ForVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#forVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForVariableDeclaration(mcfppParser.ForVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(mcfppParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(mcfppParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mcfppParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mcfppParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(mcfppParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(mcfppParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(mcfppParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(mcfppParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(mcfppParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(mcfppParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mcfppParser#namespaceID}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceID(mcfppParser.NamespaceIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcfppParser#namespaceID}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceID(mcfppParser.NamespaceIDContext ctx);
}