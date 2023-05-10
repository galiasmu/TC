// Generated from c:\Users\g-g-e\OneDrive - UNIVERSIDAD BLAS PASCAL\Facu\11-cuatri\TC\TPs\TC-1\src\main\java\compiladores\TP1.g4 by ANTLR 4.9.2
 
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
public class reglaSimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PYC=1, PA=2, PC=3, LLA=4, LLC=5, ASIGN=6, COMA=7, SUMA=8, RESTA=9, MULT=10, 
		DIV=11, MOD=12, COMP=13, NUMERO=14, INT=15, WHILE=16, ID=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PYC", "PA", "PC", "LLA", "LLC", "ASIGN", "COMA", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "COMP", "NUMERO", "INT", "WHILE", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "'='", "','", "'+'", "'-'", 
			"'*'", "'/'", "'%'", null, null, "'int'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PYC", "PA", "PC", "LLA", "LLC", "ASIGN", "COMA", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "COMP", "NUMERO", "INT", "WHILE", "ID", "WS"
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


	public reglaSimpleLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20O\n\20\3\21\6\21R\n\21"+
		"\r\21\16\21S\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\5\24b\n\24\3\24\3\24\3\24\7\24g\n\24\f\24\16\24j\13\24\3\25\3\25\3"+
		"\25\3\25\2\2\26\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24\3\2\6\4\2C\\c|\3\2\62;\4\2>>"+
		"@@\5\2\13\f\17\17\"\"\2t\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2"+
		"\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23"+
		";\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33C\3\2\2\2\35E\3\2\2\2"+
		"\37N\3\2\2\2!Q\3\2\2\2#U\3\2\2\2%Y\3\2\2\2\'a\3\2\2\2)k\3\2\2\2+,\t\2"+
		"\2\2,\4\3\2\2\2-.\t\3\2\2.\6\3\2\2\2/\60\7=\2\2\60\b\3\2\2\2\61\62\7*"+
		"\2\2\62\n\3\2\2\2\63\64\7+\2\2\64\f\3\2\2\2\65\66\7}\2\2\66\16\3\2\2\2"+
		"\678\7\177\2\28\20\3\2\2\29:\7?\2\2:\22\3\2\2\2;<\7.\2\2<\24\3\2\2\2="+
		">\7-\2\2>\26\3\2\2\2?@\7/\2\2@\30\3\2\2\2AB\7,\2\2B\32\3\2\2\2CD\7\61"+
		"\2\2D\34\3\2\2\2EF\7\'\2\2F\36\3\2\2\2GH\7?\2\2HO\7?\2\2IO\t\4\2\2JK\7"+
		"?\2\2KO\7@\2\2LM\7?\2\2MO\7>\2\2NG\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NL\3\2\2"+
		"\2O \3\2\2\2PR\5\5\3\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\"\3\2"+
		"\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X$\3\2\2\2YZ\7y\2\2Z[\7j\2\2[\\\7k\2\2"+
		"\\]\7n\2\2]^\7g\2\2^&\3\2\2\2_b\5\3\2\2`b\7a\2\2a_\3\2\2\2a`\3\2\2\2b"+
		"h\3\2\2\2cg\5\3\2\2dg\5\5\3\2eg\7a\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g"+
		"j\3\2\2\2hf\3\2\2\2hi\3\2\2\2i(\3\2\2\2jh\3\2\2\2kl\t\5\2\2lm\3\2\2\2"+
		"mn\b\25\2\2n*\3\2\2\2\b\2NSafh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}