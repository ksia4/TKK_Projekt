import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.IOException;

public class CppGramaListenerImpl implements CPPGramaListener {
    private BufferedWriter w;

    private int noIndention = 0;
    private int size;

    public CppGramaListenerImpl(BufferedWriter bw, int size){
        this.w = bw;
        this.size = size;
    }

    private void putIndents() {
        try {
            System.out.println(noIndention);
            System.out.println("\n");
            for (int i=0;i<noIndention;i++) {
                w.write("\t");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* potrzebne */
    public void enterUnqualifiedID(CPPGramaParser.UnqualifiedIDContext ctx) {
        try {
            if(ctx.getText().equals("printf") || ctx.getText().equals("cout")){
                w.write("print ");
            }
            else {
                w.write(ctx.getText());
            }
            if(ctx.getText().equals("cout")){
                w.write("( ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterExpressionlist(CPPGramaParser.ExpressionlistContext ctx) {
        try{
            w.write("(");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitExpressionlist(CPPGramaParser.ExpressionlistContext ctx) {
        try{
            w.write(")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitEqExpression(CPPGramaParser.EqExpressionContext ctx) {
        if(ctx.getChildCount() > 1) {
            try {
                w.write(":\n"); putIndents();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void enterSelectStatement(CPPGramaParser.SelectStatementContext ctx) {
        String firstChild = ctx.getChild(0).getText();
        try {
            if(firstChild.equals("if"))
                w.write("if ");
            noIndention++;

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public void exitSelectStatement(CPPGramaParser.SelectStatementContext ctx) {
        noIndention--;
    }

    public void enterParametersandqualifiers(CPPGramaParser.ParametersandqualifiersContext ctx) {
        try{
            w.write(" ( ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void exitParametersandqualifiers(CPPGramaParser.ParametersandqualifiersContext ctx) {
        try{
            w.write(" ) ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterFunctionbody(CPPGramaParser.FunctionbodyContext ctx) {
        try{
            w.write(":\n");
            putIndents();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void enterFunctiondefinition(CPPGramaParser.FunctiondefinitionContext ctx) {
        try {
            //putIndents();
            w.write("def ");
            noIndention++;

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public void exitFunctiondefinition(CPPGramaParser.FunctiondefinitionContext ctx) {
        try {
            noIndention--;
            w.write("\n"); putIndents();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

    public void enterLiteral(CPPGramaParser.LiteralContext ctx) {
        if(ctx.getChildCount() == 1 && ctx.getChild(0).getChildCount() == 0) {
            try {
                w.write(ctx.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void enterBooleanliteral(CPPGramaParser.BooleanliteralContext ctx) {
        try {
            String output = ctx.getText().substring(0, 1).toUpperCase() + ctx.getText().substring(1);
            w.write(output);

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public void visitTerminal(TerminalNode terminalNode) {
        try {
            if(terminalNode.toString().equals("return")) {
                w.write("\n");
                putIndents();
                w.write("return ");
            }
            if(terminalNode.toString().equals("else")){
                w.write("else:\n");
                putIndents();
            }
            else if(terminalNode.toString().equals("=")){
                w.write(" = ");
            }
            else if(terminalNode.toString().equals("!=") || terminalNode.toString().equals("==")
                    || terminalNode.toString().equals("+") || terminalNode.toString().equals("-")
                    || terminalNode.toString().equals("/") || terminalNode.toString().equals("*")
                    || terminalNode.toString().equals(",")){
                w.write(" ");
                w.write(terminalNode.toString());
                w.write(" ");
            }
            else if(terminalNode.toString().equals(";")){
                w.write("\n");
                putIndents();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void enterIterationStatement(CPPGramaParser.IterationStatementContext ctx) {
        if(ctx.getChild(0).getText().equals("while")){
            try{
                w.write("while ");
                noIndention++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void exitIterationStatement(CPPGramaParser.IterationStatementContext ctx) {
        noIndention--;
    }

    public void exitPostfixExpression(CPPGramaParser.PostfixExpressionContext ctx) {
        if(ctx.getChildCount() > 1) {
            try {
                if (ctx.getChild(1).getText().equals("++")) {
                    w.write(" += 1");
                } else if (ctx.getChild(1).getText().equals("--")) {
                    w.write(" -= 1");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*konieczne*/

    public void enterUnitToTranslate(CPPGramaParser.UnitToTranslateContext ctx) {

    }

    public void exitUnitToTranslate(CPPGramaParser.UnitToTranslateContext ctx) {

    }

    public void exitUnqualifiedID(CPPGramaParser.UnqualifiedIDContext ctx) {
    }

    public void enterUnaryExpression(CPPGramaParser.UnaryExpressionContext ctx) {

    }

    public void exitUnaryExpression(CPPGramaParser.UnaryExpressionContext ctx) {

    }

    public void enterUnaryOperator(CPPGramaParser.UnaryOperatorContext ctx) {


    }

    public void exitUnaryOperator(CPPGramaParser.UnaryOperatorContext ctx) {    }

    public void enterPrimaryExpression(CPPGramaParser.PrimaryExpressionContext ctx) {

    }

    public void exitPrimaryExpression(CPPGramaParser.PrimaryExpressionContext ctx) {

    }

    public void enterNestedNameSpecifier(CPPGramaParser.NestedNameSpecifierContext ctx) {    }

    public void exitNestedNameSpecifier(CPPGramaParser.NestedNameSpecifierContext ctx) {    }

    public void enterDefaultCapture(CPPGramaParser.DefaultCaptureContext ctx) { }

    public void exitDefaultCapture(CPPGramaParser.DefaultCaptureContext ctx) {    }

    public void enterCaptureList(CPPGramaParser.CaptureListContext ctx) {    }

    public void exitCaptureList(CPPGramaParser.CaptureListContext ctx) {    }

    public void enterCapture(CPPGramaParser.CaptureContext ctx) {    }

    public void exitCapture(CPPGramaParser.CaptureContext ctx) {    }

    public void enterSimpleCapture(CPPGramaParser.SimpleCaptureContext ctx) {    }

    public void exitSimpleCapture(CPPGramaParser.SimpleCaptureContext ctx) {    }

    public void enterInitCapture(CPPGramaParser.InitCaptureContext ctx) {    }

    public void exitInitCapture(CPPGramaParser.InitCaptureContext ctx) {    }

    public void enterPostfixExpression(CPPGramaParser.PostfixExpressionContext ctx) {

    }

    public void enterTypeIDofExpr(CPPGramaParser.TypeIDofExprContext ctx) {

    }

    public void exitTypeIDofExpr(CPPGramaParser.TypeIDofExprContext ctx) {


    }

    public void enterTypeIDofTheTypeID(CPPGramaParser.TypeIDofTheTypeIDContext ctx) {

    }

    public void exitTypeIDofTheTypeID(CPPGramaParser.TypeIDofTheTypeIDContext ctx) {


    }

    public void enterPseudoDestructorName(CPPGramaParser.PseudoDestructorNameContext ctx) {

    }

    public void exitPseudoDestructorName(CPPGramaParser.PseudoDestructorNameContext ctx) {


    }

    public void enterNewExpression(CPPGramaParser.NewExpressionContext ctx) {

    }

    public void exitNewExpression(CPPGramaParser.NewExpressionContext ctx) {
    }

    public void enterNewPlacement(CPPGramaParser.NewPlacementContext ctx) {

    }

    public void exitNewPlacement(CPPGramaParser.NewPlacementContext ctx) {

    }

    public void enterNewTypeID(CPPGramaParser.NewTypeIDContext ctx) {

    }

    public void exitNewTypeID(CPPGramaParser.NewTypeIDContext ctx) {

    }

    public void enterNewDeclarator(CPPGramaParser.NewDeclaratorContext ctx) {

    }

    public void exitNewDeclarator(CPPGramaParser.NewDeclaratorContext ctx) {

    }

    public void enterNoptrNewDeclarator(CPPGramaParser.NoptrNewDeclaratorContext ctx) {
    }

    public void exitNoptrNewDeclarator(CPPGramaParser.NoptrNewDeclaratorContext ctx) {

    }

    public void enterNewInitializer(CPPGramaParser.NewInitializerContext ctx) {

    }

    public void exitNewInitializer(CPPGramaParser.NewInitializerContext ctx) {

    }

    public void enterDeleteExpression(CPPGramaParser.DeleteExpressionContext ctx) {

    }

    public void exitDeleteExpression(CPPGramaParser.DeleteExpressionContext ctx) {

    }

    public void enterNoExceptExpression(CPPGramaParser.NoExceptExpressionContext ctx) {

    }

    public void exitNoExceptExpression(CPPGramaParser.NoExceptExpressionContext ctx) {

    }

    public void enterCastExpression(CPPGramaParser.CastExpressionContext ctx) {

    }

    public void exitCastExpression(CPPGramaParser.CastExpressionContext ctx) {

    }

    public void enterPmExpression(CPPGramaParser.PmExpressionContext ctx) {

    }

    public void exitPmExpression(CPPGramaParser.PmExpressionContext ctx) {

    }

    public void enterMulExpression(CPPGramaParser.MulExpressionContext ctx) {

    }

    public void exitMulExpression(CPPGramaParser.MulExpressionContext ctx) {

    }

    public void enterAddExpression(CPPGramaParser.AddExpressionContext ctx) {

    }

    public void exitAddExpression(CPPGramaParser.AddExpressionContext ctx) {

    }

    public void enterShiftExpression(CPPGramaParser.ShiftExpressionContext ctx) {

    }

    public void exitShiftExpression(CPPGramaParser.ShiftExpressionContext ctx) {
        if(ctx.getChildCount() > 1) {
            try {
                w.write(" )");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void enterShiftOperator(CPPGramaParser.ShiftOperatorContext ctx) {

    }

    public void exitShiftOperator(CPPGramaParser.ShiftOperatorContext ctx) {

    }

    public void enterRelationalExpression(CPPGramaParser.RelationalExpressionContext ctx) {

    }

    public void exitRelationalExpression(CPPGramaParser.RelationalExpressionContext ctx) {

    }

    public void enterEqExpression(CPPGramaParser.EqExpressionContext ctx) {

    }

    public void enterAndExpression(CPPGramaParser.AndExpressionContext ctx) {

    }

    public void exitAndExpression(CPPGramaParser.AndExpressionContext ctx) {

    }

    public void enterExorExpression(CPPGramaParser.ExorExpressionContext ctx) {

    }

    public void exitExorExpression(CPPGramaParser.ExorExpressionContext ctx) {

    }

    public void enterInclusiveorExpression(CPPGramaParser.InclusiveorExpressionContext ctx) {

    }

    public void exitInclusiveorExpression(CPPGramaParser.InclusiveorExpressionContext ctx) {

    }

    public void enterLogicandExpression(CPPGramaParser.LogicandExpressionContext ctx) {

    }

    public void exitLogicandExpression(CPPGramaParser.LogicandExpressionContext ctx) {

    }

    public void enterLogicorExpression(CPPGramaParser.LogicorExpressionContext ctx) {

    }

    public void exitLogicorExpression(CPPGramaParser.LogicorExpressionContext ctx) {

    }

    public void enterConditionExpression(CPPGramaParser.ConditionExpressionContext ctx) {

    }

    public void exitConditionExpression(CPPGramaParser.ConditionExpressionContext ctx) {

    }

    public void enterAssignmentExpression(CPPGramaParser.AssignmentExpressionContext ctx) {

    }

    public void exitAssignmentExpression(CPPGramaParser.AssignmentExpressionContext ctx) {

    }

    public void enterAssignmentOperator(CPPGramaParser.AssignmentOperatorContext ctx) {

    }

    public void exitAssignmentOperator(CPPGramaParser.AssignmentOperatorContext ctx) {

    }

    public void enterExpression(CPPGramaParser.ExpressionContext ctx) {

    }

    public void exitExpression(CPPGramaParser.ExpressionContext ctx) {

    }

    public void enterConstantExpression(CPPGramaParser.ConstantExpressionContext ctx) {

    }

    public void exitConstantExpression(CPPGramaParser.ConstantExpressionContext ctx) {

    }

    public void enterStatement(CPPGramaParser.StatementContext ctx) {

    }

    public void exitStatement(CPPGramaParser.StatementContext ctx) {

    }

    public void enterLabeledStatement(CPPGramaParser.LabeledStatementContext ctx) {

    }

    public void exitLabeledStatement(CPPGramaParser.LabeledStatementContext ctx) {

    }

    public void enterExpressionStatement(CPPGramaParser.ExpressionStatementContext ctx) {

    }

    public void exitExpressionStatement(CPPGramaParser.ExpressionStatementContext ctx) {

    }

    public void enterCompoundStatement(CPPGramaParser.CompoundStatementContext ctx) {

    }

    public void exitCompoundStatement(CPPGramaParser.CompoundStatementContext ctx) {

    }

    public void enterStatementSequence(CPPGramaParser.StatementSequenceContext ctx) {

    }

    public void exitStatementSequence(CPPGramaParser.StatementSequenceContext ctx) {

    }

    public void enterCondition(CPPGramaParser.ConditionContext ctx) {

    }

    public void exitCondition(CPPGramaParser.ConditionContext ctx) {

    }

    public void enterForInitStatement(CPPGramaParser.ForInitStatementContext ctx) {

    }

    public void exitForInitStatement(CPPGramaParser.ForInitStatementContext ctx) {

    }

    public void enterForRangeDeclaration(CPPGramaParser.ForRangeDeclarationContext ctx) {

    }

    public void exitForRangeDeclaration(CPPGramaParser.ForRangeDeclarationContext ctx) {

    }

    public void enterForRangeInitializer(CPPGramaParser.ForRangeInitializerContext ctx) {

    }

    public void exitForRangeInitializer(CPPGramaParser.ForRangeInitializerContext ctx) {

    }

    public void enterJumpStatement(CPPGramaParser.JumpStatementContext ctx) {

    }

    public void exitJumpStatement(CPPGramaParser.JumpStatementContext ctx) {

    }

    public void enterDeclarationStatement(CPPGramaParser.DeclarationStatementContext ctx) {

    }

    public void exitDeclarationStatement(CPPGramaParser.DeclarationStatementContext ctx) {

    }

    public void enterDeclarationSequence(CPPGramaParser.DeclarationSequenceContext ctx) {

    }

    public void exitDeclarationSequence(CPPGramaParser.DeclarationSequenceContext ctx) {

    }

    public void enterDeclaration(CPPGramaParser.DeclarationContext ctx) {

    }

    public void exitDeclaration(CPPGramaParser.DeclarationContext ctx) {

    }

    public void enterBlockDeclaration(CPPGramaParser.BlockDeclarationContext ctx) {

    }

    public void exitBlockDeclaration(CPPGramaParser.BlockDeclarationContext ctx) {

    }

    public void enterSimpleDeclaration(CPPGramaParser.SimpleDeclarationContext ctx) {
    }

    public void exitSimpleDeclaration(CPPGramaParser.SimpleDeclarationContext ctx) {

    }

    public void enterEmptyDeclaration(CPPGramaParser.EmptyDeclarationContext ctx) {

    }

    public void exitEmptyDeclaration(CPPGramaParser.EmptyDeclarationContext ctx) {

    }

    public void enterAttributeDeclaration(CPPGramaParser.AttributeDeclarationContext ctx) {

    }

    public void exitAttributeDeclaration(CPPGramaParser.AttributeDeclarationContext ctx) {

    }

    public void enterDeclSpecifier(CPPGramaParser.DeclSpecifierContext ctx) {

    }

    public void exitDeclSpecifier(CPPGramaParser.DeclSpecifierContext ctx) {

    }

    public void enterDeclSpecifierSequence(CPPGramaParser.DeclSpecifierSequenceContext ctx) {

    }

    public void exitDeclSpecifierSequence(CPPGramaParser.DeclSpecifierSequenceContext ctx) {

    }

    public void enterStorageClassSpecifier(CPPGramaParser.StorageClassSpecifierContext ctx) {

    }

    public void exitStorageClassSpecifier(CPPGramaParser.StorageClassSpecifierContext ctx) {

    }

    public void enterFunctionSpecifier(CPPGramaParser.FunctionSpecifierContext ctx) {

    }

    public void exitFunctionSpecifier(CPPGramaParser.FunctionSpecifierContext ctx) {

    }

    public void enterTypedefName(CPPGramaParser.TypedefNameContext ctx) {

    }

    public void exitTypedefName(CPPGramaParser.TypedefNameContext ctx) {

    }

    public void enterTypeSpecifier(CPPGramaParser.TypeSpecifierContext ctx) {

    }

    public void exitTypeSpecifier(CPPGramaParser.TypeSpecifierContext ctx) {

    }

    public void enterTrailingTypeSpecifier(CPPGramaParser.TrailingTypeSpecifierContext ctx) {

    }

    public void exitTrailingTypeSpecifier(CPPGramaParser.TrailingTypeSpecifierContext ctx) {

    }

    public void enterTypeSpecifierSequence(CPPGramaParser.TypeSpecifierSequenceContext ctx) {

    }

    public void exitTypeSpecifierSequence(CPPGramaParser.TypeSpecifierSequenceContext ctx) {

    }

    public void enterTrailingTypeSpecifierSequence(CPPGramaParser.TrailingTypeSpecifierSequenceContext ctx) {

    }

    public void exitTrailingTypeSpecifierSequence(CPPGramaParser.TrailingTypeSpecifierSequenceContext ctx) {

    }

    public void enterSimpleTypeSpecifier(CPPGramaParser.SimpleTypeSpecifierContext ctx) {

    }

    public void exitSimpleTypeSpecifier(CPPGramaParser.SimpleTypeSpecifierContext ctx) {

    }

    public void enterTheTypename(CPPGramaParser.TheTypenameContext ctx) {

    }

    public void exitTheTypename(CPPGramaParser.TheTypenameContext ctx) {

    }

    public void enterElaboratedTypeSpecifier(CPPGramaParser.ElaboratedTypeSpecifierContext ctx) {

    }

    public void exitElaboratedTypeSpecifier(CPPGramaParser.ElaboratedTypeSpecifierContext ctx) {

    }

    public void enterEnumname(CPPGramaParser.EnumnameContext ctx) {

    }

    public void exitEnumname(CPPGramaParser.EnumnameContext ctx) {

    }

    public void enterEnumSpecifier(CPPGramaParser.EnumSpecifierContext ctx) {

    }

    public void exitEnumSpecifier(CPPGramaParser.EnumSpecifierContext ctx) {

    }

    public void enterEnumHead(CPPGramaParser.EnumHeadContext ctx) {

    }

    public void exitEnumHead(CPPGramaParser.EnumHeadContext ctx) {

    }

    public void enterOpaqueEnumDeclaration(CPPGramaParser.OpaqueEnumDeclarationContext ctx) {

    }

    public void exitOpaqueEnumDeclaration(CPPGramaParser.OpaqueEnumDeclarationContext ctx) {

    }

    public void enterEnumKey(CPPGramaParser.EnumKeyContext ctx) {

    }

    public void exitEnumKey(CPPGramaParser.EnumKeyContext ctx) {

    }

    public void enterEnumBase(CPPGramaParser.EnumBaseContext ctx) {

    }

    public void exitEnumBase(CPPGramaParser.EnumBaseContext ctx) {

    }

    public void enterEnumeratorlist(CPPGramaParser.EnumeratorlistContext ctx) {

    }

    public void exitEnumeratorlist(CPPGramaParser.EnumeratorlistContext ctx) {

    }

    public void enterEnumeratorDefinition(CPPGramaParser.EnumeratorDefinitionContext ctx) {

    }

    public void exitEnumeratorDefinition(CPPGramaParser.EnumeratorDefinitionContext ctx) {

    }

    public void enterEnumerator(CPPGramaParser.EnumeratorContext ctx) {

    }

    public void exitEnumerator(CPPGramaParser.EnumeratorContext ctx) {

    }

    public void enterOriginalNamespacename(CPPGramaParser.OriginalNamespacenameContext ctx) {
    }

    public void exitOriginalNamespacename(CPPGramaParser.OriginalNamespacenameContext ctx) {

    }

    public void enterNamespaceDefinition(CPPGramaParser.NamespaceDefinitionContext ctx) {

    }

    public void exitNamespaceDefinition(CPPGramaParser.NamespaceDefinitionContext ctx) {

    }

    public void enterNamednamespacedefinition(CPPGramaParser.NamednamespacedefinitionContext ctx) {

    }

    public void exitNamednamespacedefinition(CPPGramaParser.NamednamespacedefinitionContext ctx) {

    }

    public void enterOriginalNamespaceDefinition(CPPGramaParser.OriginalNamespaceDefinitionContext ctx) {

    }

    public void exitOriginalNamespaceDefinition(CPPGramaParser.OriginalNamespaceDefinitionContext ctx) {

    }

    public void enterExtensionNamespaceDefinition(CPPGramaParser.ExtensionNamespaceDefinitionContext ctx) {

    }

    public void exitExtensionNamespaceDefinition(CPPGramaParser.ExtensionNamespaceDefinitionContext ctx) {

    }

    public void enterUnnamedNamesPaceDefinition(CPPGramaParser.UnnamedNamesPaceDefinitionContext ctx) {

    }

    public void exitUnnamedNamesPaceDefinition(CPPGramaParser.UnnamedNamesPaceDefinitionContext ctx) {

    }

    public void enterNamespaceBody(CPPGramaParser.NamespaceBodyContext ctx) {

    }

    public void exitNamespaceBody(CPPGramaParser.NamespaceBodyContext ctx) {

    }

    public void enterQualifiednamespacespecifier(CPPGramaParser.QualifiednamespacespecifierContext ctx) {

    }

    public void exitQualifiednamespacespecifier(CPPGramaParser.QualifiednamespacespecifierContext ctx) {

    }

    public void enterUsingdeclaration(CPPGramaParser.UsingdeclarationContext ctx) {

    }

    public void exitUsingdeclaration(CPPGramaParser.UsingdeclarationContext ctx) {

    }

    public void enterUsingdirective(CPPGramaParser.UsingdirectiveContext ctx) {

    }

    public void exitUsingdirective(CPPGramaParser.UsingdirectiveContext ctx) {

    }

    public void enterLinkagespecification(CPPGramaParser.LinkagespecificationContext ctx) {

    }

    public void exitLinkagespecification(CPPGramaParser.LinkagespecificationContext ctx) {

    }

    public void enterAttributeSpecifierSequence(CPPGramaParser.AttributeSpecifierSequenceContext ctx) {

    }

    public void exitAttributeSpecifierSequence(CPPGramaParser.AttributeSpecifierSequenceContext ctx) {

    }

    public void enterAttributespecifier(CPPGramaParser.AttributespecifierContext ctx) {

    }

    public void exitAttributespecifier(CPPGramaParser.AttributespecifierContext ctx) {

    }

    public void enterAttributelist(CPPGramaParser.AttributelistContext ctx) {

    }

    public void exitAttributelist(CPPGramaParser.AttributelistContext ctx) {

    }

    public void enterAttribute(CPPGramaParser.AttributeContext ctx) {

    }

    public void exitAttribute(CPPGramaParser.AttributeContext ctx) {

    }

    public void enterAttributetoken(CPPGramaParser.AttributetokenContext ctx) {

    }

    public void exitAttributetoken(CPPGramaParser.AttributetokenContext ctx) {

    }

    public void enterAttributescopedtoken(CPPGramaParser.AttributescopedtokenContext ctx) {

    }

    public void exitAttributescopedtoken(CPPGramaParser.AttributescopedtokenContext ctx) {

    }

    public void enterAttributenamespace(CPPGramaParser.AttributenamespaceContext ctx) {

    }

    public void exitAttributenamespace(CPPGramaParser.AttributenamespaceContext ctx) {

    }

    public void enterAttributeargumentclause(CPPGramaParser.AttributeargumentclauseContext ctx) {

    }

    public void exitAttributeargumentclause(CPPGramaParser.AttributeargumentclauseContext ctx) {

    }

    public void enterBalancedtokenseq(CPPGramaParser.BalancedtokenseqContext ctx) {

    }

    public void exitBalancedtokenseq(CPPGramaParser.BalancedtokenseqContext ctx) {

    }

    public void enterBalancedtoken(CPPGramaParser.BalancedtokenContext ctx) {

    }

    public void exitBalancedtoken(CPPGramaParser.BalancedtokenContext ctx) {

    }

    public void enterInitdeclaratorlist(CPPGramaParser.InitdeclaratorlistContext ctx) {


    }

    public void exitInitdeclaratorlist(CPPGramaParser.InitdeclaratorlistContext ctx) {

    }

    public void enterInitdeclarator(CPPGramaParser.InitdeclaratorContext ctx) {

    }

    public void exitInitdeclarator(CPPGramaParser.InitdeclaratorContext ctx) {

    }

    public void enterDeclarator(CPPGramaParser.DeclaratorContext ctx) {

    }

    public void exitDeclarator(CPPGramaParser.DeclaratorContext ctx) {

    }

    public void enterPtrdeclarator(CPPGramaParser.PtrdeclaratorContext ctx) {

    }

    public void exitPtrdeclarator(CPPGramaParser.PtrdeclaratorContext ctx) {

    }

    public void enterNoptrdeclarator(CPPGramaParser.NoptrdeclaratorContext ctx) {

    }

    public void exitNoptrdeclarator(CPPGramaParser.NoptrdeclaratorContext ctx) {

    }

    public void enterTrailingreturntype(CPPGramaParser.TrailingreturntypeContext ctx) {

    }

    public void exitTrailingreturntype(CPPGramaParser.TrailingreturntypeContext ctx) {

    }

    public void enterPtrOperator(CPPGramaParser.PtrOperatorContext ctx) {

    }

    public void exitPtrOperator(CPPGramaParser.PtrOperatorContext ctx) {

    }

    public void enterCvqualifierseq(CPPGramaParser.CvqualifierseqContext ctx) {

    }

    public void exitCvqualifierseq(CPPGramaParser.CvqualifierseqContext ctx) {

    }

    public void enterCvqualifier(CPPGramaParser.CvqualifierContext ctx) {

    }

    public void exitCvqualifier(CPPGramaParser.CvqualifierContext ctx) {

    }

    public void enterRefqualifier(CPPGramaParser.RefqualifierContext ctx) {

    }

    public void exitRefqualifier(CPPGramaParser.RefqualifierContext ctx) {

    }

    public void enterDeclaratorid(CPPGramaParser.DeclaratoridContext ctx) {

    }

    public void exitDeclaratorid(CPPGramaParser.DeclaratoridContext ctx) {

    }

    public void enterTheTypeID(CPPGramaParser.TheTypeIDContext ctx) {

    }

    public void exitTheTypeID(CPPGramaParser.TheTypeIDContext ctx) {

    }

    public void enterAbstractdeclarator(CPPGramaParser.AbstractdeclaratorContext ctx) {

    }

    public void exitAbstractdeclarator(CPPGramaParser.AbstractdeclaratorContext ctx) {

    }

    public void enterPtrabstractdeclarator(CPPGramaParser.PtrabstractdeclaratorContext ctx) {

    }

    public void exitPtrabstractdeclarator(CPPGramaParser.PtrabstractdeclaratorContext ctx) {

    }

    public void enterNoptrabstractdeclarator(CPPGramaParser.NoptrabstractdeclaratorContext ctx) {

    }

    public void exitNoptrabstractdeclarator(CPPGramaParser.NoptrabstractdeclaratorContext ctx) {

    }

    public void enterAbstractpackdeclarator(CPPGramaParser.AbstractpackdeclaratorContext ctx) {

    }

    public void exitAbstractpackdeclarator(CPPGramaParser.AbstractpackdeclaratorContext ctx) {

    }

    public void enterNoptrabstractpackdeclarator(CPPGramaParser.NoptrabstractpackdeclaratorContext ctx) {

    }

    public void exitNoptrabstractpackdeclarator(CPPGramaParser.NoptrabstractpackdeclaratorContext ctx) {

    }

    public void enterParameterdeclarationclause(CPPGramaParser.ParameterdeclarationclauseContext ctx) {

    }

    public void exitParameterdeclarationclause(CPPGramaParser.ParameterdeclarationclauseContext ctx) {

    }

    public void enterParameterdeclarationlist(CPPGramaParser.ParameterdeclarationlistContext ctx) {

    }

    public void exitParameterdeclarationlist(CPPGramaParser.ParameterdeclarationlistContext ctx) {

    }

    public void enterParameterdeclaration(CPPGramaParser.ParameterdeclarationContext ctx) {

    }

    public void exitParameterdeclaration(CPPGramaParser.ParameterdeclarationContext ctx) {

    }

    public void exitFunctionbody(CPPGramaParser.FunctionbodyContext ctx) {


    }

    public void enterInitializer(CPPGramaParser.InitializerContext ctx) {


    }

    public void exitInitializer(CPPGramaParser.InitializerContext ctx) {


    }

    public void enterBraceorequalinitializer(CPPGramaParser.BraceorequalinitializerContext ctx) {

    }

    public void exitBraceorequalinitializer(CPPGramaParser.BraceorequalinitializerContext ctx) {

    }

    public void enterInitializerclause(CPPGramaParser.InitializerclauseContext ctx) {

    }

    public void exitInitializerclause(CPPGramaParser.InitializerclauseContext ctx) {

    }

    public void enterInitializerList(CPPGramaParser.InitializerListContext ctx) {

    }

    public void exitInitializerList(CPPGramaParser.InitializerListContext ctx) {

    }

    public void enterBracedInitList(CPPGramaParser.BracedInitListContext ctx) {

    }

    public void exitBracedInitList(CPPGramaParser.BracedInitListContext ctx) {

    }

    public void enterClassname(CPPGramaParser.ClassnameContext ctx) {

    }

    public void exitClassname(CPPGramaParser.ClassnameContext ctx) {

    }

    public void enterClassspecifier(CPPGramaParser.ClassspecifierContext ctx) {

    }

    public void exitClassspecifier(CPPGramaParser.ClassspecifierContext ctx) {

    }

    public void enterClasshead(CPPGramaParser.ClassheadContext ctx) {

    }

    public void exitClasshead(CPPGramaParser.ClassheadContext ctx) {

    }

    public void enterClassheadname(CPPGramaParser.ClassheadnameContext ctx) {

    }

    public void exitClassheadname(CPPGramaParser.ClassheadnameContext ctx) {

    }

    public void enterClassvirtspecifier(CPPGramaParser.ClassvirtspecifierContext ctx) {

    }

    public void exitClassvirtspecifier(CPPGramaParser.ClassvirtspecifierContext ctx) {

    }

    public void enterClasskey(CPPGramaParser.ClasskeyContext ctx) {

    }

    public void exitClasskey(CPPGramaParser.ClasskeyContext ctx) {

    }

    public void enterMemberspecification(CPPGramaParser.MemberspecificationContext ctx) {

    }

    public void exitMemberspecification(CPPGramaParser.MemberspecificationContext ctx) {

    }

    public void enterMemberdeclaration(CPPGramaParser.MemberdeclarationContext ctx) {

    }

    public void exitMemberdeclaration(CPPGramaParser.MemberdeclarationContext ctx) {

    }

    public void enterMemberdeclaratorlist(CPPGramaParser.MemberdeclaratorlistContext ctx) {

    }

    public void exitMemberdeclaratorlist(CPPGramaParser.MemberdeclaratorlistContext ctx) {

    }

    public void enterMemberdeclarator(CPPGramaParser.MemberdeclaratorContext ctx) {

    }

    public void exitMemberdeclarator(CPPGramaParser.MemberdeclaratorContext ctx) {

    }

    public void enterVirtspecifierseq(CPPGramaParser.VirtspecifierseqContext ctx) {

    }

    public void exitVirtspecifierseq(CPPGramaParser.VirtspecifierseqContext ctx) {

    }

    public void enterVirtspecifier(CPPGramaParser.VirtspecifierContext ctx) {

    }

    public void exitVirtspecifier(CPPGramaParser.VirtspecifierContext ctx) {

    }

    public void enterPurespecifier(CPPGramaParser.PurespecifierContext ctx) {

    }

    public void exitPurespecifier(CPPGramaParser.PurespecifierContext ctx) {

    }

    public void enterBaseclause(CPPGramaParser.BaseclauseContext ctx) {

    }

    public void exitBaseclause(CPPGramaParser.BaseclauseContext ctx) {

    }

    public void enterBasespecifierlist(CPPGramaParser.BasespecifierlistContext ctx) {

    }

    public void exitBasespecifierlist(CPPGramaParser.BasespecifierlistContext ctx) {

    }

    public void enterBasespecifier(CPPGramaParser.BasespecifierContext ctx) {

    }

    public void exitBasespecifier(CPPGramaParser.BasespecifierContext ctx) {

    }

    public void enterClassordecltype(CPPGramaParser.ClassordecltypeContext ctx) {

    }

    public void exitClassordecltype(CPPGramaParser.ClassordecltypeContext ctx) {

    }

    public void enterBasetypespecifier(CPPGramaParser.BasetypespecifierContext ctx) {

    }

    public void exitBasetypespecifier(CPPGramaParser.BasetypespecifierContext ctx) {

    }

    public void enterAccessspecifier(CPPGramaParser.AccessspecifierContext ctx) {

    }

    public void exitAccessspecifier(CPPGramaParser.AccessspecifierContext ctx) {

    }

    public void enterFunctionConversionID(CPPGramaParser.FunctionConversionIDContext ctx) {

    }

    public void exitFunctionConversionID(CPPGramaParser.FunctionConversionIDContext ctx) {

    }

    public void enterConversiontypeid(CPPGramaParser.ConversiontypeidContext ctx) {

    }

    public void exitConversiontypeid(CPPGramaParser.ConversiontypeidContext ctx) {

    }

    public void enterConversiondeclarator(CPPGramaParser.ConversiondeclaratorContext ctx) {

    }

    public void exitConversiondeclarator(CPPGramaParser.ConversiondeclaratorContext ctx) {

    }

    public void enterCtorinitializer(CPPGramaParser.CtorinitializerContext ctx) {

    }

    public void exitCtorinitializer(CPPGramaParser.CtorinitializerContext ctx) {

    }

    public void enterMeminitializerlist(CPPGramaParser.MeminitializerlistContext ctx) {

    }

    public void exitMeminitializerlist(CPPGramaParser.MeminitializerlistContext ctx) {

    }

    public void enterMeminitializer(CPPGramaParser.MeminitializerContext ctx) {

    }

    public void exitMeminitializer(CPPGramaParser.MeminitializerContext ctx) {

    }

    public void enterMeminitializerid(CPPGramaParser.MeminitializeridContext ctx) {

    }

    public void exitMeminitializerid(CPPGramaParser.MeminitializeridContext ctx) {

    }

    public void enterFunctionOperatorID(CPPGramaParser.FunctionOperatorIDContext ctx) {

    }

    public void exitFunctionOperatorID(CPPGramaParser.FunctionOperatorIDContext ctx) {

    }

    public void enterLiteralOperatorID(CPPGramaParser.LiteralOperatorIDContext ctx) {

    }

    public void exitLiteralOperatorID(CPPGramaParser.LiteralOperatorIDContext ctx) {

    }

    public void enterTypeparameter(CPPGramaParser.TypeparameterContext ctx) {

    }

    public void exitTypeparameter(CPPGramaParser.TypeparameterContext ctx) {

    }

    public void enterTypenameSpecifier(CPPGramaParser.TypenameSpecifierContext ctx) {

    }

    public void exitTypenameSpecifier(CPPGramaParser.TypenameSpecifierContext ctx) {

    }

    public void enterTryblock(CPPGramaParser.TryblockContext ctx) {

    }

    public void exitTryblock(CPPGramaParser.TryblockContext ctx) {

    }

    public void enterFunctiontryblock(CPPGramaParser.FunctiontryblockContext ctx) {

    }

    public void exitFunctiontryblock(CPPGramaParser.FunctiontryblockContext ctx) {

    }

    public void enterHandlerseq(CPPGramaParser.HandlerseqContext ctx) {

    }

    public void exitHandlerseq(CPPGramaParser.HandlerseqContext ctx) {

    }

    public void enterHandler(CPPGramaParser.HandlerContext ctx) {

    }

    public void exitHandler(CPPGramaParser.HandlerContext ctx) {

    }

    public void enterExceptiondeclaration(CPPGramaParser.ExceptiondeclarationContext ctx) {

    }

    public void exitExceptiondeclaration(CPPGramaParser.ExceptiondeclarationContext ctx) {

    }

    public void enterThrowexpression(CPPGramaParser.ThrowexpressionContext ctx) {

    }

    public void exitThrowexpression(CPPGramaParser.ThrowexpressionContext ctx) {

    }

    public void enterExceptionspecification(CPPGramaParser.ExceptionspecificationContext ctx) {

    }

    public void exitExceptionspecification(CPPGramaParser.ExceptionspecificationContext ctx) {

    }

    public void enterDynamicexceptionspecification(CPPGramaParser.DynamicexceptionspecificationContext ctx) {

    }

    public void exitDynamicexceptionspecification(CPPGramaParser.DynamicexceptionspecificationContext ctx) {

    }

    public void enterTypeidlist(CPPGramaParser.TypeidlistContext ctx) {

    }

    public void exitTypeidlist(CPPGramaParser.TypeidlistContext ctx) {

    }

    public void enterNoexceptspecification(CPPGramaParser.NoexceptspecificationContext ctx) {

    }

    public void exitNoexceptspecification(CPPGramaParser.NoexceptspecificationContext ctx) {

    }

    public void enterTheoperator(CPPGramaParser.TheoperatorContext ctx) {

    }

    public void exitTheoperator(CPPGramaParser.TheoperatorContext ctx) {

    }

    public void exitLiteral(CPPGramaParser.LiteralContext ctx) {

    }

    public void exitBooleanliteral(CPPGramaParser.BooleanliteralContext ctx) {

    }

    public void enterPointerliteral(CPPGramaParser.PointerliteralContext ctx) {

    }

    public void exitPointerliteral(CPPGramaParser.PointerliteralContext ctx) {

    }

    public void enterUserdefinedliteral(CPPGramaParser.UserdefinedliteralContext ctx) {

    }

    public void exitUserdefinedliteral(CPPGramaParser.UserdefinedliteralContext ctx) {

    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {
    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
