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
		MULT=11, DIV=12, MOD=13, COMP=14, NUMERO=15, INT=16, IF_TOKEN=17, ELSE_TOKEN=18, 
		WHILE=19, ID=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CI", "CD", "PYC", "PA", "PC", "LLA", "LLC", "COMA", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "COMP", "LETRA", "DIGITO", "NUMERO", "INT", "IF_TOKEN", 
			"ELSE_TOKEN", "WHILE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "';'", "'('", "')'", "'{'", "'}'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'%'", null, null, "'int'", "'if'", "'else'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CI", "CD", "PYC", "PA", "PC", "LLA", "LLC", "COMA", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "COMP", "NUMERO", "INT", "IF_TOKEN", "ELSE_TOKEN", 
			"WHILE", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17Z\n\17\3\20\3\20\3\21\3\21\3\22"+
		"\6\22a\n\22\r\22\16\22b\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27y\n\27\3\27"+
		"\3\27\3\27\7\27~\n\27\f\27\16\27\u0081\13\27\3\30\3\30\3\30\3\30\2\2\31"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\2!\2#\21%\22\'\23)\24+\25-\26/\27\3\2\6\4\2>>@@\4\2C\\c|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\2\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;"+
		"\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31"+
		"G\3\2\2\2\33I\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#`\3\2\2\2%d\3"+
		"\2\2\2\'h\3\2\2\2)k\3\2\2\2+p\3\2\2\2-x\3\2\2\2/\u0082\3\2\2\2\61\62\7"+
		"]\2\2\62\4\3\2\2\2\63\64\7_\2\2\64\6\3\2\2\2\65\66\7=\2\2\66\b\3\2\2\2"+
		"\678\7*\2\28\n\3\2\2\29:\7+\2\2:\f\3\2\2\2;<\7}\2\2<\16\3\2\2\2=>\7\177"+
		"\2\2>\20\3\2\2\2?@\7.\2\2@\22\3\2\2\2AB\7-\2\2B\24\3\2\2\2CD\7/\2\2D\26"+
		"\3\2\2\2EF\7,\2\2F\30\3\2\2\2GH\7\61\2\2H\32\3\2\2\2IJ\7\'\2\2J\34\3\2"+
		"\2\2KZ\7?\2\2LM\7?\2\2MZ\7?\2\2NZ\t\2\2\2OP\7?\2\2PZ\7@\2\2QR\7?\2\2R"+
		"Z\7>\2\2ST\7~\2\2TZ\7~\2\2UV\7(\2\2VZ\7(\2\2WX\7#\2\2XZ\7?\2\2YK\3\2\2"+
		"\2YL\3\2\2\2YN\3\2\2\2YO\3\2\2\2YQ\3\2\2\2YS\3\2\2\2YU\3\2\2\2YW\3\2\2"+
		"\2Z\36\3\2\2\2[\\\t\3\2\2\\ \3\2\2\2]^\t\4\2\2^\"\3\2\2\2_a\5!\21\2`_"+
		"\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c$\3\2\2\2de\7k\2\2ef\7p\2\2fg\7"+
		"v\2\2g&\3\2\2\2hi\7k\2\2ij\7h\2\2j(\3\2\2\2kl\7g\2\2lm\7n\2\2mn\7u\2\2"+
		"no\7g\2\2o*\3\2\2\2pq\7y\2\2qr\7j\2\2rs\7k\2\2st\7n\2\2tu\7g\2\2u,\3\2"+
		"\2\2vy\5\37\20\2wy\7a\2\2xv\3\2\2\2xw\3\2\2\2y\177\3\2\2\2z~\5\37\20\2"+
		"{~\5!\21\2|~\7a\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080.\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\t\5\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\30\2\2\u0085\60\3\2\2\2\b\2"+
		"Ybx}\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}