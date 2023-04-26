// Generated from c:\Users\g-g-e\OneDrive - UNIVERSIDAD BLAS PASCAL\Facu\11-cuatri\TC\TPs\TC-1\src\main\java\compiladores\parentesis.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class parentesisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PI=1, PD=2, LI=3, LD=4, CI=5, CD=6, WS=7;
	public static final int
		RULE_si = 0, RULE_s = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"si", "s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PI", "PD", "LI", "LD", "CI", "CD", "WS"
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
	public String getGrammarFileName() { return "parentesis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parentesisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SiContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode EOF() { return getToken(parentesisParser.EOF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parentesisVisitor ) return ((parentesisVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_si);
		try {
			setState(6);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				match(EOF);
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

	public static class SContext extends ParserRuleContext {
		public TerminalNode LI() { return getToken(parentesisParser.LI, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public TerminalNode LD() { return getToken(parentesisParser.LD, 0); }
		public TerminalNode PI() { return getToken(parentesisParser.PI, 0); }
		public TerminalNode PD() { return getToken(parentesisParser.PD, 0); }
		public TerminalNode CI() { return getToken(parentesisParser.CI, 0); }
		public TerminalNode CD() { return getToken(parentesisParser.CD, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parentesisVisitor ) return ((parentesisVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LI:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(LI);
				setState(9);
				s();
				setState(10);
				match(LD);
				setState(11);
				s();
				}
				break;
			case PI:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(PI);
				setState(14);
				s();
				setState(15);
				match(PD);
				setState(16);
				s();
				}
				break;
			case CI:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(CI);
				setState(19);
				s();
				setState(20);
				match(CD);
				setState(21);
				s();
				}
				break;
			case EOF:
			case PD:
			case LD:
			case CD:
				enterOuterAlt(_localctx, 4);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\35\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\5\2\t\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\33\n\3\3\3\2\2\4\2\4\2\2\2\36\2\b\3\2\2\2\4\32\3"+
		"\2\2\2\6\t\5\4\3\2\7\t\7\2\2\3\b\6\3\2\2\2\b\7\3\2\2\2\t\3\3\2\2\2\n\13"+
		"\7\5\2\2\13\f\5\4\3\2\f\r\7\6\2\2\r\16\5\4\3\2\16\33\3\2\2\2\17\20\7\3"+
		"\2\2\20\21\5\4\3\2\21\22\7\4\2\2\22\23\5\4\3\2\23\33\3\2\2\2\24\25\7\7"+
		"\2\2\25\26\5\4\3\2\26\27\7\b\2\2\27\30\5\4\3\2\30\33\3\2\2\2\31\33\3\2"+
		"\2\2\32\n\3\2\2\2\32\17\3\2\2\2\32\24\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2"+
		"\2\4\b\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}