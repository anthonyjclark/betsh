// Generated from /Users/ajc/Documents/projects/betsh/Betsh.g4 by ANTLR 4.7.2
package com.betsh;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BetshParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, IDENTIFIER=2, NUMBER=3, STRING=4, PLUS=5, MINUS=6, STAR=7, SLASH=8, 
		CARET=9, EQUAL=10, LEFTPAREN=11, RIGHTPAREN=12, SEMICOLON=13, QUOTE=14, 
		WS=15, COMMENT=16;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_arithmeticExpression = 3, 
		RULE_atom = 4, RULE_stringExpression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression", "arithmeticExpression", "atom", 
			"stringExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'", "'='", 
			"'('", "')'", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "IDENTIFIER", "NUMBER", "STRING", "PLUS", "MINUS", "STAR", 
			"SLASH", "CARET", "EQUAL", "LEFTPAREN", "RIGHTPAREN", "SEMICOLON", "QUOTE", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "Betsh.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BetshParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BetshParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET) {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationContext extends StatementContext {
		public TerminalNode LET() { return getToken(BetshParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BetshParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(BetshParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BetshParser.SEMICOLON, 0); }
		public DeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitDeclaration(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			_localctx = new DeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(LET);
			setState(21);
			match(IDENTIFIER);
			setState(22);
			match(EQUAL);
			setState(23);
			expression();
			setState(24);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends ExpressionContext {
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitString(this);
		}
	}
	public static class ArithmeticContext extends ExpressionContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public ArithmeticContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitArithmetic(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUMBER:
			case LEFTPAREN:
				_localctx = new ArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				arithmeticExpression(0);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				stringExpression();
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
	 
		public ArithmeticExpressionContext() { }
		public void copyFrom(ArithmeticExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IgnoreContext extends ArithmeticExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public IgnoreContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitIgnore(this);
		}
	}
	public static class BinaryOpContext extends ArithmeticExpressionContext {
		public Token op;
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BetshParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BetshParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(BetshParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(BetshParser.SLASH, 0); }
		public TerminalNode CARET() { return getToken(BetshParser.CARET, 0); }
		public BinaryOpContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitBinaryOp(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IgnoreContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(31);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryOpContext(new ArithmeticExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(33);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(34);
					((BinaryOpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << CARET))) != 0)) ) {
						((BinaryOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(35);
					atom();
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends AtomContext {
		public TerminalNode IDENTIFIER() { return getToken(BetshParser.IDENTIFIER, 0); }
		public IdentifierContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitIdentifier(this);
		}
	}
	public static class NumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(BetshParser.NUMBER, 0); }
		public NumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitNumber(this);
		}
	}
	public static class ParenthesizedContext extends AtomContext {
		public TerminalNode LEFTPAREN() { return getToken(BetshParser.LEFTPAREN, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(BetshParser.RIGHTPAREN, 0); }
		public ParenthesizedContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterParenthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitParenthesized(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(IDENTIFIER);
				}
				break;
			case LEFTPAREN:
				_localctx = new ParenthesizedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(LEFTPAREN);
				setState(44);
				arithmeticExpression(0);
				setState(45);
				match(RIGHTPAREN);
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

	public static class StringExpressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BetshParser.STRING, 0); }
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BetshListener ) ((BetshListener)listener).exitStringExpression(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		case 3:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\'\n\5\f\5\16\5*\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\7\3"+
		"\7\3\7\2\3\b\b\2\4\6\b\n\f\2\3\3\2\7\13\2\64\2\21\3\2\2\2\4\26\3\2\2\2"+
		"\6\36\3\2\2\2\b \3\2\2\2\n\61\3\2\2\2\f\63\3\2\2\2\16\20\5\4\3\2\17\16"+
		"\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21"+
		"\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\27\7\3\2\2\27\30\7\4\2\2\30\31"+
		"\7\f\2\2\31\32\5\6\4\2\32\33\7\17\2\2\33\5\3\2\2\2\34\37\5\b\5\2\35\37"+
		"\5\f\7\2\36\34\3\2\2\2\36\35\3\2\2\2\37\7\3\2\2\2 !\b\5\1\2!\"\5\n\6\2"+
		"\"(\3\2\2\2#$\f\4\2\2$%\t\2\2\2%\'\5\n\6\2&#\3\2\2\2\'*\3\2\2\2(&\3\2"+
		"\2\2()\3\2\2\2)\t\3\2\2\2*(\3\2\2\2+\62\7\5\2\2,\62\7\4\2\2-.\7\r\2\2"+
		"./\5\b\5\2/\60\7\16\2\2\60\62\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2"+
		"\2\2\62\13\3\2\2\2\63\64\7\6\2\2\64\r\3\2\2\2\6\21\36(\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}