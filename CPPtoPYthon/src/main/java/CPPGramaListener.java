// Generated from /home/kasia/IdeaProjects/CPPtoPYthon/CPPGrama.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPPGramaParser}.
 */
public interface CPPGramaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#unitToTranslate}.
	 * @param ctx the parse tree
	 */
	void enterUnitToTranslate(CPPGramaParser.UnitToTranslateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#unitToTranslate}.
	 * @param ctx the parse tree
	 */
	void exitUnitToTranslate(CPPGramaParser.UnitToTranslateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#unqualifiedID}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedID(CPPGramaParser.UnqualifiedIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#unqualifiedID}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedID(CPPGramaParser.UnqualifiedIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CPPGramaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CPPGramaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CPPGramaParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CPPGramaParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CPPGramaParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CPPGramaParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedNameSpecifier(CPPGramaParser.NestedNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedNameSpecifier(CPPGramaParser.NestedNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#defaultCapture}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCapture(CPPGramaParser.DefaultCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#defaultCapture}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCapture(CPPGramaParser.DefaultCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(CPPGramaParser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(CPPGramaParser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(CPPGramaParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(CPPGramaParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCapture(CPPGramaParser.SimpleCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCapture(CPPGramaParser.SimpleCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#initCapture}.
	 * @param ctx the parse tree
	 */
	void enterInitCapture(CPPGramaParser.InitCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#initCapture}.
	 * @param ctx the parse tree
	 */
	void exitInitCapture(CPPGramaParser.InitCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CPPGramaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CPPGramaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#typeIDofExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeIDofExpr(CPPGramaParser.TypeIDofExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#typeIDofExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeIDofExpr(CPPGramaParser.TypeIDofExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#typeIDofTheTypeID}.
	 * @param ctx the parse tree
	 */
	void enterTypeIDofTheTypeID(CPPGramaParser.TypeIDofTheTypeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#typeIDofTheTypeID}.
	 * @param ctx the parse tree
	 */
	void exitTypeIDofTheTypeID(CPPGramaParser.TypeIDofTheTypeIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(CPPGramaParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(CPPGramaParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void enterPseudoDestructorName(CPPGramaParser.PseudoDestructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void exitPseudoDestructorName(CPPGramaParser.PseudoDestructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(CPPGramaParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(CPPGramaParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void enterNewPlacement(CPPGramaParser.NewPlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void exitNewPlacement(CPPGramaParser.NewPlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#newTypeID}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeID(CPPGramaParser.NewTypeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#newTypeID}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeID(CPPGramaParser.NewTypeIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator(CPPGramaParser.NewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator(CPPGramaParser.NewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#noptrNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrNewDeclarator(CPPGramaParser.NoptrNewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#noptrNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrNewDeclarator(CPPGramaParser.NoptrNewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewInitializer(CPPGramaParser.NewInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewInitializer(CPPGramaParser.NewInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(CPPGramaParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(CPPGramaParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void enterNoExceptExpression(CPPGramaParser.NoExceptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void exitNoExceptExpression(CPPGramaParser.NoExceptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CPPGramaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CPPGramaParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#pmExpression}.
	 * @param ctx the parse tree
	 */
	void enterPmExpression(CPPGramaParser.PmExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#pmExpression}.
	 * @param ctx the parse tree
	 */
	void exitPmExpression(CPPGramaParser.PmExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(CPPGramaParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(CPPGramaParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(CPPGramaParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(CPPGramaParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CPPGramaParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CPPGramaParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(CPPGramaParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(CPPGramaParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CPPGramaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CPPGramaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#eqExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(CPPGramaParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#eqExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(CPPGramaParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CPPGramaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CPPGramaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#exorExpression}.
	 * @param ctx the parse tree
	 */
	void enterExorExpression(CPPGramaParser.ExorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#exorExpression}.
	 * @param ctx the parse tree
	 */
	void exitExorExpression(CPPGramaParser.ExorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#inclusiveorExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorExpression(CPPGramaParser.InclusiveorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#inclusiveorExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorExpression(CPPGramaParser.InclusiveorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#logicandExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicandExpression(CPPGramaParser.LogicandExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#logicandExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicandExpression(CPPGramaParser.LogicandExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#logicorExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicorExpression(CPPGramaParser.LogicorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#logicorExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicorExpression(CPPGramaParser.LogicorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(CPPGramaParser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(CPPGramaParser.ConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CPPGramaParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CPPGramaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CPPGramaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CPPGramaParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CPPGramaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CPPGramaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CPPGramaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CPPGramaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CPPGramaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CPPGramaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CPPGramaParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CPPGramaParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CPPGramaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CPPGramaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CPPGramaParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CPPGramaParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void enterStatementSequence(CPPGramaParser.StatementSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#statementSequence}.
	 * @param ctx the parse tree
	 */
	void exitStatementSequence(CPPGramaParser.StatementSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(CPPGramaParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(CPPGramaParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CPPGramaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CPPGramaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CPPGramaParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CPPGramaParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(CPPGramaParser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(CPPGramaParser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForRangeDeclaration(CPPGramaParser.ForRangeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForRangeDeclaration(CPPGramaParser.ForRangeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForRangeInitializer(CPPGramaParser.ForRangeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForRangeInitializer(CPPGramaParser.ForRangeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CPPGramaParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CPPGramaParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(CPPGramaParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(CPPGramaParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#declarationSequence}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSequence(CPPGramaParser.DeclarationSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#declarationSequence}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSequence(CPPGramaParser.DeclarationSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CPPGramaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CPPGramaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(CPPGramaParser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(CPPGramaParser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(CPPGramaParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(CPPGramaParser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDeclaration(CPPGramaParser.EmptyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDeclaration(CPPGramaParser.EmptyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(CPPGramaParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(CPPGramaParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifier(CPPGramaParser.DeclSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifier(CPPGramaParser.DeclSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#declSpecifierSequence}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifierSequence(CPPGramaParser.DeclSpecifierSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#declSpecifierSequence}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifierSequence(CPPGramaParser.DeclSpecifierSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(CPPGramaParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(CPPGramaParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(CPPGramaParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(CPPGramaParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(CPPGramaParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(CPPGramaParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CPPGramaParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CPPGramaParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifier(CPPGramaParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifier(CPPGramaParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#typeSpecifierSequence}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierSequence(CPPGramaParser.TypeSpecifierSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#typeSpecifierSequence}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierSequence(CPPGramaParser.TypeSpecifierSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#trailingTypeSpecifierSequence}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifierSequence(CPPGramaParser.TrailingTypeSpecifierSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#trailingTypeSpecifierSequence}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifierSequence(CPPGramaParser.TrailingTypeSpecifierSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSpecifier(CPPGramaParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSpecifier(CPPGramaParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#theTypename}.
	 * @param ctx the parse tree
	 */
	void enterTheTypename(CPPGramaParser.TheTypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#theTypename}.
	 * @param ctx the parse tree
	 */
	void exitTheTypename(CPPGramaParser.TheTypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedTypeSpecifier(CPPGramaParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedTypeSpecifier(CPPGramaParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#enumname}.
	 * @param ctx the parse tree
	 */
	void enterEnumname(CPPGramaParser.EnumnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#enumname}.
	 * @param ctx the parse tree
	 */
	void exitEnumname(CPPGramaParser.EnumnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(CPPGramaParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(CPPGramaParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#enumHead}.
	 * @param ctx the parse tree
	 */
	void enterEnumHead(CPPGramaParser.EnumHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#enumHead}.
	 * @param ctx the parse tree
	 */
	void exitEnumHead(CPPGramaParser.EnumHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueEnumDeclaration(CPPGramaParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueEnumDeclaration(CPPGramaParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#enumKey}.
	 * @param ctx the parse tree
	 */
	void enterEnumKey(CPPGramaParser.EnumKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#enumKey}.
	 * @param ctx the parse tree
	 */
	void exitEnumKey(CPPGramaParser.EnumKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#enumBase}.
	 * @param ctx the parse tree
	 */
	void enterEnumBase(CPPGramaParser.EnumBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#enumBase}.
	 * @param ctx the parse tree
	 */
	void exitEnumBase(CPPGramaParser.EnumBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorlist(CPPGramaParser.EnumeratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorlist(CPPGramaParser.EnumeratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorDefinition(CPPGramaParser.EnumeratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorDefinition(CPPGramaParser.EnumeratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(CPPGramaParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(CPPGramaParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#originalNamespacename}.
	 * @param ctx the parse tree
	 */
	void enterOriginalNamespacename(CPPGramaParser.OriginalNamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#originalNamespacename}.
	 * @param ctx the parse tree
	 */
	void exitOriginalNamespacename(CPPGramaParser.OriginalNamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(CPPGramaParser.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(CPPGramaParser.NamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamednamespacedefinition(CPPGramaParser.NamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamednamespacedefinition(CPPGramaParser.NamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#originalNamespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOriginalNamespaceDefinition(CPPGramaParser.OriginalNamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#originalNamespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOriginalNamespaceDefinition(CPPGramaParser.OriginalNamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#extensionNamespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterExtensionNamespaceDefinition(CPPGramaParser.ExtensionNamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#extensionNamespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitExtensionNamespaceDefinition(CPPGramaParser.ExtensionNamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#unnamedNamesPaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedNamesPaceDefinition(CPPGramaParser.UnnamedNamesPaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#unnamedNamesPaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedNamesPaceDefinition(CPPGramaParser.UnnamedNamesPaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#namespaceBody}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceBody(CPPGramaParser.NamespaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#namespaceBody}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceBody(CPPGramaParser.NamespaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(CPPGramaParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(CPPGramaParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingdeclaration(CPPGramaParser.UsingdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingdeclaration(CPPGramaParser.UsingdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingdirective(CPPGramaParser.UsingdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingdirective(CPPGramaParser.UsingdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkagespecification(CPPGramaParser.LinkagespecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkagespecification(CPPGramaParser.LinkagespecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attributeSpecifierSequence}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifierSequence(CPPGramaParser.AttributeSpecifierSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attributeSpecifierSequence}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifierSequence(CPPGramaParser.AttributeSpecifierSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifier(CPPGramaParser.AttributespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifier(CPPGramaParser.AttributespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void enterAttributelist(CPPGramaParser.AttributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void exitAttributelist(CPPGramaParser.AttributelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CPPGramaParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CPPGramaParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributetoken(CPPGramaParser.AttributetokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributetoken(CPPGramaParser.AttributetokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributescopedtoken(CPPGramaParser.AttributescopedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributescopedtoken(CPPGramaParser.AttributescopedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributenamespace(CPPGramaParser.AttributenamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributenamespace(CPPGramaParser.AttributenamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeargumentclause(CPPGramaParser.AttributeargumentclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeargumentclause(CPPGramaParser.AttributeargumentclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtokenseq(CPPGramaParser.BalancedtokenseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtokenseq(CPPGramaParser.BalancedtokenseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(CPPGramaParser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(CPPGramaParser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclaratorlist(CPPGramaParser.InitdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclaratorlist(CPPGramaParser.InitdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclarator(CPPGramaParser.InitdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclarator(CPPGramaParser.InitdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CPPGramaParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CPPGramaParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrdeclarator(CPPGramaParser.PtrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrdeclarator(CPPGramaParser.PtrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrdeclarator(CPPGramaParser.NoptrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrdeclarator(CPPGramaParser.NoptrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersandqualifiers(CPPGramaParser.ParametersandqualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersandqualifiers(CPPGramaParser.ParametersandqualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void enterTrailingreturntype(CPPGramaParser.TrailingreturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void exitTrailingreturntype(CPPGramaParser.TrailingreturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#ptrOperator}.
	 * @param ctx the parse tree
	 */
	void enterPtrOperator(CPPGramaParser.PtrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#ptrOperator}.
	 * @param ctx the parse tree
	 */
	void exitPtrOperator(CPPGramaParser.PtrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(CPPGramaParser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(CPPGramaParser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifier(CPPGramaParser.CvqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifier(CPPGramaParser.CvqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(CPPGramaParser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(CPPGramaParser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(CPPGramaParser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(CPPGramaParser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#theTypeID}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeID(CPPGramaParser.TheTypeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#theTypeID}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeID(CPPGramaParser.TheTypeIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractdeclarator(CPPGramaParser.AbstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractdeclarator(CPPGramaParser.AbstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrabstractdeclarator(CPPGramaParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrabstractdeclarator(CPPGramaParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractdeclarator(CPPGramaParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractdeclarator(CPPGramaParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractpackdeclarator(CPPGramaParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractpackdeclarator(CPPGramaParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractpackdeclarator(CPPGramaParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractpackdeclarator(CPPGramaParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationclause(CPPGramaParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationclause(CPPGramaParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationlist(CPPGramaParser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationlist(CPPGramaParser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclaration(CPPGramaParser.ParameterdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclaration(CPPGramaParser.ParameterdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefinition(CPPGramaParser.FunctiondefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefinition(CPPGramaParser.FunctiondefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(CPPGramaParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(CPPGramaParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CPPGramaParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CPPGramaParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceorequalinitializer(CPPGramaParser.BraceorequalinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceorequalinitializer(CPPGramaParser.BraceorequalinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerclause(CPPGramaParser.InitializerclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerclause(CPPGramaParser.InitializerclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CPPGramaParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CPPGramaParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitList(CPPGramaParser.BracedInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitList(CPPGramaParser.BracedInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(CPPGramaParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(CPPGramaParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassspecifier(CPPGramaParser.ClassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassspecifier(CPPGramaParser.ClassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#classhead}.
	 * @param ctx the parse tree
	 */
	void enterClasshead(CPPGramaParser.ClassheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#classhead}.
	 * @param ctx the parse tree
	 */
	void exitClasshead(CPPGramaParser.ClassheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void enterClassheadname(CPPGramaParser.ClassheadnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void exitClassheadname(CPPGramaParser.ClassheadnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassvirtspecifier(CPPGramaParser.ClassvirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassvirtspecifier(CPPGramaParser.ClassvirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#classkey}.
	 * @param ctx the parse tree
	 */
	void enterClasskey(CPPGramaParser.ClasskeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#classkey}.
	 * @param ctx the parse tree
	 */
	void exitClasskey(CPPGramaParser.ClasskeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberspecification(CPPGramaParser.MemberspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberspecification(CPPGramaParser.MemberspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(CPPGramaParser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(CPPGramaParser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaratorlist(CPPGramaParser.MemberdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaratorlist(CPPGramaParser.MemberdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclarator(CPPGramaParser.MemberdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclarator(CPPGramaParser.MemberdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifierseq(CPPGramaParser.VirtspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifierseq(CPPGramaParser.VirtspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifier(CPPGramaParser.VirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifier(CPPGramaParser.VirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void enterPurespecifier(CPPGramaParser.PurespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void exitPurespecifier(CPPGramaParser.PurespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void enterBaseclause(CPPGramaParser.BaseclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void exitBaseclause(CPPGramaParser.BaseclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifierlist(CPPGramaParser.BasespecifierlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifierlist(CPPGramaParser.BasespecifierlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifier(CPPGramaParser.BasespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifier(CPPGramaParser.BasespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void enterClassordecltype(CPPGramaParser.ClassordecltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void exitClassordecltype(CPPGramaParser.ClassordecltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasetypespecifier(CPPGramaParser.BasetypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasetypespecifier(CPPGramaParser.BasetypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessspecifier(CPPGramaParser.AccessspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessspecifier(CPPGramaParser.AccessspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#functionConversionID}.
	 * @param ctx the parse tree
	 */
	void enterFunctionConversionID(CPPGramaParser.FunctionConversionIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#functionConversionID}.
	 * @param ctx the parse tree
	 */
	void exitFunctionConversionID(CPPGramaParser.FunctionConversionIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void enterConversiontypeid(CPPGramaParser.ConversiontypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void exitConversiontypeid(CPPGramaParser.ConversiontypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversiondeclarator(CPPGramaParser.ConversiondeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversiondeclarator(CPPGramaParser.ConversiondeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void enterCtorinitializer(CPPGramaParser.CtorinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void exitCtorinitializer(CPPGramaParser.CtorinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerlist(CPPGramaParser.MeminitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerlist(CPPGramaParser.MeminitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializer(CPPGramaParser.MeminitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializer(CPPGramaParser.MeminitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(CPPGramaParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(CPPGramaParser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#functionOperatorID}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOperatorID(CPPGramaParser.FunctionOperatorIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#functionOperatorID}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOperatorID(CPPGramaParser.FunctionOperatorIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#literalOperatorID}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOperatorID(CPPGramaParser.LiteralOperatorIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#literalOperatorID}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOperatorID(CPPGramaParser.LiteralOperatorIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeparameter(CPPGramaParser.TypeparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeparameter(CPPGramaParser.TypeparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#typenameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypenameSpecifier(CPPGramaParser.TypenameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#typenameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypenameSpecifier(CPPGramaParser.TypenameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void enterTryblock(CPPGramaParser.TryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void exitTryblock(CPPGramaParser.TryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctiontryblock(CPPGramaParser.FunctiontryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctiontryblock(CPPGramaParser.FunctiontryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerseq(CPPGramaParser.HandlerseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerseq(CPPGramaParser.HandlerseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(CPPGramaParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(CPPGramaParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptiondeclaration(CPPGramaParser.ExceptiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptiondeclaration(CPPGramaParser.ExceptiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowexpression(CPPGramaParser.ThrowexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowexpression(CPPGramaParser.ThrowexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionspecification(CPPGramaParser.ExceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionspecification(CPPGramaParser.ExceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicexceptionspecification(CPPGramaParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicexceptionspecification(CPPGramaParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void enterTypeidlist(CPPGramaParser.TypeidlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void exitTypeidlist(CPPGramaParser.TypeidlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptspecification(CPPGramaParser.NoexceptspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptspecification(CPPGramaParser.NoexceptspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#theoperator}.
	 * @param ctx the parse tree
	 */
	void enterTheoperator(CPPGramaParser.TheoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#theoperator}.
	 * @param ctx the parse tree
	 */
	void exitTheoperator(CPPGramaParser.TheoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CPPGramaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CPPGramaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanliteral(CPPGramaParser.BooleanliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanliteral(CPPGramaParser.BooleanliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void enterPointerliteral(CPPGramaParser.PointerliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void exitPointerliteral(CPPGramaParser.PointerliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPGramaParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void enterUserdefinedliteral(CPPGramaParser.UserdefinedliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPGramaParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void exitUserdefinedliteral(CPPGramaParser.UserdefinedliteralContext ctx);
}