// Generated from /home/galiasmu/Documents/TC/TC-1/src/main/java/compiladores/TP1.g4 by ANTLR 4.9.2
 
    package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TP1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CI=1, CD=2, PYC=3, PA=4, PC=5, LLA=6, LLC=7, COMA=8, SUMA=9, RESTA=10, 
		MULT=11, DIV=12, MOD=13, COMP=14, INC=15, DEC=16, TIPO=17, NUMERO=18, 
		IF_TOKEN=19, ELSE_TOKEN=20, WHILE=21, FOR=22, ID=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CI", "CD", "PYC", "PA", "PC", "LLA", "LLC", "COMA", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "COMP", "INC", "DEC", "TIPO", "LETRA", "DIGITO", 
			"NUMERO", "IF_TOKEN", "ELSE_TOKEN", "WHILE", "FOR", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "';'", "'('", "')'", "'{'", "'}'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'%'", null, "'++'", "'--'", null, null, "'if'", 
			"'else'", "'while'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CI", "CD", "PYC", "PA", "PC", "LLA", "LLC", "COMA", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "COMP", "INC", "DEC", "TIPO", "NUMERO", "IF_TOKEN", 
			"ELSE_TOKEN", "WHILE", "FOR", "ID", "WS"
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


	public TP1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TP1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"`\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u009b\n\22\3\23\3\23\3\24\3\24\3\25\6\25\u00a2\n\25\r"+
		"\25\16\25\u00a3\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u00ba\n\32\3\32\3\32"+
		"\3\32\7\32\u00bf\n\32\f\32\16\32\u00c2\13\32\3\33\3\33\3\33\3\33\2\2\34"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\2\'\2)\24+\25-\26/\27\61\30\63\31\65\32\3\2\6\4\2>>@@"+
		"\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2"+
		"\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2"+
		"\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2"+
		"\2\2\35_\3\2\2\2\37a\3\2\2\2!d\3\2\2\2#\u009a\3\2\2\2%\u009c\3\2\2\2\'"+
		"\u009e\3\2\2\2)\u00a1\3\2\2\2+\u00a5\3\2\2\2-\u00a8\3\2\2\2/\u00ad\3\2"+
		"\2\2\61\u00b3\3\2\2\2\63\u00b9\3\2\2\2\65\u00c3\3\2\2\2\678\7]\2\28\4"+
		"\3\2\2\29:\7_\2\2:\6\3\2\2\2;<\7=\2\2<\b\3\2\2\2=>\7*\2\2>\n\3\2\2\2?"+
		"@\7+\2\2@\f\3\2\2\2AB\7}\2\2B\16\3\2\2\2CD\7\177\2\2D\20\3\2\2\2EF\7."+
		"\2\2F\22\3\2\2\2GH\7-\2\2H\24\3\2\2\2IJ\7/\2\2J\26\3\2\2\2KL\7,\2\2L\30"+
		"\3\2\2\2MN\7\61\2\2N\32\3\2\2\2OP\7\'\2\2P\34\3\2\2\2Q`\7?\2\2RS\7?\2"+
		"\2S`\7?\2\2T`\t\2\2\2UV\7?\2\2V`\7@\2\2WX\7?\2\2X`\7>\2\2YZ\7~\2\2Z`\7"+
		"~\2\2[\\\7(\2\2\\`\7(\2\2]^\7#\2\2^`\7?\2\2_Q\3\2\2\2_R\3\2\2\2_T\3\2"+
		"\2\2_U\3\2\2\2_W\3\2\2\2_Y\3\2\2\2_[\3\2\2\2_]\3\2\2\2`\36\3\2\2\2ab\7"+
		"-\2\2bc\7-\2\2c \3\2\2\2de\7/\2\2ef\7/\2\2f\"\3\2\2\2gh\7x\2\2hi\7q\2"+
		"\2ij\7k\2\2j\u009b\7f\2\2kl\7e\2\2lm\7j\2\2mn\7c\2\2n\u009b\7t\2\2op\7"+
		"u\2\2pq\7j\2\2qr\7q\2\2rs\7t\2\2s\u009b\7v\2\2tu\7k\2\2uv\7p\2\2v\u009b"+
		"\7v\2\2wx\7n\2\2xy\7q\2\2yz\7p\2\2z\u009b\7i\2\2{|\7h\2\2|}\7n\2\2}~\7"+
		"q\2\2~\177\7c\2\2\177\u009b\7v\2\2\u0080\u0081\7f\2\2\u0081\u0082\7q\2"+
		"\2\u0082\u0083\7w\2\2\u0083\u0084\7d\2\2\u0084\u0085\7n\2\2\u0085\u009b"+
		"\7g\2\2\u0086\u0087\7u\2\2\u0087\u0088\7k\2\2\u0088\u0089\7i\2\2\u0089"+
		"\u008a\7p\2\2\u008a\u008b\7g\2\2\u008b\u009b\7f\2\2\u008c\u008d\7w\2\2"+
		"\u008d\u008e\7p\2\2\u008e\u008f\7u\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7i\2\2\u0091\u0092\7p\2\2\u0092\u0093\7g\2\2\u0093\u009b\7f\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7k\2\2"+
		"\u0098\u0099\7p\2\2\u0099\u009b\7i\2\2\u009ag\3\2\2\2\u009ak\3\2\2\2\u009a"+
		"o\3\2\2\2\u009at\3\2\2\2\u009aw\3\2\2\2\u009a{\3\2\2\2\u009a\u0080\3\2"+
		"\2\2\u009a\u0086\3\2\2\2\u009a\u008c\3\2\2\2\u009a\u0094\3\2\2\2\u009b"+
		"$\3\2\2\2\u009c\u009d\t\3\2\2\u009d&\3\2\2\2\u009e\u009f\t\4\2\2\u009f"+
		"(\3\2\2\2\u00a0\u00a2\5\'\24\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7"+
		"k\2\2\u00a6\u00a7\7h\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7n\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7g\2\2\u00ac.\3\2\2\2\u00ad\u00ae"+
		"\7y\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7q\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\62\3\2\2\2\u00b7\u00ba\5%\23\2\u00b8\u00ba\7a\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00c0\3\2\2\2\u00bb\u00bf"+
		"\5%\23\2\u00bc\u00bf\5\'\24\2\u00bd\u00bf\7a\2\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\64\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4"+
		"\t\5\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\33\2\2\u00c6\66\3\2\2\2\t\2"+
		"_\u009a\u00a3\u00b9\u00be\u00c0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}