// Generated from /home/galiasmu/Documents/TC/TC-1/src/main/java/compiladores/TP1.g4 by ANTLR 4.9.2
 
    package compiladores;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TP1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CI=1, CD=2, PYC=3, PA=4, PC=5, LLA=6, LLC=7, COMA=8, SUMA=9, RESTA=10, 
		MULT=11, DIV=12, MOD=13, COMP=14, INC=15, DEC=16, NUMERO=17, INT=18, IF_TOKEN=19, 
		ELSE_TOKEN=20, WHILE=21, FOR=22, ID=23, WS=24;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_asignacion = 4, RULE_declaracion = 5, RULE_inicializacion = 6, RULE_incremento = 7, 
		RULE_listaid = 8, RULE_iwhile = 9, RULE_fi = 10, RULE_rof = 11, RULE_comparacion = 12, 
		RULE_expresion = 13, RULE_termino = 14, RULE_exp = 15, RULE_term = 16, 
		RULE_factor = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "bloque", "asignacion", "declaracion", 
			"inicializacion", "incremento", "listaid", "iwhile", "fi", "rof", "comparacion", 
			"expresion", "termino", "exp", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "';'", "'('", "')'", "'{'", "'}'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'%'", null, "'++'", "'--'", null, "'int'", "'if'", 
			"'else'", "'while'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CI", "CD", "PYC", "PA", "PC", "LLA", "LLC", "COMA", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "COMP", "INC", "DEC", "NUMERO", "INT", "IF_TOKEN", 
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

	@Override
	public String getGrammarFileName() { return "TP1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TP1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TP1Parser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			instrucciones();
			setState(37);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLA:
			case INT:
			case IF_TOKEN:
			case WHILE:
			case FOR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				instruccion();
				setState(40);
				instrucciones();
				}
				break;
			case EOF:
			case LLC:
				enterOuterAlt(_localctx, 2);
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

	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public FiContext fi() {
			return getRuleContext(FiContext.class,0);
		}
		public RofContext rof() {
			return getRuleContext(RofContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				asignacion();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				declaracion();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				bloque();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				iwhile();
				}
				break;
			case IF_TOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				fi();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				rof();
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(TP1Parser.LLA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(TP1Parser.LLC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LLA);
			setState(54);
			instrucciones();
			setState(55);
			match(LLC);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TP1Parser.ID, 0); }
		public TerminalNode COMP() { return getToken(TP1Parser.COMP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(TP1Parser.PYC, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ID);
			setState(58);
			match(COMP);
			setState(59);
			expresion();
			setState(60);
			match(PYC);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TP1Parser.INT, 0); }
		public TerminalNode ID() { return getToken(TP1Parser.ID, 0); }
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public ListaidContext listaid() {
			return getRuleContext(ListaidContext.class,0);
		}
		public TerminalNode PYC() { return getToken(TP1Parser.PYC, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(INT);
			setState(63);
			match(ID);
			setState(64);
			inicializacion();
			setState(65);
			listaid();
			setState(66);
			match(PYC);
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

	public static class InicializacionContext extends ParserRuleContext {
		public TerminalNode COMP() { return getToken(TP1Parser.COMP, 0); }
		public TerminalNode NUMERO() { return getToken(TP1Parser.NUMERO, 0); }
		public InicializacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterInicializacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitInicializacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitInicializacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacionContext inicializacion() throws RecognitionException {
		InicializacionContext _localctx = new InicializacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inicializacion);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(COMP);
				setState(69);
				match(NUMERO);
				}
				break;
			case PYC:
			case COMA:
				enterOuterAlt(_localctx, 2);
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

	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TP1Parser.ID, 0); }
		public TerminalNode INC() { return getToken(TP1Parser.INC, 0); }
		public TerminalNode DEC() { return getToken(TP1Parser.DEC, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_incremento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
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

	public static class ListaidContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(TP1Parser.COMA, 0); }
		public TerminalNode ID() { return getToken(TP1Parser.ID, 0); }
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public ListaidContext listaid() {
			return getRuleContext(ListaidContext.class,0);
		}
		public ListaidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterListaid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitListaid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitListaid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaidContext listaid() throws RecognitionException {
		ListaidContext _localctx = new ListaidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaid);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(COMA);
				setState(77);
				match(ID);
				setState(78);
				inicializacion();
				setState(79);
				listaid();
				}
				break;
			case PYC:
				enterOuterAlt(_localctx, 2);
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TP1Parser.WHILE, 0); }
		public TerminalNode PA() { return getToken(TP1Parser.PA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TP1Parser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(WHILE);
			setState(85);
			match(PA);
			setState(86);
			comparacion();
			setState(87);
			match(PC);
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(88);
				bloque();
				}
				break;
			case 2:
				{
				setState(89);
				instruccion();
				}
				break;
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

	public static class FiContext extends ParserRuleContext {
		public TerminalNode IF_TOKEN() { return getToken(TP1Parser.IF_TOKEN, 0); }
		public TerminalNode PA() { return getToken(TP1Parser.PA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TP1Parser.PC, 0); }
		public TerminalNode ELSE_TOKEN() { return getToken(TP1Parser.ELSE_TOKEN, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public FiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiContext fi() throws RecognitionException {
		FiContext _localctx = new FiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IF_TOKEN);
			setState(93);
			match(PA);
			setState(94);
			comparacion();
			setState(95);
			match(PC);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(96);
				bloque();
				}
				break;
			case 2:
				{
				setState(97);
				instruccion();
				}
				break;
			}
			setState(100);
			match(ELSE_TOKEN);
			setState(101);
			bloque();
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

	public static class RofContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TP1Parser.FOR, 0); }
		public TerminalNode PA() { return getToken(TP1Parser.PA, 0); }
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(TP1Parser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(TP1Parser.PYC, i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public TerminalNode PC() { return getToken(TP1Parser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public RofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterRof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitRof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitRof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RofContext rof() throws RecognitionException {
		RofContext _localctx = new RofContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FOR);
			setState(104);
			match(PA);
			setState(105);
			inicializacion();
			setState(106);
			match(PYC);
			setState(107);
			comparacion();
			setState(108);
			match(PYC);
			setState(109);
			incremento();
			setState(110);
			match(PC);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(111);
				bloque();
				}
				break;
			case 2:
				{
				setState(112);
				instruccion();
				}
				break;
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

	public static class ComparacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode COMP() { return getToken(TP1Parser.COMP, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparacion);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				expresion();
				setState(116);
				match(COMP);
				setState(117);
				expresion();
				}
				break;
			case PYC:
			case PC:
				enterOuterAlt(_localctx, 2);
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			termino();
			setState(123);
			exp();
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			factor();
			setState(126);
			term();
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(TP1Parser.SUMA, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(TP1Parser.RESTA, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(SUMA);
				setState(129);
				termino();
				setState(130);
				exp();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(RESTA);
				setState(133);
				termino();
				setState(134);
				exp();
				}
				break;
			case PYC:
			case PC:
			case COMP:
				enterOuterAlt(_localctx, 3);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(TP1Parser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(TP1Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TP1Parser.MOD, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(MULT);
				setState(140);
				factor();
				setState(141);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(DIV);
				setState(144);
				factor();
				setState(145);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(MOD);
				setState(148);
				factor();
				setState(149);
				term();
				}
				break;
			case PYC:
			case PC:
			case SUMA:
			case RESTA:
			case COMP:
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(TP1Parser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(TP1Parser.ID, 0); }
		public TerminalNode PA() { return getToken(TP1Parser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TP1Parser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(PA);
				setState(157);
				expresion();
				setState(158);
				match(PC);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\66\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\5\bJ\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nU\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13]\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"e\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rt\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16{\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008c\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u009b\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00a3\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\3\3\2\21\22\2\u00a5\2&\3\2\2\2\4-\3\2\2\2\6\65"+
		"\3\2\2\2\b\67\3\2\2\2\n;\3\2\2\2\f@\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22"+
		"T\3\2\2\2\24V\3\2\2\2\26^\3\2\2\2\30i\3\2\2\2\32z\3\2\2\2\34|\3\2\2\2"+
		"\36\177\3\2\2\2 \u008b\3\2\2\2\"\u009a\3\2\2\2$\u00a2\3\2\2\2&\'\5\4\3"+
		"\2\'(\7\2\2\3(\3\3\2\2\2)*\5\6\4\2*+\5\4\3\2+.\3\2\2\2,.\3\2\2\2-)\3\2"+
		"\2\2-,\3\2\2\2.\5\3\2\2\2/\66\5\n\6\2\60\66\5\f\7\2\61\66\5\b\5\2\62\66"+
		"\5\24\13\2\63\66\5\26\f\2\64\66\5\30\r\2\65/\3\2\2\2\65\60\3\2\2\2\65"+
		"\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\67"+
		"8\7\b\2\289\5\4\3\29:\7\t\2\2:\t\3\2\2\2;<\7\31\2\2<=\7\20\2\2=>\5\34"+
		"\17\2>?\7\5\2\2?\13\3\2\2\2@A\7\24\2\2AB\7\31\2\2BC\5\16\b\2CD\5\22\n"+
		"\2DE\7\5\2\2E\r\3\2\2\2FG\7\20\2\2GJ\7\23\2\2HJ\3\2\2\2IF\3\2\2\2IH\3"+
		"\2\2\2J\17\3\2\2\2KL\7\31\2\2LM\t\2\2\2M\21\3\2\2\2NO\7\n\2\2OP\7\31\2"+
		"\2PQ\5\16\b\2QR\5\22\n\2RU\3\2\2\2SU\3\2\2\2TN\3\2\2\2TS\3\2\2\2U\23\3"+
		"\2\2\2VW\7\27\2\2WX\7\6\2\2XY\5\32\16\2Y\\\7\7\2\2Z]\5\b\5\2[]\5\6\4\2"+
		"\\Z\3\2\2\2\\[\3\2\2\2]\25\3\2\2\2^_\7\25\2\2_`\7\6\2\2`a\5\32\16\2ad"+
		"\7\7\2\2be\5\b\5\2ce\5\6\4\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fg\7\26\2\2"+
		"gh\5\b\5\2h\27\3\2\2\2ij\7\30\2\2jk\7\6\2\2kl\5\16\b\2lm\7\5\2\2mn\5\32"+
		"\16\2no\7\5\2\2op\5\20\t\2ps\7\7\2\2qt\5\b\5\2rt\5\6\4\2sq\3\2\2\2sr\3"+
		"\2\2\2t\31\3\2\2\2uv\5\34\17\2vw\7\20\2\2wx\5\34\17\2x{\3\2\2\2y{\3\2"+
		"\2\2zu\3\2\2\2zy\3\2\2\2{\33\3\2\2\2|}\5\36\20\2}~\5 \21\2~\35\3\2\2\2"+
		"\177\u0080\5$\23\2\u0080\u0081\5\"\22\2\u0081\37\3\2\2\2\u0082\u0083\7"+
		"\13\2\2\u0083\u0084\5\36\20\2\u0084\u0085\5 \21\2\u0085\u008c\3\2\2\2"+
		"\u0086\u0087\7\f\2\2\u0087\u0088\5\36\20\2\u0088\u0089\5 \21\2\u0089\u008c"+
		"\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c!\3\2\2\2\u008d\u008e\7\r\2\2\u008e\u008f\5$\23\2"+
		"\u008f\u0090\5\"\22\2\u0090\u009b\3\2\2\2\u0091\u0092\7\16\2\2\u0092\u0093"+
		"\5$\23\2\u0093\u0094\5\"\22\2\u0094\u009b\3\2\2\2\u0095\u0096\7\17\2\2"+
		"\u0096\u0097\5$\23\2\u0097\u0098\5\"\22\2\u0098\u009b\3\2\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u008d\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0095\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b#\3\2\2\2\u009c\u00a3\7\23\2\2\u009d\u00a3\7\31\2"+
		"\2\u009e\u009f\7\6\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7\7\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2"+
		"\2\2\u00a3%\3\2\2\2\r-\65IT\\dsz\u008b\u009a\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}