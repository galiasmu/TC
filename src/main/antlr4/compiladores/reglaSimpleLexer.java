// Generated from /home/galiasmu/Documents/Facu/TC/TC/src/main/antlr4/compiladores/reglaSimple.g4 by ANTLR 4.13.1
 
    package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class reglaSimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "reglaSimple.g4"; }

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
		"\u0004\u0000\u0012m\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"M\b\u000e\u0001\u000f\u0004\u000fP\b\u000f\u000b\u000f\f\u000fQ\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012`\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012e\b\u0012"+
		"\n\u0012\f\u0012h\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003"+
		"\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019"+
		"\u000b\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012\u0001"+
		"\u0000\u0004\u0002\u0000AZaz\u0001\u000009\u0002\u0000<<>>\u0003\u0000"+
		"\t\n\r\r  r\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000"+
		"\u0000\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b"+
		"3\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f7\u0001\u0000"+
		"\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000"+
		"\u0015=\u0001\u0000\u0000\u0000\u0017?\u0001\u0000\u0000\u0000\u0019A"+
		"\u0001\u0000\u0000\u0000\u001bC\u0001\u0000\u0000\u0000\u001dL\u0001\u0000"+
		"\u0000\u0000\u001fO\u0001\u0000\u0000\u0000!S\u0001\u0000\u0000\u0000"+
		"#W\u0001\u0000\u0000\u0000%_\u0001\u0000\u0000\u0000\'i\u0001\u0000\u0000"+
		"\u0000)*\u0007\u0000\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0007"+
		"\u0001\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005;\u0000\u0000"+
		".\u0006\u0001\u0000\u0000\u0000/0\u0005(\u0000\u00000\b\u0001\u0000\u0000"+
		"\u000012\u0005)\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005{\u0000"+
		"\u00004\f\u0001\u0000\u0000\u000056\u0005}\u0000\u00006\u000e\u0001\u0000"+
		"\u0000\u000078\u0005=\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005"+
		",\u0000\u0000:\u0012\u0001\u0000\u0000\u0000;<\u0005+\u0000\u0000<\u0014"+
		"\u0001\u0000\u0000\u0000=>\u0005-\u0000\u0000>\u0016\u0001\u0000\u0000"+
		"\u0000?@\u0005*\u0000\u0000@\u0018\u0001\u0000\u0000\u0000AB\u0005/\u0000"+
		"\u0000B\u001a\u0001\u0000\u0000\u0000CD\u0005%\u0000\u0000D\u001c\u0001"+
		"\u0000\u0000\u0000EF\u0005=\u0000\u0000FM\u0005=\u0000\u0000GM\u0007\u0002"+
		"\u0000\u0000HI\u0005=\u0000\u0000IM\u0005>\u0000\u0000JK\u0005=\u0000"+
		"\u0000KM\u0005<\u0000\u0000LE\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000"+
		"\u0000LH\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000M\u001e\u0001"+
		"\u0000\u0000\u0000NP\u0003\u0003\u0001\u0000ON\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000R \u0001\u0000\u0000\u0000ST\u0005i\u0000\u0000TU\u0005n\u0000\u0000"+
		"UV\u0005t\u0000\u0000V\"\u0001\u0000\u0000\u0000WX\u0005w\u0000\u0000"+
		"XY\u0005h\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005"+
		"e\u0000\u0000\\$\u0001\u0000\u0000\u0000]`\u0003\u0001\u0000\u0000^`\u0005"+
		"_\u0000\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`f\u0001"+
		"\u0000\u0000\u0000ae\u0003\u0001\u0000\u0000be\u0003\u0003\u0001\u0000"+
		"ce\u0005_\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000g&\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000ij\u0007\u0003\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0006"+
		"\u0013\u0000\u0000l(\u0001\u0000\u0000\u0000\u0006\u0000LQ_df\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}