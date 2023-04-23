// Generated from /home/galiasmu/Documents/TC/TC/test-gramatica/src/main/java/compiladores/parentesis.g4 by ANTLR 4.9.2
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
		PA=1, PC=2, WS=3;
	public static final int
		RULE_programa = 0, RULE_balanceo = 1, RULE_parens = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "balanceo", "parens"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "WS"
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

	public static class ProgramaContext extends ParserRuleContext {
		public BalanceoContext balanceo() {
			return getRuleContext(BalanceoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(parentesisParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parentesisVisitor ) return ((parentesisVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			balanceo();
			setState(7);
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

	public static class BalanceoContext extends ParserRuleContext {
		public List<ParensContext> parens() {
			return getRuleContexts(ParensContext.class);
		}
		public ParensContext parens(int i) {
			return getRuleContext(ParensContext.class,i);
		}
		public BalanceoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanceo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).enterBalanceo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).exitBalanceo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parentesisVisitor ) return ((parentesisVisitor<? extends T>)visitor).visitBalanceo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalanceoContext balanceo() throws RecognitionException {
		BalanceoContext _localctx = new BalanceoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_balanceo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PA) {
				{
				{
				setState(9);
				parens();
				}
				}
				setState(14);
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

	public static class ParensContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(parentesisParser.PA, 0); }
		public BalanceoContext balanceo() {
			return getRuleContext(BalanceoContext.class,0);
		}
		public TerminalNode PC() { return getToken(parentesisParser.PC, 0); }
		public ParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parentesisListener ) ((parentesisListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parentesisVisitor ) return ((parentesisVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParensContext parens() throws RecognitionException {
		ParensContext _localctx = new ParensContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(PA);
			setState(16);
			balanceo();
			setState(17);
			match(PC);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\26\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\7\3\r\n\3\f\3\16\3\20\13\3\3\4\3\4\3\4\3"+
		"\4\3\4\2\2\5\2\4\6\2\2\2\23\2\b\3\2\2\2\4\16\3\2\2\2\6\21\3\2\2\2\b\t"+
		"\5\4\3\2\t\n\7\2\2\3\n\3\3\2\2\2\13\r\5\6\4\2\f\13\3\2\2\2\r\20\3\2\2"+
		"\2\16\f\3\2\2\2\16\17\3\2\2\2\17\5\3\2\2\2\20\16\3\2\2\2\21\22\7\3\2\2"+
		"\22\23\5\4\3\2\23\24\7\4\2\2\24\7\3\2\2\2\3\16";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}