// Generated from /home/kasia/IdeaProjects/CPPtoPYthon/CPPGrama.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPPGramaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPPGramaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#unitToTranslate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitToTranslate(CPPGramaParser.UnitToTranslateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#unqualifiedID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedID(CPPGramaParser.UnqualifiedIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CPPGramaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CPPGramaParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(CPPGramaParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNameSpecifier(CPPGramaParser.NestedNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#defaultCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCapture(CPPGramaParser.DefaultCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#captureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureList(CPPGramaParser.CaptureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(CPPGramaParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#simpleCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCapture(CPPGramaParser.SimpleCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#initCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitCapture(CPPGramaParser.InitCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(CPPGramaParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#typeIDofExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIDofExpr(CPPGramaParser.TypeIDofExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#typeIDofTheTypeID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIDofTheTypeID(CPPGramaParser.TypeIDofTheTypeIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#expressionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionlist(CPPGramaParser.ExpressionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoDestructorName(CPPGramaParser.PseudoDestructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(CPPGramaParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#newPlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPlacement(CPPGramaParser.NewPlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#newTypeID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTypeID(CPPGramaParser.NewTypeIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator(CPPGramaParser.NewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#noptrNewDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrNewDeclarator(CPPGramaParser.NoptrNewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#newInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitializer(CPPGramaParser.NewInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#deleteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(CPPGramaParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#noExceptExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoExceptExpression(CPPGramaParser.NoExceptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(CPPGramaParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#pmExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPmExpression(CPPGramaParser.PmExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(CPPGramaParser.MulExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(CPPGramaParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(CPPGramaParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(CPPGramaParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(CPPGramaParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#eqExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(CPPGramaParser.EqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(CPPGramaParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#exorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExorExpression(CPPGramaParser.ExorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#inclusiveorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveorExpression(CPPGramaParser.InclusiveorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#logicandExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicandExpression(CPPGramaParser.LogicandExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#logicorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicorExpression(CPPGramaParser.LogicorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(CPPGramaParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CPPGramaParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CPPGramaParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CPPGramaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CPPGramaParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CPPGramaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(CPPGramaParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CPPGramaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CPPGramaParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#statementSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSequence(CPPGramaParser.StatementSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(CPPGramaParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CPPGramaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CPPGramaParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(CPPGramaParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeDeclaration(CPPGramaParser.ForRangeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeInitializer(CPPGramaParser.ForRangeInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(CPPGramaParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(CPPGramaParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#declarationSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSequence(CPPGramaParser.DeclarationSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CPPGramaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(CPPGramaParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(CPPGramaParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDeclaration(CPPGramaParser.EmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(CPPGramaParser.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#declSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifier(CPPGramaParser.DeclSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#declSpecifierSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifierSequence(CPPGramaParser.DeclSpecifierSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(CPPGramaParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(CPPGramaParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(CPPGramaParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(CPPGramaParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifier(CPPGramaParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#typeSpecifierSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierSequence(CPPGramaParser.TypeSpecifierSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#trailingTypeSpecifierSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifierSequence(CPPGramaParser.TrailingTypeSpecifierSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(CPPGramaParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#theTypename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypename(CPPGramaParser.TheTypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedTypeSpecifier(CPPGramaParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#enumname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumname(CPPGramaParser.EnumnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(CPPGramaParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#enumHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumHead(CPPGramaParser.EnumHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueEnumDeclaration(CPPGramaParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#enumKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumKey(CPPGramaParser.EnumKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#enumBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBase(CPPGramaParser.EnumBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#enumeratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorlist(CPPGramaParser.EnumeratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorDefinition(CPPGramaParser.EnumeratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(CPPGramaParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#originalNamespacename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespacename(CPPGramaParser.OriginalNamespacenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(CPPGramaParser.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamednamespacedefinition(CPPGramaParser.NamednamespacedefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#originalNamespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespaceDefinition(CPPGramaParser.OriginalNamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#extensionNamespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionNamespaceDefinition(CPPGramaParser.ExtensionNamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#unnamedNamesPaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedNamesPaceDefinition(CPPGramaParser.UnnamedNamesPaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#namespaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceBody(CPPGramaParser.NamespaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(CPPGramaParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#usingdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingdeclaration(CPPGramaParser.UsingdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#usingdirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingdirective(CPPGramaParser.UsingdirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#linkagespecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkagespecification(CPPGramaParser.LinkagespecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attributeSpecifierSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifierSequence(CPPGramaParser.AttributeSpecifierSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attributespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributespecifier(CPPGramaParser.AttributespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attributelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributelist(CPPGramaParser.AttributelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(CPPGramaParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attributetoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributetoken(CPPGramaParser.AttributetokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributescopedtoken(CPPGramaParser.AttributescopedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attributenamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributenamespace(CPPGramaParser.AttributenamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeargumentclause(CPPGramaParser.AttributeargumentclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtokenseq(CPPGramaParser.BalancedtokenseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(CPPGramaParser.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitdeclaratorlist(CPPGramaParser.InitdeclaratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#initdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitdeclarator(CPPGramaParser.InitdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CPPGramaParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrdeclarator(CPPGramaParser.PtrdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrdeclarator(CPPGramaParser.NoptrdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersandqualifiers(CPPGramaParser.ParametersandqualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#trailingreturntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingreturntype(CPPGramaParser.TrailingreturntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#ptrOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrOperator(CPPGramaParser.PtrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(CPPGramaParser.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#cvqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifier(CPPGramaParser.CvqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(CPPGramaParser.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(CPPGramaParser.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#theTypeID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeID(CPPGramaParser.TheTypeIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractdeclarator(CPPGramaParser.AbstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrabstractdeclarator(CPPGramaParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrabstractdeclarator(CPPGramaParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractpackdeclarator(CPPGramaParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoptrabstractpackdeclarator(CPPGramaParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclarationclause(CPPGramaParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclarationlist(CPPGramaParser.ParameterdeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclaration(CPPGramaParser.ParameterdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#functiondefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondefinition(CPPGramaParser.FunctiondefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(CPPGramaParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(CPPGramaParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceorequalinitializer(CPPGramaParser.BraceorequalinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#initializerclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerclause(CPPGramaParser.InitializerclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(CPPGramaParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#bracedInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitList(CPPGramaParser.BracedInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#classname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassname(CPPGramaParser.ClassnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#classspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassspecifier(CPPGramaParser.ClassspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#classhead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasshead(CPPGramaParser.ClassheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#classheadname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassheadname(CPPGramaParser.ClassheadnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassvirtspecifier(CPPGramaParser.ClassvirtspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#classkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasskey(CPPGramaParser.ClasskeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#memberspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberspecification(CPPGramaParser.MemberspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(CPPGramaParser.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaratorlist(CPPGramaParser.MemberdeclaratorlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#memberdeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclarator(CPPGramaParser.MemberdeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtspecifierseq(CPPGramaParser.VirtspecifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#virtspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtspecifier(CPPGramaParser.VirtspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#purespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurespecifier(CPPGramaParser.PurespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#baseclause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseclause(CPPGramaParser.BaseclauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#basespecifierlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasespecifierlist(CPPGramaParser.BasespecifierlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#basespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasespecifier(CPPGramaParser.BasespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#classordecltype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassordecltype(CPPGramaParser.ClassordecltypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#basetypespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasetypespecifier(CPPGramaParser.BasetypespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#accessspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessspecifier(CPPGramaParser.AccessspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#functionConversionID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionConversionID(CPPGramaParser.FunctionConversionIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#conversiontypeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversiontypeid(CPPGramaParser.ConversiontypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversiondeclarator(CPPGramaParser.ConversiondeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#ctorinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtorinitializer(CPPGramaParser.CtorinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#meminitializerlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerlist(CPPGramaParser.MeminitializerlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#meminitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializer(CPPGramaParser.MeminitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(CPPGramaParser.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#functionOperatorID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionOperatorID(CPPGramaParser.FunctionOperatorIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#literalOperatorID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOperatorID(CPPGramaParser.LiteralOperatorIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#typeparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeparameter(CPPGramaParser.TypeparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#typenameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypenameSpecifier(CPPGramaParser.TypenameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#tryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryblock(CPPGramaParser.TryblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#functiontryblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiontryblock(CPPGramaParser.FunctiontryblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#handlerseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerseq(CPPGramaParser.HandlerseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(CPPGramaParser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptiondeclaration(CPPGramaParser.ExceptiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#throwexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowexpression(CPPGramaParser.ThrowexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#exceptionspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionspecification(CPPGramaParser.ExceptionspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicexceptionspecification(CPPGramaParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#typeidlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidlist(CPPGramaParser.TypeidlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#noexceptspecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoexceptspecification(CPPGramaParser.NoexceptspecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#theoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheoperator(CPPGramaParser.TheoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CPPGramaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#booleanliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanliteral(CPPGramaParser.BooleanliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#pointerliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerliteral(CPPGramaParser.PointerliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPGramaParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserdefinedliteral(CPPGramaParser.UserdefinedliteralContext ctx);
}