// Generated from TrigFunctions.g4 by ANTLR 4.13.2

import java.util.*;
import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TrigFunctionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUMBER=6, WS=7;
	public static final int
		RULE_expr = 0, RULE_sin = 1, RULE_cos = 2, RULE_tan = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "sin", "cos", "tan"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Sin'", "'('", "')'", "'Cos'", "'Tan'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NUMBER", "WS"
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
	public String getGrammarFileName() { return "TrigFunctions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static void main(String[] args) throws Exception {
	        // Read from file
	        CharStream input = CharStreams.fromFileName("expr.in");
	        TrigFunctionsLexer lexer = new TrigFunctionsLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        TrigFunctionsParser parser = new TrigFunctionsParser(tokens);
	        ParseTree tree = parser.expr(); // parse the input
	        EvalVisitor eval = new EvalVisitor();
	        eval.visit(tree);
	    }

	public TrigFunctionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TrigFunctionsParser.EOF, 0); }
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public TanContext tan() {
			return getRuleContext(TanContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrigFunctionsListener ) ((TrigFunctionsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrigFunctionsListener ) ((TrigFunctionsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(8);
				sin();
				}
				break;
			case T__3:
				{
				setState(9);
				cos();
				}
				break;
			case T__4:
				{
				setState(10);
				tan();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(13);
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
	public static class SinContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TrigFunctionsParser.NUMBER, 0); }
		public SinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrigFunctionsListener ) ((TrigFunctionsListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrigFunctionsListener ) ((TrigFunctionsListener)listener).exitSin(this);
		}
	}

	public final SinContext sin() throws RecognitionException {
		SinContext _localctx = new SinContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(T__0);
			setState(16);
			match(T__1);
			setState(17);
			match(NUMBER);
			setState(18);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
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
	public static class CosContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TrigFunctionsParser.NUMBER, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrigFunctionsListener ) ((TrigFunctionsListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrigFunctionsListener ) ((TrigFunctionsListener)listener).exitCos(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__3);
			setState(21);
			match(T__1);
			setState(22);
			match(NUMBER);
			setState(23);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
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
	public static class TanContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TrigFunctionsParser.NUMBER, 0); }
		public TanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrigFunctionsListener ) ((TrigFunctionsListener)listener).enterTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrigFunctionsListener ) ((TrigFunctionsListener)listener).exitTan(this);
		}
	}

	public final TanContext tan() throws RecognitionException {
		TanContext _localctx = new TanContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__4);
			setState(26);
			match(T__1);
			setState(27);
			match(NUMBER);
			setState(28);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u0007\u001f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\f\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004"+
		"\u0006\u0000\u0000\u001c\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u000f"+
		"\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000\u0000\u0006\u0019"+
		"\u0001\u0000\u0000\u0000\b\f\u0003\u0002\u0001\u0000\t\f\u0003\u0004\u0002"+
		"\u0000\n\f\u0003\u0006\u0003\u0000\u000b\b\u0001\u0000\u0000\u0000\u000b"+
		"\t\u0001\u0000\u0000\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0005\u0001\u0000\u0000\u0010\u0011\u0005\u0002\u0000"+
		"\u0000\u0011\u0012\u0005\u0006\u0000\u0000\u0012\u0013\u0005\u0003\u0000"+
		"\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0004\u0000"+
		"\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0005\u0006\u0000"+
		"\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0005\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005\u0005\u0000\u0000\u001a\u001b\u0005\u0002\u0000"+
		"\u0000\u001b\u001c\u0005\u0006\u0000\u0000\u001c\u001d\u0005\u0003\u0000"+
		"\u0000\u001d\u0007\u0001\u0000\u0000\u0000\u0001\u000b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}