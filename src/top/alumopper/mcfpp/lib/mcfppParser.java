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
		RULE_classOrFunctionDeclaration = 3, RULE_classDeclaration = 4, RULE_classBody = 5, 
		RULE_staticClassMemberDeclaration = 6, RULE_classMemberDeclaration = 7, 
		RULE_classMember = 8, RULE_classFunctionDeclaration = 9, RULE_functionDeclaration = 10, 
		RULE_namespaceID = 11, RULE_nativeDeclaration = 12, RULE_javaRefer = 13, 
		RULE_stringName = 14, RULE_accessModifier = 15, RULE_constructorDeclaration = 16, 
		RULE_nativeConstructorDeclaration = 17, RULE_constructorCall = 18, RULE_fieldDeclaration = 19, 
		RULE_parameterList = 20, RULE_parameter = 21, RULE_expression = 22, RULE_statementExpression = 23, 
		RULE_conditionalExpression = 24, RULE_conditionalOrExpression = 25, RULE_conditionalAndExpression = 26, 
		RULE_equalityExpression = 27, RULE_relationalExpression = 28, RULE_relationalOp = 29, 
		RULE_additiveExpression = 30, RULE_multiplicativeExpression = 31, RULE_unaryExpression = 32, 
		RULE_basicExpression = 33, RULE_castExpression = 34, RULE_primary = 35, 
		RULE_varWithSelector = 36, RULE_var = 37, RULE_identifierSuffix = 38, 
		RULE_selector = 39, RULE_arguments = 40, RULE_functionBody = 41, RULE_functionCall = 42, 
		RULE_statement = 43, RULE_orgCommand = 44, RULE_controlStatement = 45, 
		RULE_ifStatement = 46, RULE_elseIfStatement = 47, RULE_ifBlock = 48, RULE_forStatement = 49, 
		RULE_forBlock = 50, RULE_forControl = 51, RULE_forInit = 52, RULE_forUpdate = 53, 
		RULE_whileStatement = 54, RULE_whileBlock = 55, RULE_doWhileStatement = 56, 
		RULE_doWhileBlock = 57, RULE_selfAddOrMinusStatement = 58, RULE_tryStoreStatement = 59, 
		RULE_block = 60, RULE_selfAddOrMinusExpression = 61, RULE_expressionList = 62, 
		RULE_type = 63, RULE_value = 64, RULE_className = 65, RULE_functionTag = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "namespaceDeclaration", "typeDeclaration", "classOrFunctionDeclaration", 
			"classDeclaration", "classBody", "staticClassMemberDeclaration", "classMemberDeclaration", 
			"classMember", "classFunctionDeclaration", "functionDeclaration", "namespaceID", 
			"nativeDeclaration", "javaRefer", "stringName", "accessModifier", "constructorDeclaration", 
			"nativeConstructorDeclaration", "constructorCall", "fieldDeclaration", 
			"parameterList", "parameter", "expression", "statementExpression", "conditionalExpression", 
			"conditionalOrExpression", "conditionalAndExpression", "equalityExpression", 
			"relationalExpression", "relationalOp", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "basicExpression", "castExpression", "primary", "varWithSelector", 
			"var", "identifierSuffix", "selector", "arguments", "functionBody", "functionCall", 
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
			null, "'namespace'", "';'", "'class'", "'{'", "'}'", "'func'", "'('", 
			"')'", "':'", "'->'", "'.'", "'new'", "'='", "','", "'?'", "'||'", "'&&'", 
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(134);
				namespaceDeclaration();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4749608757015609416L) != 0) {
				{
				{
				setState(137);
				typeDeclaration();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
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
			setState(145);
			match(T__0);
			setState(146);
			match(Identifier);
			setState(147);
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
			setState(149);
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
		public NativeDeclarationContext nativeDeclaration() {
			return getRuleContext(NativeDeclarationContext.class,0);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case STATIC:
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				classDeclaration();
				}
				break;
			case T__5:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				functionDeclaration();
				}
				break;
			case NATIVE:
			case PUBLIC:
			case PROTECTED:
			case PRIVATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				nativeDeclaration();
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
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(156);
				match(STATIC);
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(159);
				match(FINAL);
				}
			}

			setState(162);
			match(T__2);
			setState(163);
			className();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(164);
				match(EXTENDS);
				setState(165);
				className();
				}
			}

			setState(168);
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
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__3);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4338655239478443968L) != 0) {
				{
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(171);
					classMemberDeclaration();
					}
					break;
				case 2:
					{
					setState(172);
					staticClassMemberDeclaration();
					}
					break;
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__4);
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
		enterRule(_localctx, 12, RULE_staticClassMemberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0) {
				{
				setState(180);
				accessModifier();
				}
			}

			setState(183);
			match(STATIC);
			setState(184);
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
		enterRule(_localctx, 14, RULE_classMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(186);
				accessModifier();
				}
				break;
			}
			setState(189);
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
		public NativeDeclarationContext nativeDeclaration() {
			return getRuleContext(NativeDeclarationContext.class,0);
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
		enterRule(_localctx, 16, RULE_classMember);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				classFunctionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				fieldDeclaration();
				setState(193);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				nativeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
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
		enterRule(_localctx, 18, RULE_classFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__5);
			setState(201);
			match(Identifier);
			setState(202);
			match(T__6);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(203);
				parameterList();
				}
			}

			setState(206);
			match(T__7);
			setState(207);
			match(T__3);
			setState(208);
			functionBody();
			setState(209);
			match(T__4);
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
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(211);
				functionTag();
				}
			}

			setState(214);
			match(T__5);
			setState(215);
			namespaceID();
			setState(216);
			match(T__6);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(217);
				parameterList();
				}
			}

			setState(220);
			match(T__7);
			setState(221);
			match(T__3);
			setState(222);
			functionBody();
			setState(223);
			match(T__4);
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
		enterRule(_localctx, 22, RULE_namespaceID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(225);
				match(Identifier);
				setState(226);
				match(T__8);
				}
				break;
			}
			setState(229);
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
	public static class NativeDeclarationContext extends ParserRuleContext {
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
		public NativeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).enterNativeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mcfppListener ) ((mcfppListener)listener).exitNativeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mcfppVisitor ) return ((mcfppVisitor<? extends T>)visitor).visitNativeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeDeclarationContext nativeDeclaration() throws RecognitionException {
		NativeDeclarationContext _localctx = new NativeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nativeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0) {
				{
				setState(231);
				accessModifier();
				}
			}

			setState(234);
			match(NATIVE);
			setState(235);
			match(T__5);
			setState(236);
			match(Identifier);
			setState(237);
			match(T__6);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(238);
				parameterList();
				}
			}

			setState(241);
			match(T__7);
			setState(242);
			match(T__9);
			setState(243);
			javaRefer();
			setState(244);
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
		enterRule(_localctx, 26, RULE_javaRefer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			stringName();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(247);
				match(T__10);
				setState(248);
				stringName();
				}
				}
				setState(253);
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
		enterRule(_localctx, 28, RULE_stringName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 30, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 32, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			className();
			setState(259);
			match(T__6);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(260);
				parameterList();
				}
			}

			setState(263);
			match(T__7);
			setState(264);
			match(T__3);
			setState(265);
			functionBody();
			setState(266);
			match(T__4);
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
		enterRule(_localctx, 34, RULE_nativeConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0) {
				{
				setState(268);
				accessModifier();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIVE) {
				{
				setState(271);
				match(NATIVE);
				}
			}

			setState(274);
			className();
			setState(275);
			match(T__6);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4462504229231132672L) != 0) {
				{
				setState(276);
				parameterList();
				}
			}

			setState(279);
			match(T__7);
			setState(280);
			match(T__9);
			setState(281);
			javaRefer();
			setState(282);
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
		enterRule(_localctx, 36, RULE_constructorCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__11);
			setState(285);
			className();
			setState(286);
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
		enterRule(_localctx, 38, RULE_fieldDeclaration);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				type();
				setState(289);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				type();
				setState(292);
				match(Identifier);
				setState(293);
				match(T__12);
				setState(294);
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
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			parameter();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(299);
				match(T__13);
				setState(300);
				parameter();
				}
				}
				setState(305);
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
		enterRule(_localctx, 42, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(306);
				match(STATIC);
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCRETE) {
				{
				setState(309);
				match(CONCRETE);
				}
			}

			setState(312);
			type();
			setState(313);
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
		enterRule(_localctx, 44, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		enterRule(_localctx, 46, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			varWithSelector();
			setState(318);
			match(T__12);
			setState(319);
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
		enterRule(_localctx, 48, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			conditionalOrExpression();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(322);
				match(T__14);
				setState(323);
				expression();
				setState(324);
				match(T__8);
				setState(325);
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
		enterRule(_localctx, 50, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			conditionalAndExpression();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(330);
				match(T__15);
				setState(331);
				conditionalAndExpression();
				}
				}
				setState(336);
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
		enterRule(_localctx, 52, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			equalityExpression();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(338);
				match(T__16);
				setState(339);
				equalityExpression();
				}
				}
				setState(344);
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
		enterRule(_localctx, 54, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			relationalExpression();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(346);
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
				setState(347);
				relationalExpression();
				}
				}
				setState(352);
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
		enterRule(_localctx, 56, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			additiveExpression();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0) {
				{
				setState(354);
				relationalOp();
				setState(355);
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
		enterRule(_localctx, 58, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
		enterRule(_localctx, 60, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			multiplicativeExpression();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23 || _la==T__24) {
				{
				{
				setState(362);
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
				setState(363);
				multiplicativeExpression();
				}
				}
				setState(368);
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
		enterRule(_localctx, 62, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			unaryExpression();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) {
				{
				{
				setState(370);
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
				setState(371);
				unaryExpression();
				}
				}
				setState(376);
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
		enterRule(_localctx, 64, RULE_unaryExpression);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(T__28);
				setState(378);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
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
		enterRule(_localctx, 66, RULE_basicExpression);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
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
		enterRule(_localctx, 68, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__6);
			setState(388);
			type();
			setState(389);
			match(T__7);
			setState(390);
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
		enterRule(_localctx, 70, RULE_primary);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__11:
			case TargetSelector:
			case THIS:
			case SUPER:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				var();
				}
				break;
			case INT:
			case DECIMAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
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
		enterRule(_localctx, 72, RULE_varWithSelector);
		int _la;
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				var();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(397);
					selector();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				className();
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
					selector();
					}
					}
					setState(407); 
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
		enterRule(_localctx, 74, RULE_var);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(T__6);
				setState(412);
				expression();
				setState(413);
				match(T__7);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(Identifier);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(416);
					identifierSuffix();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				match(SUPER);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				constructorCall();
				}
				break;
			case TargetSelector:
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
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
		enterRule(_localctx, 76, RULE_identifierSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__29);
			setState(429);
			conditionalExpression();
			setState(430);
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
		enterRule(_localctx, 78, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__10);
			setState(433);
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
		enterRule(_localctx, 80, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__6);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 404198074076889121L) != 0) {
				{
				setState(436);
				expressionList();
				}
			}

			setState(439);
			match(T__7);
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
		enterRule(_localctx, 82, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -5512283352649956319L) != 0) {
				{
				{
				setState(441);
				statement();
				}
				}
				setState(446);
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
		enterRule(_localctx, 84, RULE_functionCall);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				namespaceID();
				setState(448);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(THIS);
				setState(451);
				arguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(SUPER);
				setState(453);
				arguments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				basicExpression();
				setState(455);
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
		enterRule(_localctx, 86, RULE_statement);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				fieldDeclaration();
				setState(460);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				statementExpression();
				setState(463);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				functionCall();
				setState(466);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(471);
				doWhileStatement();
				setState(472);
				match(T__1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(474);
				match(T__1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(475);
				selfAddOrMinusStatement();
				setState(476);
				match(T__1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(478);
				tryStoreStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(479);
				controlStatement();
				setState(480);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(482);
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
		enterRule(_localctx, 88, RULE_orgCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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
		enterRule(_localctx, 90, RULE_controlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
		enterRule(_localctx, 92, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(IF);
			setState(490);
			match(T__6);
			setState(491);
			expression();
			setState(492);
			match(T__7);
			setState(493);
			ifBlock();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(494);
				match(ELSE);
				setState(497);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(495);
					elseIfStatement();
					}
					break;
				case T__3:
					{
					setState(496);
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
		enterRule(_localctx, 94, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		enterRule(_localctx, 96, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		enterRule(_localctx, 98, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(FOR);
			setState(506);
			match(T__6);
			setState(507);
			forControl();
			setState(508);
			match(T__7);
			setState(509);
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
		enterRule(_localctx, 100, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
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
		enterRule(_localctx, 102, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4467569816739245952L) != 0) {
				{
				{
				setState(513);
				forInit();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(T__1);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 404198074076889121L) != 0) {
				{
				setState(520);
				expression();
				}
			}

			setState(523);
			match(T__1);
			setState(524);
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
		enterRule(_localctx, 104, RULE_forInit);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
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
		enterRule(_localctx, 106, RULE_forUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4467569868278853504L) != 0) {
				{
				{
				setState(530);
				statementExpression();
				}
				}
				setState(535);
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
		enterRule(_localctx, 108, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(WHILE);
			setState(537);
			match(T__6);
			setState(538);
			expression();
			setState(539);
			match(T__7);
			setState(540);
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
		enterRule(_localctx, 110, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		enterRule(_localctx, 112, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(DO);
			setState(545);
			doWhileBlock();
			setState(546);
			match(WHILE);
			setState(547);
			match(T__6);
			setState(548);
			expression();
			setState(549);
			match(T__7);
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
		enterRule(_localctx, 114, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		enterRule(_localctx, 116, RULE_selfAddOrMinusStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		enterRule(_localctx, 118, RULE_tryStoreStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(TRY);
			setState(556);
			block();
			setState(557);
			match(STORE);
			setState(558);
			match(T__6);
			setState(559);
			match(Identifier);
			setState(560);
			match(T__7);
			setState(561);
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
		enterRule(_localctx, 120, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__3);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -5512283352649956319L) != 0) {
				{
				{
				setState(564);
				statement();
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
			match(T__4);
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
		enterRule(_localctx, 122, RULE_selfAddOrMinusExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(Identifier);
			setState(573);
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
		enterRule(_localctx, 124, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			expression();
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(576);
				match(T__13);
				setState(577);
				expression();
				}
				}
				setState(582);
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
		enterRule(_localctx, 126, RULE_type);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(T__34);
				}
				break;
			case InsideClass:
			case Identifier:
			case ClassIdentifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
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
		enterRule(_localctx, 128, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
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
		enterRule(_localctx, 130, RULE_className);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(590);
					match(Identifier);
					setState(591);
					match(T__8);
					}
				}

				setState(594);
				match(ClassIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(595);
					match(Identifier);
					setState(596);
					match(T__8);
					}
				}

				setState(599);
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
		enterRule(_localctx, 132, RULE_functionTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
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
		"\u0004\u0001D\u025d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0001\u0000\u0003\u0000\u0088\b\u0000\u0001\u0000"+
		"\u0005\u0000\u008b\b\u0000\n\u0000\f\u0000\u008e\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009b\b\u0003\u0001"+
		"\u0004\u0003\u0004\u009e\b\u0004\u0001\u0004\u0003\u0004\u00a1\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a7\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00ae\b\u0005\n\u0005\f\u0005\u00b1\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0003\u0006\u00b6\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0003\u0007\u00bc\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c7\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00cd\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0003\n\u00d5\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00db"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00e4\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0003\f\u00e9\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f0\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00fa\b\r\n"+
		"\r\f\r\u00fd\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0106\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u010e"+
		"\b\u0011\u0001\u0011\u0003\u0011\u0111\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0116\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0129\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u012e\b\u0014\n\u0014\f\u0014\u0131\t\u0014\u0001"+
		"\u0015\u0003\u0015\u0134\b\u0015\u0001\u0015\u0003\u0015\u0137\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0148\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u014d\b\u0019\n\u0019\f\u0019\u0150"+
		"\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0155\b\u001a"+
		"\n\u001a\f\u001a\u0158\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u015d\b\u001b\n\u001b\f\u001b\u0160\t\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0166\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u016d\b\u001e\n\u001e"+
		"\f\u001e\u0170\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0175\b\u001f\n\u001f\f\u001f\u0178\t\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u017e\b \u0001!\u0001!\u0003!\u0182\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u018b\b#\u0001$\u0001$\u0005$"+
		"\u018f\b$\n$\f$\u0192\t$\u0001$\u0001$\u0004$\u0196\b$\u000b$\f$\u0197"+
		"\u0003$\u019a\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u01a2"+
		"\b%\n%\f%\u01a5\t%\u0001%\u0001%\u0001%\u0001%\u0003%\u01ab\b%\u0001&"+
		"\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0003(\u01b6"+
		"\b(\u0001(\u0001(\u0001)\u0005)\u01bb\b)\n)\f)\u01be\t)\u0001*\u0001*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01ca"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u01e4\b+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01f2"+
		"\b.\u0003.\u01f4\b.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00013\u00053\u0203\b3\n3\f3\u0206\t3\u0001"+
		"3\u00013\u00033\u020a\b3\u00013\u00013\u00013\u00014\u00014\u00034\u0211"+
		"\b4\u00015\u00055\u0214\b5\n5\f5\u0217\t5\u00016\u00016\u00016\u00016"+
		"\u00016\u00016\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001<\u0001<\u0005<\u0236\b<\n<\f<\u0239\t<\u0001"+
		"<\u0001<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0005>\u0243\b>\n>"+
		"\f>\u0246\t>\u0001?\u0001?\u0001?\u0003?\u024b\b?\u0001@\u0001@\u0001"+
		"A\u0001A\u0003A\u0251\bA\u0001A\u0001A\u0001A\u0003A\u0256\bA\u0001A\u0003"+
		"A\u0259\bA\u0001B\u0001B\u0001B\u0000\u0000C\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0000\t\u0001"+
		"\u0000>@\u0001\u000068\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0017"+
		"\u0001\u0000\u0018\u0019\u0001\u0000\u001a\u001c\u0001\u0000/0\u0001\u0000"+
		" !\u0002\u0000:;AA\u0268\u0000\u0087\u0001\u0000\u0000\u0000\u0002\u0091"+
		"\u0001\u0000\u0000\u0000\u0004\u0095\u0001\u0000\u0000\u0000\u0006\u009a"+
		"\u0001\u0000\u0000\u0000\b\u009d\u0001\u0000\u0000\u0000\n\u00aa\u0001"+
		"\u0000\u0000\u0000\f\u00b5\u0001\u0000\u0000\u0000\u000e\u00bb\u0001\u0000"+
		"\u0000\u0000\u0010\u00c6\u0001\u0000\u0000\u0000\u0012\u00c8\u0001\u0000"+
		"\u0000\u0000\u0014\u00d4\u0001\u0000\u0000\u0000\u0016\u00e3\u0001\u0000"+
		"\u0000\u0000\u0018\u00e8\u0001\u0000\u0000\u0000\u001a\u00f6\u0001\u0000"+
		"\u0000\u0000\u001c\u00fe\u0001\u0000\u0000\u0000\u001e\u0100\u0001\u0000"+
		"\u0000\u0000 \u0102\u0001\u0000\u0000\u0000\"\u010d\u0001\u0000\u0000"+
		"\u0000$\u011c\u0001\u0000\u0000\u0000&\u0128\u0001\u0000\u0000\u0000("+
		"\u012a\u0001\u0000\u0000\u0000*\u0133\u0001\u0000\u0000\u0000,\u013b\u0001"+
		"\u0000\u0000\u0000.\u013d\u0001\u0000\u0000\u00000\u0141\u0001\u0000\u0000"+
		"\u00002\u0149\u0001\u0000\u0000\u00004\u0151\u0001\u0000\u0000\u00006"+
		"\u0159\u0001\u0000\u0000\u00008\u0161\u0001\u0000\u0000\u0000:\u0167\u0001"+
		"\u0000\u0000\u0000<\u0169\u0001\u0000\u0000\u0000>\u0171\u0001\u0000\u0000"+
		"\u0000@\u017d\u0001\u0000\u0000\u0000B\u0181\u0001\u0000\u0000\u0000D"+
		"\u0183\u0001\u0000\u0000\u0000F\u018a\u0001\u0000\u0000\u0000H\u0199\u0001"+
		"\u0000\u0000\u0000J\u01aa\u0001\u0000\u0000\u0000L\u01ac\u0001\u0000\u0000"+
		"\u0000N\u01b0\u0001\u0000\u0000\u0000P\u01b3\u0001\u0000\u0000\u0000R"+
		"\u01bc\u0001\u0000\u0000\u0000T\u01c9\u0001\u0000\u0000\u0000V\u01e3\u0001"+
		"\u0000\u0000\u0000X\u01e5\u0001\u0000\u0000\u0000Z\u01e7\u0001\u0000\u0000"+
		"\u0000\\\u01e9\u0001\u0000\u0000\u0000^\u01f5\u0001\u0000\u0000\u0000"+
		"`\u01f7\u0001\u0000\u0000\u0000b\u01f9\u0001\u0000\u0000\u0000d\u01ff"+
		"\u0001\u0000\u0000\u0000f\u0204\u0001\u0000\u0000\u0000h\u0210\u0001\u0000"+
		"\u0000\u0000j\u0215\u0001\u0000\u0000\u0000l\u0218\u0001\u0000\u0000\u0000"+
		"n\u021e\u0001\u0000\u0000\u0000p\u0220\u0001\u0000\u0000\u0000r\u0227"+
		"\u0001\u0000\u0000\u0000t\u0229\u0001\u0000\u0000\u0000v\u022b\u0001\u0000"+
		"\u0000\u0000x\u0233\u0001\u0000\u0000\u0000z\u023c\u0001\u0000\u0000\u0000"+
		"|\u023f\u0001\u0000\u0000\u0000~\u024a\u0001\u0000\u0000\u0000\u0080\u024c"+
		"\u0001\u0000\u0000\u0000\u0082\u0258\u0001\u0000\u0000\u0000\u0084\u025a"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0002\u0001\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008c"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u0004\u0002\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0000\u0000\u0001\u0090\u0001\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u0001\u0000\u0000\u0092\u0093\u0005>\u0000\u0000\u0093\u0094\u0005"+
		"\u0002\u0000\u0000\u0094\u0003\u0001\u0000\u0000\u0000\u0095\u0096\u0003"+
		"\u0006\u0003\u0000\u0096\u0005\u0001\u0000\u0000\u0000\u0097\u009b\u0003"+
		"\b\u0004\u0000\u0098\u009b\u0003\u0014\n\u0000\u0099\u009b\u0003\u0018"+
		"\f\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u0007\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u00051\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u00055\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0003\u0000\u0000\u00a3\u00a6\u0003\u0082A\u0000\u00a4\u00a5"+
		"\u00052\u0000\u0000\u00a5\u00a7\u0003\u0082A\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0003\n\u0005\u0000\u00a9\t\u0001\u0000\u0000"+
		"\u0000\u00aa\u00af\u0005\u0004\u0000\u0000\u00ab\u00ae\u0003\u000e\u0007"+
		"\u0000\u00ac\u00ae\u0003\f\u0006\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0005\u0000\u0000\u00b3\u000b\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0003\u001e\u000f\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u00051\u0000\u0000\u00b8\u00b9\u0003\u0010\b\u0000\u00b9"+
		"\r\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003\u001e\u000f\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0010\b\u0000\u00be\u000f\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c7\u0003\u0012\t\u0000\u00c0\u00c1\u0003&"+
		"\u0013\u0000\u00c1\u00c2\u0005\u0002\u0000\u0000\u00c2\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c7\u0003 \u0010\u0000\u00c4\u00c7\u0003\u0018\f"+
		"\u0000\u00c5\u00c7\u0003\"\u0011\u0000\u00c6\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u0011\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0006\u0000\u0000"+
		"\u00c9\u00ca\u0005>\u0000\u0000\u00ca\u00cc\u0005\u0007\u0000\u0000\u00cb"+
		"\u00cd\u0003(\u0014\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005\b\u0000\u0000\u00cf\u00d0\u0005\u0004\u0000\u0000\u00d0\u00d1\u0003"+
		"R)\u0000\u00d1\u00d2\u0005\u0005\u0000\u0000\u00d2\u0013\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d5\u0003\u0084B\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\u0006\u0000\u0000\u00d7\u00d8\u0003\u0016\u000b\u0000"+
		"\u00d8\u00da\u0005\u0007\u0000\u0000\u00d9\u00db\u0003(\u0014\u0000\u00da"+
		"\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd\u00de"+
		"\u0005\u0004\u0000\u0000\u00de\u00df\u0003R)\u0000\u00df\u00e0\u0005\u0005"+
		"\u0000\u0000\u00e0\u0015\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005>\u0000"+
		"\u0000\u00e2\u00e4\u0005\t\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005>\u0000\u0000\u00e6\u0017\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e9\u0003\u001e\u000f\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u00053\u0000\u0000\u00eb\u00ec\u0005\u0006\u0000\u0000\u00ec\u00ed"+
		"\u0005>\u0000\u0000\u00ed\u00ef\u0005\u0007\u0000\u0000\u00ee\u00f0\u0003"+
		"(\u0014\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\b\u0000"+
		"\u0000\u00f2\u00f3\u0005\n\u0000\u0000\u00f3\u00f4\u0003\u001a\r\u0000"+
		"\u00f4\u00f5\u0005\u0002\u0000\u0000\u00f5\u0019\u0001\u0000\u0000\u0000"+
		"\u00f6\u00fb\u0003\u001c\u000e\u0000\u00f7\u00f8\u0005\u000b\u0000\u0000"+
		"\u00f8\u00fa\u0003\u001c\u000e\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u001b\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0007\u0000\u0000\u0000"+
		"\u00ff\u001d\u0001\u0000\u0000\u0000\u0100\u0101\u0007\u0001\u0000\u0000"+
		"\u0101\u001f\u0001\u0000\u0000\u0000\u0102\u0103\u0003\u0082A\u0000\u0103"+
		"\u0105\u0005\u0007\u0000\u0000\u0104\u0106\u0003(\u0014\u0000\u0105\u0104"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0005\b\u0000\u0000\u0108\u0109\u0005"+
		"\u0004\u0000\u0000\u0109\u010a\u0003R)\u0000\u010a\u010b\u0005\u0005\u0000"+
		"\u0000\u010b!\u0001\u0000\u0000\u0000\u010c\u010e\u0003\u001e\u000f\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0111\u00053\u0000\u0000\u0110"+
		"\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0003\u0082A\u0000\u0113\u0115"+
		"\u0005\u0007\u0000\u0000\u0114\u0116\u0003(\u0014\u0000\u0115\u0114\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0005\b\u0000\u0000\u0118\u0119\u0005\n"+
		"\u0000\u0000\u0119\u011a\u0003\u001a\r\u0000\u011a\u011b\u0005\u0002\u0000"+
		"\u0000\u011b#\u0001\u0000\u0000\u0000\u011c\u011d\u0005\f\u0000\u0000"+
		"\u011d\u011e\u0003\u0082A\u0000\u011e\u011f\u0003P(\u0000\u011f%\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0003~?\u0000\u0121\u0122\u0005>\u0000"+
		"\u0000\u0122\u0129\u0001\u0000\u0000\u0000\u0123\u0124\u0003~?\u0000\u0124"+
		"\u0125\u0005>\u0000\u0000\u0125\u0126\u0005\r\u0000\u0000\u0126\u0127"+
		"\u0003,\u0016\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0120\u0001"+
		"\u0000\u0000\u0000\u0128\u0123\u0001\u0000\u0000\u0000\u0129\'\u0001\u0000"+
		"\u0000\u0000\u012a\u012f\u0003*\u0015\u0000\u012b\u012c\u0005\u000e\u0000"+
		"\u0000\u012c\u012e\u0003*\u0015\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130)\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0134\u00051\u0000\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136"+
		"\u0001\u0000\u0000\u0000\u0135\u0137\u00054\u0000\u0000\u0136\u0135\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0003~?\u0000\u0139\u013a\u0005>\u0000"+
		"\u0000\u013a+\u0001\u0000\u0000\u0000\u013b\u013c\u00032\u0019\u0000\u013c"+
		"-\u0001\u0000\u0000\u0000\u013d\u013e\u0003H$\u0000\u013e\u013f\u0005"+
		"\r\u0000\u0000\u013f\u0140\u0003,\u0016\u0000\u0140/\u0001\u0000\u0000"+
		"\u0000\u0141\u0147\u00032\u0019\u0000\u0142\u0143\u0005\u000f\u0000\u0000"+
		"\u0143\u0144\u0003,\u0016\u0000\u0144\u0145\u0005\t\u0000\u0000\u0145"+
		"\u0146\u0003,\u0016\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0142"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u01481\u0001"+
		"\u0000\u0000\u0000\u0149\u014e\u00034\u001a\u0000\u014a\u014b\u0005\u0010"+
		"\u0000\u0000\u014b\u014d\u00034\u001a\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f3\u0001\u0000\u0000\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0156\u00036\u001b\u0000\u0152"+
		"\u0153\u0005\u0011\u0000\u0000\u0153\u0155\u00036\u001b\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u01575\u0001"+
		"\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015e\u0003"+
		"8\u001c\u0000\u015a\u015b\u0007\u0002\u0000\u0000\u015b\u015d\u00038\u001c"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000"+
		"\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f7\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0161\u0165\u0003<\u001e\u0000\u0162\u0163\u0003:\u001d\u0000\u0163\u0164"+
		"\u0003<\u001e\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0162\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u01669\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0007\u0003\u0000\u0000\u0168;\u0001\u0000\u0000"+
		"\u0000\u0169\u016e\u0003>\u001f\u0000\u016a\u016b\u0007\u0004\u0000\u0000"+
		"\u016b\u016d\u0003>\u001f\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d"+
		"\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f=\u0001\u0000\u0000\u0000\u0170\u016e"+
		"\u0001\u0000\u0000\u0000\u0171\u0176\u0003@ \u0000\u0172\u0173\u0007\u0005"+
		"\u0000\u0000\u0173\u0175\u0003@ \u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177?\u0001\u0000\u0000\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u001d\u0000\u0000\u017a"+
		"\u017e\u0003@ \u0000\u017b\u017e\u0003D\"\u0000\u017c\u017e\u0003B!\u0000"+
		"\u017d\u0179\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017d\u017c\u0001\u0000\u0000\u0000\u017eA\u0001\u0000\u0000\u0000\u017f"+
		"\u0182\u0003F#\u0000\u0180\u0182\u0003H$\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182C\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005\u0007\u0000\u0000\u0184\u0185\u0003~?\u0000\u0185"+
		"\u0186\u0005\b\u0000\u0000\u0186\u0187\u0003@ \u0000\u0187E\u0001\u0000"+
		"\u0000\u0000\u0188\u018b\u0003J%\u0000\u0189\u018b\u0003\u0080@\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000"+
		"\u018bG\u0001\u0000\u0000\u0000\u018c\u0190\u0003J%\u0000\u018d\u018f"+
		"\u0003N\'\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u019a\u0001\u0000\u0000\u0000\u0192\u0190\u0001"+
		"\u0000\u0000\u0000\u0193\u0195\u0003\u0082A\u0000\u0194\u0196\u0003N\'"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u018c\u0001\u0000\u0000"+
		"\u0000\u0199\u0193\u0001\u0000\u0000\u0000\u019aI\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005\u0007\u0000\u0000\u019c\u019d\u0003,\u0016\u0000\u019d"+
		"\u019e\u0005\b\u0000\u0000\u019e\u01ab\u0001\u0000\u0000\u0000\u019f\u01a3"+
		"\u0005>\u0000\u0000\u01a0\u01a2\u0003L&\u0000\u01a1\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01ab\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01ab\u0005&\u0000"+
		"\u0000\u01a7\u01ab\u0005\'\u0000\u0000\u01a8\u01ab\u0003$\u0012\u0000"+
		"\u01a9\u01ab\u0005%\u0000\u0000\u01aa\u019b\u0001\u0000\u0000\u0000\u01aa"+
		"\u019f\u0001\u0000\u0000\u0000\u01aa\u01a6\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a7\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a9\u0001\u0000\u0000\u0000\u01abK\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0005\u001e\u0000\u0000\u01ad\u01ae\u00030\u0018\u0000\u01ae\u01af\u0005"+
		"\u001f\u0000\u0000\u01afM\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u000b"+
		"\u0000\u0000\u01b1\u01b2\u0003J%\u0000\u01b2O\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b5\u0005\u0007\u0000\u0000\u01b4\u01b6\u0003|>\u0000\u01b5\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\b\u0000\u0000\u01b8Q\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bb\u0003V+\u0000\u01ba\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bdS\u0001\u0000\u0000\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c0\u0003\u0016\u000b\u0000"+
		"\u01c0\u01c1\u0003P(\u0000\u01c1\u01ca\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0005&\u0000\u0000\u01c3\u01ca\u0003P(\u0000\u01c4\u01c5\u0005\'\u0000"+
		"\u0000\u01c5\u01ca\u0003P(\u0000\u01c6\u01c7\u0003B!\u0000\u01c7\u01c8"+
		"\u0003P(\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c2\u0001\u0000\u0000\u0000\u01c9\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01caU\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0003&\u0013\u0000\u01cc\u01cd\u0005\u0002\u0000\u0000"+
		"\u01cd\u01e4\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003.\u0017\u0000\u01cf"+
		"\u01d0\u0005\u0002\u0000\u0000\u01d0\u01e4\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0003T*\u0000\u01d2\u01d3\u0005\u0002\u0000\u0000\u01d3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01d4\u01e4\u0003\\.\u0000\u01d5\u01e4\u0003b1\u0000"+
		"\u01d6\u01e4\u0003l6\u0000\u01d7\u01d8\u0003p8\u0000\u01d8\u01d9\u0005"+
		"\u0002\u0000\u0000\u01d9\u01e4\u0001\u0000\u0000\u0000\u01da\u01e4\u0005"+
		"\u0002\u0000\u0000\u01db\u01dc\u0003t:\u0000\u01dc\u01dd\u0005\u0002\u0000"+
		"\u0000\u01dd\u01e4\u0001\u0000\u0000\u0000\u01de\u01e4\u0003v;\u0000\u01df"+
		"\u01e0\u0003Z-\u0000\u01e0\u01e1\u0005\u0002\u0000\u0000\u01e1\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e4\u0003X,\u0000\u01e3\u01cb\u0001\u0000\u0000"+
		"\u0000\u01e3\u01ce\u0001\u0000\u0000\u0000\u01e3\u01d1\u0001\u0000\u0000"+
		"\u0000\u01e3\u01d4\u0001\u0000\u0000\u0000\u01e3\u01d5\u0001\u0000\u0000"+
		"\u0000\u01e3\u01d6\u0001\u0000\u0000\u0000\u01e3\u01d7\u0001\u0000\u0000"+
		"\u0000\u01e3\u01da\u0001\u0000\u0000\u0000\u01e3\u01db\u0001\u0000\u0000"+
		"\u0000\u01e3\u01de\u0001\u0000\u0000\u0000\u01e3\u01df\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4W\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0005$\u0000\u0000\u01e6Y\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0007\u0006\u0000\u0000\u01e8[\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005"+
		"(\u0000\u0000\u01ea\u01eb\u0005\u0007\u0000\u0000\u01eb\u01ec\u0003,\u0016"+
		"\u0000\u01ec\u01ed\u0005\b\u0000\u0000\u01ed\u01f3\u0003`0\u0000\u01ee"+
		"\u01f1\u0005)\u0000\u0000\u01ef\u01f2\u0003^/\u0000\u01f0\u01f2\u0003"+
		"`0\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4]\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0003\\.\u0000\u01f6_\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0003x<\u0000\u01f8a\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005+\u0000"+
		"\u0000\u01fa\u01fb\u0005\u0007\u0000\u0000\u01fb\u01fc\u0003f3\u0000\u01fc"+
		"\u01fd\u0005\b\u0000\u0000\u01fd\u01fe\u0003d2\u0000\u01fec\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0003x<\u0000\u0200e\u0001\u0000\u0000\u0000"+
		"\u0201\u0203\u0003h4\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0206"+
		"\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0207\u0209\u0005\u0002\u0000\u0000\u0208\u020a"+
		"\u0003,\u0016\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0005"+
		"\u0002\u0000\u0000\u020c\u020d\u0003j5\u0000\u020dg\u0001\u0000\u0000"+
		"\u0000\u020e\u0211\u0003&\u0013\u0000\u020f\u0211\u0003.\u0017\u0000\u0210"+
		"\u020e\u0001\u0000\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0211"+
		"i\u0001\u0000\u0000\u0000\u0212\u0214\u0003.\u0017\u0000\u0213\u0212\u0001"+
		"\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216k\u0001\u0000"+
		"\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u0219\u0005*\u0000"+
		"\u0000\u0219\u021a\u0005\u0007\u0000\u0000\u021a\u021b\u0003,\u0016\u0000"+
		"\u021b\u021c\u0005\b\u0000\u0000\u021c\u021d\u0003n7\u0000\u021dm\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0003x<\u0000\u021fo\u0001\u0000\u0000"+
		"\u0000\u0220\u0221\u0005,\u0000\u0000\u0221\u0222\u0003r9\u0000\u0222"+
		"\u0223\u0005*\u0000\u0000\u0223\u0224\u0005\u0007\u0000\u0000\u0224\u0225"+
		"\u0003,\u0016\u0000\u0225\u0226\u0005\b\u0000\u0000\u0226q\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0003x<\u0000\u0228s\u0001\u0000\u0000\u0000"+
		"\u0229\u022a\u0003z=\u0000\u022au\u0001\u0000\u0000\u0000\u022b\u022c"+
		"\u0005-\u0000\u0000\u022c\u022d\u0003x<\u0000\u022d\u022e\u0005.\u0000"+
		"\u0000\u022e\u022f\u0005\u0007\u0000\u0000\u022f\u0230\u0005>\u0000\u0000"+
		"\u0230\u0231\u0005\b\u0000\u0000\u0231\u0232\u0005\u0002\u0000\u0000\u0232"+
		"w\u0001\u0000\u0000\u0000\u0233\u0237\u0005\u0004\u0000\u0000\u0234\u0236"+
		"\u0003V+\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000"+
		"\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000"+
		"\u0000\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0005\u0005\u0000\u0000\u023by\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0005>\u0000\u0000\u023d\u023e\u0007\u0007\u0000\u0000"+
		"\u023e{\u0001\u0000\u0000\u0000\u023f\u0244\u0003,\u0016\u0000\u0240\u0241"+
		"\u0005\u000e\u0000\u0000\u0241\u0243\u0003,\u0016\u0000\u0242\u0240\u0001"+
		"\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0242\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245}\u0001\u0000"+
		"\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247\u024b\u0005\"\u0000"+
		"\u0000\u0248\u024b\u0005#\u0000\u0000\u0249\u024b\u0003\u0082A\u0000\u024a"+
		"\u0247\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a"+
		"\u0249\u0001\u0000\u0000\u0000\u024b\u007f\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0007\b\u0000\u0000\u024d\u0081\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\u0005>\u0000\u0000\u024f\u0251\u0005\t\u0000\u0000\u0250\u024e\u0001"+
		"\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0001"+
		"\u0000\u0000\u0000\u0252\u0259\u0005?\u0000\u0000\u0253\u0254\u0005>\u0000"+
		"\u0000\u0254\u0256\u0005\t\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000"+
		"\u0257\u0259\u00059\u0000\u0000\u0258\u0250\u0001\u0000\u0000\u0000\u0258"+
		"\u0255\u0001\u0000\u0000\u0000\u0259\u0083\u0001\u0000\u0000\u0000\u025a"+
		"\u025b\u0003\u0016\u000b\u0000\u025b\u0085\u0001\u0000\u0000\u00009\u0087"+
		"\u008c\u009a\u009d\u00a0\u00a6\u00ad\u00af\u00b5\u00bb\u00c6\u00cc\u00d4"+
		"\u00da\u00e3\u00e8\u00ef\u00fb\u0105\u010d\u0110\u0115\u0128\u012f\u0133"+
		"\u0136\u0147\u014e\u0156\u015e\u0165\u016e\u0176\u017d\u0181\u018a\u0190"+
		"\u0197\u0199\u01a3\u01aa\u01b5\u01bc\u01c9\u01e3\u01f1\u01f3\u0204\u0209"+
		"\u0210\u0215\u0237\u0244\u024a\u0250\u0255\u0258";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}