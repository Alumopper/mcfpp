// Generated from java-escape by ANTLR 4.11.1

package top.alumopper.mcfpp.lib;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class mcfppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, OrgCommand=36, TargetSelector=37, 
		THIS=38, SUPER=39, IF=40, ELSE=41, WHILE=42, FOR=43, DO=44, TRY=45, STORE=46, 
		BREAK=47, CONTINUE=48, STATIC=49, EXTENDS=50, NATIVE=51, CONCRETE=52, 
		FINAL=53, PUBLIC=54, PROTECTED=55, PRIVATE=56, InsideClass=57, INT=58, 
		DECIMAL=59, VEC=60, WAVE=61, Identifier=62, ClassIdentifier=63, NORMALSTRING=64, 
		STRING=65, WS=66, COMMENT=67, LINE_COMMENT=68;
	public static final int
		RULE_compilationUnit = 0, RULE_namespaceDeclaration = 1, RULE_typeDeclaration = 2, 
		RULE_classOrFunctionDeclaration = 3, RULE_classDeclaration = 4, RULE_nativeClassDeclaration = 5, 
		RULE_classBody = 6, RULE_staticClassMemberDeclaration = 7, RULE_classMemberDeclaration = 8, 
		RULE_classMember = 9, RULE_classFunctionDeclaration = 10, RULE_functionDeclaration = 11, 
		RULE_namespaceID = 12, RULE_nativeFuncDeclaration = 13, RULE_javaRefer = 14, 
		RULE_stringName = 15, RULE_accessModifier = 16, RULE_constructorDeclaration = 17, 
		RULE_nativeConstructorDeclaration = 18, RULE_constructorCall = 19, RULE_fieldDeclaration = 20, 
		RULE_parameterList = 21, RULE_parameter = 22, RULE_expression = 23, RULE_statementExpression = 24, 
		RULE_conditionalExpression = 25, RULE_conditionalOrExpression = 26, RULE_conditionalAndExpression = 27, 
		RULE_equalityExpression = 28, RULE_relationalExpression = 29, RULE_relationalOp = 30, 
		RULE_additiveExpression = 31, RULE_multiplicativeExpression = 32, RULE_unaryExpression = 33, 
		RULE_basicExpression = 34, RULE_castExpression = 35, RULE_primary = 36, 
		RULE_varWithSelector = 37, RULE_var = 38, RULE_identifierSuffix = 39, 
		RULE_selector = 40, RULE_arguments = 41, RULE_functionBody = 42, RULE_functionCall = 43, 
		RULE_statement = 44, RULE_orgCommand = 45, RULE_controlStatement = 46, 
		RULE_ifStatement = 47, RULE_elseIfStatement = 48, RULE_ifBlock = 49, RULE_forStatement = 50, 
		RULE_forBlock = 51, RULE_forControl = 52, RULE_forInit = 53, RULE_forUpdate = 54, 
		RULE_whileStatement = 55, RULE_whileBlock = 56, RULE_doWhileStatement = 57, 
		RULE_doWhileBlock = 58, RULE_selfAddOrMinusStatement = 59, RULE_tryStoreStatement = 60, 
		RULE_block = 61, RULE_selfAddOrMinusExpression = 62, RULE_expressionList = 63, 
		RULE_type = 64, RULE_value = 65, RULE_className = 66, RULE_functionTag = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "namespaceDeclaration", "typeDeclaration", "classOrFunctionDeclaration", 
			"classDeclaration", "nativeClassDeclaration", "classBody", "staticClassMemberDeclaration", 
			"classMemberDeclaration", "classMember", "classFunctionDeclaration", 
			"functionDeclaration", "namespaceID", "nativeFuncDeclaration", "javaRefer", 
			"stringName", "accessModifier", "constructorDeclaration", "nativeConstructorDeclaration", 
			"constructorCall", "fieldDeclaration", "parameterList", "parameter", 
			"expression", "statementExpression", "conditionalExpression", "conditionalOrExpression", 
			"conditionalAndExpression", "equalityExpression", "relationalExpression", 
			"relationalOp", "additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"basicExpression", "castExpression", "primary", "varWithSelector", "var", 
			"identifierSuffix", "selector", "arguments", "functionBody", "functionCall", 
			"statement", "orgCommand", "controlStatement", "ifStatement", "elseIfStatement", 
			"ifBlock", "forStatement", "forBlock", "forControl", "forInit", "forUpdate", 
			"whileStatement", "whileBlock", "doWhileStatement", "doWhileBlock", "selfAddOrMinusStatement", 
			"tryStoreStatement", "block", "selfAddOrMinusExpression", "expressionList", 
			"type", "value", "className", "functionTag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'namespace'", "';'", "'class'", "'->'", "'{'", "'}'", "'func'", 
			"'('", "')'", "':'", "'.'", "'new'", "'='", "','", "'?'", "'||'", "'&&'", 
			"'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'!'", "'['", "']'", "'++'", "'--'", "'int'", "'bool'", null, 
			null, "'this'", "'super'", "'if'", "'else'", "'while'", "'for'", "'do'", 
			"'try'", "'store'", "'break'", "'continue'", "'static'", "'extends'", 
			"'native'", "'concrete'", "'final '", "'public'", "'protected'", "'private'", 
			null, null, null, "'vec'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"OrgCommand", "TargetSelector", "THIS", "SUPER", "IF", "ELSE", "WHILE", 
			"FOR", "DO", "TRY", "STORE", "BREAK", "CONTINUE", "STATIC", "EXTENDS", 
			"NATIVE", "CONCRETE", "FINAL", "PUBLIC", "PROTECTED", "PRIVATE", "InsideClass", 
			"INT", "DECIMAL", "VEC", "WAVE", "Identifier", "ClassIdentifier", "NORMALSTRING", 
			"STRING", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mcfppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mcfppParser.EOF, 0); }
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(136);
				namespaceDeclaration();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4749608757015609480L) != 0) {
				{
				{
				setState(139);
				typeDeclaration();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__0);
			setState(148);
			match(Identifier);
			setState(149);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrFunctionDeclarationContext classOrFunctionDeclaration() {
			return getRuleContext(ClassOrFunctionDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			classOrFunctionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrFunctionDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public NativeFuncDeclarationContext nativeFuncDeclaration() {
			return getRuleContext(NativeFuncDeclarationContext.class,0);
		}
		public NativeClassDeclarationContext nativeClassDeclaration() {
			return getRuleContext(NativeClassDeclarationContext.class,0);
		}
		public ClassOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterClassOrFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitClassOrFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitClassOrFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrFunctionDeclarationContext classOrFunctionDeclaration() throws RecognitionException {
		ClassOrFunctionDeclarationContext _localctx = new ClassOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classOrFunctionDeclaration);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				nativeFuncDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				nativeClassDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(mcfppParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(mcfppParser.FINAL, 0); }
		public TerminalNode EXTENDS() { return getToken(mcfppParser.EXTENDS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(159);
				match(STATIC);
				}
			}

			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(162);
				match(FINAL);
				}
			}

			setState(165);
			match(T__2);
			setState(166);
			className();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(167);
				match(EXTENDS);
				setState(168);
				className();
				}
			}

			setState(171);
			classBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NativeClassDeclarationContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(mcfppParser.NATIVE, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public JavaReferContext javaRefer() {
			return getRuleContext(JavaReferContext.class,0);
		}
		public NativeClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterNativeClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitNativeClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitNativeClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeClassDeclarationContext nativeClassDeclaration() throws RecognitionException {
		NativeClassDeclarationContext _localctx = new NativeClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nativeClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(NATIVE);
			setState(174);
			match(T__2);
			setState(175);
			className();
			setState(176);
			match(T__3);
			setState(177);
			javaRefer();
			setState(178);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
		}
		public List<StaticClassMemberDeclarationContext> staticClassMemberDeclaration() {
			return getRuleContexts(StaticClassMemberDeclarationContext.class);
		}
		public StaticClassMemberDeclarationContext staticClassMemberDeclaration(int i) {
			return getRuleContext(StaticClassMemberDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__4);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4338655239478443904L) != 0) {
				{
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(181);
					classMemberDeclaration();
					}
					break;
				case 2:
					{
					setState(182);
					staticClassMemberDeclaration();
					}
					break;
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StaticClassMemberDeclarationContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(mcfppParser.STATIC, 0); }
		public ClassMemberContext classMember() {
			return getRuleContext(ClassMemberContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public StaticClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticClassMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterStaticClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitStaticClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitStaticClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticClassMemberDeclarationContext staticClassMemberDeclaration() throws RecognitionException {
		StaticClassMemberDeclarationContext _localctx = new StaticClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_staticClassMemberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0) {
				{
				setState(190);
				accessModifier();
				}
			}

			setState(193);
			match(STATIC);
			setState(194);
			classMember();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassMemberContext classMember() {
			return getRuleContext(ClassMemberContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(196);
				accessModifier();
				}
				break;
			}
			setState(199);
			classMember();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassFunctionDeclarationContext classFunctionDeclaration() {
			return getRuleContext(ClassFunctionDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public NativeFuncDeclarationContext nativeFuncDeclaration() {
			return getRuleContext(NativeFuncDeclarationContext.class,0);
		}
		public NativeConstructorDeclarationContext nativeConstructorDeclaration() {
			return getRuleContext(NativeConstructorDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classMember);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				classFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				fieldDeclaration();
				setState(203);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				nativeFuncDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				nativeConstructorDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ClassFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterClassFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitClassFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitClassFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFunctionDeclarationContext classFunctionDeclaration() throws RecognitionException {
		ClassFunctionDeclarationContext _localctx = new ClassFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__6);
			setState(211);
			match(Identifier);
			setState(212);
			match(T__7);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(213);
				parameterList();
				}
			}

			setState(216);
			match(T__8);
			setState(217);
			match(T__4);
			setState(218);
			functionBody();
			setState(219);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public NamespaceIDContext namespaceID() {
			return getRuleContext(NamespaceIDContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionTagContext functionTag() {
			return getRuleContext(FunctionTagContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(221);
				functionTag();
				}
			}

			setState(224);
			match(T__6);
			setState(225);
			namespaceID();
			setState(226);
			match(T__7);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(227);
				parameterList();
				}
			}

			setState(230);
			match(T__8);
			setState(231);
			match(T__4);
			setState(232);
			functionBody();
			setState(233);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceIDContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(mcfppParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(mcfppParser.Identifier, i);
		}
		public NamespaceIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterNamespaceID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitNamespaceID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitNamespaceID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceIDContext namespaceID() throws RecognitionException {
		NamespaceIDContext _localctx = new NamespaceIDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namespaceID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(235);
				match(Identifier);
				setState(236);
				match(T__9);
				}
				break;
			}
			setState(239);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NativeFuncDeclarationContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(mcfppParser.NATIVE, 0); }
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public JavaReferContext javaRefer() {
			return getRuleContext(JavaReferContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public NativeFuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeFuncDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterNativeFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitNativeFuncDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitNativeFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeFuncDeclarationContext nativeFuncDeclaration() throws RecognitionException {
		NativeFuncDeclarationContext _localctx = new NativeFuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nativeFuncDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0) {
				{
				setState(241);
				accessModifier();
				}
			}

			setState(244);
			match(NATIVE);
			setState(245);
			match(T__6);
			setState(246);
			match(Identifier);
			setState(247);
			match(T__7);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(248);
				parameterList();
				}
			}

			setState(251);
			match(T__8);
			setState(252);
			match(T__3);
			setState(253);
			javaRefer();
			setState(254);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JavaReferContext extends ParserRuleContext {
		public List<StringNameContext> stringName() {
			return getRuleContexts(StringNameContext.class);
		}
		public StringNameContext stringName(int i) {
			return getRuleContext(StringNameContext.class,i);
		}
		public JavaReferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaRefer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterJavaRefer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitJavaRefer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitJavaRefer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaReferContext javaRefer() throws RecognitionException {
		JavaReferContext _localctx = new JavaReferContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_javaRefer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			stringName();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(257);
				match(T__10);
				setState(258);
				stringName();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public TerminalNode ClassIdentifier() { return getToken(mcfppParser.ClassIdentifier, 0); }
		public TerminalNode NORMALSTRING() { return getToken(mcfppParser.NORMALSTRING, 0); }
		public StringNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterStringName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitStringName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitStringName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringNameContext stringName() throws RecognitionException {
		StringNameContext _localctx = new StringNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 7L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(mcfppParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(mcfppParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(mcfppParser.PUBLIC, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			className();
			setState(269);
			match(T__7);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(270);
				parameterList();
				}
			}

			setState(273);
			match(T__8);
			setState(274);
			match(T__4);
			setState(275);
			functionBody();
			setState(276);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NativeConstructorDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public JavaReferContext javaRefer() {
			return getRuleContext(JavaReferContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(mcfppParser.NATIVE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public NativeConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterNativeConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitNativeConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitNativeConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeConstructorDeclarationContext nativeConstructorDeclaration() throws RecognitionException {
		NativeConstructorDeclarationContext _localctx = new NativeConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nativeConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0) {
				{
				setState(278);
				accessModifier();
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(281);
				match(NATIVE);
				}
			}

			setState(284);
			className();
			setState(285);
			match(T__7);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(286);
				parameterList();
				}
			}

			setState(289);
			match(T__8);
			setState(290);
			match(T__3);
			setState(291);
			javaRefer();
			setState(292);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorCallContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__11);
			setState(295);
			className();
			setState(296);
			arguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldDeclaration);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				type();
				setState(299);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				type();
				setState(302);
				match(Identifier);
				setState(303);
				match(T__12);
				setState(304);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			parameter();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(309);
				match(T__13);
				setState(310);
				parameter();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public TerminalNode STATIC() { return getToken(mcfppParser.STATIC, 0); }
		public TerminalNode CONCRETE() { return getToken(mcfppParser.CONCRETE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(316);
				match(STATIC);
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCRETE) {
				{
				setState(319);
				match(CONCRETE);
				}
			}

			setState(322);
			type();
			setState(323);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			conditionalOrExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionContext extends ParserRuleContext {
		public VarWithSelectorContext varWithSelector() {
			return getRuleContext(VarWithSelectorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			varWithSelector();
			setState(328);
			match(T__12);
			setState(329);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			conditionalOrExpression();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(332);
				match(T__14);
				setState(333);
				expression();
				setState(334);
				match(T__9);
				setState(335);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			conditionalAndExpression();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(340);
				match(T__15);
				setState(341);
				conditionalAndExpression();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			equalityExpression();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(348);
				match(T__16);
				setState(349);
				equalityExpression();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public Token op;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			relationalExpression();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(356);
				((EqualityExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(357);
				relationalExpression();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public RelationalOpContext relationalOp() {
			return getRuleContext(RelationalOpContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			additiveExpression();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0) {
				{
				setState(364);
				relationalOp();
				setState(365);
				additiveExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Token op;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			multiplicativeExpression();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==T__24) {
				{
				{
				setState(372);
				((AdditiveExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
					((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(373);
				multiplicativeExpression();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Token op;
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			unaryExpression();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) {
				{
				{
				setState(380);
				((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
					((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(381);
				unaryExpression();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unaryExpression);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T__28);
				setState(388);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				basicExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BasicExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public VarWithSelectorContext varWithSelector() {
			return getRuleContext(VarWithSelectorContext.class,0);
		}
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterBasicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitBasicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitBasicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicExpressionContext basicExpression() throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_basicExpression);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				varWithSelector();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__7);
			setState(398);
			type();
			setState(399);
			match(T__8);
			setState(400);
			unaryExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primary);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__11:
			case TargetSelector:
			case THIS:
			case SUPER:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				var();
				}
				break;
			case INT:
			case DECIMAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarWithSelectorContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public VarWithSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varWithSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterVarWithSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitVarWithSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitVarWithSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarWithSelectorContext varWithSelector() throws RecognitionException {
		VarWithSelectorContext _localctx = new VarWithSelectorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_varWithSelector);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				var();
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(407);
					selector();
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				className();
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(414);
					selector();
					}
					}
					setState(417); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public List<IdentifierSuffixContext> identifierSuffix() {
			return getRuleContexts(IdentifierSuffixContext.class);
		}
		public IdentifierSuffixContext identifierSuffix(int i) {
			return getRuleContext(IdentifierSuffixContext.class,i);
		}
		public TerminalNode THIS() { return getToken(mcfppParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(mcfppParser.SUPER, 0); }
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public TerminalNode TargetSelector() { return getToken(mcfppParser.TargetSelector, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_var);
		int _la;
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(T__7);
				setState(422);
				expression();
				setState(423);
				match(T__8);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(Identifier);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(426);
					identifierSuffix();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				match(SUPER);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				constructorCall();
				}
				break;
			case TargetSelector:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				match(TargetSelector);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierSuffixContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public IdentifierSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterIdentifierSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitIdentifierSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitIdentifierSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_identifierSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__29);
			setState(439);
			conditionalExpression();
			setState(440);
			match(T__30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__10);
			setState(443);
			var();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__7);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 202099037038444561L) != 0) {
				{
				setState(446);
				expressionList();
				}
			}

			setState(449);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -5512283352649956287L) != 0) {
				{
				{
				setState(451);
				statement();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public NamespaceIDContext namespaceID() {
			return getRuleContext(NamespaceIDContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode THIS() { return getToken(mcfppParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(mcfppParser.SUPER, 0); }
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionCall);
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				namespaceID();
				setState(458);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(THIS);
				setState(461);
				arguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(SUPER);
				setState(463);
				arguments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				basicExpression();
				setState(465);
				arguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public SelfAddOrMinusStatementContext selfAddOrMinusStatement() {
			return getRuleContext(SelfAddOrMinusStatementContext.class,0);
		}
		public TryStoreStatementContext tryStoreStatement() {
			return getRuleContext(TryStoreStatementContext.class,0);
		}
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public OrgCommandContext orgCommand() {
			return getRuleContext(OrgCommandContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				fieldDeclaration();
				setState(470);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				statementExpression();
				setState(473);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				functionCall();
				setState(476);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(481);
				doWhileStatement();
				setState(482);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(484);
				match(T__1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(485);
				selfAddOrMinusStatement();
				setState(486);
				match(T__1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(488);
				tryStoreStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(489);
				controlStatement();
				setState(490);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(492);
				orgCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrgCommandContext extends ParserRuleContext {
		public TerminalNode OrgCommand() { return getToken(mcfppParser.OrgCommand, 0); }
		public OrgCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orgCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterOrgCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitOrgCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitOrgCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrgCommandContext orgCommand() throws RecognitionException {
		OrgCommandContext _localctx = new OrgCommandContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_orgCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(OrgCommand);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControlStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(mcfppParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(mcfppParser.CONTINUE, 0); }
		public ControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStatementContext controlStatement() throws RecognitionException {
		ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_controlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(mcfppParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(mcfppParser.ELSE, 0); }
		public ElseIfStatementContext elseIfStatement() {
			return getRuleContext(ElseIfStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(IF);
			setState(500);
			match(T__7);
			setState(501);
			expression();
			setState(502);
			match(T__8);
			setState(503);
			ifBlock();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(504);
				match(ELSE);
				setState(507);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(505);
					elseIfStatement();
					}
					break;
				case T__4:
					{
					setState(506);
					ifBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			ifStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(mcfppParser.FOR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(FOR);
			setState(516);
			match(T__7);
			setState(517);
			forControl();
			setState(518);
			match(T__8);
			setState(519);
			forBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public List<ForInitContext> forInit() {
			return getRuleContexts(ForInitContext.class);
		}
		public ForInitContext forInit(int i) {
			return getRuleContext(ForInitContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4467569816739245824L) != 0) {
				{
				{
				setState(523);
				forInit();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(T__1);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 202099037038444561L) != 0) {
				{
				setState(530);
				expression();
				}
			}

			setState(533);
			match(T__1);
			setState(534);
			forUpdate();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_forInit);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				statementExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4467569868278853376L) != 0) {
				{
				{
				setState(540);
				statementExpression();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(mcfppParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(WHILE);
			setState(547);
			match(T__7);
			setState(548);
			expression();
			setState(549);
			match(T__8);
			setState(550);
			whileBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(mcfppParser.DO, 0); }
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(mcfppParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(DO);
			setState(555);
			doWhileBlock();
			setState(556);
			match(WHILE);
			setState(557);
			match(T__7);
			setState(558);
			expression();
			setState(559);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfAddOrMinusStatementContext extends ParserRuleContext {
		public SelfAddOrMinusExpressionContext selfAddOrMinusExpression() {
			return getRuleContext(SelfAddOrMinusExpressionContext.class,0);
		}
		public SelfAddOrMinusStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfAddOrMinusStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterSelfAddOrMinusStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitSelfAddOrMinusStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitSelfAddOrMinusStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfAddOrMinusStatementContext selfAddOrMinusStatement() throws RecognitionException {
		SelfAddOrMinusStatementContext _localctx = new SelfAddOrMinusStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_selfAddOrMinusStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			selfAddOrMinusExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryStoreStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(mcfppParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STORE() { return getToken(mcfppParser.STORE, 0); }
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public TryStoreStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStoreStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterTryStoreStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitTryStoreStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitTryStoreStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStoreStatementContext tryStoreStatement() throws RecognitionException {
		TryStoreStatementContext _localctx = new TryStoreStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_tryStoreStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(TRY);
			setState(566);
			block();
			setState(567);
			match(STORE);
			setState(568);
			match(T__7);
			setState(569);
			match(Identifier);
			setState(570);
			match(T__8);
			setState(571);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__4);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -5512283352649956287L) != 0) {
				{
				{
				setState(574);
				statement();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfAddOrMinusExpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public SelfAddOrMinusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfAddOrMinusExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterSelfAddOrMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitSelfAddOrMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitSelfAddOrMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfAddOrMinusExpressionContext selfAddOrMinusExpression() throws RecognitionException {
		SelfAddOrMinusExpressionContext _localctx = new SelfAddOrMinusExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_selfAddOrMinusExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(Identifier);
			setState(583);
			((SelfAddOrMinusExpressionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
				((SelfAddOrMinusExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			expression();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(586);
				match(T__13);
				setState(587);
				expression();
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_type);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(T__34);
				}
				break;
			case InsideClass:
			case Identifier:
			case ClassIdentifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				className();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(mcfppParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(mcfppParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(mcfppParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 131L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ClassIdentifier() { return getToken(mcfppParser.ClassIdentifier, 0); }
		public TerminalNode Identifier() { return getToken(mcfppParser.Identifier, 0); }
		public TerminalNode InsideClass() { return getToken(mcfppParser.InsideClass, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_className);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(600);
					match(Identifier);
					setState(601);
					match(T__9);
					}
				}

				setState(604);
				match(ClassIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(605);
					match(Identifier);
					setState(606);
					match(T__9);
					}
				}

				setState(609);
				match(InsideClass);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTagContext extends ParserRuleContext {
		public NamespaceIDContext namespaceID() {
			return getRuleContext(NamespaceIDContext.class,0);
		}
		public FunctionTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterFunctionTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitFunctionTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitFunctionTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTagContext functionTag() throws RecognitionException {
		FunctionTagContext _localctx = new FunctionTagContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			namespaceID();
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

	public static final String _serializedATN =
		"\u0004\u0001D\u0267\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000\u0003\u0000\u008a\b\u0000"+
		"\u0001\u0000\u0005\u0000\u008d\b\u0000\n\u0000\f\u0000\u0090\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u009e\b\u0003\u0001\u0004\u0003\u0004\u00a1\b\u0004\u0001\u0004"+
		"\u0003\u0004\u00a4\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00aa\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00b8\b\u0006\n\u0006\f\u0006\u00bb"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u00c0\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u00c6\b\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00d1\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d7\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u00df\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e5\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\f\u00ee\b\f\u0001\f\u0001\f\u0001\r\u0003\r\u00f3\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fa\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0104"+
		"\b\u000e\n\u000e\f\u000e\u0107\t\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0110\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0003\u0012\u0118\b\u0012\u0001\u0012\u0003\u0012\u011b\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0120\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0133\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0138\b\u0015\n\u0015\f\u0015"+
		"\u013b\t\u0015\u0001\u0016\u0003\u0016\u013e\b\u0016\u0001\u0016\u0003"+
		"\u0016\u0141\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0152"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0157\b\u001a"+
		"\n\u001a\f\u001a\u015a\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u015f\b\u001b\n\u001b\f\u001b\u0162\t\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u0167\b\u001c\n\u001c\f\u001c\u016a\t\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0170\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0177"+
		"\b\u001f\n\u001f\f\u001f\u017a\t\u001f\u0001 \u0001 \u0001 \u0005 \u017f"+
		"\b \n \f \u0182\t \u0001!\u0001!\u0001!\u0001!\u0003!\u0188\b!\u0001\""+
		"\u0001\"\u0003\"\u018c\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0003$\u0195\b$\u0001%\u0001%\u0005%\u0199\b%\n%\f%\u019c\t%\u0001%"+
		"\u0001%\u0004%\u01a0\b%\u000b%\f%\u01a1\u0003%\u01a4\b%\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0005&\u01ac\b&\n&\f&\u01af\t&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u01b5\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0003)\u01c0\b)\u0001)\u0001)\u0001*\u0005"+
		"*\u01c5\b*\n*\f*\u01c8\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u01d4\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u01ee\b,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u01fc\b/\u0003/\u01fe\b/\u00010\u00010\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"4\u00054\u020d\b4\n4\f4\u0210\t4\u00014\u00014\u00034\u0214\b4\u00014"+
		"\u00014\u00014\u00015\u00015\u00035\u021b\b5\u00016\u00056\u021e\b6\n"+
		"6\f6\u0221\t6\u00017\u00017\u00017\u00017\u00017\u00017\u00018\u00018"+
		"\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0005=\u0240\b=\n=\f=\u0243\t=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0005?\u024d\b?\n?\f?\u0250\t?\u0001@\u0001@\u0001"+
		"@\u0003@\u0255\b@\u0001A\u0001A\u0001B\u0001B\u0003B\u025b\bB\u0001B\u0001"+
		"B\u0001B\u0003B\u0260\bB\u0001B\u0003B\u0263\bB\u0001C\u0001C\u0001C\u0000"+
		"\u0000D\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0000\t\u0001\u0000>@\u0001\u000068\u0001\u0000\u0012"+
		"\u0013\u0001\u0000\u0014\u0017\u0001\u0000\u0018\u0019\u0001\u0000\u001a"+
		"\u001c\u0001\u0000/0\u0001\u0000 !\u0002\u0000:;AA\u0272\u0000\u0089\u0001"+
		"\u0000\u0000\u0000\u0002\u0093\u0001\u0000\u0000\u0000\u0004\u0097\u0001"+
		"\u0000\u0000\u0000\u0006\u009d\u0001\u0000\u0000\u0000\b\u00a0\u0001\u0000"+
		"\u0000\u0000\n\u00ad\u0001\u0000\u0000\u0000\f\u00b4\u0001\u0000\u0000"+
		"\u0000\u000e\u00bf\u0001\u0000\u0000\u0000\u0010\u00c5\u0001\u0000\u0000"+
		"\u0000\u0012\u00d0\u0001\u0000\u0000\u0000\u0014\u00d2\u0001\u0000\u0000"+
		"\u0000\u0016\u00de\u0001\u0000\u0000\u0000\u0018\u00ed\u0001\u0000\u0000"+
		"\u0000\u001a\u00f2\u0001\u0000\u0000\u0000\u001c\u0100\u0001\u0000\u0000"+
		"\u0000\u001e\u0108\u0001\u0000\u0000\u0000 \u010a\u0001\u0000\u0000\u0000"+
		"\"\u010c\u0001\u0000\u0000\u0000$\u0117\u0001\u0000\u0000\u0000&\u0126"+
		"\u0001\u0000\u0000\u0000(\u0132\u0001\u0000\u0000\u0000*\u0134\u0001\u0000"+
		"\u0000\u0000,\u013d\u0001\u0000\u0000\u0000.\u0145\u0001\u0000\u0000\u0000"+
		"0\u0147\u0001\u0000\u0000\u00002\u014b\u0001\u0000\u0000\u00004\u0153"+
		"\u0001\u0000\u0000\u00006\u015b\u0001\u0000\u0000\u00008\u0163\u0001\u0000"+
		"\u0000\u0000:\u016b\u0001\u0000\u0000\u0000<\u0171\u0001\u0000\u0000\u0000"+
		">\u0173\u0001\u0000\u0000\u0000@\u017b\u0001\u0000\u0000\u0000B\u0187"+
		"\u0001\u0000\u0000\u0000D\u018b\u0001\u0000\u0000\u0000F\u018d\u0001\u0000"+
		"\u0000\u0000H\u0194\u0001\u0000\u0000\u0000J\u01a3\u0001\u0000\u0000\u0000"+
		"L\u01b4\u0001\u0000\u0000\u0000N\u01b6\u0001\u0000\u0000\u0000P\u01ba"+
		"\u0001\u0000\u0000\u0000R\u01bd\u0001\u0000\u0000\u0000T\u01c6\u0001\u0000"+
		"\u0000\u0000V\u01d3\u0001\u0000\u0000\u0000X\u01ed\u0001\u0000\u0000\u0000"+
		"Z\u01ef\u0001\u0000\u0000\u0000\\\u01f1\u0001\u0000\u0000\u0000^\u01f3"+
		"\u0001\u0000\u0000\u0000`\u01ff\u0001\u0000\u0000\u0000b\u0201\u0001\u0000"+
		"\u0000\u0000d\u0203\u0001\u0000\u0000\u0000f\u0209\u0001\u0000\u0000\u0000"+
		"h\u020e\u0001\u0000\u0000\u0000j\u021a\u0001\u0000\u0000\u0000l\u021f"+
		"\u0001\u0000\u0000\u0000n\u0222\u0001\u0000\u0000\u0000p\u0228\u0001\u0000"+
		"\u0000\u0000r\u022a\u0001\u0000\u0000\u0000t\u0231\u0001\u0000\u0000\u0000"+
		"v\u0233\u0001\u0000\u0000\u0000x\u0235\u0001\u0000\u0000\u0000z\u023d"+
		"\u0001\u0000\u0000\u0000|\u0246\u0001\u0000\u0000\u0000~\u0249\u0001\u0000"+
		"\u0000\u0000\u0080\u0254\u0001\u0000\u0000\u0000\u0082\u0256\u0001\u0000"+
		"\u0000\u0000\u0084\u0262\u0001\u0000\u0000\u0000\u0086\u0264\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008e\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0003\u0004\u0002\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0000"+
		"\u0000\u0001\u0092\u0001\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0001"+
		"\u0000\u0000\u0094\u0095\u0005>\u0000\u0000\u0095\u0096\u0005\u0002\u0000"+
		"\u0000\u0096\u0003\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0006\u0003"+
		"\u0000\u0098\u0005\u0001\u0000\u0000\u0000\u0099\u009e\u0003\b\u0004\u0000"+
		"\u009a\u009e\u0003\u0016\u000b\u0000\u009b\u009e\u0003\u001a\r\u0000\u009c"+
		"\u009e\u0003\n\u0005\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u0007\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u00051\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005"+
		"5\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0003"+
		"\u0000\u0000\u00a6\u00a9\u0003\u0084B\u0000\u00a7\u00a8\u00052\u0000\u0000"+
		"\u00a8\u00aa\u0003\u0084B\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0003\f\u0006\u0000\u00ac\t\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u00053\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af\u00b0\u0003"+
		"\u0084B\u0000\u00b0\u00b1\u0005\u0004\u0000\u0000\u00b1\u00b2\u0003\u001c"+
		"\u000e\u0000\u00b2\u00b3\u0005\u0002\u0000\u0000\u00b3\u000b\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b9\u0005\u0005\u0000\u0000\u00b5\u00b8\u0003\u0010"+
		"\b\u0000\u00b6\u00b8\u0003\u000e\u0007\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0006\u0000\u0000\u00bd\r\u0001\u0000\u0000\u0000"+
		"\u00be\u00c0\u0003 \u0010\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u00051\u0000\u0000\u00c2\u00c3\u0003\u0012\t\u0000\u00c3\u000f"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0003 \u0010\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0003\u0012\t\u0000\u00c8\u0011\u0001\u0000"+
		"\u0000\u0000\u00c9\u00d1\u0003\u0014\n\u0000\u00ca\u00cb\u0003(\u0014"+
		"\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc\u00d1\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d1\u0003\"\u0011\u0000\u00ce\u00d1\u0003\u001a\r\u0000"+
		"\u00cf\u00d1\u0003$\u0012\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u0013\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0007\u0000\u0000\u00d3"+
		"\u00d4\u0005>\u0000\u0000\u00d4\u00d6\u0005\b\u0000\u0000\u00d5\u00d7"+
		"\u0003*\u0015\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005"+
		"\t\u0000\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da\u00db\u0003T"+
		"*\u0000\u00db\u00dc\u0005\u0006\u0000\u0000\u00dc\u0015\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0003\u0086C\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\u0007\u0000\u0000\u00e1\u00e2\u0003\u0018\f\u0000\u00e2"+
		"\u00e4\u0005\b\u0000\u0000\u00e3\u00e5\u0003*\u0015\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\t\u0000\u0000\u00e7\u00e8\u0005"+
		"\u0005\u0000\u0000\u00e8\u00e9\u0003T*\u0000\u00e9\u00ea\u0005\u0006\u0000"+
		"\u0000\u00ea\u0017\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005>\u0000\u0000"+
		"\u00ec\u00ee\u0005\n\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005>\u0000\u0000\u00f0\u0019\u0001\u0000\u0000\u0000\u00f1\u00f3"+
		"\u0003 \u0010\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"3\u0000\u0000\u00f5\u00f6\u0005\u0007\u0000\u0000\u00f6\u00f7\u0005>\u0000"+
		"\u0000\u00f7\u00f9\u0005\b\u0000\u0000\u00f8\u00fa\u0003*\u0015\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\t\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0004\u0000\u0000\u00fd\u00fe\u0003\u001c\u000e\u0000\u00fe"+
		"\u00ff\u0005\u0002\u0000\u0000\u00ff\u001b\u0001\u0000\u0000\u0000\u0100"+
		"\u0105\u0003\u001e\u000f\u0000\u0101\u0102\u0005\u000b\u0000\u0000\u0102"+
		"\u0104\u0003\u001e\u000f\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104"+
		"\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u001d\u0001\u0000\u0000\u0000\u0107"+
		"\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0000\u0000\u0000\u0109"+
		"\u001f\u0001\u0000\u0000\u0000\u010a\u010b\u0007\u0001\u0000\u0000\u010b"+
		"!\u0001\u0000\u0000\u0000\u010c\u010d\u0003\u0084B\u0000\u010d\u010f\u0005"+
		"\b\u0000\u0000\u010e\u0110\u0003*\u0015\u0000\u010f\u010e\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\t\u0000\u0000\u0112\u0113\u0005\u0005\u0000"+
		"\u0000\u0113\u0114\u0003T*\u0000\u0114\u0115\u0005\u0006\u0000\u0000\u0115"+
		"#\u0001\u0000\u0000\u0000\u0116\u0118\u0003 \u0010\u0000\u0117\u0116\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001"+
		"\u0000\u0000\u0000\u0119\u011b\u00053\u0000\u0000\u011a\u0119\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0003\u0084B\u0000\u011d\u011f\u0005\b\u0000"+
		"\u0000\u011e\u0120\u0003*\u0015\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005\t\u0000\u0000\u0122\u0123\u0005\u0004\u0000\u0000\u0123"+
		"\u0124\u0003\u001c\u000e\u0000\u0124\u0125\u0005\u0002\u0000\u0000\u0125"+
		"%\u0001\u0000\u0000\u0000\u0126\u0127\u0005\f\u0000\u0000\u0127\u0128"+
		"\u0003\u0084B\u0000\u0128\u0129\u0003R)\u0000\u0129\'\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0003\u0080@\u0000\u012b\u012c\u0005>\u0000\u0000\u012c"+
		"\u0133\u0001\u0000\u0000\u0000\u012d\u012e\u0003\u0080@\u0000\u012e\u012f"+
		"\u0005>\u0000\u0000\u012f\u0130\u0005\r\u0000\u0000\u0130\u0131\u0003"+
		".\u0017\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u012a\u0001\u0000"+
		"\u0000\u0000\u0132\u012d\u0001\u0000\u0000\u0000\u0133)\u0001\u0000\u0000"+
		"\u0000\u0134\u0139\u0003,\u0016\u0000\u0135\u0136\u0005\u000e\u0000\u0000"+
		"\u0136\u0138\u0003,\u0016\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a+\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013c\u013e\u00051\u0000\u0000\u013d\u013c\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u00054\u0000\u0000\u0140\u013f\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0003\u0080@\u0000\u0143\u0144\u0005>\u0000\u0000"+
		"\u0144-\u0001\u0000\u0000\u0000\u0145\u0146\u00034\u001a\u0000\u0146/"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0003J%\u0000\u0148\u0149\u0005\r"+
		"\u0000\u0000\u0149\u014a\u0003.\u0017\u0000\u014a1\u0001\u0000\u0000\u0000"+
		"\u014b\u0151\u00034\u001a\u0000\u014c\u014d\u0005\u000f\u0000\u0000\u014d"+
		"\u014e\u0003.\u0017\u0000\u014e\u014f\u0005\n\u0000\u0000\u014f\u0150"+
		"\u0003.\u0017\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014c\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u01523\u0001\u0000"+
		"\u0000\u0000\u0153\u0158\u00036\u001b\u0000\u0154\u0155\u0005\u0010\u0000"+
		"\u0000\u0155\u0157\u00036\u001b\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u01595\u0001\u0000\u0000\u0000\u015a"+
		"\u0158\u0001\u0000\u0000\u0000\u015b\u0160\u00038\u001c\u0000\u015c\u015d"+
		"\u0005\u0011\u0000\u0000\u015d\u015f\u00038\u001c\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u01617\u0001\u0000"+
		"\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0168\u0003:\u001d"+
		"\u0000\u0164\u0165\u0007\u0002\u0000\u0000\u0165\u0167\u0003:\u001d\u0000"+
		"\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000"+
		"\u01699\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b"+
		"\u016f\u0003>\u001f\u0000\u016c\u016d\u0003<\u001e\u0000\u016d\u016e\u0003"+
		">\u001f\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170;\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0007\u0003\u0000\u0000\u0172=\u0001\u0000\u0000\u0000"+
		"\u0173\u0178\u0003@ \u0000\u0174\u0175\u0007\u0004\u0000\u0000\u0175\u0177"+
		"\u0003@ \u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u017a\u0001\u0000"+
		"\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000"+
		"\u0000\u0000\u0179?\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017b\u0180\u0003B!\u0000\u017c\u017d\u0007\u0005\u0000\u0000\u017d"+
		"\u017f\u0003B!\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181A\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0005\u001d\u0000\u0000\u0184\u0188\u0003B!\u0000"+
		"\u0185\u0188\u0003F#\u0000\u0186\u0188\u0003D\"\u0000\u0187\u0183\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001"+
		"\u0000\u0000\u0000\u0188C\u0001\u0000\u0000\u0000\u0189\u018c\u0003H$"+
		"\u0000\u018a\u018c\u0003J%\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018a\u0001\u0000\u0000\u0000\u018cE\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\b\u0000\u0000\u018e\u018f\u0003\u0080@\u0000\u018f\u0190\u0005"+
		"\t\u0000\u0000\u0190\u0191\u0003B!\u0000\u0191G\u0001\u0000\u0000\u0000"+
		"\u0192\u0195\u0003L&\u0000\u0193\u0195\u0003\u0082A\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195I\u0001"+
		"\u0000\u0000\u0000\u0196\u019a\u0003L&\u0000\u0197\u0199\u0003P(\u0000"+
		"\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u01a4\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019d\u019f\u0003\u0084B\u0000\u019e\u01a0\u0003P(\u0000\u019f\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u019f"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a3\u0196\u0001\u0000\u0000\u0000\u01a3\u019d"+
		"\u0001\u0000\u0000\u0000\u01a4K\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005"+
		"\b\u0000\u0000\u01a6\u01a7\u0003.\u0017\u0000\u01a7\u01a8\u0005\t\u0000"+
		"\u0000\u01a8\u01b5\u0001\u0000\u0000\u0000\u01a9\u01ad\u0005>\u0000\u0000"+
		"\u01aa\u01ac\u0003N\'\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b5\u0001\u0000\u0000\u0000\u01af"+
		"\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b5\u0005&\u0000\u0000\u01b1\u01b5"+
		"\u0005\'\u0000\u0000\u01b2\u01b5\u0003&\u0013\u0000\u01b3\u01b5\u0005"+
		"%\u0000\u0000\u01b4\u01a5\u0001\u0000\u0000\u0000\u01b4\u01a9\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b0\u0001\u0000\u0000\u0000\u01b4\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b5M\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005\u001e\u0000"+
		"\u0000\u01b7\u01b8\u00032\u0019\u0000\u01b8\u01b9\u0005\u001f\u0000\u0000"+
		"\u01b9O\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u000b\u0000\u0000\u01bb"+
		"\u01bc\u0003L&\u0000\u01bcQ\u0001\u0000\u0000\u0000\u01bd\u01bf\u0005"+
		"\b\u0000\u0000\u01be\u01c0\u0003~?\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0005\t\u0000\u0000\u01c2S\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c5\u0003X,\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c7U\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0003\u0018\f\u0000\u01ca\u01cb\u0003R"+
		")\u0000\u01cb\u01d4\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005&\u0000\u0000"+
		"\u01cd\u01d4\u0003R)\u0000\u01ce\u01cf\u0005\'\u0000\u0000\u01cf\u01d4"+
		"\u0003R)\u0000\u01d0\u01d1\u0003D\"\u0000\u01d1\u01d2\u0003R)\u0000\u01d2"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d3\u01c9\u0001\u0000\u0000\u0000\u01d3"+
		"\u01cc\u0001\u0000\u0000\u0000\u01d3\u01ce\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d4W\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0003(\u0014\u0000\u01d6\u01d7\u0005\u0002\u0000\u0000\u01d7\u01ee\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u00030\u0018\u0000\u01d9\u01da\u0005\u0002"+
		"\u0000\u0000\u01da\u01ee\u0001\u0000\u0000\u0000\u01db\u01dc\u0003V+\u0000"+
		"\u01dc\u01dd\u0005\u0002\u0000\u0000\u01dd\u01ee\u0001\u0000\u0000\u0000"+
		"\u01de\u01ee\u0003^/\u0000\u01df\u01ee\u0003d2\u0000\u01e0\u01ee\u0003"+
		"n7\u0000\u01e1\u01e2\u0003r9\u0000\u01e2\u01e3\u0005\u0002\u0000\u0000"+
		"\u01e3\u01ee\u0001\u0000\u0000\u0000\u01e4\u01ee\u0005\u0002\u0000\u0000"+
		"\u01e5\u01e6\u0003v;\u0000\u01e6\u01e7\u0005\u0002\u0000\u0000\u01e7\u01ee"+
		"\u0001\u0000\u0000\u0000\u01e8\u01ee\u0003x<\u0000\u01e9\u01ea\u0003\\"+
		".\u0000\u01ea\u01eb\u0005\u0002\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ee\u0003Z-\u0000\u01ed\u01d5\u0001\u0000\u0000\u0000\u01ed"+
		"\u01d8\u0001\u0000\u0000\u0000\u01ed\u01db\u0001\u0000\u0000\u0000\u01ed"+
		"\u01de\u0001\u0000\u0000\u0000\u01ed\u01df\u0001\u0000\u0000\u0000\u01ed"+
		"\u01e0\u0001\u0000\u0000\u0000\u01ed\u01e1\u0001\u0000\u0000\u0000\u01ed"+
		"\u01e4\u0001\u0000\u0000\u0000\u01ed\u01e5\u0001\u0000\u0000\u0000\u01ed"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ed\u01e9\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ec\u0001\u0000\u0000\u0000\u01eeY\u0001\u0000\u0000\u0000\u01ef\u01f0"+
		"\u0005$\u0000\u0000\u01f0[\u0001\u0000\u0000\u0000\u01f1\u01f2\u0007\u0006"+
		"\u0000\u0000\u01f2]\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005(\u0000\u0000"+
		"\u01f4\u01f5\u0005\b\u0000\u0000\u01f5\u01f6\u0003.\u0017\u0000\u01f6"+
		"\u01f7\u0005\t\u0000\u0000\u01f7\u01fd\u0003b1\u0000\u01f8\u01fb\u0005"+
		")\u0000\u0000\u01f9\u01fc\u0003`0\u0000\u01fa\u01fc\u0003b1\u0000\u01fb"+
		"\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fd\u01f8\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe_\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0003^/\u0000\u0200a\u0001\u0000\u0000\u0000\u0201\u0202\u0003z=\u0000"+
		"\u0202c\u0001\u0000\u0000\u0000\u0203\u0204\u0005+\u0000\u0000\u0204\u0205"+
		"\u0005\b\u0000\u0000\u0205\u0206\u0003h4\u0000\u0206\u0207\u0005\t\u0000"+
		"\u0000\u0207\u0208\u0003f3\u0000\u0208e\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u0003z=\u0000\u020ag\u0001\u0000\u0000\u0000\u020b\u020d\u0003"+
		"j5\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000"+
		"\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0211\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0211\u0213\u0005\u0002\u0000\u0000\u0212\u0214\u0003.\u0017\u0000"+
		"\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u0002\u0000\u0000"+
		"\u0216\u0217\u0003l6\u0000\u0217i\u0001\u0000\u0000\u0000\u0218\u021b"+
		"\u0003(\u0014\u0000\u0219\u021b\u00030\u0018\u0000\u021a\u0218\u0001\u0000"+
		"\u0000\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021bk\u0001\u0000\u0000"+
		"\u0000\u021c\u021e\u00030\u0018\u0000\u021d\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220m\u0001\u0000\u0000\u0000\u0221"+
		"\u021f\u0001\u0000\u0000\u0000\u0222\u0223\u0005*\u0000\u0000\u0223\u0224"+
		"\u0005\b\u0000\u0000\u0224\u0225\u0003.\u0017\u0000\u0225\u0226\u0005"+
		"\t\u0000\u0000\u0226\u0227\u0003p8\u0000\u0227o\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0003z=\u0000\u0229q\u0001\u0000\u0000\u0000\u022a\u022b"+
		"\u0005,\u0000\u0000\u022b\u022c\u0003t:\u0000\u022c\u022d\u0005*\u0000"+
		"\u0000\u022d\u022e\u0005\b\u0000\u0000\u022e\u022f\u0003.\u0017\u0000"+
		"\u022f\u0230\u0005\t\u0000\u0000\u0230s\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u0003z=\u0000\u0232u\u0001\u0000\u0000\u0000\u0233\u0234\u0003"+
		"|>\u0000\u0234w\u0001\u0000\u0000\u0000\u0235\u0236\u0005-\u0000\u0000"+
		"\u0236\u0237\u0003z=\u0000\u0237\u0238\u0005.\u0000\u0000\u0238\u0239"+
		"\u0005\b\u0000\u0000\u0239\u023a\u0005>\u0000\u0000\u023a\u023b\u0005"+
		"\t\u0000\u0000\u023b\u023c\u0005\u0002\u0000\u0000\u023cy\u0001\u0000"+
		"\u0000\u0000\u023d\u0241\u0005\u0005\u0000\u0000\u023e\u0240\u0003X,\u0000"+
		"\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000"+
		"\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000"+
		"\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000"+
		"\u0244\u0245\u0005\u0006\u0000\u0000\u0245{\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0005>\u0000\u0000\u0247\u0248\u0007\u0007\u0000\u0000\u0248}\u0001"+
		"\u0000\u0000\u0000\u0249\u024e\u0003.\u0017\u0000\u024a\u024b\u0005\u000e"+
		"\u0000\u0000\u024b\u024d\u0003.\u0017\u0000\u024c\u024a\u0001\u0000\u0000"+
		"\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u007f\u0001\u0000\u0000"+
		"\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0251\u0255\u0005\"\u0000\u0000"+
		"\u0252\u0255\u0005#\u0000\u0000\u0253\u0255\u0003\u0084B\u0000\u0254\u0251"+
		"\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254\u0253"+
		"\u0001\u0000\u0000\u0000\u0255\u0081\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0007\b\u0000\u0000\u0257\u0083\u0001\u0000\u0000\u0000\u0258\u0259\u0005"+
		">\u0000\u0000\u0259\u025b\u0005\n\u0000\u0000\u025a\u0258\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000"+
		"\u0000\u0000\u025c\u0263\u0005?\u0000\u0000\u025d\u025e\u0005>\u0000\u0000"+
		"\u025e\u0260\u0005\n\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261"+
		"\u0263\u00059\u0000\u0000\u0262\u025a\u0001\u0000\u0000\u0000\u0262\u025f"+
		"\u0001\u0000\u0000\u0000\u0263\u0085\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u0003\u0018\f\u0000\u0265\u0087\u0001\u0000\u0000\u00009\u0089\u008e"+
		"\u009d\u00a0\u00a3\u00a9\u00b7\u00b9\u00bf\u00c5\u00d0\u00d6\u00de\u00e4"+
		"\u00ed\u00f2\u00f9\u0105\u010f\u0117\u011a\u011f\u0132\u0139\u013d\u0140"+
		"\u0151\u0158\u0160\u0168\u016f\u0178\u0180\u0187\u018b\u0194\u019a\u01a1"+
		"\u01a3\u01ad\u01b4\u01bf\u01c6\u01d3\u01ed\u01fb\u01fd\u020e\u0213\u021a"+
		"\u021f\u0241\u024e\u0254\u025a\u025f\u0262";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}