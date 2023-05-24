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
		CI=1, CD=2, PYC=3, PA=4, PC=5, LLA=6, LLC=7, ASIGN=8, COMA=9, SUMA=10, 
		RESTA=11, MULT=12, DIV=13, MOD=14, COMP=15, INC=16, DEC=17, TIPO=18, NUMERO=19, 
		IF_TOKEN=20, ELSE_TOKEN=21, FOR=22, WHILE=23, ID=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CI", "CD", "PYC", "PA", "PC", "LLA", "LLC", "ASIGN", "COMA", "SUMA", 
			"RESTA", "MULT", "DIV", "MOD", "COMP", "INC", "DEC", "TIPO", "LETRA", 
			"DIGITO", "NUMERO", "IF_TOKEN", "ELSE_TOKEN", "FOR", "WHILE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "';'", "'('", "')'", "'{'", "'}'", "'='", "','", 
			"'+'", "'-'", "'*'", "'/'", "'%'", null, "'++'", "'--'", null, null, 
			"'if'", "'else'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CI", "CD", "PYC", "PA", "PC", "LLA", "LLC", "ASIGN", "COMA", "SUMA", 
			"RESTA", "MULT", "DIV", "MOD", "COMP", "INC", "DEC", "TIPO", "NUMERO", 
			"IF_TOKEN", "ELSE_TOKEN", "FOR", "WHILE", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20c\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u009e\n\23\3\24\3\24\3\25\3\25\3\26\6\26"+
		"\u00a5\n\26\r\26\16\26\u00a6\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u00bd"+
		"\n\33\3\33\3\33\3\33\7\33\u00c2\n\33\f\33\16\33\u00c5\13\33\3\34\3\34"+
		"\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\25-\26/\27\61\30\63\31\65\32"+
		"\67\33\3\2\6\4\2>>@@\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00db\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13"+
		"A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27"+
		"M\3\2\2\2\31O\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37b\3\2\2\2!d\3\2\2\2#g"+
		"\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3\2\2\2"+
		"-\u00a8\3\2\2\2/\u00ab\3\2\2\2\61\u00b0\3\2\2\2\63\u00b4\3\2\2\2\65\u00bc"+
		"\3\2\2\2\67\u00c6\3\2\2\29:\7]\2\2:\4\3\2\2\2;<\7_\2\2<\6\3\2\2\2=>\7"+
		"=\2\2>\b\3\2\2\2?@\7*\2\2@\n\3\2\2\2AB\7+\2\2B\f\3\2\2\2CD\7}\2\2D\16"+
		"\3\2\2\2EF\7\177\2\2F\20\3\2\2\2GH\7?\2\2H\22\3\2\2\2IJ\7.\2\2J\24\3\2"+
		"\2\2KL\7-\2\2L\26\3\2\2\2MN\7/\2\2N\30\3\2\2\2OP\7,\2\2P\32\3\2\2\2QR"+
		"\7\61\2\2R\34\3\2\2\2ST\7\'\2\2T\36\3\2\2\2UV\7?\2\2Vc\7?\2\2Wc\t\2\2"+
		"\2XY\7?\2\2Yc\7@\2\2Z[\7?\2\2[c\7>\2\2\\]\7~\2\2]c\7~\2\2^_\7(\2\2_c\7"+
		"(\2\2`a\7#\2\2ac\7?\2\2bU\3\2\2\2bW\3\2\2\2bX\3\2\2\2bZ\3\2\2\2b\\\3\2"+
		"\2\2b^\3\2\2\2b`\3\2\2\2c \3\2\2\2de\7-\2\2ef\7-\2\2f\"\3\2\2\2gh\7/\2"+
		"\2hi\7/\2\2i$\3\2\2\2jk\7x\2\2kl\7q\2\2lm\7k\2\2m\u009e\7f\2\2no\7e\2"+
		"\2op\7j\2\2pq\7c\2\2q\u009e\7t\2\2rs\7u\2\2st\7j\2\2tu\7q\2\2uv\7t\2\2"+
		"v\u009e\7v\2\2wx\7k\2\2xy\7p\2\2y\u009e\7v\2\2z{\7n\2\2{|\7q\2\2|}\7p"+
		"\2\2}\u009e\7i\2\2~\177\7h\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u009e\7v\2\2\u0083\u0084\7f\2\2\u0084\u0085\7q\2\2"+
		"\u0085\u0086\7w\2\2\u0086\u0087\7d\2\2\u0087\u0088\7n\2\2\u0088\u009e"+
		"\7g\2\2\u0089\u008a\7u\2\2\u008a\u008b\7k\2\2\u008b\u008c\7i\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7g\2\2\u008e\u009e\7f\2\2\u008f\u0090\7w\2\2"+
		"\u0090\u0091\7p\2\2\u0091\u0092\7u\2\2\u0092\u0093\7k\2\2\u0093\u0094"+
		"\7i\2\2\u0094\u0095\7p\2\2\u0095\u0096\7g\2\2\u0096\u009e\7f\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2"+
		"\u009b\u009c\7p\2\2\u009c\u009e\7i\2\2\u009dj\3\2\2\2\u009dn\3\2\2\2\u009d"+
		"r\3\2\2\2\u009dw\3\2\2\2\u009dz\3\2\2\2\u009d~\3\2\2\2\u009d\u0083\3\2"+
		"\2\2\u009d\u0089\3\2\2\2\u009d\u008f\3\2\2\2\u009d\u0097\3\2\2\2\u009e"+
		"&\3\2\2\2\u009f\u00a0\t\3\2\2\u00a0(\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2"+
		"*\3\2\2\2\u00a3\u00a5\5)\25\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7"+
		"k\2\2\u00a9\u00aa\7h\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af\60\3\2\2\2\u00b0\u00b1"+
		"\7h\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3\62\3\2\2\2\u00b4\u00b5"+
		"\7y\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\64\3\2\2\2\u00ba\u00bd\5\'\24\2\u00bb\u00bd\7a\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c3\3\2\2\2\u00be\u00c2"+
		"\5\'\24\2\u00bf\u00c2\5)\25\2\u00c0\u00c2\7a\2\2\u00c1\u00be\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\66\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7"+
		"\t\5\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\34\2\2\u00c98\3\2\2\2\t\2b"+
		"\u009d\u00a6\u00bc\u00c1\u00c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}