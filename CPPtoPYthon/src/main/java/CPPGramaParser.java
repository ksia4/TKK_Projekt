// Generated from /home/kasia/IdeaProjects/CPPtoPYthon/CPPGrama.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPPGramaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Directive=8, Auto=9, 
		Bool=10, Break=11, Case=12, Catch=13, Char=14, Char16=15, Char32=16, Class=17, 
		Const=18, Constexpr=19, Const_cast=20, Continue=21, Default=22, Delete=23, 
		Do=24, Double=25, Dynamic_cast=26, Else=27, Enum=28, Explicit=29, Export=30, 
		Extern=31, False=32, Final=33, Float=34, For=35, Friend=36, Goto=37, If=38, 
		Inline=39, Int=40, Long=41, Namespace=42, New=43, Noexcept=44, Nullptr=45, 
		Operator=46, Override=47, Private=48, Protected=49, Public=50, Reinterpret_cast=51, 
		Return=52, Short=53, Signed=54, Sizeof=55, Static=56, Static_cast=57, 
		Struct=58, Switch=59, This=60, Throw=61, True=62, Try=63, Typedef=64, 
		Typeid=65, Typename=66, Union=67, Unsigned=68, Using=69, Virtual=70, Void=71, 
		While=72, LeftParen=73, RightParen=74, LeftBracket=75, RightBracket=76, 
		LeftBrace=77, RightBrace=78, Plus=79, Minus=80, Star=81, Div=82, Mod=83, 
		Caret=84, And=85, Or=86, Tilde=87, Not=88, Assign=89, Less=90, Greater=91, 
		PlusAssign=92, MinusAssign=93, StarAssign=94, DivAssign=95, ModAssign=96, 
		XorAssign=97, AndAssign=98, OrAssign=99, LeftShift=100, RightShift=101, 
		LeftShiftAssign=102, RightShiftAssign=103, Equal=104, NotEqual=105, LessEqual=106, 
		GreaterEqual=107, AndAnd=108, OrOr=109, PlusPlus=110, MinusMinus=111, 
		Comma=112, ArrowStar=113, Arrow=114, Question=115, Colon=116, Doublecolon=117, 
		Semi=118, Dot=119, DotStar=120, Identifier=121, Integerliteral=122, Decimalliteral=123, 
		Octalliteral=124, Hexadecimalliteral=125, Binaryliteral=126, Integersuffix=127, 
		Characterliteral=128, Floatingliteral=129, Stringliteral=130, Userdefinedintegerliteral=131, 
		Userdefinedfloatingliteral=132, Userdefinedstringliteral=133, Userdefinedcharacterliteral=134, 
		Whitespace=135, Newline=136, BlockComment=137, LineComment=138;
	public static final int
		RULE_unitToTranslate = 0, RULE_unqualifiedID = 1, RULE_unaryExpression = 2, 
		RULE_unaryOperator = 3, RULE_primaryExpression = 4, RULE_nestedNameSpecifier = 5, 
		RULE_defaultCapture = 6, RULE_captureList = 7, RULE_capture = 8, RULE_simpleCapture = 9, 
		RULE_initCapture = 10, RULE_postfixExpression = 11, RULE_typeIDofExpr = 12, 
		RULE_typeIDofTheTypeID = 13, RULE_expressionlist = 14, RULE_pseudoDestructorName = 15, 
		RULE_newExpression = 16, RULE_newPlacement = 17, RULE_newTypeID = 18, 
		RULE_newDeclarator = 19, RULE_noptrNewDeclarator = 20, RULE_newInitializer = 21, 
		RULE_deleteExpression = 22, RULE_noExceptExpression = 23, RULE_castExpression = 24, 
		RULE_pmExpression = 25, RULE_mulExpression = 26, RULE_addExpression = 27, 
		RULE_shiftExpression = 28, RULE_shiftOperator = 29, RULE_relationalExpression = 30, 
		RULE_eqExpression = 31, RULE_andExpression = 32, RULE_exorExpression = 33, 
		RULE_inclusiveorExpression = 34, RULE_logicandExpression = 35, RULE_logicorExpression = 36, 
		RULE_conditionExpression = 37, RULE_assignmentExpression = 38, RULE_assignmentOperator = 39, 
		RULE_expression = 40, RULE_constantExpression = 41, RULE_statement = 42, 
		RULE_labeledStatement = 43, RULE_expressionStatement = 44, RULE_compoundStatement = 45, 
		RULE_statementSequence = 46, RULE_selectStatement = 47, RULE_condition = 48, 
		RULE_iterationStatement = 49, RULE_forInitStatement = 50, RULE_forRangeDeclaration = 51, 
		RULE_forRangeInitializer = 52, RULE_jumpStatement = 53, RULE_declarationStatement = 54, 
		RULE_declarationSequence = 55, RULE_declaration = 56, RULE_blockDeclaration = 57, 
		RULE_simpleDeclaration = 58, RULE_emptyDeclaration = 59, RULE_attributeDeclaration = 60, 
		RULE_declSpecifier = 61, RULE_declSpecifierSequence = 62, RULE_storageClassSpecifier = 63, 
		RULE_functionSpecifier = 64, RULE_typedefName = 65, RULE_typeSpecifier = 66, 
		RULE_trailingTypeSpecifier = 67, RULE_typeSpecifierSequence = 68, RULE_trailingTypeSpecifierSequence = 69, 
		RULE_simpleTypeSpecifier = 70, RULE_theTypename = 71, RULE_elaboratedTypeSpecifier = 72, 
		RULE_enumname = 73, RULE_enumSpecifier = 74, RULE_enumHead = 75, RULE_opaqueEnumDeclaration = 76, 
		RULE_enumKey = 77, RULE_enumBase = 78, RULE_enumeratorlist = 79, RULE_enumeratorDefinition = 80, 
		RULE_enumerator = 81, RULE_originalNamespacename = 82, RULE_namespaceDefinition = 83, 
		RULE_namednamespacedefinition = 84, RULE_originalNamespaceDefinition = 85, 
		RULE_extensionNamespaceDefinition = 86, RULE_unnamedNamesPaceDefinition = 87, 
		RULE_namespaceBody = 88, RULE_qualifiednamespacespecifier = 89, RULE_usingdeclaration = 90, 
		RULE_usingdirective = 91, RULE_linkagespecification = 92, RULE_attributeSpecifierSequence = 93, 
		RULE_attributespecifier = 94, RULE_attributelist = 95, RULE_attribute = 96, 
		RULE_attributetoken = 97, RULE_attributescopedtoken = 98, RULE_attributenamespace = 99, 
		RULE_attributeargumentclause = 100, RULE_balancedtokenseq = 101, RULE_balancedtoken = 102, 
		RULE_initdeclaratorlist = 103, RULE_initdeclarator = 104, RULE_declarator = 105, 
		RULE_ptrdeclarator = 106, RULE_noptrdeclarator = 107, RULE_parametersandqualifiers = 108, 
		RULE_trailingreturntype = 109, RULE_ptrOperator = 110, RULE_cvqualifierseq = 111, 
		RULE_cvqualifier = 112, RULE_refqualifier = 113, RULE_declaratorid = 114, 
		RULE_theTypeID = 115, RULE_abstractdeclarator = 116, RULE_ptrabstractdeclarator = 117, 
		RULE_noptrabstractdeclarator = 118, RULE_abstractpackdeclarator = 119, 
		RULE_noptrabstractpackdeclarator = 120, RULE_parameterdeclarationclause = 121, 
		RULE_parameterdeclarationlist = 122, RULE_parameterdeclaration = 123, 
		RULE_functiondefinition = 124, RULE_functionbody = 125, RULE_initializer = 126, 
		RULE_braceorequalinitializer = 127, RULE_initializerclause = 128, RULE_initializerList = 129, 
		RULE_bracedInitList = 130, RULE_classname = 131, RULE_classspecifier = 132, 
		RULE_classhead = 133, RULE_classheadname = 134, RULE_classvirtspecifier = 135, 
		RULE_classkey = 136, RULE_memberspecification = 137, RULE_memberdeclaration = 138, 
		RULE_memberdeclaratorlist = 139, RULE_memberdeclarator = 140, RULE_virtspecifierseq = 141, 
		RULE_virtspecifier = 142, RULE_purespecifier = 143, RULE_baseclause = 144, 
		RULE_basespecifierlist = 145, RULE_basespecifier = 146, RULE_classordecltype = 147, 
		RULE_basetypespecifier = 148, RULE_accessspecifier = 149, RULE_functionConversionID = 150, 
		RULE_conversiontypeid = 151, RULE_conversiondeclarator = 152, RULE_ctorinitializer = 153, 
		RULE_meminitializerlist = 154, RULE_meminitializer = 155, RULE_meminitializerid = 156, 
		RULE_functionOperatorID = 157, RULE_literalOperatorID = 158, RULE_typeparameter = 159, 
		RULE_typenameSpecifier = 160, RULE_tryblock = 161, RULE_functiontryblock = 162, 
		RULE_handlerseq = 163, RULE_handler = 164, RULE_exceptiondeclaration = 165, 
		RULE_throwexpression = 166, RULE_exceptionspecification = 167, RULE_dynamicexceptionspecification = 168, 
		RULE_typeidlist = 169, RULE_noexceptspecification = 170, RULE_theoperator = 171, 
		RULE_literal = 172, RULE_booleanliteral = 173, RULE_pointerliteral = 174, 
		RULE_userdefinedliteral = 175;
	private static String[] makeRuleNames() {
		return new String[] {
			"unitToTranslate", "unqualifiedID", "unaryExpression", "unaryOperator", 
			"primaryExpression", "nestedNameSpecifier", "defaultCapture", "captureList", 
			"capture", "simpleCapture", "initCapture", "postfixExpression", "typeIDofExpr", 
			"typeIDofTheTypeID", "expressionlist", "pseudoDestructorName", "newExpression", 
			"newPlacement", "newTypeID", "newDeclarator", "noptrNewDeclarator", "newInitializer", 
			"deleteExpression", "noExceptExpression", "castExpression", "pmExpression", 
			"mulExpression", "addExpression", "shiftExpression", "shiftOperator", 
			"relationalExpression", "eqExpression", "andExpression", "exorExpression", 
			"inclusiveorExpression", "logicandExpression", "logicorExpression", "conditionExpression", 
			"assignmentExpression", "assignmentOperator", "expression", "constantExpression", 
			"statement", "labeledStatement", "expressionStatement", "compoundStatement", 
			"statementSequence", "selectStatement", "condition", "iterationStatement", 
			"forInitStatement", "forRangeDeclaration", "forRangeInitializer", "jumpStatement", 
			"declarationStatement", "declarationSequence", "declaration", "blockDeclaration", 
			"simpleDeclaration", "emptyDeclaration", "attributeDeclaration", "declSpecifier", 
			"declSpecifierSequence", "storageClassSpecifier", "functionSpecifier", 
			"typedefName", "typeSpecifier", "trailingTypeSpecifier", "typeSpecifierSequence", 
			"trailingTypeSpecifierSequence", "simpleTypeSpecifier", "theTypename", 
			"elaboratedTypeSpecifier", "enumname", "enumSpecifier", "enumHead", "opaqueEnumDeclaration", 
			"enumKey", "enumBase", "enumeratorlist", "enumeratorDefinition", "enumerator", 
			"originalNamespacename", "namespaceDefinition", "namednamespacedefinition", 
			"originalNamespaceDefinition", "extensionNamespaceDefinition", "unnamedNamesPaceDefinition", 
			"namespaceBody", "qualifiednamespacespecifier", "usingdeclaration", "usingdirective", 
			"linkagespecification", "attributeSpecifierSequence", "attributespecifier", 
			"attributelist", "attribute", "attributetoken", "attributescopedtoken", 
			"attributenamespace", "attributeargumentclause", "balancedtokenseq", 
			"balancedtoken", "initdeclaratorlist", "initdeclarator", "declarator", 
			"ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", "trailingreturntype", 
			"ptrOperator", "cvqualifierseq", "cvqualifier", "refqualifier", "declaratorid", 
			"theTypeID", "abstractdeclarator", "ptrabstractdeclarator", "noptrabstractdeclarator", 
			"abstractpackdeclarator", "noptrabstractpackdeclarator", "parameterdeclarationclause", 
			"parameterdeclarationlist", "parameterdeclaration", "functiondefinition", 
			"functionbody", "initializer", "braceorequalinitializer", "initializerclause", 
			"initializerList", "bracedInitList", "classname", "classspecifier", "classhead", 
			"classheadname", "classvirtspecifier", "classkey", "memberspecification", 
			"memberdeclaration", "memberdeclaratorlist", "memberdeclarator", "virtspecifierseq", 
			"virtspecifier", "purespecifier", "baseclause", "basespecifierlist", 
			"basespecifier", "classordecltype", "basetypespecifier", "accessspecifier", 
			"functionConversionID", "conversiontypeid", "conversiondeclarator", "ctorinitializer", 
			"meminitializerlist", "meminitializer", "meminitializerid", "functionOperatorID", 
			"literalOperatorID", "typeparameter", "typenameSpecifier", "tryblock", 
			"functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
			"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
			"typeidlist", "noexceptspecification", "theoperator", "literal", "booleanliteral", 
			"pointerliteral", "userdefinedliteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'...'", "'!'", "'not'", "'&&'", "'and'", "'||'", "'or'", null, 
			"'auto'", "'bool'", "'break'", "'case'", "'catch'", "'char'", "'char16_t'", 
			"'char32_t'", "'class'", "'const'", "'constexpr'", "'const_cast'", "'continue'", 
			"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
			"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
			"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", "'operator'", 
			"'override'", "'private'", "'protected'", "'public'", "'reinterpret_cast'", 
			"'return'", "'short'", "'signed'", "'sizeof'", "'static'", "'static_cast'", 
			"'struct'", "'switch'", "'this'", "'throw'", "'true'", "'try'", "'typedef'", 
			"'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", 
			"'void'", "'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", 
			"'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", 
			"'|='", "'<<'", "'>>'", "'<<='", "'>>='", "'=='", "'!='", "'<='", "'>='", 
			null, null, "'++'", "'--'", "','", "'->*'", "'->'", "'?'", "':'", "'::'", 
			"';'", "'.'", "'.*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Directive", "Auto", 
			"Bool", "Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", 
			"Const", "Constexpr", "Const_cast", "Continue", "Default", "Delete", 
			"Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", "Export", 
			"Extern", "False", "Final", "Float", "For", "Friend", "Goto", "If", "Inline", 
			"Int", "Long", "Namespace", "New", "Noexcept", "Nullptr", "Operator", 
			"Override", "Private", "Protected", "Public", "Reinterpret_cast", "Return", 
			"Short", "Signed", "Sizeof", "Static", "Static_cast", "Struct", "Switch", 
			"This", "Throw", "True", "Try", "Typedef", "Typeid", "Typename", "Union", 
			"Unsigned", "Using", "Virtual", "Void", "While", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
			"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
			"Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", 
			"ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShift", "RightShift", 
			"LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", "LessEqual", 
			"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", 
			"ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", "Semi", "Dot", 
			"DotStar", "Identifier", "Integerliteral", "Decimalliteral", "Octalliteral", 
			"Hexadecimalliteral", "Binaryliteral", "Integersuffix", "Characterliteral", 
			"Floatingliteral", "Stringliteral", "Userdefinedintegerliteral", "Userdefinedfloatingliteral", 
			"Userdefinedstringliteral", "Userdefinedcharacterliteral", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CPPGrama.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPPGramaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class UnitToTranslateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPPGramaParser.EOF, 0); }
		public DeclarationSequenceContext declarationSequence() {
			return getRuleContext(DeclarationSequenceContext.class,0);
		}
		public UnitToTranslateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToTranslate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterUnitToTranslate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitUnitToTranslate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitUnitToTranslate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToTranslateContext unitToTranslate() throws RecognitionException {
		UnitToTranslateContext _localctx = new UnitToTranslateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unitToTranslate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Namespace) | (1L << Operator) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(352);
				declarationSequence(0);
				}
			}

			setState(355);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedIDContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public FunctionOperatorIDContext functionOperatorID() {
			return getRuleContext(FunctionOperatorIDContext.class,0);
		}
		public FunctionConversionIDContext functionConversionID() {
			return getRuleContext(FunctionConversionIDContext.class,0);
		}
		public LiteralOperatorIDContext literalOperatorID() {
			return getRuleContext(LiteralOperatorIDContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(CPPGramaParser.Tilde, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public UnqualifiedIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterUnqualifiedID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitUnqualifiedID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitUnqualifiedID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedIDContext unqualifiedID() throws RecognitionException {
		UnqualifiedIDContext _localctx = new UnqualifiedIDContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unqualifiedID);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				functionOperatorID();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				functionConversionID();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				literalOperatorID();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(Tilde);
				setState(362);
				classname();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(CPPGramaParser.PlusPlus, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(CPPGramaParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPPGramaParser.Sizeof, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public TheTypeIDContext theTypeID() {
			return getRuleContext(TheTypeIDContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public NoExceptExpressionContext noExceptExpression() {
			return getRuleContext(NoExceptExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public DeleteExpressionContext deleteExpression() {
			return getRuleContext(DeleteExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unaryExpression);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(PlusPlus);
				setState(367);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(MinusMinus);
				setState(369);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				unaryOperator();
				setState(371);
				castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(Sizeof);
				setState(374);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				match(Sizeof);
				setState(376);
				match(LeftParen);
				setState(377);
				theTypeID();
				setState(378);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(380);
				match(Sizeof);
				setState(381);
				match(T__0);
				setState(382);
				match(LeftParen);
				setState(383);
				match(Identifier);
				setState(384);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(385);
				noExceptExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(386);
				newExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(387);
				deleteExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(CPPGramaParser.Or, 0); }
		public TerminalNode Star() { return getToken(CPPGramaParser.Star, 0); }
		public TerminalNode And() { return getToken(CPPGramaParser.And, 0); }
		public TerminalNode Plus() { return getToken(CPPGramaParser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(CPPGramaParser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(CPPGramaParser.Minus, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2 || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Plus - 79)) | (1L << (Minus - 79)) | (1L << (Star - 79)) | (1L << (And - 79)) | (1L << (Or - 79)) | (1L << (Tilde - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(CPPGramaParser.This, 0); }
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public UnqualifiedIDContext unqualifiedID() {
			return getRuleContext(UnqualifiedIDContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primaryExpression);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(LeftParen);
				setState(395);
				expression(0);
				setState(396);
				match(RightParen);
				}
				break;
			case Operator:
			case Tilde:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				unqualifiedID();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedNameSpecifierContext extends ParserRuleContext {
		public TerminalNode Doublecolon() { return getToken(CPPGramaParser.Doublecolon, 0); }
		public TheTypenameContext theTypename() {
			return getRuleContext(TheTypenameContext.class,0);
		}
		public OriginalNamespacenameContext originalNamespacename() {
			return getRuleContext(OriginalNamespacenameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public NestedNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNestedNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNestedNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNestedNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedNameSpecifierContext nestedNameSpecifier() throws RecognitionException {
		return nestedNameSpecifier(0);
	}

	private NestedNameSpecifierContext nestedNameSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestedNameSpecifierContext _localctx = new NestedNameSpecifierContext(_ctx, _parentState);
		NestedNameSpecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestedNameSpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(402);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(403);
				theTypename();
				setState(404);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(406);
				originalNamespacename();
				setState(407);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NestedNameSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nestedNameSpecifier);
					setState(411);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(412);
					match(Identifier);
					setState(413);
					match(Doublecolon);
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DefaultCaptureContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPPGramaParser.And, 0); }
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public DefaultCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDefaultCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDefaultCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDefaultCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaptureContext defaultCapture() throws RecognitionException {
		DefaultCaptureContext _localctx = new DefaultCaptureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defaultCapture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitCaptureList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitCaptureList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureListContext captureList() throws RecognitionException {
		return captureList(0);
	}

	private CaptureListContext captureList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CaptureListContext _localctx = new CaptureListContext(_ctx, _parentState);
		CaptureListContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_captureList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(422);
			capture();
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(423);
				match(T__0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CaptureListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_captureList);
					setState(426);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(427);
					match(Comma);
					setState(428);
					capture();
					setState(430);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(429);
						match(T__0);
						}
						break;
					}
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimpleCaptureContext simpleCapture() {
			return getRuleContext(SimpleCaptureContext.class,0);
		}
		public InitCaptureContext initCapture() {
			return getRuleContext(InitCaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_capture);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				simpleCapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				initCapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleCaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public TerminalNode And() { return getToken(CPPGramaParser.And, 0); }
		public TerminalNode This() { return getToken(CPPGramaParser.This, 0); }
		public SimpleCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterSimpleCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitSimpleCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitSimpleCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCaptureContext simpleCapture() throws RecognitionException {
		SimpleCaptureContext _localctx = new SimpleCaptureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleCapture);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(And);
				setState(443);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitCaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(CPPGramaParser.And, 0); }
		public InitCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterInitCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitInitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitInitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitCaptureContext initCapture() throws RecognitionException {
		InitCaptureContext _localctx = new InitCaptureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_initCapture);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(Identifier);
				setState(448);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(And);
				setState(450);
				match(Identifier);
				setState(451);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenameSpecifierContext typenameSpecifier() {
			return getRuleContext(TypenameSpecifierContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(CPPGramaParser.Dynamic_cast, 0); }
		public TerminalNode Less() { return getToken(CPPGramaParser.Less, 0); }
		public TheTypeIDContext theTypeID() {
			return getRuleContext(TheTypeIDContext.class,0);
		}
		public TerminalNode Greater() { return getToken(CPPGramaParser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(CPPGramaParser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(CPPGramaParser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(CPPGramaParser.Const_cast, 0); }
		public TypeIDofTheTypeIDContext typeIDofTheTypeID() {
			return getRuleContext(TypeIDofTheTypeIDContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPPGramaParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPPGramaParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CPPGramaParser.Dot, 0); }
		public PseudoDestructorNameContext pseudoDestructorName() {
			return getRuleContext(PseudoDestructorNameContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(CPPGramaParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(CPPGramaParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPPGramaParser.MinusMinus, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(455);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(456);
				simpleTypeSpecifier();
				setState(457);
				match(LeftParen);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
					{
					setState(458);
					expressionlist();
					}
				}

				setState(461);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(463);
				typenameSpecifier();
				setState(464);
				match(LeftParen);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
					{
					setState(465);
					expressionlist();
					}
				}

				setState(468);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(470);
				simpleTypeSpecifier();
				setState(471);
				bracedInitList();
				}
				break;
			case 5:
				{
				setState(473);
				typenameSpecifier();
				setState(474);
				bracedInitList();
				}
				break;
			case 6:
				{
				setState(476);
				match(Dynamic_cast);
				setState(477);
				match(Less);
				setState(478);
				theTypeID();
				setState(479);
				match(Greater);
				setState(480);
				match(LeftParen);
				setState(481);
				expression(0);
				setState(482);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(484);
				match(Static_cast);
				setState(485);
				match(Less);
				setState(486);
				theTypeID();
				setState(487);
				match(Greater);
				setState(488);
				match(LeftParen);
				setState(489);
				expression(0);
				setState(490);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(492);
				match(Reinterpret_cast);
				setState(493);
				match(Less);
				setState(494);
				theTypeID();
				setState(495);
				match(Greater);
				setState(496);
				match(LeftParen);
				setState(497);
				expression(0);
				setState(498);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(500);
				match(Const_cast);
				setState(501);
				match(Less);
				setState(502);
				theTypeID();
				setState(503);
				match(Greater);
				setState(504);
				match(LeftParen);
				setState(505);
				expression(0);
				setState(506);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(508);
				typeIDofTheTypeID();
				setState(509);
				match(LeftParen);
				setState(510);
				expression(0);
				setState(511);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(513);
				typeIDofTheTypeID();
				setState(514);
				match(LeftParen);
				setState(515);
				theTypeID();
				setState(516);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(546);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(520);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(521);
						match(LeftBracket);
						setState(522);
						expression(0);
						setState(523);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(525);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(526);
						match(LeftBracket);
						setState(527);
						bracedInitList();
						setState(528);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(530);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(531);
						match(LeftParen);
						setState(533);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
							{
							setState(532);
							expressionlist();
							}
						}

						setState(535);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(536);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(537);
						match(Dot);
						setState(538);
						pseudoDestructorName();
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(539);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(540);
						match(Arrow);
						setState(541);
						pseudoDestructorName();
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(542);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(543);
						match(PlusPlus);
						}
						break;
					case 7:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(544);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(545);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeIDofExprContext extends ParserRuleContext {
		public TerminalNode Typeid() { return getToken(CPPGramaParser.Typeid, 0); }
		public TypeIDofExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIDofExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTypeIDofExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTypeIDofExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTypeIDofExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIDofExprContext typeIDofExpr() throws RecognitionException {
		TypeIDofExprContext _localctx = new TypeIDofExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeIDofExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(Typeid);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIDofTheTypeIDContext extends ParserRuleContext {
		public TerminalNode Typeid() { return getToken(CPPGramaParser.Typeid, 0); }
		public TypeIDofTheTypeIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIDofTheTypeID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTypeIDofTheTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTypeIDofTheTypeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTypeIDofTheTypeID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIDofTheTypeIDContext typeIDofTheTypeID() throws RecognitionException {
		TypeIDofTheTypeIDContext _localctx = new TypeIDofTheTypeIDContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeIDofTheTypeID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(Typeid);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitExpressionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitExpressionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			initializerList(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudoDestructorNameContext extends ParserRuleContext {
		public List<TheTypenameContext> theTypename() {
			return getRuleContexts(TheTypenameContext.class);
		}
		public TheTypenameContext theTypename(int i) {
			return getRuleContext(TheTypenameContext.class,i);
		}
		public TerminalNode Doublecolon() { return getToken(CPPGramaParser.Doublecolon, 0); }
		public TerminalNode Tilde() { return getToken(CPPGramaParser.Tilde, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public PseudoDestructorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoDestructorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPseudoDestructorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPseudoDestructorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPseudoDestructorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoDestructorNameContext pseudoDestructorName() throws RecognitionException {
		PseudoDestructorNameContext _localctx = new PseudoDestructorNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pseudoDestructorName);
		int _la;
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(557);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(560);
				theTypename();
				setState(561);
				match(Doublecolon);
				setState(562);
				match(Tilde);
				setState(563);
				theTypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon || _la==Identifier) {
					{
					setState(565);
					nestedNameSpecifier(0);
					}
				}

				setState(568);
				match(Tilde);
				setState(569);
				theTypename();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPPGramaParser.New, 0); }
		public NewTypeIDContext newTypeID() {
			return getRuleContext(NewTypeIDContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPPGramaParser.Doublecolon, 0); }
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public TheTypeIDContext theTypeID() {
			return getRuleContext(TheTypeIDContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_newExpression);
		int _la;
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(572);
					match(Doublecolon);
					}
				}

				setState(575);
				match(New);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(576);
					newPlacement();
					}
				}

				setState(579);
				newTypeID();
				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(580);
					newInitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(583);
					match(Doublecolon);
					}
				}

				setState(586);
				match(New);
				setState(588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(587);
					newPlacement();
					}
					break;
				}
				setState(590);
				match(LeftParen);
				setState(591);
				theTypeID();
				setState(592);
				match(RightParen);
				setState(594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(593);
					newInitializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewPlacementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public NewPlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPlacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNewPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNewPlacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNewPlacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewPlacementContext newPlacement() throws RecognitionException {
		NewPlacementContext _localctx = new NewPlacementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_newPlacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(LeftParen);
			setState(599);
			expressionlist();
			setState(600);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewTypeIDContext extends ParserRuleContext {
		public TypeSpecifierSequenceContext typeSpecifierSequence() {
			return getRuleContext(TypeSpecifierSequenceContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NewTypeIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTypeID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNewTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNewTypeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNewTypeID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeIDContext newTypeID() throws RecognitionException {
		NewTypeIDContext _localctx = new NewTypeIDContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_newTypeID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			typeSpecifierSequence();
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(603);
				newDeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewDeclaratorContext extends ParserRuleContext {
		public PtrOperatorContext ptrOperator() {
			return getRuleContext(PtrOperatorContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NoptrNewDeclaratorContext noptrNewDeclarator() {
			return getRuleContext(NoptrNewDeclaratorContext.class,0);
		}
		public NewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDeclaratorContext newDeclarator() throws RecognitionException {
		NewDeclaratorContext _localctx = new NewDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newDeclarator);
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				ptrOperator();
				setState(608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(607);
					newDeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				noptrNewDeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrNewDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CPPGramaParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CPPGramaParser.RightBracket, 0); }
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public NoptrNewDeclaratorContext noptrNewDeclarator() {
			return getRuleContext(NoptrNewDeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoptrNewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrNewDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNoptrNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNoptrNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNoptrNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrNewDeclaratorContext noptrNewDeclarator() throws RecognitionException {
		return noptrNewDeclarator(0);
	}

	private NoptrNewDeclaratorContext noptrNewDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrNewDeclaratorContext _localctx = new NoptrNewDeclaratorContext(_ctx, _parentState);
		NoptrNewDeclaratorContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_noptrNewDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(614);
			match(LeftBracket);
			setState(615);
			expression(0);
			setState(616);
			match(RightBracket);
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(617);
				attributeSpecifierSequence(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrNewDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrNewDeclarator);
					setState(620);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(621);
					match(LeftBracket);
					setState(622);
					constantExpression();
					setState(623);
					match(RightBracket);
					setState(625);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(624);
						attributeSpecifierSequence(0);
						}
						break;
					}
					}
					} 
				}
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewInitializerContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public NewInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNewInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNewInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNewInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInitializerContext newInitializer() throws RecognitionException {
		NewInitializerContext _localctx = new NewInitializerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newInitializer);
		int _la;
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(LeftParen);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
					{
					setState(633);
					expressionlist();
					}
				}

				setState(636);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteExpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(CPPGramaParser.Delete, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPPGramaParser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(CPPGramaParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPPGramaParser.RightBracket, 0); }
		public DeleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteExpressionContext deleteExpression() throws RecognitionException {
		DeleteExpressionContext _localctx = new DeleteExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_deleteExpression);
		int _la;
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(640);
					match(Doublecolon);
					}
				}

				setState(643);
				match(Delete);
				setState(644);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(645);
					match(Doublecolon);
					}
				}

				setState(648);
				match(Delete);
				setState(649);
				match(LeftBracket);
				setState(650);
				match(RightBracket);
				setState(651);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoExceptExpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPPGramaParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public NoExceptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noExceptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNoExceptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNoExceptExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNoExceptExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoExceptExpressionContext noExceptExpression() throws RecognitionException {
		NoExceptExpressionContext _localctx = new NoExceptExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_noExceptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(Noexcept);
			setState(655);
			match(LeftParen);
			setState(656);
			expression(0);
			setState(657);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public TheTypeIDContext theTypeID() {
			return getRuleContext(TheTypeIDContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_castExpression);
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(LeftParen);
				setState(661);
				theTypeID();
				setState(662);
				match(RightParen);
				setState(663);
				castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PmExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PmExpressionContext pmExpression() {
			return getRuleContext(PmExpressionContext.class,0);
		}
		public TerminalNode DotStar() { return getToken(CPPGramaParser.DotStar, 0); }
		public TerminalNode ArrowStar() { return getToken(CPPGramaParser.ArrowStar, 0); }
		public PmExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPmExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPmExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPmExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PmExpressionContext pmExpression() throws RecognitionException {
		return pmExpression(0);
	}

	private PmExpressionContext pmExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmExpressionContext _localctx = new PmExpressionContext(_ctx, _parentState);
		PmExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_pmExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(668);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(676);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new PmExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmExpression);
						setState(670);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(671);
						match(DotStar);
						setState(672);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new PmExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmExpression);
						setState(673);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(674);
						match(ArrowStar);
						setState(675);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulExpressionContext extends ParserRuleContext {
		public PmExpressionContext pmExpression() {
			return getRuleContext(PmExpressionContext.class,0);
		}
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CPPGramaParser.Star, 0); }
		public TerminalNode Div() { return getToken(CPPGramaParser.Div, 0); }
		public TerminalNode Mod() { return getToken(CPPGramaParser.Mod, 0); }
		public MulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpressionContext mulExpression() throws RecognitionException {
		return mulExpression(0);
	}

	private MulExpressionContext mulExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExpressionContext _localctx = new MulExpressionContext(_ctx, _parentState);
		MulExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_mulExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(682);
			pmExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(693);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
						setState(684);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(685);
						match(Star);
						setState(686);
						pmExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MulExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
						setState(687);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(688);
						match(Div);
						setState(689);
						pmExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MulExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_mulExpression);
						setState(690);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(691);
						match(Mod);
						setState(692);
						pmExpression(0);
						}
						break;
					}
					} 
				}
				setState(697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddExpressionContext extends ParserRuleContext {
		public MulExpressionContext mulExpression() {
			return getRuleContext(MulExpressionContext.class,0);
		}
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CPPGramaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPPGramaParser.Minus, 0); }
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		return addExpression(0);
	}

	private AddExpressionContext addExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, _parentState);
		AddExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_addExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(699);
			mulExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(707);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new AddExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addExpression);
						setState(701);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(702);
						match(Plus);
						setState(703);
						mulExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AddExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addExpression);
						setState(704);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(705);
						match(Minus);
						setState(706);
						mulExpression(0);
						}
						break;
					}
					} 
				}
				setState(711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftOperatorContext shiftOperator() {
			return getRuleContext(ShiftOperatorContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(713);
			addExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
					setState(715);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(716);
					shiftOperator();
					setState(717);
					addExpression(0);
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftOperatorContext extends ParserRuleContext {
		public TerminalNode RightShift() { return getToken(CPPGramaParser.RightShift, 0); }
		public TerminalNode LeftShift() { return getToken(CPPGramaParser.LeftShift, 0); }
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_shiftOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !(_la==LeftShift || _la==RightShift) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CPPGramaParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPPGramaParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CPPGramaParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CPPGramaParser.GreaterEqual, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(727);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(741);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(729);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(730);
						match(Less);
						setState(731);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(732);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(733);
						match(Greater);
						setState(734);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(735);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(736);
						match(LessEqual);
						setState(737);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(738);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(739);
						match(GreaterEqual);
						setState(740);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqExpressionContext eqExpression() {
			return getRuleContext(EqExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(CPPGramaParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CPPGramaParser.NotEqual, 0); }
		public EqExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpressionContext eqExpression() throws RecognitionException {
		return eqExpression(0);
	}

	private EqExpressionContext eqExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExpressionContext _localctx = new EqExpressionContext(_ctx, _parentState);
		EqExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_eqExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(747);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(755);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new EqExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqExpression);
						setState(749);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(750);
						match(Equal);
						setState(751);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_eqExpression);
						setState(752);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(753);
						match(NotEqual);
						setState(754);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqExpressionContext eqExpression() {
			return getRuleContext(EqExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(CPPGramaParser.And, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(761);
			eqExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(763);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(764);
					match(And);
					setState(765);
					eqExpression(0);
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExorExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExorExpressionContext exorExpression() {
			return getRuleContext(ExorExpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(CPPGramaParser.Caret, 0); }
		public ExorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterExorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitExorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitExorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExorExpressionContext exorExpression() throws RecognitionException {
		return exorExpression(0);
	}

	private ExorExpressionContext exorExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExorExpressionContext _localctx = new ExorExpressionContext(_ctx, _parentState);
		ExorExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_exorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(772);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exorExpression);
					setState(774);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(775);
					match(Caret);
					setState(776);
					andExpression(0);
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorExpressionContext extends ParserRuleContext {
		public ExorExpressionContext exorExpression() {
			return getRuleContext(ExorExpressionContext.class,0);
		}
		public InclusiveorExpressionContext inclusiveorExpression() {
			return getRuleContext(InclusiveorExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(CPPGramaParser.Or, 0); }
		public InclusiveorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterInclusiveorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitInclusiveorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitInclusiveorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveorExpressionContext inclusiveorExpression() throws RecognitionException {
		return inclusiveorExpression(0);
	}

	private InclusiveorExpressionContext inclusiveorExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorExpressionContext _localctx = new InclusiveorExpressionContext(_ctx, _parentState);
		InclusiveorExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_inclusiveorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(783);
			exorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorExpression);
					setState(785);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(786);
					match(Or);
					setState(787);
					exorExpression(0);
					}
					} 
				}
				setState(792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicandExpressionContext extends ParserRuleContext {
		public InclusiveorExpressionContext inclusiveorExpression() {
			return getRuleContext(InclusiveorExpressionContext.class,0);
		}
		public LogicandExpressionContext logicandExpression() {
			return getRuleContext(LogicandExpressionContext.class,0);
		}
		public LogicandExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicandExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterLogicandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitLogicandExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitLogicandExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicandExpressionContext logicandExpression() throws RecognitionException {
		return logicandExpression(0);
	}

	private LogicandExpressionContext logicandExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicandExpressionContext _localctx = new LogicandExpressionContext(_ctx, _parentState);
		LogicandExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_logicandExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(794);
			inclusiveorExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(802);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new LogicandExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicandExpression);
						setState(796);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(797);
						match(T__3);
						setState(798);
						inclusiveorExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicandExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicandExpression);
						setState(799);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(800);
						match(T__4);
						setState(801);
						inclusiveorExpression(0);
						}
						break;
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicorExpressionContext extends ParserRuleContext {
		public LogicandExpressionContext logicandExpression() {
			return getRuleContext(LogicandExpressionContext.class,0);
		}
		public LogicorExpressionContext logicorExpression() {
			return getRuleContext(LogicorExpressionContext.class,0);
		}
		public LogicorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterLogicorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitLogicorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitLogicorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicorExpressionContext logicorExpression() throws RecognitionException {
		return logicorExpression(0);
	}

	private LogicorExpressionContext logicorExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicorExpressionContext _localctx = new LogicorExpressionContext(_ctx, _parentState);
		LogicorExpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_logicorExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(808);
			logicandExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(816);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new LogicorExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicorExpression);
						setState(810);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(811);
						match(T__5);
						setState(812);
						logicandExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicorExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicorExpression);
						setState(813);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(814);
						match(T__6);
						setState(815);
						logicandExpression(0);
						}
						break;
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionExpressionContext extends ParserRuleContext {
		public LogicorExpressionContext logicorExpression() {
			return getRuleContext(LogicorExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CPPGramaParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPPGramaParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditionExpression);
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				logicorExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				logicorExpression(0);
				setState(823);
				match(Question);
				setState(824);
				expression(0);
				setState(825);
				match(Colon);
				setState(826);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public LogicorExpressionContext logicorExpression() {
			return getRuleContext(LogicorExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignmentExpression);
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				conditionExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				logicorExpression(0);
				setState(832);
				assignmentOperator();
				setState(833);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				throwexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CPPGramaParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CPPGramaParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPPGramaParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CPPGramaParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPPGramaParser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPPGramaParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPPGramaParser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPPGramaParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPPGramaParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPPGramaParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (Assign - 89)) | (1L << (PlusAssign - 89)) | (1L << (MinusAssign - 89)) | (1L << (StarAssign - 89)) | (1L << (DivAssign - 89)) | (1L << (ModAssign - 89)) | (1L << (XorAssign - 89)) | (1L << (AndAssign - 89)) | (1L << (OrAssign - 89)) | (1L << (LeftShiftAssign - 89)) | (1L << (RightShiftAssign - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(841);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(843);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(844);
					match(Comma);
					setState(845);
					assignmentExpression();
					}
					} 
				}
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			conditionExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_statement);
		int _la;
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(854);
					attributeSpecifierSequence(0);
					}
				}

				setState(857);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(858);
					attributeSpecifierSequence(0);
					}
				}

				setState(861);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(862);
					attributeSpecifierSequence(0);
					}
				}

				setState(865);
				selectStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(866);
					attributeSpecifierSequence(0);
					}
				}

				setState(869);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(870);
					attributeSpecifierSequence(0);
					}
				}

				setState(873);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(874);
				declarationStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(875);
					attributeSpecifierSequence(0);
					}
				}

				setState(878);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CPPGramaParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TerminalNode Case() { return getToken(CPPGramaParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPPGramaParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_labeledStatement);
		int _la;
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(881);
					attributeSpecifierSequence(0);
					}
				}

				setState(884);
				match(Identifier);
				setState(885);
				match(Colon);
				setState(886);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(887);
					attributeSpecifierSequence(0);
					}
				}

				setState(890);
				match(Case);
				setState(891);
				constantExpression();
				setState(892);
				match(Colon);
				setState(893);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(895);
					attributeSpecifierSequence(0);
					}
				}

				setState(898);
				match(Default);
				setState(899);
				match(Colon);
				setState(900);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
				{
				setState(903);
				expression(0);
				}
			}

			setState(906);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(LeftBrace);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Throw) | (1L << True) | (1L << Try))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(909);
				statementSequence(0);
				}
			}

			setState(912);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementSequenceContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public StatementSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterStatementSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitStatementSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitStatementSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSequenceContext statementSequence() throws RecognitionException {
		return statementSequence(0);
	}

	private StatementSequenceContext statementSequence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementSequenceContext _localctx = new StatementSequenceContext(_ctx, _parentState);
		StatementSequenceContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_statementSequence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(915);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementSequenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementSequence);
					setState(917);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(918);
					statement();
					}
					} 
				}
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CPPGramaParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CPPGramaParser.Else, 0); }
		public TerminalNode Switch() { return getToken(CPPGramaParser.Switch, 0); }
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selectStatement);
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				match(If);
				setState(925);
				match(LeftParen);
				setState(926);
				condition();
				setState(927);
				match(RightParen);
				setState(928);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				match(If);
				setState(931);
				match(LeftParen);
				setState(932);
				condition();
				setState(933);
				match(RightParen);
				setState(934);
				statement();
				setState(935);
				match(Else);
				setState(936);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938);
				match(Switch);
				setState(939);
				match(LeftParen);
				setState(940);
				condition();
				setState(941);
				match(RightParen);
				setState(942);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclSpecifierSequenceContext declSpecifierSequence() {
			return getRuleContext(DeclSpecifierSequenceContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_condition);
		int _la;
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(947);
					attributeSpecifierSequence(0);
					}
				}

				setState(950);
				declSpecifierSequence();
				setState(951);
				declarator();
				setState(952);
				match(Assign);
				setState(953);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(955);
					attributeSpecifierSequence(0);
					}
				}

				setState(958);
				declSpecifierSequence();
				setState(959);
				declarator();
				setState(960);
				bracedInitList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPPGramaParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPPGramaParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public TerminalNode For() { return getToken(CPPGramaParser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ForRangeDeclarationContext forRangeDeclaration() {
			return getRuleContext(ForRangeDeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPPGramaParser.Colon, 0); }
		public ForRangeInitializerContext forRangeInitializer() {
			return getRuleContext(ForRangeInitializerContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_iterationStatement);
		int _la;
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(While);
				setState(965);
				match(LeftParen);
				setState(966);
				condition();
				setState(967);
				match(RightParen);
				setState(968);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				match(Do);
				setState(971);
				statement();
				setState(972);
				match(While);
				setState(973);
				match(LeftParen);
				setState(974);
				expression(0);
				setState(975);
				match(RightParen);
				setState(976);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(978);
				match(For);
				setState(979);
				match(LeftParen);
				setState(980);
				forInitStatement();
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(981);
					condition();
					}
				}

				setState(984);
				match(Semi);
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
					{
					setState(985);
					expression(0);
					}
				}

				setState(988);
				match(RightParen);
				setState(989);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(991);
				match(For);
				setState(992);
				match(LeftParen);
				setState(993);
				forRangeDeclaration();
				setState(994);
				match(Colon);
				setState(995);
				forRangeInitializer();
				setState(996);
				match(RightParen);
				setState(997);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forInitStatement);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				simpleDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForRangeDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSequenceContext declSpecifierSequence() {
			return getRuleContext(DeclSpecifierSequenceContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public ForRangeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterForRangeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitForRangeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitForRangeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeDeclarationContext forRangeDeclaration() throws RecognitionException {
		ForRangeDeclarationContext _localctx = new ForRangeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forRangeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(1005);
				attributeSpecifierSequence(0);
				}
			}

			setState(1008);
			declSpecifierSequence();
			setState(1009);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForRangeInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ForRangeInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterForRangeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitForRangeInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitForRangeInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeInitializerContext forRangeInitializer() throws RecognitionException {
		ForRangeInitializerContext _localctx = new ForRangeInitializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forRangeInitializer);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(CPPGramaParser.Break, 0); }
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public TerminalNode Continue() { return getToken(CPPGramaParser.Continue, 0); }
		public TerminalNode Return() { return getToken(CPPGramaParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public TerminalNode Goto() { return getToken(CPPGramaParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jumpStatement);
		int _la;
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				match(Break);
				setState(1016);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				match(Continue);
				setState(1018);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1019);
				match(Return);
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
					{
					setState(1020);
					expression(0);
					}
				}

				setState(1023);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1024);
				match(Return);
				setState(1025);
				bracedInitList();
				setState(1026);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1028);
				match(Goto);
				setState(1029);
				match(Identifier);
				setState(1030);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			blockDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSequenceContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationSequenceContext declarationSequence() {
			return getRuleContext(DeclarationSequenceContext.class,0);
		}
		public DeclarationSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDeclarationSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDeclarationSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDeclarationSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSequenceContext declarationSequence() throws RecognitionException {
		return declarationSequence(0);
	}

	private DeclarationSequenceContext declarationSequence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationSequenceContext _localctx = new DeclarationSequenceContext(_ctx, _parentState);
		DeclarationSequenceContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_declarationSequence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1036);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1042);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationSequenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationSequence);
					setState(1038);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1039);
					declaration();
					}
					} 
				}
				setState(1044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespaceDefinitionContext namespaceDefinition() {
			return getRuleContext(NamespaceDefinitionContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_declaration);
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1047);
				linkagespecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1048);
				namespaceDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1049);
				emptyDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1050);
				attributeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public OpaqueEnumDeclarationContext opaqueEnumDeclaration() {
			return getRuleContext(OpaqueEnumDeclarationContext.class,0);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBlockDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_blockDeclaration);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				usingdeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				usingdirective();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1056);
				opaqueEnumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public DeclSpecifierSequenceContext declSpecifierSequence() {
			return getRuleContext(DeclSpecifierSequenceContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_simpleDeclaration);
		int _la;
		try {
			setState(1073);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Operator:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case Doublecolon:
			case Semi:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(1059);
					declSpecifierSequence();
					}
					break;
				}
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Operator))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LeftParen - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (Tilde - 73)) | (1L << (Doublecolon - 73)) | (1L << (Identifier - 73)))) != 0)) {
					{
					setState(1062);
					initdeclaratorlist(0);
					}
				}

				setState(1065);
				match(Semi);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				attributeSpecifierSequence(0);
				setState(1068);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(1067);
					declSpecifierSequence();
					}
					break;
				}
				setState(1070);
				initdeclaratorlist(0);
				setState(1071);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEmptyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEmptyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyDeclarationContext emptyDeclaration() throws RecognitionException {
		EmptyDeclarationContext _localctx = new EmptyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeDeclarationContext extends ParserRuleContext {
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			attributeSpecifierSequence(0);
			setState(1078);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPPGramaParser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPPGramaParser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(CPPGramaParser.Constexpr, 0); }
		public DeclSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDeclSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDeclSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDeclSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierContext declSpecifier() throws RecognitionException {
		DeclSpecifierContext _localctx = new DeclSpecifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declSpecifier);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				storageClassSpecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename:
			case Union:
			case Unsigned:
			case Void:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				typeSpecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1082);
				functionSpecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1083);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1084);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1085);
				match(Constexpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclSpecifierSequenceContext extends ParserRuleContext {
		public DeclSpecifierContext declSpecifier() {
			return getRuleContext(DeclSpecifierContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public DeclSpecifierSequenceContext declSpecifierSequence() {
			return getRuleContext(DeclSpecifierSequenceContext.class,0);
		}
		public DeclSpecifierSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifierSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDeclSpecifierSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDeclSpecifierSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDeclSpecifierSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierSequenceContext declSpecifierSequence() throws RecognitionException {
		DeclSpecifierSequenceContext _localctx = new DeclSpecifierSequenceContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_declSpecifierSequence);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				declSpecifier();
				setState(1090);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1089);
					attributeSpecifierSequence(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				declSpecifier();
				setState(1093);
				declSpecifierSequence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(CPPGramaParser.Static, 0); }
		public TerminalNode Extern() { return getToken(CPPGramaParser.Extern, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_la = _input.LA(1);
			if ( !(_la==Extern || _la==Static) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPPGramaParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPPGramaParser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CPPGramaParser.Explicit, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (Explicit - 29)) | (1L << (Inline - 29)) | (1L << (Virtual - 29)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TrailingTypeSpecifierContext trailingTypeSpecifier() {
			return getRuleContext(TrailingTypeSpecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_typeSpecifier);
		try {
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				trailingTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105);
				enumSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingTypeSpecifierContext extends ParserRuleContext {
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() {
			return getRuleContext(ElaboratedTypeSpecifierContext.class,0);
		}
		public TypenameSpecifierContext typenameSpecifier() {
			return getRuleContext(TypenameSpecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTrailingTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTrailingTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTrailingTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierContext trailingTypeSpecifier() throws RecognitionException {
		TrailingTypeSpecifierContext _localctx = new TrailingTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_trailingTypeSpecifier);
		try {
			setState(1112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				simpleTypeSpecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				elaboratedTypeSpecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				typenameSpecifier();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 4);
				{
				setState(1111);
				cvqualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierSequenceContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TypeSpecifierSequenceContext typeSpecifierSequence() {
			return getRuleContext(TypeSpecifierSequenceContext.class,0);
		}
		public TypeSpecifierSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifierSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTypeSpecifierSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTypeSpecifierSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTypeSpecifierSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierSequenceContext typeSpecifierSequence() throws RecognitionException {
		TypeSpecifierSequenceContext _localctx = new TypeSpecifierSequenceContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typeSpecifierSequence);
		try {
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				typeSpecifier();
				setState(1116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1115);
					attributeSpecifierSequence(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				typeSpecifier();
				setState(1119);
				typeSpecifierSequence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingTypeSpecifierSequenceContext extends ParserRuleContext {
		public TrailingTypeSpecifierContext trailingTypeSpecifier() {
			return getRuleContext(TrailingTypeSpecifierContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TrailingTypeSpecifierSequenceContext trailingTypeSpecifierSequence() {
			return getRuleContext(TrailingTypeSpecifierSequenceContext.class,0);
		}
		public TrailingTypeSpecifierSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifierSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTrailingTypeSpecifierSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTrailingTypeSpecifierSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTrailingTypeSpecifierSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierSequenceContext trailingTypeSpecifierSequence() throws RecognitionException {
		TrailingTypeSpecifierSequenceContext _localctx = new TrailingTypeSpecifierSequenceContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_trailingTypeSpecifierSequence);
		try {
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				trailingTypeSpecifier();
				setState(1125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1124);
					attributeSpecifierSequence(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				trailingTypeSpecifier();
				setState(1128);
				trailingTypeSpecifierSequence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeSpecifierContext extends ParserRuleContext {
		public TheTypenameContext theTypename() {
			return getRuleContext(TheTypenameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Char() { return getToken(CPPGramaParser.Char, 0); }
		public TerminalNode Char16() { return getToken(CPPGramaParser.Char16, 0); }
		public TerminalNode Char32() { return getToken(CPPGramaParser.Char32, 0); }
		public TerminalNode Bool() { return getToken(CPPGramaParser.Bool, 0); }
		public TerminalNode Short() { return getToken(CPPGramaParser.Short, 0); }
		public TerminalNode Int() { return getToken(CPPGramaParser.Int, 0); }
		public TerminalNode Long() { return getToken(CPPGramaParser.Long, 0); }
		public TerminalNode Signed() { return getToken(CPPGramaParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CPPGramaParser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(CPPGramaParser.Float, 0); }
		public TerminalNode Double() { return getToken(CPPGramaParser.Double, 0); }
		public TerminalNode Void() { return getToken(CPPGramaParser.Void, 0); }
		public TerminalNode Auto() { return getToken(CPPGramaParser.Auto, 0); }
		public SimpleTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterSimpleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitSimpleTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitSimpleTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeSpecifierContext simpleTypeSpecifier() throws RecognitionException {
		SimpleTypeSpecifierContext _localctx = new SimpleTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_simpleTypeSpecifier);
		try {
			setState(1149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1132);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1135);
				theTypename();
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				match(Char);
				}
				break;
			case Char16:
				enterOuterAlt(_localctx, 3);
				{
				setState(1137);
				match(Char16);
				}
				break;
			case Char32:
				enterOuterAlt(_localctx, 4);
				{
				setState(1138);
				match(Char32);
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 5);
				{
				setState(1139);
				match(Bool);
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 6);
				{
				setState(1140);
				match(Short);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 7);
				{
				setState(1141);
				match(Int);
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 8);
				{
				setState(1142);
				match(Long);
				}
				break;
			case Signed:
				enterOuterAlt(_localctx, 9);
				{
				setState(1143);
				match(Signed);
				}
				break;
			case Unsigned:
				enterOuterAlt(_localctx, 10);
				{
				setState(1144);
				match(Unsigned);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 11);
				{
				setState(1145);
				match(Float);
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 12);
				{
				setState(1146);
				match(Double);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 13);
				{
				setState(1147);
				match(Void);
				}
				break;
			case Auto:
				enterOuterAlt(_localctx, 14);
				{
				setState(1148);
				match(Auto);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheTypenameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TheTypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTheTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTheTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTheTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypenameContext theTypename() throws RecognitionException {
		TheTypenameContext _localctx = new TheTypenameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_theTypename);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1153);
				typedefName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElaboratedTypeSpecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Enum() { return getToken(CPPGramaParser.Enum, 0); }
		public ElaboratedTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterElaboratedTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitElaboratedTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitElaboratedTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() throws RecognitionException {
		ElaboratedTypeSpecifierContext _localctx = new ElaboratedTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elaboratedTypeSpecifier);
		int _la;
		try {
			setState(1170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				classkey();
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1157);
					attributeSpecifierSequence(0);
					}
				}

				setState(1161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1160);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1163);
				match(Identifier);
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				match(Enum);
				setState(1167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1166);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1169);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEnumname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEnumname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumHeadContext enumHead() {
			return getRuleContext(EnumHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_enumSpecifier);
		int _la;
		try {
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				enumHead();
				setState(1175);
				match(LeftBrace);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1176);
					enumeratorlist(0);
					}
				}

				setState(1179);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				enumHead();
				setState(1182);
				match(LeftBrace);
				setState(1183);
				enumeratorlist(0);
				setState(1184);
				match(Comma);
				setState(1185);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumHeadContext extends ParserRuleContext {
		public EnumKeyContext enumKey() {
			return getRuleContext(EnumKeyContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public EnumBaseContext enumBase() {
			return getRuleContext(EnumBaseContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public EnumHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEnumHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEnumHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEnumHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumHeadContext enumHead() throws RecognitionException {
		EnumHeadContext _localctx = new EnumHeadContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_enumHead);
		int _la;
		try {
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				enumKey();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1190);
					attributeSpecifierSequence(0);
					}
				}

				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1193);
					match(Identifier);
					}
				}

				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1196);
					enumBase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				enumKey();
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1200);
					attributeSpecifierSequence(0);
					}
				}

				setState(1203);
				nestedNameSpecifier(0);
				setState(1204);
				match(Identifier);
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1205);
					enumBase();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueEnumDeclarationContext extends ParserRuleContext {
		public EnumKeyContext enumKey() {
			return getRuleContext(EnumKeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public EnumBaseContext enumBase() {
			return getRuleContext(EnumBaseContext.class,0);
		}
		public OpaqueEnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueEnumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterOpaqueEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitOpaqueEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitOpaqueEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaqueEnumDeclarationContext opaqueEnumDeclaration() throws RecognitionException {
		OpaqueEnumDeclarationContext _localctx = new OpaqueEnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_opaqueEnumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			enumKey();
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(1211);
				attributeSpecifierSequence(0);
				}
			}

			setState(1214);
			match(Identifier);
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1215);
				enumBase();
				}
			}

			setState(1218);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumKeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPPGramaParser.Enum, 0); }
		public TerminalNode Class() { return getToken(CPPGramaParser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPPGramaParser.Struct, 0); }
		public EnumKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEnumKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEnumKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEnumKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumKeyContext enumKey() throws RecognitionException {
		EnumKeyContext _localctx = new EnumKeyContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_enumKey);
		try {
			setState(1225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				match(Enum);
				setState(1222);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1223);
				match(Enum);
				setState(1224);
				match(Struct);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBaseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPPGramaParser.Colon, 0); }
		public TypeSpecifierSequenceContext typeSpecifierSequence() {
			return getRuleContext(TypeSpecifierSequenceContext.class,0);
		}
		public EnumBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEnumBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEnumBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEnumBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBaseContext enumBase() throws RecognitionException {
		EnumBaseContext _localctx = new EnumBaseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_enumBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(Colon);
			setState(1228);
			typeSpecifierSequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratorDefinitionContext enumeratorDefinition() {
			return getRuleContext(EnumeratorDefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEnumeratorlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEnumeratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1231);
			enumeratorDefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1233);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1234);
					match(Comma);
					setState(1235);
					enumeratorDefinition();
					}
					} 
				}
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorDefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEnumeratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEnumeratorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEnumeratorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorDefinitionContext enumeratorDefinition() throws RecognitionException {
		EnumeratorDefinitionContext _localctx = new EnumeratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enumeratorDefinition);
		try {
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				enumerator();
				setState(1243);
				match(Assign);
				setState(1244);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalNamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public OriginalNamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterOriginalNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitOriginalNamespacename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitOriginalNamespacename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalNamespacenameContext originalNamespacename() throws RecognitionException {
		OriginalNamespacenameContext _localctx = new OriginalNamespacenameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_originalNamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDefinitionContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamedNamesPaceDefinitionContext unnamedNamesPaceDefinition() {
			return getRuleContext(UnnamedNamesPaceDefinitionContext.class,0);
		}
		public NamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_namespaceDefinition);
		try {
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				unnamedNamesPaceDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalNamespaceDefinitionContext originalNamespaceDefinition() {
			return getRuleContext(OriginalNamespaceDefinitionContext.class,0);
		}
		public ExtensionNamespaceDefinitionContext extensionNamespaceDefinition() {
			return getRuleContext(ExtensionNamespaceDefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNamednamespacedefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNamednamespacedefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_namednamespacedefinition);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				originalNamespaceDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				extensionNamespaceDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalNamespaceDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPPGramaParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public NamespaceBodyContext namespaceBody() {
			return getRuleContext(NamespaceBodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(CPPGramaParser.Inline, 0); }
		public OriginalNamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterOriginalNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitOriginalNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitOriginalNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalNamespaceDefinitionContext originalNamespaceDefinition() throws RecognitionException {
		OriginalNamespaceDefinitionContext _localctx = new OriginalNamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_originalNamespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1260);
				match(Inline);
				}
			}

			setState(1263);
			match(Namespace);
			setState(1264);
			match(Identifier);
			setState(1265);
			match(LeftBrace);
			setState(1266);
			namespaceBody();
			setState(1267);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionNamespaceDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPPGramaParser.Namespace, 0); }
		public OriginalNamespacenameContext originalNamespacename() {
			return getRuleContext(OriginalNamespacenameContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public NamespaceBodyContext namespaceBody() {
			return getRuleContext(NamespaceBodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(CPPGramaParser.Inline, 0); }
		public ExtensionNamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionNamespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterExtensionNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitExtensionNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitExtensionNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionNamespaceDefinitionContext extensionNamespaceDefinition() throws RecognitionException {
		ExtensionNamespaceDefinitionContext _localctx = new ExtensionNamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_extensionNamespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1269);
				match(Inline);
				}
			}

			setState(1272);
			match(Namespace);
			setState(1273);
			originalNamespacename();
			setState(1274);
			match(LeftBrace);
			setState(1275);
			namespaceBody();
			setState(1276);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamedNamesPaceDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPPGramaParser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public NamespaceBodyContext namespaceBody() {
			return getRuleContext(NamespaceBodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(CPPGramaParser.Inline, 0); }
		public UnnamedNamesPaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamedNamesPaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterUnnamedNamesPaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitUnnamedNamesPaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitUnnamedNamesPaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnnamedNamesPaceDefinitionContext unnamedNamesPaceDefinition() throws RecognitionException {
		UnnamedNamesPaceDefinitionContext _localctx = new UnnamedNamesPaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_unnamedNamesPaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1278);
				match(Inline);
				}
			}

			setState(1281);
			match(Namespace);
			setState(1282);
			match(LeftBrace);
			setState(1283);
			namespaceBody();
			setState(1284);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceBodyContext extends ParserRuleContext {
		public DeclarationSequenceContext declarationSequence() {
			return getRuleContext(DeclarationSequenceContext.class,0);
		}
		public NamespaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNamespaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNamespaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNamespaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceBodyContext namespaceBody() throws RecognitionException {
		NamespaceBodyContext _localctx = new NamespaceBodyContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namespaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Namespace) | (1L << Operator) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1286);
				declarationSequence(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public OriginalNamespacenameContext originalNamespacename() {
			return getRuleContext(OriginalNamespacenameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitQualifiednamespacespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitQualifiednamespacespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1289);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1292);
			originalNamespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPPGramaParser.Using, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UnqualifiedIDContext unqualifiedID() {
			return getRuleContext(UnqualifiedIDContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public TerminalNode Typename() { return getToken(CPPGramaParser.Typename, 0); }
		public TerminalNode Doublecolon() { return getToken(CPPGramaParser.Doublecolon, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitUsingdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitUsingdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_usingdeclaration);
		int _la;
		try {
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1294);
				match(Using);
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1295);
					match(Typename);
					}
				}

				setState(1298);
				nestedNameSpecifier(0);
				setState(1299);
				unqualifiedID();
				setState(1300);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
				match(Using);
				setState(1303);
				match(Doublecolon);
				setState(1304);
				unqualifiedID();
				setState(1305);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPPGramaParser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CPPGramaParser.Namespace, 0); }
		public OriginalNamespacenameContext originalNamespacename() {
			return getRuleContext(OriginalNamespacenameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitUsingdirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitUsingdirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(1309);
				attributeSpecifierSequence(0);
				}
			}

			setState(1312);
			match(Using);
			setState(1313);
			match(Namespace);
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1314);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1317);
			originalNamespacename();
			setState(1318);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPPGramaParser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CPPGramaParser.Stringliteral, 0); }
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public DeclarationSequenceContext declarationSequence() {
			return getRuleContext(DeclarationSequenceContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitLinkagespecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitLinkagespecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_linkagespecification);
		int _la;
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320);
				match(Extern);
				setState(1321);
				match(Stringliteral);
				setState(1322);
				match(LeftBrace);
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Namespace) | (1L << Operator) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1323);
					declarationSequence(0);
					}
				}

				setState(1326);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				match(Extern);
				setState(1328);
				match(Stringliteral);
				setState(1329);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSpecifierSequenceContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public AttributeSpecifierSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifierSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttributeSpecifierSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttributeSpecifierSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttributeSpecifierSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierSequenceContext attributeSpecifierSequence() throws RecognitionException {
		return attributeSpecifierSequence(0);
	}

	private AttributeSpecifierSequenceContext attributeSpecifierSequence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributeSpecifierSequenceContext _localctx = new AttributeSpecifierSequenceContext(_ctx, _parentState);
		AttributeSpecifierSequenceContext _prevctx = _localctx;
		int _startState = 186;
		enterRecursionRule(_localctx, 186, RULE_attributeSpecifierSequence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1333);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributeSpecifierSequenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributeSpecifierSequence);
					setState(1335);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1336);
					attributespecifier();
					}
					} 
				}
				setState(1341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(CPPGramaParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(CPPGramaParser.LeftBracket, i);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public List<TerminalNode> RightBracket() { return getTokens(CPPGramaParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(CPPGramaParser.RightBracket, i);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttributespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttributespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_attributespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(LeftBracket);
			setState(1343);
			match(LeftBracket);
			setState(1344);
			attributelist(0);
			setState(1345);
			match(RightBracket);
			setState(1346);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttributelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttributelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1349);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1352);
				attribute();
				setState(1353);
				match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1357);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1358);
						match(Comma);
						setState(1360);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
						case 1:
							{
							setState(1359);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1362);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1363);
						match(Comma);
						setState(1364);
						attribute();
						setState(1365);
						match(T__0);
						}
						break;
					}
					} 
				}
				setState(1371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			attributetoken();
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1373);
				attributeargumentclause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttributetoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttributetoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_attributetoken);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				attributescopedtoken();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(CPPGramaParser.Doublecolon, 0); }
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttributescopedtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttributescopedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			attributenamespace();
			setState(1381);
			match(Doublecolon);
			setState(1382);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttributenamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttributenamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAttributeargumentclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAttributeargumentclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(LeftParen);
			setState(1387);
			balancedtokenseq(0);
			setState(1388);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBalancedtokenseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBalancedtokenseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1391);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1394);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1395);
					balancedtoken();
					}
					} 
				}
				setState(1400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public TerminalNode LeftBracket() { return getToken(CPPGramaParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPPGramaParser.RightBracket, 0); }
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBalancedtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBalancedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_balancedtoken);
		try {
			setState(1413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				match(LeftParen);
				setState(1402);
				balancedtokenseq(0);
				setState(1403);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1405);
				match(LeftBracket);
				setState(1406);
				balancedtokenseq(0);
				setState(1407);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1409);
				match(LeftBrace);
				setState(1410);
				balancedtokenseq(0);
				setState(1411);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitInitdeclaratorlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitInitdeclaratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1416);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1418);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1419);
					match(Comma);
					setState(1420);
					initdeclarator();
					}
					} 
				}
				setState(1425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitInitdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitInitdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			declarator();
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1427);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_declarator);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1430);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
				noptrdeclarator(0);
				setState(1432);
				parametersandqualifiers();
				setState(1433);
				trailingreturntype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtrOperatorContext ptrOperator() {
			return getRuleContext(PtrOperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPtrdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPtrdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_ptrdeclarator);
		try {
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				ptrOperator();
				setState(1439);
				ptrdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPPGramaParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPPGramaParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNoptrdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNoptrdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Operator:
			case Tilde:
			case Identifier:
				{
				setState(1444);
				declaratorid();
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1445);
					attributeSpecifierSequence(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1448);
				match(LeftParen);
				setState(1449);
				ptrdeclarator();
				setState(1450);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1465);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1454);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1455);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1456);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1457);
						match(LeftBracket);
						setState(1459);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
							{
							setState(1458);
							constantExpression();
							}
						}

						setState(1461);
						match(RightBracket);
						setState(1463);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
						case 1:
							{
							setState(1462);
							attributeSpecifierSequence(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitParametersandqualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitParametersandqualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			match(LeftParen);
			setState(1471);
			parameterdeclarationclause();
			setState(1472);
			match(RightParen);
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1473);
				cvqualifierseq();
				}
				break;
			}
			setState(1477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1476);
				refqualifier();
				}
				break;
			}
			setState(1480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1479);
				exceptionspecification();
				}
				break;
			}
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1482);
				attributeSpecifierSequence(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(CPPGramaParser.Arrow, 0); }
		public TrailingTypeSpecifierSequenceContext trailingTypeSpecifierSequence() {
			return getRuleContext(TrailingTypeSpecifierSequenceContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTrailingreturntype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTrailingreturntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			match(Arrow);
			setState(1486);
			trailingTypeSpecifierSequence();
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1487);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrOperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(CPPGramaParser.Star, 0); }
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public TerminalNode And() { return getToken(CPPGramaParser.And, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public PtrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPtrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPtrOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPtrOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrOperatorContext ptrOperator() throws RecognitionException {
		PtrOperatorContext _localctx = new PtrOperatorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_ptrOperator);
		try {
			setState(1513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				match(Star);
				setState(1492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1491);
					attributeSpecifierSequence(0);
					}
					break;
				}
				setState(1495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1494);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1497);
				match(And);
				setState(1499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1498);
					attributeSpecifierSequence(0);
					}
					break;
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1501);
				match(T__3);
				setState(1503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1502);
					attributeSpecifierSequence(0);
					}
					break;
				}
				}
				break;
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1505);
				nestedNameSpecifier(0);
				setState(1506);
				match(Star);
				setState(1508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1507);
					attributeSpecifierSequence(0);
					}
					break;
				}
				setState(1511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1510);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitCvqualifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitCvqualifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			cvqualifier();
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1516);
				cvqualifierseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPPGramaParser.Const, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitCvqualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitCvqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_cvqualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			match(Const);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CPPGramaParser.And, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitRefqualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitRefqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==And) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratoridContext extends ParserRuleContext {
		public UnqualifiedIDContext unqualifiedID() {
			return getRuleContext(UnqualifiedIDContext.class,0);
		}
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDeclaratorid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDeclaratorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1523);
				match(T__0);
				}
			}

			setState(1526);
			unqualifiedID();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheTypeIDContext extends ParserRuleContext {
		public TypeSpecifierSequenceContext typeSpecifierSequence() {
			return getRuleContext(TypeSpecifierSequenceContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TheTypeIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTheTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTheTypeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTheTypeID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeIDContext theTypeID() throws RecognitionException {
		TheTypeIDContext _localctx = new TheTypeIDContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_theTypeID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			typeSpecifierSequence();
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1529);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAbstractdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAbstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_abstractdeclarator);
		try {
			setState(1540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1533);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1536);
				parametersandqualifiers();
				setState(1537);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1539);
				abstractpackdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtrOperatorContext ptrOperator() {
			return getRuleContext(PtrOperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPtrabstractdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPtrabstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_ptrabstractdeclarator);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				noptrabstractdeclarator(0);
				}
				break;
			case T__3:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543);
				ptrOperator();
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1544);
					ptrabstractdeclarator();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPPGramaParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPPGramaParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNoptrabstractdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNoptrabstractdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1550);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1551);
				match(LeftBracket);
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
					{
					setState(1552);
					constantExpression();
					}
				}

				setState(1555);
				match(RightBracket);
				setState(1557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1556);
					attributeSpecifierSequence(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1559);
				match(LeftParen);
				setState(1560);
				ptrabstractdeclarator();
				setState(1561);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1576);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1565);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1566);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1567);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1568);
						match(LeftBracket);
						setState(1570);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
							{
							setState(1569);
							constantExpression();
							}
						}

						setState(1572);
						match(RightBracket);
						setState(1574);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
						case 1:
							{
							setState(1573);
							attributeSpecifierSequence(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtrOperatorContext ptrOperator() {
			return getRuleContext(PtrOperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAbstractpackdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAbstractpackdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_abstractpackdeclarator);
		try {
			setState(1585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				noptrabstractpackdeclarator(0);
				}
				break;
			case T__3:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1582);
				ptrOperator();
				setState(1583);
				abstractpackdeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(CPPGramaParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPPGramaParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNoptrabstractpackdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNoptrabstractpackdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1588);
			match(T__0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1601);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1590);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1591);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1592);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1593);
						match(LeftBracket);
						setState(1595);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
							{
							setState(1594);
							constantExpression();
							}
						}

						setState(1597);
						match(RightBracket);
						setState(1599);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
						case 1:
							{
							setState(1598);
							attributeSpecifierSequence(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitParameterdeclarationclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitParameterdeclarationclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (LeftBracket - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1606);
					parameterdeclarationlist(0);
					}
				}

				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1609);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				parameterdeclarationlist(0);
				setState(1613);
				match(Comma);
				setState(1614);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitParameterdeclarationlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitParameterdeclarationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1619);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1621);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1622);
					match(Comma);
					setState(1623);
					parameterdeclaration();
					}
					} 
				}
				setState(1628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclSpecifierSequenceContext declSpecifierSequence() {
			return getRuleContext(DeclSpecifierSequenceContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitParameterdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitParameterdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1629);
					attributeSpecifierSequence(0);
					}
				}

				setState(1632);
				declSpecifierSequence();
				setState(1633);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1635);
					attributeSpecifierSequence(0);
					}
				}

				setState(1638);
				declSpecifierSequence();
				setState(1639);
				declarator();
				setState(1640);
				match(Assign);
				setState(1641);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1643);
					attributeSpecifierSequence(0);
					}
				}

				setState(1646);
				declSpecifierSequence();
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1647);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1650);
					attributeSpecifierSequence(0);
					}
				}

				setState(1653);
				declSpecifierSequence();
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__3 || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LeftParen - 73)) | (1L << (LeftBracket - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (Doublecolon - 73)) | (1L << (Identifier - 73)))) != 0)) {
					{
					setState(1654);
					abstractdeclarator();
					}
				}

				setState(1657);
				match(Assign);
				setState(1658);
				initializerclause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public DeclSpecifierSequenceContext declSpecifierSequence() {
			return getRuleContext(DeclSpecifierSequenceContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitFunctiondefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitFunctiondefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(1662);
				attributeSpecifierSequence(0);
				}
			}

			setState(1666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1665);
				declSpecifierSequence();
				}
				break;
			}
			setState(1668);
			declarator();
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1669);
				virtspecifierseq(0);
				}
			}

			setState(1672);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public TerminalNode Default() { return getToken(CPPGramaParser.Default, 0); }
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public TerminalNode Delete() { return getToken(CPPGramaParser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitFunctionbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_functionbody);
		int _la;
		try {
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1674);
					ctorinitializer();
					}
				}

				setState(1677);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1679);
				match(Assign);
				setState(1680);
				match(Default);
				setState(1681);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1682);
				match(Assign);
				setState(1683);
				match(Delete);
				setState(1684);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_initializer);
		try {
			setState(1692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1688);
				match(LeftParen);
				setState(1689);
				expressionlist();
				setState(1690);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBraceorequalinitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBraceorequalinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_braceorequalinitializer);
		try {
			setState(1697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1694);
				match(Assign);
				setState(1695);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitInitializerclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitInitializerclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_initializerclause);
		try {
			setState(1701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case LeftParen:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1699);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1700);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_initializerList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1704);
			initializerclause();
			setState(1706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1705);
				match(T__0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1708);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1709);
					match(Comma);
					setState(1710);
					initializerclause();
					setState(1712);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1711);
						match(T__0);
						}
						break;
					}
					}
					} 
				}
				setState(1718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedInitListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public BracedInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedInitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBracedInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBracedInitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBracedInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracedInitListContext bracedInitList() throws RecognitionException {
		BracedInitListContext _localctx = new BracedInitListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_bracedInitList);
		int _la;
		try {
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1719);
				match(LeftBrace);
				setState(1720);
				initializerList(0);
				setState(1722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1721);
					match(Comma);
					}
				}

				setState(1724);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				match(LeftBrace);
				setState(1727);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitClassname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitClassname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_classname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CPPGramaParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CPPGramaParser.RightBrace, 0); }
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitClassspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitClassspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			classhead();
			setState(1733);
			match(LeftBrace);
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1734);
				memberspecification();
				}
			}

			setState(1737);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitClasshead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitClasshead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_classhead);
		int _la;
		try {
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				classkey();
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1740);
					attributeSpecifierSequence(0);
					}
				}

				setState(1743);
				classheadname();
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(1744);
					classvirtspecifier();
					}
				}

				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1747);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1750);
				classkey();
				setState(1752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1751);
					attributeSpecifierSequence(0);
					}
				}

				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1754);
					baseclause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitClassheadname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitClassheadname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1759);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1762);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPPGramaParser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitClassvirtspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitClassvirtspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPPGramaParser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPPGramaParser.Struct, 0); }
		public TerminalNode Union() { return getToken(CPPGramaParser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitClasskey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitClasskey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Class - 17)) | (1L << (Struct - 17)) | (1L << (Union - 17)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPPGramaParser.Colon, 0); }
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitMemberspecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitMemberspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_memberspecification);
		int _la;
		try {
			setState(1777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Operator:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case Colon:
			case Doublecolon:
			case Semi:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1768);
				memberdeclaration();
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1769);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(1772);
				accessspecifier();
				setState(1773);
				match(Colon);
				setState(1775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1774);
					memberspecification();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CPPGramaParser.Semi, 0); }
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public DeclSpecifierSequenceContext declSpecifierSequence() {
			return getRuleContext(DeclSpecifierSequenceContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitMemberdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitMemberdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_memberdeclaration);
		int _la;
		try {
			setState(1792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1779);
					attributeSpecifierSequence(0);
					}
					break;
				}
				setState(1783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1782);
					declSpecifierSequence();
					}
					break;
				}
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << Operator))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LeftParen - 73)) | (1L << (LeftBracket - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (Tilde - 73)) | (1L << (Colon - 73)) | (1L << (Doublecolon - 73)) | (1L << (Identifier - 73)))) != 0)) {
					{
					setState(1785);
					memberdeclaratorlist(0);
					}
				}

				setState(1788);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1790);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1791);
				emptyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitMemberdeclaratorlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitMemberdeclaratorlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1795);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(1797);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1798);
					match(Comma);
					setState(1799);
					memberdeclarator();
					}
					} 
				}
				setState(1804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CPPGramaParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterMemberdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitMemberdeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitMemberdeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_memberdeclarator);
		int _la;
		try {
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				declarator();
				setState(1807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1806);
					virtspecifierseq(0);
					}
					break;
				}
				setState(1810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1809);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				declarator();
				setState(1814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1813);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1816);
					match(Identifier);
					}
				}

				setState(1820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1819);
					attributeSpecifierSequence(0);
					}
				}

				setState(1822);
				match(Colon);
				setState(1823);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitVirtspecifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitVirtspecifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 282;
		enterRecursionRule(_localctx, 282, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1827);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(1829);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1830);
					virtspecifier();
					}
					} 
				}
				setState(1835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(CPPGramaParser.Override, 0); }
		public TerminalNode Final() { return getToken(CPPGramaParser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitVirtspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitVirtspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(CPPGramaParser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPurespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPurespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			match(Assign);
			setState(1839);
			((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPPGramaParser.Colon, 0); }
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBaseclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBaseclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			match(Colon);
			setState(1843);
			basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBasespecifierlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBasespecifierlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 290;
		enterRecursionRule(_localctx, 290, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1846);
			basespecifier();
			setState(1848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1847);
				match(T__0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(1850);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1851);
					match(Comma);
					setState(1852);
					basespecifier();
					setState(1854);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
					case 1:
						{
						setState(1853);
						match(T__0);
						}
						break;
					}
					}
					} 
				}
				setState(1860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPPGramaParser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBasespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBasespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_basespecifier);
		int _la;
		try {
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1861);
					attributeSpecifierSequence(0);
					}
				}

				setState(1864);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1865);
					attributeSpecifierSequence(0);
					}
				}

				setState(1868);
				match(Virtual);
				setState(1870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(1869);
					accessspecifier();
					}
				}

				setState(1872);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1873);
					attributeSpecifierSequence(0);
					}
				}

				setState(1876);
				accessspecifier();
				setState(1878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(1877);
					match(Virtual);
					}
				}

				setState(1880);
				basetypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitClassordecltype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitClassordecltype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_classordecltype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1884);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1887);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBasetypespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBasetypespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(CPPGramaParser.Private, 0); }
		public TerminalNode Protected() { return getToken(CPPGramaParser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPPGramaParser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitAccessspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitAccessspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionConversionIDContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPPGramaParser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public FunctionConversionIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionConversionID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterFunctionConversionID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitFunctionConversionID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitFunctionConversionID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionConversionIDContext functionConversionID() throws RecognitionException {
		FunctionConversionIDContext _localctx = new FunctionConversionIDContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_functionConversionID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			match(Operator);
			setState(1894);
			conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypeSpecifierSequenceContext typeSpecifierSequence() {
			return getRuleContext(TypeSpecifierSequenceContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitConversiontypeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitConversiontypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			typeSpecifierSequence();
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1897);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtrOperatorContext ptrOperator() {
			return getRuleContext(PtrOperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitConversiondeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitConversiondeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			ptrOperator();
			setState(1902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1901);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtorinitializerContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CPPGramaParser.Colon, 0); }
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitCtorinitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitCtorinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(Colon);
			setState(1905);
			meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitMeminitializerlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitMeminitializerlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_meminitializerlist);
		int _la;
		try {
			setState(1918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907);
				meminitializer();
				setState(1909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1908);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
				meminitializer();
				setState(1913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1912);
					match(T__0);
					}
				}

				setState(1915);
				match(Comma);
				setState(1916);
				meminitializerlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitMeminitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitMeminitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_meminitializer);
		int _la;
		try {
			setState(1930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
				meminitializerid();
				setState(1921);
				match(LeftParen);
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw) | (1L << True))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)) | (1L << (Characterliteral - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Floatingliteral - 129)) | (1L << (Stringliteral - 129)) | (1L << (Userdefinedintegerliteral - 129)) | (1L << (Userdefinedfloatingliteral - 129)) | (1L << (Userdefinedstringliteral - 129)) | (1L << (Userdefinedcharacterliteral - 129)))) != 0)) {
					{
					setState(1922);
					expressionlist();
					}
				}

				setState(1925);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1927);
				meminitializerid();
				setState(1928);
				bracedInitList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitMeminitializerid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitMeminitializerid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_meminitializerid);
		try {
			setState(1934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1932);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1933);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionOperatorIDContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPPGramaParser.Operator, 0); }
		public TheoperatorContext theoperator() {
			return getRuleContext(TheoperatorContext.class,0);
		}
		public FunctionOperatorIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionOperatorID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterFunctionOperatorID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitFunctionOperatorID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitFunctionOperatorID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionOperatorIDContext functionOperatorID() throws RecognitionException {
		FunctionOperatorIDContext _localctx = new FunctionOperatorIDContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_functionOperatorID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(Operator);
			setState(1937);
			theoperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralOperatorIDContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPPGramaParser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(CPPGramaParser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPPGramaParser.Userdefinedstringliteral, 0); }
		public LiteralOperatorIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalOperatorID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterLiteralOperatorID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitLiteralOperatorID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitLiteralOperatorID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralOperatorIDContext literalOperatorID() throws RecognitionException {
		LiteralOperatorIDContext _localctx = new LiteralOperatorIDContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_literalOperatorID);
		try {
			setState(1944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				match(Operator);
				setState(1940);
				match(Stringliteral);
				setState(1941);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1942);
				match(Operator);
				setState(1943);
				match(Userdefinedstringliteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPPGramaParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public TheTypeIDContext theTypeID() {
			return getRuleContext(TheTypeIDContext.class,0);
		}
		public TerminalNode Typename() { return getToken(CPPGramaParser.Typename, 0); }
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTypeparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTypeparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_typeparameter);
		int _la;
		try {
			setState(1972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1946);
				match(Class);
				setState(1948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1947);
					match(T__0);
					}
				}

				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1950);
					match(Identifier);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1953);
				match(Class);
				setState(1955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1954);
					match(Identifier);
					}
				}

				setState(1957);
				match(Assign);
				setState(1958);
				theTypeID();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1959);
				match(Typename);
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1960);
					match(T__0);
					}
				}

				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1963);
					match(Identifier);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1966);
				match(Typename);
				setState(1968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1967);
					match(Identifier);
					}
				}

				setState(1970);
				match(Assign);
				setState(1971);
				theTypeID();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenameSpecifierContext extends ParserRuleContext {
		public TerminalNode Typename() { return getToken(CPPGramaParser.Typename, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPPGramaParser.Identifier, 0); }
		public TypenameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTypenameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTypenameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTypenameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameSpecifierContext typenameSpecifier() throws RecognitionException {
		TypenameSpecifierContext _localctx = new TypenameSpecifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_typenameSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			match(Typename);
			setState(1975);
			nestedNameSpecifier(0);
			setState(1976);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPPGramaParser.Try, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTryblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTryblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			match(Try);
			setState(1979);
			compoundStatement();
			setState(1980);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPPGramaParser.Try, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitFunctiontryblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitFunctiontryblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			match(Try);
			setState(1984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1983);
				ctorinitializer();
				}
			}

			setState(1986);
			compoundStatement();
			setState(1987);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitHandlerseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitHandlerseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			handler();
			setState(1991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(1990);
				handlerseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPPGramaParser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(Catch);
			setState(1994);
			match(LeftParen);
			setState(1995);
			exceptiondeclaration();
			setState(1996);
			match(RightParen);
			setState(1997);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypeSpecifierSequenceContext typeSpecifierSequence() {
			return getRuleContext(TypeSpecifierSequenceContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributeSpecifierSequenceContext attributeSpecifierSequence() {
			return getRuleContext(AttributeSpecifierSequenceContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitExceptiondeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitExceptiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(1999);
					attributeSpecifierSequence(0);
					}
				}

				setState(2002);
				typeSpecifierSequence();
				setState(2003);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(2005);
					attributeSpecifierSequence(0);
					}
				}

				setState(2008);
				typeSpecifierSequence();
				setState(2010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0 || _la==T__3 || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LeftParen - 73)) | (1L << (LeftBracket - 73)) | (1L << (Star - 73)) | (1L << (And - 73)) | (1L << (Doublecolon - 73)) | (1L << (Identifier - 73)))) != 0)) {
					{
					setState(2009);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2012);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPPGramaParser.Throw, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitThrowexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitThrowexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			match(Throw);
			setState(2017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2016);
				assignmentExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitExceptionspecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitExceptionspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_exceptionspecification);
		try {
			setState(2021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2020);
				noexceptspecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPPGramaParser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitDynamicexceptionspecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitDynamicexceptionspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			match(Throw);
			setState(2024);
			match(LeftParen);
			setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(2025);
				typeidlist(0);
				}
			}

			setState(2028);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public TheTypeIDContext theTypeID() {
			return getRuleContext(TheTypeIDContext.class,0);
		}
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTypeidlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTypeidlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 338;
		enterRecursionRule(_localctx, 338, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2031);
			theTypeID();
			setState(2033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2032);
				match(T__0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2035);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2036);
					match(Comma);
					setState(2037);
					theTypeID();
					setState(2039);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
					case 1:
						{
						setState(2038);
						match(T__0);
						}
						break;
					}
					}
					} 
				}
				setState(2045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPPGramaParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitNoexceptspecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitNoexceptspecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_noexceptspecification);
		try {
			setState(2052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2046);
				match(Noexcept);
				setState(2047);
				match(LeftParen);
				setState(2048);
				constantExpression();
				setState(2049);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2051);
				match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheoperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPPGramaParser.New, 0); }
		public TerminalNode Delete() { return getToken(CPPGramaParser.Delete, 0); }
		public TerminalNode LeftBracket() { return getToken(CPPGramaParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CPPGramaParser.RightBracket, 0); }
		public TerminalNode Plus() { return getToken(CPPGramaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CPPGramaParser.Minus, 0); }
		public TerminalNode Star() { return getToken(CPPGramaParser.Star, 0); }
		public TerminalNode Div() { return getToken(CPPGramaParser.Div, 0); }
		public TerminalNode Mod() { return getToken(CPPGramaParser.Mod, 0); }
		public TerminalNode Caret() { return getToken(CPPGramaParser.Caret, 0); }
		public TerminalNode And() { return getToken(CPPGramaParser.And, 0); }
		public TerminalNode Or() { return getToken(CPPGramaParser.Or, 0); }
		public TerminalNode Tilde() { return getToken(CPPGramaParser.Tilde, 0); }
		public TerminalNode Assign() { return getToken(CPPGramaParser.Assign, 0); }
		public TerminalNode Less() { return getToken(CPPGramaParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CPPGramaParser.Greater, 0); }
		public TerminalNode PlusAssign() { return getToken(CPPGramaParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CPPGramaParser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(CPPGramaParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CPPGramaParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CPPGramaParser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CPPGramaParser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CPPGramaParser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CPPGramaParser.OrAssign, 0); }
		public TerminalNode LeftShift() { return getToken(CPPGramaParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(CPPGramaParser.RightShift, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CPPGramaParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CPPGramaParser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(CPPGramaParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CPPGramaParser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(CPPGramaParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CPPGramaParser.GreaterEqual, 0); }
		public TerminalNode PlusPlus() { return getToken(CPPGramaParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CPPGramaParser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(CPPGramaParser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(CPPGramaParser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(CPPGramaParser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(CPPGramaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CPPGramaParser.RightParen, 0); }
		public TheoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterTheoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitTheoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitTheoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheoperatorContext theoperator() throws RecognitionException {
		TheoperatorContext _localctx = new TheoperatorContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_theoperator);
		try {
			setState(2105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2054);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2055);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2056);
				match(New);
				setState(2057);
				match(LeftBracket);
				setState(2058);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2059);
				match(Delete);
				setState(2060);
				match(LeftBracket);
				setState(2061);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2062);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2063);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2064);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2065);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2066);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2067);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2068);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2069);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2070);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2071);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2072);
				match(T__2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2073);
				match(Assign);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2074);
				match(Less);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2075);
				match(Greater);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2076);
				match(PlusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2077);
				match(MinusAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2078);
				match(StarAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2079);
				match(DivAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2080);
				match(ModAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2081);
				match(XorAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2082);
				match(AndAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2083);
				match(OrAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2084);
				match(LeftShift);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2085);
				match(RightShift);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2086);
				match(RightShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2087);
				match(LeftShiftAssign);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2088);
				match(Equal);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2089);
				match(NotEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2090);
				match(LessEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2091);
				match(GreaterEqual);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2092);
				match(T__3);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2093);
				match(T__4);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2094);
				match(T__5);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2095);
				match(T__6);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2096);
				match(PlusPlus);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2097);
				match(MinusMinus);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2098);
				match(Comma);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2099);
				match(ArrowStar);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2100);
				match(Arrow);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2101);
				match(LeftParen);
				setState(2102);
				match(RightParen);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2103);
				match(LeftBracket);
				setState(2104);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(CPPGramaParser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(CPPGramaParser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(CPPGramaParser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(CPPGramaParser.Stringliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_literal);
		try {
			setState(2114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2107);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2109);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2110);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2111);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2112);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2113);
				userdefinedliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(CPPGramaParser.False, 0); }
		public TerminalNode True() { return getToken(CPPGramaParser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitBooleanliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitBooleanliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(CPPGramaParser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitPointerliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitPointerliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(CPPGramaParser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(CPPGramaParser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPPGramaParser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(CPPGramaParser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPGramaListener ) ((CPPGramaListener)listener).exitUserdefinedliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPGramaVisitor ) return ((CPPGramaVisitor<? extends T>)visitor).visitUserdefinedliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			_la = _input.LA(1);
			if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestedNameSpecifier_sempred((NestedNameSpecifierContext)_localctx, predIndex);
		case 7:
			return captureList_sempred((CaptureListContext)_localctx, predIndex);
		case 11:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 20:
			return noptrNewDeclarator_sempred((NoptrNewDeclaratorContext)_localctx, predIndex);
		case 25:
			return pmExpression_sempred((PmExpressionContext)_localctx, predIndex);
		case 26:
			return mulExpression_sempred((MulExpressionContext)_localctx, predIndex);
		case 27:
			return addExpression_sempred((AddExpressionContext)_localctx, predIndex);
		case 28:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 30:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 31:
			return eqExpression_sempred((EqExpressionContext)_localctx, predIndex);
		case 32:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 33:
			return exorExpression_sempred((ExorExpressionContext)_localctx, predIndex);
		case 34:
			return inclusiveorExpression_sempred((InclusiveorExpressionContext)_localctx, predIndex);
		case 35:
			return logicandExpression_sempred((LogicandExpressionContext)_localctx, predIndex);
		case 36:
			return logicorExpression_sempred((LogicorExpressionContext)_localctx, predIndex);
		case 40:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 46:
			return statementSequence_sempred((StatementSequenceContext)_localctx, predIndex);
		case 55:
			return declarationSequence_sempred((DeclarationSequenceContext)_localctx, predIndex);
		case 79:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 93:
			return attributeSpecifierSequence_sempred((AttributeSpecifierSequenceContext)_localctx, predIndex);
		case 95:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 101:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 103:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 107:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 118:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 120:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 122:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 129:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 139:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 141:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 145:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 169:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestedNameSpecifier_sempred(NestedNameSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean captureList_sempred(CaptureListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrNewDeclarator_sempred(NoptrNewDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmExpression_sempred(PmExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulExpression_sempred(MulExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpression_sempred(AddExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExpression_sempred(EqExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 2);
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exorExpression_sempred(ExorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorExpression_sempred(InclusiveorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicandExpression_sempred(LogicandExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicorExpression_sempred(LogicorExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 2);
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementSequence_sempred(StatementSequenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationSequence_sempred(DeclarationSequenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributeSpecifierSequence_sempred(AttributeSpecifierSequenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 3);
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 3);
		case 41:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 5);
		case 43:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 3);
		case 45:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008c\u084d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\3\2\5"+
		"\2\u0164\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u016e\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u0187\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0192"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u019c\n\7\3\7\3\7\3\7\7\7\u01a1"+
		"\n\7\f\7\16\7\u01a4\13\7\3\b\3\b\3\t\3\t\3\t\5\t\u01ab\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u01b1\n\t\7\t\u01b3\n\t\f\t\16\t\u01b6\13\t\3\n\3\n\5\n\u01ba"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u01c0\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u01c7"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u01ce\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d5\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0209"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0218\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0225\n\r\f\r\16\r\u0228"+
		"\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21\u0231\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0239\n\21\3\21\3\21\5\21\u023d\n\21\3\22\5\22\u0240"+
		"\n\22\3\22\3\22\5\22\u0244\n\22\3\22\3\22\5\22\u0248\n\22\3\22\5\22\u024b"+
		"\n\22\3\22\3\22\5\22\u024f\n\22\3\22\3\22\3\22\3\22\5\22\u0255\n\22\5"+
		"\22\u0257\n\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u025f\n\24\3\25\3\25"+
		"\5\25\u0263\n\25\3\25\5\25\u0266\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u026d"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0274\n\26\7\26\u0276\n\26\f\26\16"+
		"\26\u0279\13\26\3\27\3\27\5\27\u027d\n\27\3\27\3\27\5\27\u0281\n\27\3"+
		"\30\5\30\u0284\n\30\3\30\3\30\3\30\5\30\u0289\n\30\3\30\3\30\3\30\3\30"+
		"\5\30\u028f\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u029c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u02a7"+
		"\n\33\f\33\16\33\u02aa\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u02b8\n\34\f\34\16\34\u02bb\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u02c6\n\35\f\35\16\35\u02c9\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02d2\n\36\f\36\16\36\u02d5"+
		"\13\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u02e8"+
		"\n \f \16 \u02eb\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u02f6\n!\f!\16!\u02f9"+
		"\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0301\n\"\f\"\16\"\u0304\13\"\3#\3#\3"+
		"#\3#\3#\3#\7#\u030c\n#\f#\16#\u030f\13#\3$\3$\3$\3$\3$\3$\7$\u0317\n$"+
		"\f$\16$\u031a\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0325\n%\f%\16%\u0328"+
		"\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0333\n&\f&\16&\u0336\13&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u033f\n\'\3(\3(\3(\3(\3(\3(\5(\u0347\n(\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\7*\u0351\n*\f*\16*\u0354\13*\3+\3+\3,\3,\5,\u035a\n,"+
		"\3,\3,\5,\u035e\n,\3,\3,\5,\u0362\n,\3,\3,\5,\u0366\n,\3,\3,\5,\u036a"+
		"\n,\3,\3,\3,\5,\u036f\n,\3,\5,\u0372\n,\3-\5-\u0375\n-\3-\3-\3-\3-\5-"+
		"\u037b\n-\3-\3-\3-\3-\3-\3-\5-\u0383\n-\3-\3-\3-\5-\u0388\n-\3.\5.\u038b"+
		"\n.\3.\3.\3/\3/\5/\u0391\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\7\60\u039a"+
		"\n\60\f\60\16\60\u039d\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u03b3"+
		"\n\61\3\62\3\62\5\62\u03b7\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03bf"+
		"\n\62\3\62\3\62\3\62\3\62\5\62\u03c5\n\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u03d9"+
		"\n\63\3\63\3\63\5\63\u03dd\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u03ea\n\63\3\64\3\64\5\64\u03ee\n\64\3\65\5\65\u03f1"+
		"\n\65\3\65\3\65\3\65\3\66\3\66\5\66\u03f8\n\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u0400\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u040a"+
		"\n\67\38\38\39\39\39\39\39\79\u0413\n9\f9\169\u0416\139\3:\3:\3:\3:\3"+
		":\3:\5:\u041e\n:\3;\3;\3;\3;\5;\u0424\n;\3<\5<\u0427\n<\3<\5<\u042a\n"+
		"<\3<\3<\3<\5<\u042f\n<\3<\3<\3<\5<\u0434\n<\3=\3=\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3?\5?\u0441\n?\3@\3@\5@\u0445\n@\3@\3@\3@\5@\u044a\n@\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3D\5D\u0455\nD\3E\3E\3E\3E\5E\u045b\nE\3F\3F\5F\u045f\n"+
		"F\3F\3F\3F\5F\u0464\nF\3G\3G\5G\u0468\nG\3G\3G\3G\5G\u046d\nG\3H\5H\u0470"+
		"\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0480\nH\3I\3I\3I\5I"+
		"\u0485\nI\3J\3J\5J\u0489\nJ\3J\5J\u048c\nJ\3J\3J\3J\3J\5J\u0492\nJ\3J"+
		"\5J\u0495\nJ\3K\3K\3L\3L\3L\5L\u049c\nL\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04a6"+
		"\nL\3M\3M\5M\u04aa\nM\3M\5M\u04ad\nM\3M\5M\u04b0\nM\3M\3M\5M\u04b4\nM"+
		"\3M\3M\3M\5M\u04b9\nM\5M\u04bb\nM\3N\3N\5N\u04bf\nN\3N\3N\5N\u04c3\nN"+
		"\3N\3N\3O\3O\3O\3O\3O\5O\u04cc\nO\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u04d7"+
		"\nQ\fQ\16Q\u04da\13Q\3R\3R\3R\3R\3R\5R\u04e1\nR\3S\3S\3T\3T\3U\3U\5U\u04e9"+
		"\nU\3V\3V\5V\u04ed\nV\3W\5W\u04f0\nW\3W\3W\3W\3W\3W\3W\3X\5X\u04f9\nX"+
		"\3X\3X\3X\3X\3X\3X\3Y\5Y\u0502\nY\3Y\3Y\3Y\3Y\3Y\3Z\5Z\u050a\nZ\3[\5["+
		"\u050d\n[\3[\3[\3\\\3\\\5\\\u0513\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u051e\n\\\3]\5]\u0521\n]\3]\3]\3]\5]\u0526\n]\3]\3]\3]\3^\3^"+
		"\3^\3^\5^\u052f\n^\3^\3^\3^\3^\5^\u0535\n^\3_\3_\3_\3_\3_\7_\u053c\n_"+
		"\f_\16_\u053f\13_\3`\3`\3`\3`\3`\3`\3a\3a\5a\u0549\na\3a\3a\3a\5a\u054e"+
		"\na\3a\3a\3a\5a\u0553\na\3a\3a\3a\3a\3a\7a\u055a\na\fa\16a\u055d\13a\3"+
		"b\3b\5b\u0561\nb\3c\3c\5c\u0565\nc\3d\3d\3d\3d\3e\3e\3f\3f\3f\3f\3g\3"+
		"g\5g\u0573\ng\3g\3g\7g\u0577\ng\fg\16g\u057a\13g\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\5h\u0588\nh\3i\3i\3i\3i\3i\3i\7i\u0590\ni\fi\16i\u0593"+
		"\13i\3j\3j\5j\u0597\nj\3k\3k\3k\3k\3k\5k\u059e\nk\3l\3l\3l\3l\5l\u05a4"+
		"\nl\3m\3m\3m\5m\u05a9\nm\3m\3m\3m\3m\5m\u05af\nm\3m\3m\3m\3m\3m\5m\u05b6"+
		"\nm\3m\3m\5m\u05ba\nm\7m\u05bc\nm\fm\16m\u05bf\13m\3n\3n\3n\3n\5n\u05c5"+
		"\nn\3n\5n\u05c8\nn\3n\5n\u05cb\nn\3n\5n\u05ce\nn\3o\3o\3o\5o\u05d3\no"+
		"\3p\3p\5p\u05d7\np\3p\5p\u05da\np\3p\3p\5p\u05de\np\3p\3p\5p\u05e2\np"+
		"\3p\3p\3p\5p\u05e7\np\3p\5p\u05ea\np\5p\u05ec\np\3q\3q\5q\u05f0\nq\3r"+
		"\3r\3s\3s\3t\5t\u05f7\nt\3t\3t\3u\3u\5u\u05fd\nu\3v\3v\5v\u0601\nv\3v"+
		"\3v\3v\3v\5v\u0607\nv\3w\3w\3w\5w\u060c\nw\5w\u060e\nw\3x\3x\3x\3x\5x"+
		"\u0614\nx\3x\3x\5x\u0618\nx\3x\3x\3x\3x\5x\u061e\nx\3x\3x\3x\3x\3x\5x"+
		"\u0625\nx\3x\3x\5x\u0629\nx\7x\u062b\nx\fx\16x\u062e\13x\3y\3y\3y\3y\5"+
		"y\u0634\ny\3z\3z\3z\3z\3z\3z\3z\3z\5z\u063e\nz\3z\3z\5z\u0642\nz\7z\u0644"+
		"\nz\fz\16z\u0647\13z\3{\5{\u064a\n{\3{\5{\u064d\n{\3{\3{\3{\3{\5{\u0653"+
		"\n{\3|\3|\3|\3|\3|\3|\7|\u065b\n|\f|\16|\u065e\13|\3}\5}\u0661\n}\3}\3"+
		"}\3}\3}\5}\u0667\n}\3}\3}\3}\3}\3}\3}\5}\u066f\n}\3}\3}\5}\u0673\n}\3"+
		"}\5}\u0676\n}\3}\3}\5}\u067a\n}\3}\3}\3}\5}\u067f\n}\3~\5~\u0682\n~\3"+
		"~\5~\u0685\n~\3~\3~\5~\u0689\n~\3~\3~\3\177\5\177\u068e\n\177\3\177\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0698\n\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\5\u0080\u069f\n\u0080\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u06a4\n\u0081\3\u0082\3\u0082\5\u0082\u06a8\n\u0082\3\u0083\3"+
		"\u0083\3\u0083\5\u0083\u06ad\n\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5"+
		"\u0083\u06b3\n\u0083\7\u0083\u06b5\n\u0083\f\u0083\16\u0083\u06b8\13\u0083"+
		"\3\u0084\3\u0084\3\u0084\5\u0084\u06bd\n\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u06c3\n\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u06ca\n\u0086\3\u0086\3\u0086\3\u0087\3\u0087\5\u0087\u06d0\n"+
		"\u0087\3\u0087\3\u0087\5\u0087\u06d4\n\u0087\3\u0087\5\u0087\u06d7\n\u0087"+
		"\3\u0087\3\u0087\5\u0087\u06db\n\u0087\3\u0087\5\u0087\u06de\n\u0087\5"+
		"\u0087\u06e0\n\u0087\3\u0088\5\u0088\u06e3\n\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\5\u008b\u06ed\n\u008b\3\u008b"+
		"\3\u008b\3\u008b\5\u008b\u06f2\n\u008b\5\u008b\u06f4\n\u008b\3\u008c\5"+
		"\u008c\u06f7\n\u008c\3\u008c\5\u008c\u06fa\n\u008c\3\u008c\5\u008c\u06fd"+
		"\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0703\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u070b\n\u008d\f\u008d"+
		"\16\u008d\u070e\13\u008d\3\u008e\3\u008e\5\u008e\u0712\n\u008e\3\u008e"+
		"\5\u008e\u0715\n\u008e\3\u008e\3\u008e\5\u008e\u0719\n\u008e\3\u008e\5"+
		"\u008e\u071c\n\u008e\3\u008e\5\u008e\u071f\n\u008e\3\u008e\3\u008e\5\u008e"+
		"\u0723\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u072a\n"+
		"\u008f\f\u008f\16\u008f\u072d\13\u008f\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\5\u0093"+
		"\u073b\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u0741\n\u0093\7"+
		"\u0093\u0743\n\u0093\f\u0093\16\u0093\u0746\13\u0093\3\u0094\5\u0094\u0749"+
		"\n\u0094\3\u0094\3\u0094\5\u0094\u074d\n\u0094\3\u0094\3\u0094\5\u0094"+
		"\u0751\n\u0094\3\u0094\3\u0094\5\u0094\u0755\n\u0094\3\u0094\3\u0094\5"+
		"\u0094\u0759\n\u0094\3\u0094\3\u0094\5\u0094\u075d\n\u0094\3\u0095\5\u0095"+
		"\u0760\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u076d\n\u0099\3\u009a\3\u009a"+
		"\5\u009a\u0771\n\u009a\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\5\u009c"+
		"\u0778\n\u009c\3\u009c\3\u009c\5\u009c\u077c\n\u009c\3\u009c\3\u009c\3"+
		"\u009c\5\u009c\u0781\n\u009c\3\u009d\3\u009d\3\u009d\5\u009d\u0786\n\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u078d\n\u009d\3\u009e"+
		"\3\u009e\5\u009e\u0791\n\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u079b\n\u00a0\3\u00a1\3\u00a1\5\u00a1"+
		"\u079f\n\u00a1\3\u00a1\5\u00a1\u07a2\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u07a6"+
		"\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u07ac\n\u00a1\3\u00a1"+
		"\5\u00a1\u07af\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u07b3\n\u00a1\3\u00a1\3"+
		"\u00a1\5\u00a1\u07b7\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u07c3\n\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a5\3\u00a5\5\u00a5\u07ca\n\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a7\5\u00a7\u07d3\n\u00a7\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a7\5\u00a7\u07d9\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u07dd"+
		"\n\u00a7\3\u00a7\5\u00a7\u07e0\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u07e4\n"+
		"\u00a8\3\u00a9\3\u00a9\5\u00a9\u07e8\n\u00a9\3\u00aa\3\u00aa\3\u00aa\5"+
		"\u00aa\u07ed\n\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u07f4"+
		"\n\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u07fa\n\u00ab\7\u00ab"+
		"\u07fc\n\u00ab\f\u00ab\16\u00ab\u07ff\13\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0807\n\u00ac\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u083c\n\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u0845\n\u00ae\3\u00af\3\u00af"+
		"\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\2\"\f\20\30*\64\668:>@BDFHJR"+
		"^p\u00a0\u00bc\u00c0\u00cc\u00d0\u00d8\u00ee\u00f2\u00f6\u0104\u0118\u011c"+
		"\u0124\u0154\u00b2\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\2\16\5\2\4\5QSWY\4\2WW[[\3\2fg\5\2[[^ehi\4\2!!::\5\2\37\37))HH"+
		"\4\2\6\6WW\5\2\23\23<<EE\4\2##\61\61\3\2\62\64\4\2\"\"@@\3\2\u0085\u0088"+
		"\2\u093a\2\u0163\3\2\2\2\4\u016d\3\2\2\2\6\u0186\3\2\2\2\b\u0188\3\2\2"+
		"\2\n\u0191\3\2\2\2\f\u019b\3\2\2\2\16\u01a5\3\2\2\2\20\u01a7\3\2\2\2\22"+
		"\u01b9\3\2\2\2\24\u01bf\3\2\2\2\26\u01c6\3\2\2\2\30\u0208\3\2\2\2\32\u0229"+
		"\3\2\2\2\34\u022b\3\2\2\2\36\u022d\3\2\2\2 \u023c\3\2\2\2\"\u0256\3\2"+
		"\2\2$\u0258\3\2\2\2&\u025c\3\2\2\2(\u0265\3\2\2\2*\u0267\3\2\2\2,\u0280"+
		"\3\2\2\2.\u028e\3\2\2\2\60\u0290\3\2\2\2\62\u029b\3\2\2\2\64\u029d\3\2"+
		"\2\2\66\u02ab\3\2\2\28\u02bc\3\2\2\2:\u02ca\3\2\2\2<\u02d6\3\2\2\2>\u02d8"+
		"\3\2\2\2@\u02ec\3\2\2\2B\u02fa\3\2\2\2D\u0305\3\2\2\2F\u0310\3\2\2\2H"+
		"\u031b\3\2\2\2J\u0329\3\2\2\2L\u033e\3\2\2\2N\u0346\3\2\2\2P\u0348\3\2"+
		"\2\2R\u034a\3\2\2\2T\u0355\3\2\2\2V\u0371\3\2\2\2X\u0387\3\2\2\2Z\u038a"+
		"\3\2\2\2\\\u038e\3\2\2\2^\u0394\3\2\2\2`\u03b2\3\2\2\2b\u03c4\3\2\2\2"+
		"d\u03e9\3\2\2\2f\u03ed\3\2\2\2h\u03f0\3\2\2\2j\u03f7\3\2\2\2l\u0409\3"+
		"\2\2\2n\u040b\3\2\2\2p\u040d\3\2\2\2r\u041d\3\2\2\2t\u0423\3\2\2\2v\u0433"+
		"\3\2\2\2x\u0435\3\2\2\2z\u0437\3\2\2\2|\u0440\3\2\2\2~\u0449\3\2\2\2\u0080"+
		"\u044b\3\2\2\2\u0082\u044d\3\2\2\2\u0084\u044f\3\2\2\2\u0086\u0454\3\2"+
		"\2\2\u0088\u045a\3\2\2\2\u008a\u0463\3\2\2\2\u008c\u046c\3\2\2\2\u008e"+
		"\u047f\3\2\2\2\u0090\u0484\3\2\2\2\u0092\u0494\3\2\2\2\u0094\u0496\3\2"+
		"\2\2\u0096\u04a5\3\2\2\2\u0098\u04ba\3\2\2\2\u009a\u04bc\3\2\2\2\u009c"+
		"\u04cb\3\2\2\2\u009e\u04cd\3\2\2\2\u00a0\u04d0\3\2\2\2\u00a2\u04e0\3\2"+
		"\2\2\u00a4\u04e2\3\2\2\2\u00a6\u04e4\3\2\2\2\u00a8\u04e8\3\2\2\2\u00aa"+
		"\u04ec\3\2\2\2\u00ac\u04ef\3\2\2\2\u00ae\u04f8\3\2\2\2\u00b0\u0501\3\2"+
		"\2\2\u00b2\u0509\3\2\2\2\u00b4\u050c\3\2\2\2\u00b6\u051d\3\2\2\2\u00b8"+
		"\u0520\3\2\2\2\u00ba\u0534\3\2\2\2\u00bc\u0536\3\2\2\2\u00be\u0540\3\2"+
		"\2\2\u00c0\u054d\3\2\2\2\u00c2\u055e\3\2\2\2\u00c4\u0564\3\2\2\2\u00c6"+
		"\u0566\3\2\2\2\u00c8\u056a\3\2\2\2\u00ca\u056c\3\2\2\2\u00cc\u0570\3\2"+
		"\2\2\u00ce\u0587\3\2\2\2\u00d0\u0589\3\2\2\2\u00d2\u0594\3\2\2\2\u00d4"+
		"\u059d\3\2\2\2\u00d6\u05a3\3\2\2\2\u00d8\u05ae\3\2\2\2\u00da\u05c0\3\2"+
		"\2\2\u00dc\u05cf\3\2\2\2\u00de\u05eb\3\2\2\2\u00e0\u05ed\3\2\2\2\u00e2"+
		"\u05f1\3\2\2\2\u00e4\u05f3\3\2\2\2\u00e6\u05f6\3\2\2\2\u00e8\u05fa\3\2"+
		"\2\2\u00ea\u0606\3\2\2\2\u00ec\u060d\3\2\2\2\u00ee\u061d\3\2\2\2\u00f0"+
		"\u0633\3\2\2\2\u00f2\u0635\3\2\2\2\u00f4\u0652\3\2\2\2\u00f6\u0654\3\2"+
		"\2\2\u00f8\u067e\3\2\2\2\u00fa\u0681\3\2\2\2\u00fc\u0697\3\2\2\2\u00fe"+
		"\u069e\3\2\2\2\u0100\u06a3\3\2\2\2\u0102\u06a7\3\2\2\2\u0104\u06a9\3\2"+
		"\2\2\u0106\u06c2\3\2\2\2\u0108\u06c4\3\2\2\2\u010a\u06c6\3\2\2\2\u010c"+
		"\u06df\3\2\2\2\u010e\u06e2\3\2\2\2\u0110\u06e6\3\2\2\2\u0112\u06e8\3\2"+
		"\2\2\u0114\u06f3\3\2\2\2\u0116\u0702\3\2\2\2\u0118\u0704\3\2\2\2\u011a"+
		"\u0722\3\2\2\2\u011c\u0724\3\2\2\2\u011e\u072e\3\2\2\2\u0120\u0730\3\2"+
		"\2\2\u0122\u0734\3\2\2\2\u0124\u0737\3\2\2\2\u0126\u075c\3\2\2\2\u0128"+
		"\u075f\3\2\2\2\u012a\u0763\3\2\2\2\u012c\u0765\3\2\2\2\u012e\u0767\3\2"+
		"\2\2\u0130\u076a\3\2\2\2\u0132\u076e\3\2\2\2\u0134\u0772\3\2\2\2\u0136"+
		"\u0780\3\2\2\2\u0138\u078c\3\2\2\2\u013a\u0790\3\2\2\2\u013c\u0792\3\2"+
		"\2\2\u013e\u079a\3\2\2\2\u0140\u07b6\3\2\2\2\u0142\u07b8\3\2\2\2\u0144"+
		"\u07bc\3\2\2\2\u0146\u07c0\3\2\2\2\u0148\u07c7\3\2\2\2\u014a\u07cb\3\2"+
		"\2\2\u014c\u07df\3\2\2\2\u014e\u07e1\3\2\2\2\u0150\u07e7\3\2\2\2\u0152"+
		"\u07e9\3\2\2\2\u0154\u07f0\3\2\2\2\u0156\u0806\3\2\2\2\u0158\u083b\3\2"+
		"\2\2\u015a\u0844\3\2\2\2\u015c\u0846\3\2\2\2\u015e\u0848\3\2\2\2\u0160"+
		"\u084a\3\2\2\2\u0162\u0164\5p9\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2"+
		"\2\u0164\u0165\3\2\2\2\u0165\u0166\7\2\2\3\u0166\3\3\2\2\2\u0167\u016e"+
		"\7{\2\2\u0168\u016e\5\u013c\u009f\2\u0169\u016e\5\u012e\u0098\2\u016a"+
		"\u016e\5\u013e\u00a0\2\u016b\u016c\7Y\2\2\u016c\u016e\5\u0108\u0085\2"+
		"\u016d\u0167\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016e\5\3\2\2\2\u016f\u0187\5\30\r\2\u0170"+
		"\u0171\7p\2\2\u0171\u0187\5\62\32\2\u0172\u0173\7q\2\2\u0173\u0187\5\62"+
		"\32\2\u0174\u0175\5\b\5\2\u0175\u0176\5\62\32\2\u0176\u0187\3\2\2\2\u0177"+
		"\u0178\79\2\2\u0178\u0187\5\6\4\2\u0179\u017a\79\2\2\u017a\u017b\7K\2"+
		"\2\u017b\u017c\5\u00e8u\2\u017c\u017d\7L\2\2\u017d\u0187\3\2\2\2\u017e"+
		"\u017f\79\2\2\u017f\u0180\7\3\2\2\u0180\u0181\7K\2\2\u0181\u0182\7{\2"+
		"\2\u0182\u0187\7L\2\2\u0183\u0187\5\60\31\2\u0184\u0187\5\"\22\2\u0185"+
		"\u0187\5.\30\2\u0186\u016f\3\2\2\2\u0186\u0170\3\2\2\2\u0186\u0172\3\2"+
		"\2\2\u0186\u0174\3\2\2\2\u0186\u0177\3\2\2\2\u0186\u0179\3\2\2\2\u0186"+
		"\u017e\3\2\2\2\u0186\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2"+
		"\2\2\u0187\7\3\2\2\2\u0188\u0189\t\2\2\2\u0189\t\3\2\2\2\u018a\u0192\5"+
		"\u015a\u00ae\2\u018b\u0192\7>\2\2\u018c\u018d\7K\2\2\u018d\u018e\5R*\2"+
		"\u018e\u018f\7L\2\2\u018f\u0192\3\2\2\2\u0190\u0192\5\4\3\2\u0191\u018a"+
		"\3\2\2\2\u0191\u018b\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u0190\3\2\2\2\u0192"+
		"\13\3\2\2\2\u0193\u0194\b\7\1\2\u0194\u019c\7w\2\2\u0195\u0196\5\u0090"+
		"I\2\u0196\u0197\7w\2\2\u0197\u019c\3\2\2\2\u0198\u0199\5\u00a6T\2\u0199"+
		"\u019a\7w\2\2\u019a\u019c\3\2\2\2\u019b\u0193\3\2\2\2\u019b\u0195\3\2"+
		"\2\2\u019b\u0198\3\2\2\2\u019c\u01a2\3\2\2\2\u019d\u019e\f\3\2\2\u019e"+
		"\u019f\7{\2\2\u019f\u01a1\7w\2\2\u01a0\u019d\3\2\2\2\u01a1\u01a4\3\2\2"+
		"\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\r\3\2\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a5\u01a6\t\3\2\2\u01a6\17\3\2\2\2\u01a7\u01a8\b\t\1\2\u01a8"+
		"\u01aa\5\22\n\2\u01a9\u01ab\7\3\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01ab\u01b4\3\2\2\2\u01ac\u01ad\f\3\2\2\u01ad\u01ae\7r\2\2\u01ae"+
		"\u01b0\5\22\n\2\u01af\u01b1\7\3\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3"+
		"\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\21\3\2\2\2\u01b6\u01b4\3\2\2"+
		"\2\u01b7\u01ba\5\24\13\2\u01b8\u01ba\5\26\f\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01ba\23\3\2\2\2\u01bb\u01c0\7{\2\2\u01bc\u01bd\7W\2\2"+
		"\u01bd\u01c0\7{\2\2\u01be\u01c0\7>\2\2\u01bf\u01bb\3\2\2\2\u01bf\u01bc"+
		"\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\25\3\2\2\2\u01c1\u01c2\7{\2\2\u01c2"+
		"\u01c7\5\u00fe\u0080\2\u01c3\u01c4\7W\2\2\u01c4\u01c5\7{\2\2\u01c5\u01c7"+
		"\5\u00fe\u0080\2\u01c6\u01c1\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c7\27\3\2"+
		"\2\2\u01c8\u01c9\b\r\1\2\u01c9\u0209\5\n\6\2\u01ca\u01cb\5\u008eH\2\u01cb"+
		"\u01cd\7K\2\2\u01cc\u01ce\5\36\20\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3"+
		"\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7L\2\2\u01d0\u0209\3\2\2\2\u01d1"+
		"\u01d2\5\u0142\u00a2\2\u01d2\u01d4\7K\2\2\u01d3\u01d5\5\36\20\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7L"+
		"\2\2\u01d7\u0209\3\2\2\2\u01d8\u01d9\5\u008eH\2\u01d9\u01da\5\u0106\u0084"+
		"\2\u01da\u0209\3\2\2\2\u01db\u01dc\5\u0142\u00a2\2\u01dc\u01dd\5\u0106"+
		"\u0084\2\u01dd\u0209\3\2\2\2\u01de\u01df\7\34\2\2\u01df\u01e0\7\\\2\2"+
		"\u01e0\u01e1\5\u00e8u\2\u01e1\u01e2\7]\2\2\u01e2\u01e3\7K\2\2\u01e3\u01e4"+
		"\5R*\2\u01e4\u01e5\7L\2\2\u01e5\u0209\3\2\2\2\u01e6\u01e7\7;\2\2\u01e7"+
		"\u01e8\7\\\2\2\u01e8\u01e9\5\u00e8u\2\u01e9\u01ea\7]\2\2\u01ea\u01eb\7"+
		"K\2\2\u01eb\u01ec\5R*\2\u01ec\u01ed\7L\2\2\u01ed\u0209\3\2\2\2\u01ee\u01ef"+
		"\7\65\2\2\u01ef\u01f0\7\\\2\2\u01f0\u01f1\5\u00e8u\2\u01f1\u01f2\7]\2"+
		"\2\u01f2\u01f3\7K\2\2\u01f3\u01f4\5R*\2\u01f4\u01f5\7L\2\2\u01f5\u0209"+
		"\3\2\2\2\u01f6\u01f7\7\26\2\2\u01f7\u01f8\7\\\2\2\u01f8\u01f9\5\u00e8"+
		"u\2\u01f9\u01fa\7]\2\2\u01fa\u01fb\7K\2\2\u01fb\u01fc\5R*\2\u01fc\u01fd"+
		"\7L\2\2\u01fd\u0209\3\2\2\2\u01fe\u01ff\5\34\17\2\u01ff\u0200\7K\2\2\u0200"+
		"\u0201\5R*\2\u0201\u0202\7L\2\2\u0202\u0209\3\2\2\2\u0203\u0204\5\34\17"+
		"\2\u0204\u0205\7K\2\2\u0205\u0206\5\u00e8u\2\u0206\u0207\7L\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u01c8\3\2\2\2\u0208\u01ca\3\2\2\2\u0208\u01d1\3\2"+
		"\2\2\u0208\u01d8\3\2\2\2\u0208\u01db\3\2\2\2\u0208\u01de\3\2\2\2\u0208"+
		"\u01e6\3\2\2\2\u0208\u01ee\3\2\2\2\u0208\u01f6\3\2\2\2\u0208\u01fe\3\2"+
		"\2\2\u0208\u0203\3\2\2\2\u0209\u0226\3\2\2\2\u020a\u020b\f\23\2\2\u020b"+
		"\u020c\7M\2\2\u020c\u020d\5R*\2\u020d\u020e\7N\2\2\u020e\u0225\3\2\2\2"+
		"\u020f\u0210\f\22\2\2\u0210\u0211\7M\2\2\u0211\u0212\5\u0106\u0084\2\u0212"+
		"\u0213\7N\2\2\u0213\u0225\3\2\2\2\u0214\u0215\f\21\2\2\u0215\u0217\7K"+
		"\2\2\u0216\u0218\5\36\20\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u0225\7L\2\2\u021a\u021b\f\f\2\2\u021b\u021c\7y\2"+
		"\2\u021c\u0225\5 \21\2\u021d\u021e\f\13\2\2\u021e\u021f\7t\2\2\u021f\u0225"+
		"\5 \21\2\u0220\u0221\f\n\2\2\u0221\u0225\7p\2\2\u0222\u0223\f\t\2\2\u0223"+
		"\u0225\7q\2\2\u0224\u020a\3\2\2\2\u0224\u020f\3\2\2\2\u0224\u0214\3\2"+
		"\2\2\u0224\u021a\3\2\2\2\u0224\u021d\3\2\2\2\u0224\u0220\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\31\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7C\2\2\u022a\33"+
		"\3\2\2\2\u022b\u022c\7C\2\2\u022c\35\3\2\2\2\u022d\u022e\5\u0104\u0083"+
		"\2\u022e\37\3\2\2\2\u022f\u0231\5\f\7\2\u0230\u022f\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\5\u0090I\2\u0233\u0234\7w\2\2"+
		"\u0234\u0235\7Y\2\2\u0235\u0236\5\u0090I\2\u0236\u023d\3\2\2\2\u0237\u0239"+
		"\5\f\7\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\7Y\2\2\u023b\u023d\5\u0090I\2\u023c\u0230\3\2\2\2\u023c\u0238\3"+
		"\2\2\2\u023d!\3\2\2\2\u023e\u0240\7w\2\2\u023f\u023e\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\7-\2\2\u0242\u0244\5$\23\2\u0243"+
		"\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\5&"+
		"\24\2\u0246\u0248\5,\27\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0257\3\2\2\2\u0249\u024b\7w\2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u024e\7-\2\2\u024d\u024f\5$\23\2\u024e"+
		"\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7K"+
		"\2\2\u0251\u0252\5\u00e8u\2\u0252\u0254\7L\2\2\u0253\u0255\5,\27\2\u0254"+
		"\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u023f\3\2"+
		"\2\2\u0256\u024a\3\2\2\2\u0257#\3\2\2\2\u0258\u0259\7K\2\2\u0259\u025a"+
		"\5\36\20\2\u025a\u025b\7L\2\2\u025b%\3\2\2\2\u025c\u025e\5\u008aF\2\u025d"+
		"\u025f\5(\25\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\'\3\2\2\2"+
		"\u0260\u0262\5\u00dep\2\u0261\u0263\5(\25\2\u0262\u0261\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0266\5*\26\2\u0265\u0260\3\2"+
		"\2\2\u0265\u0264\3\2\2\2\u0266)\3\2\2\2\u0267\u0268\b\26\1\2\u0268\u0269"+
		"\7M\2\2\u0269\u026a\5R*\2\u026a\u026c\7N\2\2\u026b\u026d\5\u00bc_\2\u026c"+
		"\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0277\3\2\2\2\u026e\u026f\f\3"+
		"\2\2\u026f\u0270\7M\2\2\u0270\u0271\5T+\2\u0271\u0273\7N\2\2\u0272\u0274"+
		"\5\u00bc_\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2"+
		"\2\u0275\u026e\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278+\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027c\7K\2\2\u027b\u027d"+
		"\5\36\20\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2"+
		"\u027e\u0281\7L\2\2\u027f\u0281\5\u0106\u0084\2\u0280\u027a\3\2\2\2\u0280"+
		"\u027f\3\2\2\2\u0281-\3\2\2\2\u0282\u0284\7w\2\2\u0283\u0282\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7\31\2\2\u0286\u028f\5"+
		"\62\32\2\u0287\u0289\7w\2\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028b\7\31\2\2\u028b\u028c\7M\2\2\u028c\u028d\7N"+
		"\2\2\u028d\u028f\5\62\32\2\u028e\u0283\3\2\2\2\u028e\u0288\3\2\2\2\u028f"+
		"/\3\2\2\2\u0290\u0291\7.\2\2\u0291\u0292\7K\2\2\u0292\u0293\5R*\2\u0293"+
		"\u0294\7L\2\2\u0294\61\3\2\2\2\u0295\u029c\5\6\4\2\u0296\u0297\7K\2\2"+
		"\u0297\u0298\5\u00e8u\2\u0298\u0299\7L\2\2\u0299\u029a\5\62\32\2\u029a"+
		"\u029c\3\2\2\2\u029b\u0295\3\2\2\2\u029b\u0296\3\2\2\2\u029c\63\3\2\2"+
		"\2\u029d\u029e\b\33\1\2\u029e\u029f\5\62\32\2\u029f\u02a8\3\2\2\2\u02a0"+
		"\u02a1\f\4\2\2\u02a1\u02a2\7z\2\2\u02a2\u02a7\5\62\32\2\u02a3\u02a4\f"+
		"\3\2\2\u02a4\u02a5\7s\2\2\u02a5\u02a7\5\62\32\2\u02a6\u02a0\3\2\2\2\u02a6"+
		"\u02a3\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\65\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ac\b\34\1\2\u02ac\u02ad"+
		"\5\64\33\2\u02ad\u02b9\3\2\2\2\u02ae\u02af\f\5\2\2\u02af\u02b0\7S\2\2"+
		"\u02b0\u02b8\5\64\33\2\u02b1\u02b2\f\4\2\2\u02b2\u02b3\7T\2\2\u02b3\u02b8"+
		"\5\64\33\2\u02b4\u02b5\f\3\2\2\u02b5\u02b6\7U\2\2\u02b6\u02b8\5\64\33"+
		"\2\u02b7\u02ae\3\2\2\2\u02b7\u02b1\3\2\2\2\u02b7\u02b4\3\2\2\2\u02b8\u02bb"+
		"\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\67\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bc\u02bd\b\35\1\2\u02bd\u02be\5\66\34\2\u02be\u02c7"+
		"\3\2\2\2\u02bf\u02c0\f\4\2\2\u02c0\u02c1\7Q\2\2\u02c1\u02c6\5\66\34\2"+
		"\u02c2\u02c3\f\3\2\2\u02c3\u02c4\7R\2\2\u02c4\u02c6\5\66\34\2\u02c5\u02bf"+
		"\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c89\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\b\36\1\2"+
		"\u02cb\u02cc\58\35\2\u02cc\u02d3\3\2\2\2\u02cd\u02ce\f\3\2\2\u02ce\u02cf"+
		"\5<\37\2\u02cf\u02d0\58\35\2\u02d0\u02d2\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d2"+
		"\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4;\3\2\2\2"+
		"\u02d5\u02d3\3\2\2\2\u02d6\u02d7\t\4\2\2\u02d7=\3\2\2\2\u02d8\u02d9\b"+
		" \1\2\u02d9\u02da\5:\36\2\u02da\u02e9\3\2\2\2\u02db\u02dc\f\6\2\2\u02dc"+
		"\u02dd\7\\\2\2\u02dd\u02e8\5:\36\2\u02de\u02df\f\5\2\2\u02df\u02e0\7]"+
		"\2\2\u02e0\u02e8\5:\36\2\u02e1\u02e2\f\4\2\2\u02e2\u02e3\7l\2\2\u02e3"+
		"\u02e8\5:\36\2\u02e4\u02e5\f\3\2\2\u02e5\u02e6\7m\2\2\u02e6\u02e8\5:\36"+
		"\2\u02e7\u02db\3\2\2\2\u02e7\u02de\3\2\2\2\u02e7\u02e1\3\2\2\2\u02e7\u02e4"+
		"\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"?\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\b!\1\2\u02ed\u02ee\5> \2\u02ee"+
		"\u02f7\3\2\2\2\u02ef\u02f0\f\4\2\2\u02f0\u02f1\7j\2\2\u02f1\u02f6\5> "+
		"\2\u02f2\u02f3\f\3\2\2\u02f3\u02f4\7k\2\2\u02f4\u02f6\5> \2\u02f5\u02ef"+
		"\3\2\2\2\u02f5\u02f2\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8A\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\b\"\1\2"+
		"\u02fb\u02fc\5@!\2\u02fc\u0302\3\2\2\2\u02fd\u02fe\f\3\2\2\u02fe\u02ff"+
		"\7W\2\2\u02ff\u0301\5@!\2\u0300\u02fd\3\2\2\2\u0301\u0304\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303C\3\2\2\2\u0304\u0302\3\2\2\2"+
		"\u0305\u0306\b#\1\2\u0306\u0307\5B\"\2\u0307\u030d\3\2\2\2\u0308\u0309"+
		"\f\3\2\2\u0309\u030a\7V\2\2\u030a\u030c\5B\"\2\u030b\u0308\3\2\2\2\u030c"+
		"\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030eE\3\2\2\2"+
		"\u030f\u030d\3\2\2\2\u0310\u0311\b$\1\2\u0311\u0312\5D#\2\u0312\u0318"+
		"\3\2\2\2\u0313\u0314\f\3\2\2\u0314\u0315\7X\2\2\u0315\u0317\5D#\2\u0316"+
		"\u0313\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2"+
		"\2\2\u0319G\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u031c\b%\1\2\u031c\u031d"+
		"\5F$\2\u031d\u0326\3\2\2\2\u031e\u031f\f\4\2\2\u031f\u0320\7\6\2\2\u0320"+
		"\u0325\5F$\2\u0321\u0322\f\3\2\2\u0322\u0323\7\7\2\2\u0323\u0325\5F$\2"+
		"\u0324\u031e\3\2\2\2\u0324\u0321\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327I\3\2\2\2\u0328\u0326\3\2\2\2\u0329"+
		"\u032a\b&\1\2\u032a\u032b\5H%\2\u032b\u0334\3\2\2\2\u032c\u032d\f\4\2"+
		"\2\u032d\u032e\7\b\2\2\u032e\u0333\5H%\2\u032f\u0330\f\3\2\2\u0330\u0331"+
		"\7\t\2\2\u0331\u0333\5H%\2\u0332\u032c\3\2\2\2\u0332\u032f\3\2\2\2\u0333"+
		"\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335K\3\2\2\2"+
		"\u0336\u0334\3\2\2\2\u0337\u033f\5J&\2\u0338\u0339\5J&\2\u0339\u033a\7"+
		"u\2\2\u033a\u033b\5R*\2\u033b\u033c\7v\2\2\u033c\u033d\5N(\2\u033d\u033f"+
		"\3\2\2\2\u033e\u0337\3\2\2\2\u033e\u0338\3\2\2\2\u033fM\3\2\2\2\u0340"+
		"\u0347\5L\'\2\u0341\u0342\5J&\2\u0342\u0343\5P)\2\u0343\u0344\5\u0102"+
		"\u0082\2\u0344\u0347\3\2\2\2\u0345\u0347\5\u014e\u00a8\2\u0346\u0340\3"+
		"\2\2\2\u0346\u0341\3\2\2\2\u0346\u0345\3\2\2\2\u0347O\3\2\2\2\u0348\u0349"+
		"\t\5\2\2\u0349Q\3\2\2\2\u034a\u034b\b*\1\2\u034b\u034c\5N(\2\u034c\u0352"+
		"\3\2\2\2\u034d\u034e\f\3\2\2\u034e\u034f\7r\2\2\u034f\u0351\5N(\2\u0350"+
		"\u034d\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353S\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0356\5L\'\2\u0356U\3\2"+
		"\2\2\u0357\u0372\5X-\2\u0358\u035a\5\u00bc_\2\u0359\u0358\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0372\5Z.\2\u035c\u035e\5\u00bc"+
		"_\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u0372\5\\/\2\u0360\u0362\5\u00bc_\2\u0361\u0360\3\2\2\2\u0361\u0362\3"+
		"\2\2\2\u0362\u0363\3\2\2\2\u0363\u0372\5`\61\2\u0364\u0366\5\u00bc_\2"+
		"\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0372"+
		"\5d\63\2\u0368\u036a\5\u00bc_\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2"+
		"\2\u036a\u036b\3\2\2\2\u036b\u0372\5l\67\2\u036c\u0372\5n8\2\u036d\u036f"+
		"\5\u00bc_\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2"+
		"\2\u0370\u0372\5\u0144\u00a3\2\u0371\u0357\3\2\2\2\u0371\u0359\3\2\2\2"+
		"\u0371\u035d\3\2\2\2\u0371\u0361\3\2\2\2\u0371\u0365\3\2\2\2\u0371\u0369"+
		"\3\2\2\2\u0371\u036c\3\2\2\2\u0371\u036e\3\2\2\2\u0372W\3\2\2\2\u0373"+
		"\u0375\5\u00bc_\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u0377\7{\2\2\u0377\u0378\7v\2\2\u0378\u0388\5V,\2\u0379"+
		"\u037b\5\u00bc_\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u037d\7\16\2\2\u037d\u037e\5T+\2\u037e\u037f\7v\2\2\u037f"+
		"\u0380\5V,\2\u0380\u0388\3\2\2\2\u0381\u0383\5\u00bc_\2\u0382\u0381\3"+
		"\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\7\30\2\2\u0385"+
		"\u0386\7v\2\2\u0386\u0388\5V,\2\u0387\u0374\3\2\2\2\u0387\u037a\3\2\2"+
		"\2\u0387\u0382\3\2\2\2\u0388Y\3\2\2\2\u0389\u038b\5R*\2\u038a\u0389\3"+
		"\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\7x\2\2\u038d"+
		"[\3\2\2\2\u038e\u0390\7O\2\2\u038f\u0391\5^\60\2\u0390\u038f\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\7P\2\2\u0393]\3\2\2\2\u0394"+
		"\u0395\b\60\1\2\u0395\u0396\5V,\2\u0396\u039b\3\2\2\2\u0397\u0398\f\3"+
		"\2\2\u0398\u039a\5V,\2\u0399\u0397\3\2\2\2\u039a\u039d\3\2\2\2\u039b\u0399"+
		"\3\2\2\2\u039b\u039c\3\2\2\2\u039c_\3\2\2\2\u039d\u039b\3\2\2\2\u039e"+
		"\u039f\7(\2\2\u039f\u03a0\7K\2\2\u03a0\u03a1\5b\62\2\u03a1\u03a2\7L\2"+
		"\2\u03a2\u03a3\5V,\2\u03a3\u03b3\3\2\2\2\u03a4\u03a5\7(\2\2\u03a5\u03a6"+
		"\7K\2\2\u03a6\u03a7\5b\62\2\u03a7\u03a8\7L\2\2\u03a8\u03a9\5V,\2\u03a9"+
		"\u03aa\7\35\2\2\u03aa\u03ab\5V,\2\u03ab\u03b3\3\2\2\2\u03ac\u03ad\7=\2"+
		"\2\u03ad\u03ae\7K\2\2\u03ae\u03af\5b\62\2\u03af\u03b0\7L\2\2\u03b0\u03b1"+
		"\5V,\2\u03b1\u03b3\3\2\2\2\u03b2\u039e\3\2\2\2\u03b2\u03a4\3\2\2\2\u03b2"+
		"\u03ac\3\2\2\2\u03b3a\3\2\2\2\u03b4\u03c5\5R*\2\u03b5\u03b7\5\u00bc_\2"+
		"\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9"+
		"\5~@\2\u03b9\u03ba\5\u00d4k\2\u03ba\u03bb\7[\2\2\u03bb\u03bc\5\u0102\u0082"+
		"\2\u03bc\u03c5\3\2\2\2\u03bd\u03bf\5\u00bc_\2\u03be\u03bd\3\2\2\2\u03be"+
		"\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\5~@\2\u03c1\u03c2\5\u00d4"+
		"k\2\u03c2\u03c3\5\u0106\u0084\2\u03c3\u03c5\3\2\2\2\u03c4\u03b4\3\2\2"+
		"\2\u03c4\u03b6\3\2\2\2\u03c4\u03be\3\2\2\2\u03c5c\3\2\2\2\u03c6\u03c7"+
		"\7J\2\2\u03c7\u03c8\7K\2\2\u03c8\u03c9\5b\62\2\u03c9\u03ca\7L\2\2\u03ca"+
		"\u03cb\5V,\2\u03cb\u03ea\3\2\2\2\u03cc\u03cd\7\32\2\2\u03cd\u03ce\5V,"+
		"\2\u03ce\u03cf\7J\2\2\u03cf\u03d0\7K\2\2\u03d0\u03d1\5R*\2\u03d1\u03d2"+
		"\7L\2\2\u03d2\u03d3\7x\2\2\u03d3\u03ea\3\2\2\2\u03d4\u03d5\7%\2\2\u03d5"+
		"\u03d6\7K\2\2\u03d6\u03d8\5f\64\2\u03d7\u03d9\5b\62\2\u03d8\u03d7\3\2"+
		"\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\7x\2\2\u03db"+
		"\u03dd\5R*\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2"+
		"\2\u03de\u03df\7L\2\2\u03df\u03e0\5V,\2\u03e0\u03ea\3\2\2\2\u03e1\u03e2"+
		"\7%\2\2\u03e2\u03e3\7K\2\2\u03e3\u03e4\5h\65\2\u03e4\u03e5\7v\2\2\u03e5"+
		"\u03e6\5j\66\2\u03e6\u03e7\7L\2\2\u03e7\u03e8\5V,\2\u03e8\u03ea\3\2\2"+
		"\2\u03e9\u03c6\3\2\2\2\u03e9\u03cc\3\2\2\2\u03e9\u03d4\3\2\2\2\u03e9\u03e1"+
		"\3\2\2\2\u03eae\3\2\2\2\u03eb\u03ee\5Z.\2\u03ec\u03ee\5v<\2\u03ed\u03eb"+
		"\3\2\2\2\u03ed\u03ec\3\2\2\2\u03eeg\3\2\2\2\u03ef\u03f1\5\u00bc_\2\u03f0"+
		"\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\5~"+
		"@\2\u03f3\u03f4\5\u00d4k\2\u03f4i\3\2\2\2\u03f5\u03f8\5R*\2\u03f6\u03f8"+
		"\5\u0106\u0084\2\u03f7\u03f5\3\2\2\2\u03f7\u03f6\3\2\2\2\u03f8k\3\2\2"+
		"\2\u03f9\u03fa\7\r\2\2\u03fa\u040a\7x\2\2\u03fb\u03fc\7\27\2\2\u03fc\u040a"+
		"\7x\2\2\u03fd\u03ff\7\66\2\2\u03fe\u0400\5R*\2\u03ff\u03fe\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u040a\7x\2\2\u0402\u0403\7\66"+
		"\2\2\u0403\u0404\5\u0106\u0084\2\u0404\u0405\7x\2\2\u0405\u040a\3\2\2"+
		"\2\u0406\u0407\7\'\2\2\u0407\u0408\7{\2\2\u0408\u040a\7x\2\2\u0409\u03f9"+
		"\3\2\2\2\u0409\u03fb\3\2\2\2\u0409\u03fd\3\2\2\2\u0409\u0402\3\2\2\2\u0409"+
		"\u0406\3\2\2\2\u040am\3\2\2\2\u040b\u040c\5t;\2\u040co\3\2\2\2\u040d\u040e"+
		"\b9\1\2\u040e\u040f\5r:\2\u040f\u0414\3\2\2\2\u0410\u0411\f\3\2\2\u0411"+
		"\u0413\5r:\2\u0412\u0410\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2"+
		"\2\u0414\u0415\3\2\2\2\u0415q\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u041e"+
		"\5t;\2\u0418\u041e\5\u00fa~\2\u0419\u041e\5\u00ba^\2\u041a\u041e\5\u00a8"+
		"U\2\u041b\u041e\5x=\2\u041c\u041e\5z>\2\u041d\u0417\3\2\2\2\u041d\u0418"+
		"\3\2\2\2\u041d\u0419\3\2\2\2\u041d\u041a\3\2\2\2\u041d\u041b\3\2\2\2\u041d"+
		"\u041c\3\2\2\2\u041es\3\2\2\2\u041f\u0424\5v<\2\u0420\u0424\5\u00b6\\"+
		"\2\u0421\u0424\5\u00b8]\2\u0422\u0424\5\u009aN\2\u0423\u041f\3\2\2\2\u0423"+
		"\u0420\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0422\3\2\2\2\u0424u\3\2\2\2"+
		"\u0425\u0427\5~@\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429"+
		"\3\2\2\2\u0428\u042a\5\u00d0i\2\u0429\u0428\3\2\2\2\u0429\u042a\3\2\2"+
		"\2\u042a\u042b\3\2\2\2\u042b\u0434\7x\2\2\u042c\u042e\5\u00bc_\2\u042d"+
		"\u042f\5~@\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2"+
		"\2\u0430\u0431\5\u00d0i\2\u0431\u0432\7x\2\2\u0432\u0434\3\2\2\2\u0433"+
		"\u0426\3\2\2\2\u0433\u042c\3\2\2\2\u0434w\3\2\2\2\u0435\u0436\7x\2\2\u0436"+
		"y\3\2\2\2\u0437\u0438\5\u00bc_\2\u0438\u0439\7x\2\2\u0439{\3\2\2\2\u043a"+
		"\u0441\5\u0080A\2\u043b\u0441\5\u0086D\2\u043c\u0441\5\u0082B\2\u043d"+
		"\u0441\7&\2\2\u043e\u0441\7B\2\2\u043f\u0441\7\25\2\2\u0440\u043a\3\2"+
		"\2\2\u0440\u043b\3\2\2\2\u0440\u043c\3\2\2\2\u0440\u043d\3\2\2\2\u0440"+
		"\u043e\3\2\2\2\u0440\u043f\3\2\2\2\u0441}\3\2\2\2\u0442\u0444\5|?\2\u0443"+
		"\u0445\5\u00bc_\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u044a"+
		"\3\2\2\2\u0446\u0447\5|?\2\u0447\u0448\5~@\2\u0448\u044a\3\2\2\2\u0449"+
		"\u0442\3\2\2\2\u0449\u0446\3\2\2\2\u044a\177\3\2\2\2\u044b\u044c\t\6\2"+
		"\2\u044c\u0081\3\2\2\2\u044d\u044e\t\7\2\2\u044e\u0083\3\2\2\2\u044f\u0450"+
		"\7{\2\2\u0450\u0085\3\2\2\2\u0451\u0455\5\u0088E\2\u0452\u0455\5\u010a"+
		"\u0086\2\u0453\u0455\5\u0096L\2\u0454\u0451\3\2\2\2\u0454\u0452\3\2\2"+
		"\2\u0454\u0453\3\2\2\2\u0455\u0087\3\2\2\2\u0456\u045b\5\u008eH\2\u0457"+
		"\u045b\5\u0092J\2\u0458\u045b\5\u0142\u00a2\2\u0459\u045b\5\u00e2r\2\u045a"+
		"\u0456\3\2\2\2\u045a\u0457\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u0459\3\2"+
		"\2\2\u045b\u0089\3\2\2\2\u045c\u045e\5\u0086D\2\u045d\u045f\5\u00bc_\2"+
		"\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0464\3\2\2\2\u0460\u0461"+
		"\5\u0086D\2\u0461\u0462\5\u008aF\2\u0462\u0464\3\2\2\2\u0463\u045c\3\2"+
		"\2\2\u0463\u0460\3\2\2\2\u0464\u008b\3\2\2\2\u0465\u0467\5\u0088E\2\u0466"+
		"\u0468\5\u00bc_\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u046d"+
		"\3\2\2\2\u0469\u046a\5\u0088E\2\u046a\u046b\5\u008cG\2\u046b\u046d\3\2"+
		"\2\2\u046c\u0465\3\2\2\2\u046c\u0469\3\2\2\2\u046d\u008d\3\2\2\2\u046e"+
		"\u0470\5\f\7\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2"+
		"\2\2\u0471\u0480\5\u0090I\2\u0472\u0480\7\20\2\2\u0473\u0480\7\21\2\2"+
		"\u0474\u0480\7\22\2\2\u0475\u0480\7\f\2\2\u0476\u0480\7\67\2\2\u0477\u0480"+
		"\7*\2\2\u0478\u0480\7+\2\2\u0479\u0480\78\2\2\u047a\u0480\7F\2\2\u047b"+
		"\u0480\7$\2\2\u047c\u0480\7\33\2\2\u047d\u0480\7I\2\2\u047e\u0480\7\13"+
		"\2\2\u047f\u046f\3\2\2\2\u047f\u0472\3\2\2\2\u047f\u0473\3\2\2\2\u047f"+
		"\u0474\3\2\2\2\u047f\u0475\3\2\2\2\u047f\u0476\3\2\2\2\u047f\u0477\3\2"+
		"\2\2\u047f\u0478\3\2\2\2\u047f\u0479\3\2\2\2\u047f\u047a\3\2\2\2\u047f"+
		"\u047b\3\2\2\2\u047f\u047c\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u047e\3\2"+
		"\2\2\u0480\u008f\3\2\2\2\u0481\u0485\5\u0108\u0085\2\u0482\u0485\5\u0094"+
		"K\2\u0483\u0485\5\u0084C\2\u0484\u0481\3\2\2\2\u0484\u0482\3\2\2\2\u0484"+
		"\u0483\3\2\2\2\u0485\u0091\3\2\2\2\u0486\u0488\5\u0112\u008a\2\u0487\u0489"+
		"\5\u00bc_\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2"+
		"\2\u048a\u048c\5\f\7\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u048e\7{\2\2\u048e\u0495\3\2\2\2\u048f\u0491\7\36\2\2\u0490"+
		"\u0492\5\f\7\2\u0491\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2"+
		"\2\2\u0493\u0495\7{\2\2\u0494\u0486\3\2\2\2\u0494\u048f\3\2\2\2\u0495"+
		"\u0093\3\2\2\2\u0496\u0497\7{\2\2\u0497\u0095\3\2\2\2\u0498\u0499\5\u0098"+
		"M\2\u0499\u049b\7O\2\2\u049a\u049c\5\u00a0Q\2\u049b\u049a\3\2\2\2\u049b"+
		"\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\7P\2\2\u049e\u04a6\3\2"+
		"\2\2\u049f\u04a0\5\u0098M\2\u04a0\u04a1\7O\2\2\u04a1\u04a2\5\u00a0Q\2"+
		"\u04a2\u04a3\7r\2\2\u04a3\u04a4\7P\2\2\u04a4\u04a6\3\2\2\2\u04a5\u0498"+
		"\3\2\2\2\u04a5\u049f\3\2\2\2\u04a6\u0097\3\2\2\2\u04a7\u04a9\5\u009cO"+
		"\2\u04a8\u04aa\5\u00bc_\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04ac\3\2\2\2\u04ab\u04ad\7{\2\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2"+
		"\2\2\u04ad\u04af\3\2\2\2\u04ae\u04b0\5\u009eP\2\u04af\u04ae\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04bb\3\2\2\2\u04b1\u04b3\5\u009cO\2\u04b2\u04b4"+
		"\5\u00bc_\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2"+
		"\2\u04b5\u04b6\5\f\7\2\u04b6\u04b8\7{\2\2\u04b7\u04b9\5\u009eP\2\u04b8"+
		"\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bb\3\2\2\2\u04ba\u04a7\3\2"+
		"\2\2\u04ba\u04b1\3\2\2\2\u04bb\u0099\3\2\2\2\u04bc\u04be\5\u009cO\2\u04bd"+
		"\u04bf\5\u00bc_\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0"+
		"\3\2\2\2\u04c0\u04c2\7{\2\2\u04c1\u04c3\5\u009eP\2\u04c2\u04c1\3\2\2\2"+
		"\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\7x\2\2\u04c5\u009b"+
		"\3\2\2\2\u04c6\u04cc\7\36\2\2\u04c7\u04c8\7\36\2\2\u04c8\u04cc\7\23\2"+
		"\2\u04c9\u04ca\7\36\2\2\u04ca\u04cc\7<\2\2\u04cb\u04c6\3\2\2\2\u04cb\u04c7"+
		"\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u009d\3\2\2\2\u04cd\u04ce\7v\2\2\u04ce"+
		"\u04cf\5\u008aF\2\u04cf\u009f\3\2\2\2\u04d0\u04d1\bQ\1\2\u04d1\u04d2\5"+
		"\u00a2R\2\u04d2\u04d8\3\2\2\2\u04d3\u04d4\f\3\2\2\u04d4\u04d5\7r\2\2\u04d5"+
		"\u04d7\5\u00a2R\2\u04d6\u04d3\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6"+
		"\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u00a1\3\2\2\2\u04da\u04d8\3\2\2\2\u04db"+
		"\u04e1\5\u00a4S\2\u04dc\u04dd\5\u00a4S\2\u04dd\u04de\7[\2\2\u04de\u04df"+
		"\5T+\2\u04df\u04e1\3\2\2\2\u04e0\u04db\3\2\2\2\u04e0\u04dc\3\2\2\2\u04e1"+
		"\u00a3\3\2\2\2\u04e2\u04e3\7{\2\2\u04e3\u00a5\3\2\2\2\u04e4\u04e5\7{\2"+
		"\2\u04e5\u00a7\3\2\2\2\u04e6\u04e9\5\u00aaV\2\u04e7\u04e9\5\u00b0Y\2\u04e8"+
		"\u04e6\3\2\2\2\u04e8\u04e7\3\2\2\2\u04e9\u00a9\3\2\2\2\u04ea\u04ed\5\u00ac"+
		"W\2\u04eb\u04ed\5\u00aeX\2\u04ec\u04ea\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed"+
		"\u00ab\3\2\2\2\u04ee\u04f0\7)\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2"+
		"\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\7,\2\2\u04f2\u04f3\7{\2\2\u04f3\u04f4"+
		"\7O\2\2\u04f4\u04f5\5\u00b2Z\2\u04f5\u04f6\7P\2\2\u04f6\u00ad\3\2\2\2"+
		"\u04f7\u04f9\7)\2\2\u04f8\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa"+
		"\3\2\2\2\u04fa\u04fb\7,\2\2\u04fb\u04fc\5\u00a6T\2\u04fc\u04fd\7O\2\2"+
		"\u04fd\u04fe\5\u00b2Z\2\u04fe\u04ff\7P\2\2\u04ff\u00af\3\2\2\2\u0500\u0502"+
		"\7)\2\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u0504\7,\2\2\u0504\u0505\7O\2\2\u0505\u0506\5\u00b2Z\2\u0506\u0507\7"+
		"P\2\2\u0507\u00b1\3\2\2\2\u0508\u050a\5p9\2\u0509\u0508\3\2\2\2\u0509"+
		"\u050a\3\2\2\2\u050a\u00b3\3\2\2\2\u050b\u050d\5\f\7\2\u050c\u050b\3\2"+
		"\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\5\u00a6T\2\u050f"+
		"\u00b5\3\2\2\2\u0510\u0512\7G\2\2\u0511\u0513\7D\2\2\u0512\u0511\3\2\2"+
		"\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\5\f\7\2\u0515\u0516"+
		"\5\4\3\2\u0516\u0517\7x\2\2\u0517\u051e\3\2\2\2\u0518\u0519\7G\2\2\u0519"+
		"\u051a\7w\2\2\u051a\u051b\5\4\3\2\u051b\u051c\7x\2\2\u051c\u051e\3\2\2"+
		"\2\u051d\u0510\3\2\2\2\u051d\u0518\3\2\2\2\u051e\u00b7\3\2\2\2\u051f\u0521"+
		"\5\u00bc_\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2\2"+
		"\2\u0522\u0523\7G\2\2\u0523\u0525\7,\2\2\u0524\u0526\5\f\7\2\u0525\u0524"+
		"\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\5\u00a6T"+
		"\2\u0528\u0529\7x\2\2\u0529\u00b9\3\2\2\2\u052a\u052b\7!\2\2\u052b\u052c"+
		"\7\u0084\2\2\u052c\u052e\7O\2\2\u052d\u052f\5p9\2\u052e\u052d\3\2\2\2"+
		"\u052e\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0535\7P\2\2\u0531\u0532"+
		"\7!\2\2\u0532\u0533\7\u0084\2\2\u0533\u0535\5r:\2\u0534\u052a\3\2\2\2"+
		"\u0534\u0531\3\2\2\2\u0535\u00bb\3\2\2\2\u0536\u0537\b_\1\2\u0537\u0538"+
		"\5\u00be`\2\u0538\u053d\3\2\2\2\u0539\u053a\f\3\2\2\u053a\u053c\5\u00be"+
		"`\2\u053b\u0539\3\2\2\2\u053c\u053f\3\2\2\2\u053d\u053b\3\2\2\2\u053d"+
		"\u053e\3\2\2\2\u053e\u00bd\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u0541\7M"+
		"\2\2\u0541\u0542\7M\2\2\u0542\u0543\5\u00c0a\2\u0543\u0544\7N\2\2\u0544"+
		"\u0545\7N\2\2\u0545\u00bf\3\2\2\2\u0546\u0548\ba\1\2\u0547\u0549\5\u00c2"+
		"b\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054e\3\2\2\2\u054a"+
		"\u054b\5\u00c2b\2\u054b\u054c\7\3\2\2\u054c\u054e\3\2\2\2\u054d\u0546"+
		"\3\2\2\2\u054d\u054a\3\2\2\2\u054e\u055b\3\2\2\2\u054f\u0550\f\5\2\2\u0550"+
		"\u0552\7r\2\2\u0551\u0553\5\u00c2b\2\u0552\u0551\3\2\2\2\u0552\u0553\3"+
		"\2\2\2\u0553\u055a\3\2\2\2\u0554\u0555\f\3\2\2\u0555\u0556\7r\2\2\u0556"+
		"\u0557\5\u00c2b\2\u0557\u0558\7\3\2\2\u0558\u055a\3\2\2\2\u0559\u054f"+
		"\3\2\2\2\u0559\u0554\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055c\u00c1\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u0560\5\u00c4"+
		"c\2\u055f\u0561\5\u00caf\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2\2\2\u0561"+
		"\u00c3\3\2\2\2\u0562\u0565\7{\2\2\u0563\u0565\5\u00c6d\2\u0564\u0562\3"+
		"\2\2\2\u0564\u0563\3\2\2\2\u0565\u00c5\3\2\2\2\u0566\u0567\5\u00c8e\2"+
		"\u0567\u0568\7w\2\2\u0568\u0569\7{\2\2\u0569\u00c7\3\2\2\2\u056a\u056b"+
		"\7{\2\2\u056b\u00c9\3\2\2\2\u056c\u056d\7K\2\2\u056d\u056e\5\u00ccg\2"+
		"\u056e\u056f\7L\2\2\u056f\u00cb\3\2\2\2\u0570\u0572\bg\1\2\u0571\u0573"+
		"\5\u00ceh\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0578\3\2\2"+
		"\2\u0574\u0575\f\3\2\2\u0575\u0577\5\u00ceh\2\u0576\u0574\3\2\2\2\u0577"+
		"\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u00cd\3\2"+
		"\2\2\u057a\u0578\3\2\2\2\u057b\u057c\7K\2\2\u057c\u057d\5\u00ccg\2\u057d"+
		"\u057e\7L\2\2\u057e\u0588\3\2\2\2\u057f\u0580\7M\2\2\u0580\u0581\5\u00cc"+
		"g\2\u0581\u0582\7N\2\2\u0582\u0588\3\2\2\2\u0583\u0584\7O\2\2\u0584\u0585"+
		"\5\u00ccg\2\u0585\u0586\7P\2\2\u0586\u0588\3\2\2\2\u0587\u057b\3\2\2\2"+
		"\u0587\u057f\3\2\2\2\u0587\u0583\3\2\2\2\u0588\u00cf\3\2\2\2\u0589\u058a"+
		"\bi\1\2\u058a\u058b\5\u00d2j\2\u058b\u0591\3\2\2\2\u058c\u058d\f\3\2\2"+
		"\u058d\u058e\7r\2\2\u058e\u0590\5\u00d2j\2\u058f\u058c\3\2\2\2\u0590\u0593"+
		"\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u00d1\3\2\2\2\u0593"+
		"\u0591\3\2\2\2\u0594\u0596\5\u00d4k\2\u0595\u0597\5\u00fe\u0080\2\u0596"+
		"\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u00d3\3\2\2\2\u0598\u059e\5\u00d6"+
		"l\2\u0599\u059a\5\u00d8m\2\u059a\u059b\5\u00dan\2\u059b\u059c\5\u00dc"+
		"o\2\u059c\u059e\3\2\2\2\u059d\u0598\3\2\2\2\u059d\u0599\3\2\2\2\u059e"+
		"\u00d5\3\2\2\2\u059f\u05a4\5\u00d8m\2\u05a0\u05a1\5\u00dep\2\u05a1\u05a2"+
		"\5\u00d6l\2\u05a2\u05a4\3\2\2\2\u05a3\u059f\3\2\2\2\u05a3\u05a0\3\2\2"+
		"\2\u05a4\u00d7\3\2\2\2\u05a5\u05a6\bm\1\2\u05a6\u05a8\5\u00e6t\2\u05a7"+
		"\u05a9\5\u00bc_\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05af"+
		"\3\2\2\2\u05aa\u05ab\7K\2\2\u05ab\u05ac\5\u00d6l\2\u05ac\u05ad\7L\2\2"+
		"\u05ad\u05af\3\2\2\2\u05ae\u05a5\3\2\2\2\u05ae\u05aa\3\2\2\2\u05af\u05bd"+
		"\3\2\2\2\u05b0\u05b1\f\5\2\2\u05b1\u05bc\5\u00dan\2\u05b2\u05b3\f\4\2"+
		"\2\u05b3\u05b5\7M\2\2\u05b4\u05b6\5T+\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6"+
		"\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\7N\2\2\u05b8\u05ba\5\u00bc_\2"+
		"\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05b0"+
		"\3\2\2\2\u05bb\u05b2\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd"+
		"\u05be\3\2\2\2\u05be\u00d9\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05c1\7K"+
		"\2\2\u05c1\u05c2\5\u00f4{\2\u05c2\u05c4\7L\2\2\u05c3\u05c5\5\u00e0q\2"+
		"\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c7\3\2\2\2\u05c6\u05c8"+
		"\5\u00e4s\2\u05c7\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05ca\3\2\2"+
		"\2\u05c9\u05cb\5\u0150\u00a9\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2"+
		"\u05cb\u05cd\3\2\2\2\u05cc\u05ce\5\u00bc_\2\u05cd\u05cc\3\2\2\2\u05cd"+
		"\u05ce\3\2\2\2\u05ce\u00db\3\2\2\2\u05cf\u05d0\7t\2\2\u05d0\u05d2\5\u008c"+
		"G\2\u05d1\u05d3\5\u00eav\2\u05d2\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3"+
		"\u00dd\3\2\2\2\u05d4\u05d6\7S\2\2\u05d5\u05d7\5\u00bc_\2\u05d6\u05d5\3"+
		"\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\3\2\2\2\u05d8\u05da\5\u00e0q\2"+
		"\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05ec\3\2\2\2\u05db\u05dd"+
		"\7W\2\2\u05dc\u05de\5\u00bc_\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2"+
		"\u05de\u05ec\3\2\2\2\u05df\u05e1\7\6\2\2\u05e0\u05e2\5\u00bc_\2\u05e1"+
		"\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05ec\3\2\2\2\u05e3\u05e4\5\f"+
		"\7\2\u05e4\u05e6\7S\2\2\u05e5\u05e7\5\u00bc_\2\u05e6\u05e5\3\2\2\2\u05e6"+
		"\u05e7\3\2\2\2\u05e7\u05e9\3\2\2\2\u05e8\u05ea\5\u00e0q\2\u05e9\u05e8"+
		"\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ec\3\2\2\2\u05eb\u05d4\3\2\2\2\u05eb"+
		"\u05db\3\2\2\2\u05eb\u05df\3\2\2\2\u05eb\u05e3\3\2\2\2\u05ec\u00df\3\2"+
		"\2\2\u05ed\u05ef\5\u00e2r\2\u05ee\u05f0\5\u00e0q\2\u05ef\u05ee\3\2\2\2"+
		"\u05ef\u05f0\3\2\2\2\u05f0\u00e1\3\2\2\2\u05f1\u05f2\7\24\2\2\u05f2\u00e3"+
		"\3\2\2\2\u05f3\u05f4\t\b\2\2\u05f4\u00e5\3\2\2\2\u05f5\u05f7\7\3\2\2\u05f6"+
		"\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\5\4"+
		"\3\2\u05f9\u00e7\3\2\2\2\u05fa\u05fc\5\u008aF\2\u05fb\u05fd\5\u00eav\2"+
		"\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u00e9\3\2\2\2\u05fe\u0607"+
		"\5\u00ecw\2\u05ff\u0601\5\u00eex\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2"+
		"\2\2\u0601\u0602\3\2\2\2\u0602\u0603\5\u00dan\2\u0603\u0604\5\u00dco\2"+
		"\u0604\u0607\3\2\2\2\u0605\u0607\5\u00f0y\2\u0606\u05fe\3\2\2\2\u0606"+
		"\u0600\3\2\2\2\u0606\u0605\3\2\2\2\u0607\u00eb\3\2\2\2\u0608\u060e\5\u00ee"+
		"x\2\u0609\u060b\5\u00dep\2\u060a\u060c\5\u00ecw\2\u060b\u060a\3\2\2\2"+
		"\u060b\u060c\3\2\2\2\u060c\u060e\3\2\2\2\u060d\u0608\3\2\2\2\u060d\u0609"+
		"\3\2\2\2\u060e\u00ed\3\2\2\2\u060f\u0610\bx\1\2\u0610\u061e\5\u00dan\2"+
		"\u0611\u0613\7M\2\2\u0612\u0614\5T+\2\u0613\u0612\3\2\2\2\u0613\u0614"+
		"\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0617\7N\2\2\u0616\u0618\5\u00bc_\2"+
		"\u0617\u0616\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u061e\3\2\2\2\u0619\u061a"+
		"\7K\2\2\u061a\u061b\5\u00ecw\2\u061b\u061c\7L\2\2\u061c\u061e\3\2\2\2"+
		"\u061d\u060f\3\2\2\2\u061d\u0611\3\2\2\2\u061d\u0619\3\2\2\2\u061e\u062c"+
		"\3\2\2\2\u061f\u0620\f\7\2\2\u0620\u062b\5\u00dan\2\u0621\u0622\f\5\2"+
		"\2\u0622\u0624\7M\2\2\u0623\u0625\5T+\2\u0624\u0623\3\2\2\2\u0624\u0625"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628\7N\2\2\u0627\u0629\5\u00bc_\2"+
		"\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062b\3\2\2\2\u062a\u061f"+
		"\3\2\2\2\u062a\u0621\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c"+
		"\u062d\3\2\2\2\u062d\u00ef\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u0634\5\u00f2"+
		"z\2\u0630\u0631\5\u00dep\2\u0631\u0632\5\u00f0y\2\u0632\u0634\3\2\2\2"+
		"\u0633\u062f\3\2\2\2\u0633\u0630\3\2\2\2\u0634\u00f1\3\2\2\2\u0635\u0636"+
		"\bz\1\2\u0636\u0637\7\3\2\2\u0637\u0645\3\2\2\2\u0638\u0639\f\5\2\2\u0639"+
		"\u0644\5\u00dan\2\u063a\u063b\f\4\2\2\u063b\u063d\7M\2\2\u063c\u063e\5"+
		"T+\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u0641\7N\2\2\u0640\u0642\5\u00bc_\2\u0641\u0640\3\2\2\2\u0641\u0642\3"+
		"\2\2\2\u0642\u0644\3\2\2\2\u0643\u0638\3\2\2\2\u0643\u063a\3\2\2\2\u0644"+
		"\u0647\3\2\2\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u00f3\3\2"+
		"\2\2\u0647\u0645\3\2\2\2\u0648\u064a\5\u00f6|\2\u0649\u0648\3\2\2\2\u0649"+
		"\u064a\3\2\2\2\u064a\u064c\3\2\2\2\u064b\u064d\7\3\2\2\u064c\u064b\3\2"+
		"\2\2\u064c\u064d\3\2\2\2\u064d\u0653\3\2\2\2\u064e\u064f\5\u00f6|\2\u064f"+
		"\u0650\7r\2\2\u0650\u0651\7\3\2\2\u0651\u0653\3\2\2\2\u0652\u0649\3\2"+
		"\2\2\u0652\u064e\3\2\2\2\u0653\u00f5\3\2\2\2\u0654\u0655\b|\1\2\u0655"+
		"\u0656\5\u00f8}\2\u0656\u065c\3\2\2\2\u0657\u0658\f\3\2\2\u0658\u0659"+
		"\7r\2\2\u0659\u065b\5\u00f8}\2\u065a\u0657\3\2\2\2\u065b\u065e\3\2\2\2"+
		"\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u00f7\3\2\2\2\u065e\u065c"+
		"\3\2\2\2\u065f\u0661\5\u00bc_\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2"+
		"\2\u0661\u0662\3\2\2\2\u0662\u0663\5~@\2\u0663\u0664\5\u00d4k\2\u0664"+
		"\u067f\3\2\2\2\u0665\u0667\5\u00bc_\2\u0666\u0665\3\2\2\2\u0666\u0667"+
		"\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\5~@\2\u0669\u066a\5\u00d4k\2"+
		"\u066a\u066b\7[\2\2\u066b\u066c\5\u0102\u0082\2\u066c\u067f\3\2\2\2\u066d"+
		"\u066f\5\u00bc_\2\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670"+
		"\3\2\2\2\u0670\u0672\5~@\2\u0671\u0673\5\u00eav\2\u0672\u0671\3\2\2\2"+
		"\u0672\u0673\3\2\2\2\u0673\u067f\3\2\2\2\u0674\u0676\5\u00bc_\2\u0675"+
		"\u0674\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0679\5~"+
		"@\2\u0678\u067a\5\u00eav\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a"+
		"\u067b\3\2\2\2\u067b\u067c\7[\2\2\u067c\u067d\5\u0102\u0082\2\u067d\u067f"+
		"\3\2\2\2\u067e\u0660\3\2\2\2\u067e\u0666\3\2\2\2\u067e\u066e\3\2\2\2\u067e"+
		"\u0675\3\2\2\2\u067f\u00f9\3\2\2\2\u0680\u0682\5\u00bc_\2\u0681\u0680"+
		"\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0684\3\2\2\2\u0683\u0685\5~@\2\u0684"+
		"\u0683\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0688\5\u00d4"+
		"k\2\u0687\u0689\5\u011c\u008f\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2"+
		"\2\u0689\u068a\3\2\2\2\u068a\u068b\5\u00fc\177\2\u068b\u00fb\3\2\2\2\u068c"+
		"\u068e\5\u0134\u009b\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u068f"+
		"\3\2\2\2\u068f\u0698\5\\/\2\u0690\u0698\5\u0146\u00a4\2\u0691\u0692\7"+
		"[\2\2\u0692\u0693\7\30\2\2\u0693\u0698\7x\2\2\u0694\u0695\7[\2\2\u0695"+
		"\u0696\7\31\2\2\u0696\u0698\7x\2\2\u0697\u068d\3\2\2\2\u0697\u0690\3\2"+
		"\2\2\u0697\u0691\3\2\2\2\u0697\u0694\3\2\2\2\u0698\u00fd\3\2\2\2\u0699"+
		"\u069f\5\u0100\u0081\2\u069a\u069b\7K\2\2\u069b\u069c\5\36\20\2\u069c"+
		"\u069d\7L\2\2\u069d\u069f\3\2\2\2\u069e\u0699\3\2\2\2\u069e\u069a\3\2"+
		"\2\2\u069f\u00ff\3\2\2\2\u06a0\u06a1\7[\2\2\u06a1\u06a4\5\u0102\u0082"+
		"\2\u06a2\u06a4\5\u0106\u0084\2\u06a3\u06a0\3\2\2\2\u06a3\u06a2\3\2\2\2"+
		"\u06a4\u0101\3\2\2\2\u06a5\u06a8\5N(\2\u06a6\u06a8\5\u0106\u0084\2\u06a7"+
		"\u06a5\3\2\2\2\u06a7\u06a6\3\2\2\2\u06a8\u0103\3\2\2\2\u06a9\u06aa\b\u0083"+
		"\1\2\u06aa\u06ac\5\u0102\u0082\2\u06ab\u06ad\7\3\2\2\u06ac\u06ab\3\2\2"+
		"\2\u06ac\u06ad\3\2\2\2\u06ad\u06b6\3\2\2\2\u06ae\u06af\f\3\2\2\u06af\u06b0"+
		"\7r\2\2\u06b0\u06b2\5\u0102\u0082\2\u06b1\u06b3\7\3\2\2\u06b2\u06b1\3"+
		"\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06ae\3\2\2\2\u06b5"+
		"\u06b8\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7\u0105\3\2"+
		"\2\2\u06b8\u06b6\3\2\2\2\u06b9\u06ba\7O\2\2\u06ba\u06bc\5\u0104\u0083"+
		"\2\u06bb\u06bd\7r\2\2\u06bc\u06bb\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd\u06be"+
		"\3\2\2\2\u06be\u06bf\7P\2\2\u06bf\u06c3\3\2\2\2\u06c0\u06c1\7O\2\2\u06c1"+
		"\u06c3\7P\2\2\u06c2\u06b9\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c3\u0107\3\2"+
		"\2\2\u06c4\u06c5\7{\2\2\u06c5\u0109\3\2\2\2\u06c6\u06c7\5\u010c\u0087"+
		"\2\u06c7\u06c9\7O\2\2\u06c8\u06ca\5\u0114\u008b\2\u06c9\u06c8\3\2\2\2"+
		"\u06c9\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc\7P\2\2\u06cc\u010b"+
		"\3\2\2\2\u06cd\u06cf\5\u0112\u008a\2\u06ce\u06d0\5\u00bc_\2\u06cf\u06ce"+
		"\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\5\u010e\u0088"+
		"\2\u06d2\u06d4\5\u0110\u0089\2\u06d3\u06d2\3\2\2\2\u06d3\u06d4\3\2\2\2"+
		"\u06d4\u06d6\3\2\2\2\u06d5\u06d7\5\u0122\u0092\2\u06d6\u06d5\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u06e0\3\2\2\2\u06d8\u06da\5\u0112\u008a\2\u06d9\u06db"+
		"\5\u00bc_\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dd\3\2\2"+
		"\2\u06dc\u06de\5\u0122\u0092\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2"+
		"\u06de\u06e0\3\2\2\2\u06df\u06cd\3\2\2\2\u06df\u06d8\3\2\2\2\u06e0\u010d"+
		"\3\2\2\2\u06e1\u06e3\5\f\7\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3"+
		"\u06e4\3\2\2\2\u06e4\u06e5\5\u0108\u0085\2\u06e5\u010f\3\2\2\2\u06e6\u06e7"+
		"\7#\2\2\u06e7\u0111\3\2\2\2\u06e8\u06e9\t\t\2\2\u06e9\u0113\3\2\2\2\u06ea"+
		"\u06ec\5\u0116\u008c\2\u06eb\u06ed\5\u0114\u008b\2\u06ec\u06eb\3\2\2\2"+
		"\u06ec\u06ed\3\2\2\2\u06ed\u06f4\3\2\2\2\u06ee\u06ef\5\u012c\u0097\2\u06ef"+
		"\u06f1\7v\2\2\u06f0\u06f2\5\u0114\u008b\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2"+
		"\3\2\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06ea\3\2\2\2\u06f3\u06ee\3\2\2\2\u06f4"+
		"\u0115\3\2\2\2\u06f5\u06f7\5\u00bc_\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7"+
		"\3\2\2\2\u06f7\u06f9\3\2\2\2\u06f8\u06fa\5~@\2\u06f9\u06f8\3\2\2\2\u06f9"+
		"\u06fa\3\2\2\2\u06fa\u06fc\3\2\2\2\u06fb\u06fd\5\u0118\u008d\2\u06fc\u06fb"+
		"\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0703\7x\2\2\u06ff"+
		"\u0703\5\u00fa~\2\u0700\u0703\5\u00b6\\\2\u0701\u0703\5x=\2\u0702\u06f6"+
		"\3\2\2\2\u0702\u06ff\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0701\3\2\2\2\u0703"+
		"\u0117\3\2\2\2\u0704\u0705\b\u008d\1\2\u0705\u0706\5\u011a\u008e\2\u0706"+
		"\u070c\3\2\2\2\u0707\u0708\f\3\2\2\u0708\u0709\7r\2\2\u0709\u070b\5\u011a"+
		"\u008e\2\u070a\u0707\3\2\2\2\u070b\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c"+
		"\u070d\3\2\2\2\u070d\u0119\3\2\2\2\u070e\u070c\3\2\2\2\u070f\u0711\5\u00d4"+
		"k\2\u0710\u0712\5\u011c\u008f\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2"+
		"\2\u0712\u0714\3\2\2\2\u0713\u0715\5\u0120\u0091\2\u0714\u0713\3\2\2\2"+
		"\u0714\u0715\3\2\2\2\u0715\u0723\3\2\2\2\u0716\u0718\5\u00d4k\2\u0717"+
		"\u0719\5\u0100\u0081\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u0723"+
		"\3\2\2\2\u071a\u071c\7{\2\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2\2\u071c"+
		"\u071e\3\2\2\2\u071d\u071f\5\u00bc_\2\u071e\u071d\3\2\2\2\u071e\u071f"+
		"\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721\7v\2\2\u0721\u0723\5T+\2\u0722"+
		"\u070f\3\2\2\2\u0722\u0716\3\2\2\2\u0722\u071b\3\2\2\2\u0723\u011b\3\2"+
		"\2\2\u0724\u0725\b\u008f\1\2\u0725\u0726\5\u011e\u0090\2\u0726\u072b\3"+
		"\2\2\2\u0727\u0728\f\3\2\2\u0728\u072a\5\u011e\u0090\2\u0729\u0727\3\2"+
		"\2\2\u072a\u072d\3\2\2\2\u072b\u0729\3\2\2\2\u072b\u072c\3\2\2\2\u072c"+
		"\u011d\3\2\2\2\u072d\u072b\3\2\2\2\u072e\u072f\t\n\2\2\u072f\u011f\3\2"+
		"\2\2\u0730\u0731\7[\2\2\u0731\u0732\7~\2\2\u0732\u0733\b\u0091\1\2\u0733"+
		"\u0121\3\2\2\2\u0734\u0735\7v\2\2\u0735\u0736\5\u0124\u0093\2\u0736\u0123"+
		"\3\2\2\2\u0737\u0738\b\u0093\1\2\u0738\u073a\5\u0126\u0094\2\u0739\u073b"+
		"\7\3\2\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u0744\3\2\2\2\u073c"+
		"\u073d\f\3\2\2\u073d\u073e\7r\2\2\u073e\u0740\5\u0126\u0094\2\u073f\u0741"+
		"\7\3\2\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0743\3\2\2\2\u0742"+
		"\u073c\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2"+
		"\2\2\u0745\u0125\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0749\5\u00bc_\2\u0748"+
		"\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u075d\5\u012a"+
		"\u0096\2\u074b\u074d\5\u00bc_\2\u074c\u074b\3\2\2\2\u074c\u074d\3\2\2"+
		"\2\u074d\u074e\3\2\2\2\u074e\u0750\7H\2\2\u074f\u0751\5\u012c\u0097\2"+
		"\u0750\u074f\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u075d"+
		"\5\u012a\u0096\2\u0753\u0755\5\u00bc_\2\u0754\u0753\3\2\2\2\u0754\u0755"+
		"\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0758\5\u012c\u0097\2\u0757\u0759\7"+
		"H\2\2\u0758\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075a\3\2\2\2\u075a"+
		"\u075b\5\u012a\u0096\2\u075b\u075d\3\2\2\2\u075c\u0748\3\2\2\2\u075c\u074c"+
		"\3\2\2\2\u075c\u0754\3\2\2\2\u075d\u0127\3\2\2\2\u075e\u0760\5\f\7\2\u075f"+
		"\u075e\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0762\5\u0108"+
		"\u0085\2\u0762\u0129\3\2\2\2\u0763\u0764\5\u0128\u0095\2\u0764\u012b\3"+
		"\2\2\2\u0765\u0766\t\13\2\2\u0766\u012d\3\2\2\2\u0767\u0768\7\60\2\2\u0768"+
		"\u0769\5\u0130\u0099\2\u0769\u012f\3\2\2\2\u076a\u076c\5\u008aF\2\u076b"+
		"\u076d\5\u0132\u009a\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u0131"+
		"\3\2\2\2\u076e\u0770\5\u00dep\2\u076f\u0771\5\u0132\u009a\2\u0770\u076f"+
		"\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0133\3\2\2\2\u0772\u0773\7v\2\2\u0773"+
		"\u0774\5\u0136\u009c\2\u0774\u0135\3\2\2\2\u0775\u0777\5\u0138\u009d\2"+
		"\u0776\u0778\7\3\2\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0781"+
		"\3\2\2\2\u0779\u077b\5\u0138\u009d\2\u077a\u077c\7\3\2\2\u077b\u077a\3"+
		"\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u077e\7r\2\2\u077e"+
		"\u077f\5\u0136\u009c\2\u077f\u0781\3\2\2\2\u0780\u0775\3\2\2\2\u0780\u0779"+
		"\3\2\2\2\u0781\u0137\3\2\2\2\u0782\u0783\5\u013a\u009e\2\u0783\u0785\7"+
		"K\2\2\u0784\u0786\5\36\20\2\u0785\u0784\3\2\2\2\u0785\u0786\3\2\2\2\u0786"+
		"\u0787\3\2\2\2\u0787\u0788\7L\2\2\u0788\u078d\3\2\2\2\u0789\u078a\5\u013a"+
		"\u009e\2\u078a\u078b\5\u0106\u0084\2\u078b\u078d\3\2\2\2\u078c\u0782\3"+
		"\2\2\2\u078c\u0789\3\2\2\2\u078d\u0139\3\2\2\2\u078e\u0791\5\u0128\u0095"+
		"\2\u078f\u0791\7{\2\2\u0790\u078e\3\2\2\2\u0790\u078f\3\2\2\2\u0791\u013b"+
		"\3\2\2\2\u0792\u0793\7\60\2\2\u0793\u0794\5\u0158\u00ad\2\u0794\u013d"+
		"\3\2\2\2\u0795\u0796\7\60\2\2\u0796\u0797\7\u0084\2\2\u0797\u079b\7{\2"+
		"\2\u0798\u0799\7\60\2\2\u0799\u079b\7\u0087\2\2\u079a\u0795\3\2\2\2\u079a"+
		"\u0798\3\2\2\2\u079b\u013f\3\2\2\2\u079c\u079e\7\23\2\2\u079d\u079f\7"+
		"\3\2\2\u079e\u079d\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a1\3\2\2\2\u07a0"+
		"\u07a2\7{\2\2\u07a1\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07b7\3\2"+
		"\2\2\u07a3\u07a5\7\23\2\2\u07a4\u07a6\7{\2\2\u07a5\u07a4\3\2\2\2\u07a5"+
		"\u07a6\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a8\7[\2\2\u07a8\u07b7\5\u00e8"+
		"u\2\u07a9\u07ab\7D\2\2\u07aa\u07ac\7\3\2\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac"+
		"\3\2\2\2\u07ac\u07ae\3\2\2\2\u07ad\u07af\7{\2\2\u07ae\u07ad\3\2\2\2\u07ae"+
		"\u07af\3\2\2\2\u07af\u07b7\3\2\2\2\u07b0\u07b2\7D\2\2\u07b1\u07b3\7{\2"+
		"\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5"+
		"\7[\2\2\u07b5\u07b7\5\u00e8u\2\u07b6\u079c\3\2\2\2\u07b6\u07a3\3\2\2\2"+
		"\u07b6\u07a9\3\2\2\2\u07b6\u07b0\3\2\2\2\u07b7\u0141\3\2\2\2\u07b8\u07b9"+
		"\7D\2\2\u07b9\u07ba\5\f\7\2\u07ba\u07bb\7{\2\2\u07bb\u0143\3\2\2\2\u07bc"+
		"\u07bd\7A\2\2\u07bd\u07be\5\\/\2\u07be\u07bf\5\u0148\u00a5\2\u07bf\u0145"+
		"\3\2\2\2\u07c0\u07c2\7A\2\2\u07c1\u07c3\5\u0134\u009b\2\u07c2\u07c1\3"+
		"\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c5\5\\/\2\u07c5"+
		"\u07c6\5\u0148\u00a5\2\u07c6\u0147\3\2\2\2\u07c7\u07c9\5\u014a\u00a6\2"+
		"\u07c8\u07ca\5\u0148\u00a5\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca"+
		"\u0149\3\2\2\2\u07cb\u07cc\7\17\2\2\u07cc\u07cd\7K\2\2\u07cd\u07ce\5\u014c"+
		"\u00a7\2\u07ce\u07cf\7L\2\2\u07cf\u07d0\5\\/\2\u07d0\u014b\3\2\2\2\u07d1"+
		"\u07d3\5\u00bc_\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d4"+
		"\3\2\2\2\u07d4\u07d5\5\u008aF\2\u07d5\u07d6\5\u00d4k\2\u07d6\u07e0\3\2"+
		"\2\2\u07d7\u07d9\5\u00bc_\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9"+
		"\u07da\3\2\2\2\u07da\u07dc\5\u008aF\2\u07db\u07dd\5\u00eav\2\u07dc\u07db"+
		"\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07e0\3\2\2\2\u07de\u07e0\7\3\2\2\u07df"+
		"\u07d2\3\2\2\2\u07df\u07d8\3\2\2\2\u07df\u07de\3\2\2\2\u07e0\u014d\3\2"+
		"\2\2\u07e1\u07e3\7?\2\2\u07e2\u07e4\5N(\2\u07e3\u07e2\3\2\2\2\u07e3\u07e4"+
		"\3\2\2\2\u07e4\u014f\3\2\2\2\u07e5\u07e8\5\u0152\u00aa\2\u07e6\u07e8\5"+
		"\u0156\u00ac\2\u07e7\u07e5\3\2\2\2\u07e7\u07e6\3\2\2\2\u07e8\u0151\3\2"+
		"\2\2\u07e9\u07ea\7?\2\2\u07ea\u07ec\7K\2\2\u07eb\u07ed\5\u0154\u00ab\2"+
		"\u07ec\u07eb\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef"+
		"\7L\2\2\u07ef\u0153\3\2\2\2\u07f0\u07f1\b\u00ab\1\2\u07f1\u07f3\5\u00e8"+
		"u\2\u07f2\u07f4\7\3\2\2\u07f3\u07f2\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4"+
		"\u07fd\3\2\2\2\u07f5\u07f6\f\3\2\2\u07f6\u07f7\7r\2\2\u07f7\u07f9\5\u00e8"+
		"u\2\u07f8\u07fa\7\3\2\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa"+
		"\u07fc\3\2\2\2\u07fb\u07f5\3\2\2\2\u07fc\u07ff\3\2\2\2\u07fd\u07fb\3\2"+
		"\2\2\u07fd\u07fe\3\2\2\2\u07fe\u0155\3\2\2\2\u07ff\u07fd\3\2\2\2\u0800"+
		"\u0801\7.\2\2\u0801\u0802\7K\2\2\u0802\u0803\5T+\2\u0803\u0804\7L\2\2"+
		"\u0804\u0807\3\2\2\2\u0805\u0807\7.\2\2\u0806\u0800\3\2\2\2\u0806\u0805"+
		"\3\2\2\2\u0807\u0157\3\2\2\2\u0808\u083c\7-\2\2\u0809\u083c\7\31\2\2\u080a"+
		"\u080b\7-\2\2\u080b\u080c\7M\2\2\u080c\u083c\7N\2\2\u080d\u080e\7\31\2"+
		"\2\u080e\u080f\7M\2\2\u080f\u083c\7N\2\2\u0810\u083c\7Q\2\2\u0811\u083c"+
		"\7R\2\2\u0812\u083c\7S\2\2\u0813\u083c\7T\2\2\u0814\u083c\7U\2\2\u0815"+
		"\u083c\7V\2\2\u0816\u083c\7W\2\2\u0817\u083c\7X\2\2\u0818\u083c\7Y\2\2"+
		"\u0819\u083c\7\4\2\2\u081a\u083c\7\5\2\2\u081b\u083c\7[\2\2\u081c\u083c"+
		"\7\\\2\2\u081d\u083c\7]\2\2\u081e\u083c\7^\2\2\u081f\u083c\7_\2\2\u0820"+
		"\u083c\7`\2\2\u0821\u083c\7a\2\2\u0822\u083c\7b\2\2\u0823\u083c\7c\2\2"+
		"\u0824\u083c\7d\2\2\u0825\u083c\7e\2\2\u0826\u083c\7f\2\2\u0827\u083c"+
		"\7g\2\2\u0828\u083c\7i\2\2\u0829\u083c\7h\2\2\u082a\u083c\7j\2\2\u082b"+
		"\u083c\7k\2\2\u082c\u083c\7l\2\2\u082d\u083c\7m\2\2\u082e\u083c\7\6\2"+
		"\2\u082f\u083c\7\7\2\2\u0830\u083c\7\b\2\2\u0831\u083c\7\t\2\2\u0832\u083c"+
		"\7p\2\2\u0833\u083c\7q\2\2\u0834\u083c\7r\2\2\u0835\u083c\7s\2\2\u0836"+
		"\u083c\7t\2\2\u0837\u0838\7K\2\2\u0838\u083c\7L\2\2\u0839\u083a\7M\2\2"+
		"\u083a\u083c\7N\2\2\u083b\u0808\3\2\2\2\u083b\u0809\3\2\2\2\u083b\u080a"+
		"\3\2\2\2\u083b\u080d\3\2\2\2\u083b\u0810\3\2\2\2\u083b\u0811\3\2\2\2\u083b"+
		"\u0812\3\2\2\2\u083b\u0813\3\2\2\2\u083b\u0814\3\2\2\2\u083b\u0815\3\2"+
		"\2\2\u083b\u0816\3\2\2\2\u083b\u0817\3\2\2\2\u083b\u0818\3\2\2\2\u083b"+
		"\u0819\3\2\2\2\u083b\u081a\3\2\2\2\u083b\u081b\3\2\2\2\u083b\u081c\3\2"+
		"\2\2\u083b\u081d\3\2\2\2\u083b\u081e\3\2\2\2\u083b\u081f\3\2\2\2\u083b"+
		"\u0820\3\2\2\2\u083b\u0821\3\2\2\2\u083b\u0822\3\2\2\2\u083b\u0823\3\2"+
		"\2\2\u083b\u0824\3\2\2\2\u083b\u0825\3\2\2\2\u083b\u0826\3\2\2\2\u083b"+
		"\u0827\3\2\2\2\u083b\u0828\3\2\2\2\u083b\u0829\3\2\2\2\u083b\u082a\3\2"+
		"\2\2\u083b\u082b\3\2\2\2\u083b\u082c\3\2\2\2\u083b\u082d\3\2\2\2\u083b"+
		"\u082e\3\2\2\2\u083b\u082f\3\2\2\2\u083b\u0830\3\2\2\2\u083b\u0831\3\2"+
		"\2\2\u083b\u0832\3\2\2\2\u083b\u0833\3\2\2\2\u083b\u0834\3\2\2\2\u083b"+
		"\u0835\3\2\2\2\u083b\u0836\3\2\2\2\u083b\u0837\3\2\2\2\u083b\u0839\3\2"+
		"\2\2\u083c\u0159\3\2\2\2\u083d\u0845\7|\2\2\u083e\u0845\7\u0082\2\2\u083f"+
		"\u0845\7\u0083\2\2\u0840\u0845\7\u0084\2\2\u0841\u0845\5\u015c\u00af\2"+
		"\u0842\u0845\5\u015e\u00b0\2\u0843\u0845\5\u0160\u00b1\2\u0844\u083d\3"+
		"\2\2\2\u0844\u083e\3\2\2\2\u0844\u083f\3\2\2\2\u0844\u0840\3\2\2\2\u0844"+
		"\u0841\3\2\2\2\u0844\u0842\3\2\2\2\u0844\u0843\3\2\2\2\u0845\u015b\3\2"+
		"\2\2\u0846\u0847\t\f\2\2\u0847\u015d\3\2\2\2\u0848\u0849\7/\2\2\u0849"+
		"\u015f\3\2\2\2\u084a\u084b\t\r\2\2\u084b\u0161\3\2\2\2\u0116\u0163\u016d"+
		"\u0186\u0191\u019b\u01a2\u01aa\u01b0\u01b4\u01b9\u01bf\u01c6\u01cd\u01d4"+
		"\u0208\u0217\u0224\u0226\u0230\u0238\u023c\u023f\u0243\u0247\u024a\u024e"+
		"\u0254\u0256\u025e\u0262\u0265\u026c\u0273\u0277\u027c\u0280\u0283\u0288"+
		"\u028e\u029b\u02a6\u02a8\u02b7\u02b9\u02c5\u02c7\u02d3\u02e7\u02e9\u02f5"+
		"\u02f7\u0302\u030d\u0318\u0324\u0326\u0332\u0334\u033e\u0346\u0352\u0359"+
		"\u035d\u0361\u0365\u0369\u036e\u0371\u0374\u037a\u0382\u0387\u038a\u0390"+
		"\u039b\u03b2\u03b6\u03be\u03c4\u03d8\u03dc\u03e9\u03ed\u03f0\u03f7\u03ff"+
		"\u0409\u0414\u041d\u0423\u0426\u0429\u042e\u0433\u0440\u0444\u0449\u0454"+
		"\u045a\u045e\u0463\u0467\u046c\u046f\u047f\u0484\u0488\u048b\u0491\u0494"+
		"\u049b\u04a5\u04a9\u04ac\u04af\u04b3\u04b8\u04ba\u04be\u04c2\u04cb\u04d8"+
		"\u04e0\u04e8\u04ec\u04ef\u04f8\u0501\u0509\u050c\u0512\u051d\u0520\u0525"+
		"\u052e\u0534\u053d\u0548\u054d\u0552\u0559\u055b\u0560\u0564\u0572\u0578"+
		"\u0587\u0591\u0596\u059d\u05a3\u05a8\u05ae\u05b5\u05b9\u05bb\u05bd\u05c4"+
		"\u05c7\u05ca\u05cd\u05d2\u05d6\u05d9\u05dd\u05e1\u05e6\u05e9\u05eb\u05ef"+
		"\u05f6\u05fc\u0600\u0606\u060b\u060d\u0613\u0617\u061d\u0624\u0628\u062a"+
		"\u062c\u0633\u063d\u0641\u0643\u0645\u0649\u064c\u0652\u065c\u0660\u0666"+
		"\u066e\u0672\u0675\u0679\u067e\u0681\u0684\u0688\u068d\u0697\u069e\u06a3"+
		"\u06a7\u06ac\u06b2\u06b6\u06bc\u06c2\u06c9\u06cf\u06d3\u06d6\u06da\u06dd"+
		"\u06df\u06e2\u06ec\u06f1\u06f3\u06f6\u06f9\u06fc\u0702\u070c\u0711\u0714"+
		"\u0718\u071b\u071e\u0722\u072b\u073a\u0740\u0744\u0748\u074c\u0750\u0754"+
		"\u0758\u075c\u075f\u076c\u0770\u0777\u077b\u0780\u0785\u078c\u0790\u079a"+
		"\u079e\u07a1\u07a5\u07ab\u07ae\u07b2\u07b6\u07c2\u07c9\u07d2\u07d8\u07dc"+
		"\u07df\u07e3\u07e7\u07ec\u07f3\u07f9\u07fd\u0806\u083b\u0844";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}