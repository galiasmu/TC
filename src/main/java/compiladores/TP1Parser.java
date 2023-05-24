// Generated from c:\Users\g-g-e\OneDrive - UNIVERSIDAD BLAS PASCAL\Facu\11-cuatri\TC\TPs\TC-1\src\main\java\compiladores\TP1.g4 by ANTLR 4.9.2
 
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
		CI=1, CD=2, PYC=3, PA=4, PC=5, LLA=6, LLC=7, ASIGN=8, COMA=9, SUMA=10, 
		RESTA=11, MULT=12, DIV=13, MOD=14, COMP=15, INC=16, DEC=17, TIPO=18, NUMERO=19, 
		IF_TOKEN=20, ELSE_TOKEN=21, FOR=22, WHILE=23, ID=24, WS=25;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_bloque = 3, 
		RULE_asignacion = 4, RULE_incFor = 5, RULE_declaracion = 6, RULE_inicializacion = 7, 
		RULE_incremento = 8, RULE_listaid = 9, RULE_funcion = 10, RULE_dec = 11, 
		RULE_iwhile = 12, RULE_fi = 13, RULE_rof = 14, RULE_comparacion = 15, 
		RULE_expresion = 16, RULE_termino = 17, RULE_exp = 18, RULE_term = 19, 
		RULE_factor = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "bloque", "asignacion", "incFor", 
			"declaracion", "inicializacion", "incremento", "listaid", "funcion", 
			"dec", "iwhile", "fi", "rof", "comparacion", "expresion", "termino", 
			"exp", "term", "factor"
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
			setState(42);
			instrucciones();
			setState(43);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLA:
			case TIPO:
			case IF_TOKEN:
			case FOR:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				instruccion();
				setState(46);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				asignacion();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				declaracion();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				bloque();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				iwhile();
				}
				break;
			case IF_TOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				fi();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
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
			setState(59);
			match(LLA);
			setState(60);
			instrucciones();
			setState(61);
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
		public TerminalNode ASIGN() { return getToken(TP1Parser.ASIGN, 0); }
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
			setState(63);
			match(ID);
			setState(64);
			match(ASIGN);
			setState(65);
			expresion();
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

	public static class IncForContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(TP1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TP1Parser.ID, i);
		}
		public TerminalNode COMP() { return getToken(TP1Parser.COMP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IncForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterIncFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitIncFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitIncFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncForContext incFor() throws RecognitionException {
		IncForContext _localctx = new IncForContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_incFor);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				incremento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(ID);
				setState(71);
				match(COMP);
				setState(72);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				term();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(TP1Parser.TIPO, 0); }
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
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(TIPO);
			setState(79);
			match(ID);
			setState(80);
			inicializacion();
			setState(81);
			listaid();
			setState(82);
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
		public TerminalNode ASIGN() { return getToken(TP1Parser.ASIGN, 0); }
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
		enterRule(_localctx, 14, RULE_inicializacion);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(ASIGN);
				setState(85);
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
		enterRule(_localctx, 16, RULE_incremento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
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
		enterRule(_localctx, 18, RULE_listaid);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(COMA);
				setState(93);
				match(ID);
				setState(94);
				inicializacion();
				setState(95);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(TP1Parser.TIPO, 0); }
		public TerminalNode ID() { return getToken(TP1Parser.ID, 0); }
		public TerminalNode PA() { return getToken(TP1Parser.PA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TP1Parser.PC, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(TIPO);
			setState(101);
			match(ID);
			setState(102);
			match(PA);
			setState(103);
			asignacion();
			setState(104);
			match(PC);
			setState(105);
			instruccion();
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(TP1Parser.TIPO, 0); }
		public TerminalNode ID() { return getToken(TP1Parser.ID, 0); }
		public TerminalNode PYC() { return getToken(TP1Parser.PYC, 0); }
		public TerminalNode COMP() { return getToken(TP1Parser.COMP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TP1Listener ) ((TP1Listener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TP1Visitor ) return ((TP1Visitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(TIPO);
			setState(108);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMP) {
				{
				setState(109);
				match(COMP);
				setState(110);
				expresion();
				}
			}

			setState(113);
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TP1Parser.WHILE, 0); }
		public TerminalNode PA() { return getToken(TP1Parser.PA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TP1Parser.PC, 0); }
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
		enterRule(_localctx, 24, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(WHILE);
			setState(116);
			match(PA);
			setState(117);
			comparacion();
			setState(118);
			match(PC);
			setState(119);
			instruccion();
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
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public TerminalNode ELSE_TOKEN() { return getToken(TP1Parser.ELSE_TOKEN, 0); }
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
		enterRule(_localctx, 26, RULE_fi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IF_TOKEN);
			setState(122);
			match(PA);
			setState(123);
			comparacion();
			setState(124);
			match(PC);
			setState(125);
			instruccion();
			setState(126);
			match(ELSE_TOKEN);
			setState(127);
			instruccion();
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
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(TP1Parser.PYC, 0); }
		public IncForContext incFor() {
			return getRuleContext(IncForContext.class,0);
		}
		public TerminalNode PC() { return getToken(TP1Parser.PC, 0); }
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
		enterRule(_localctx, 28, RULE_rof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FOR);
			setState(130);
			match(PA);
			setState(131);
			declaracion();
			setState(132);
			comparacion();
			setState(133);
			match(PYC);
			setState(134);
			incFor();
			setState(135);
			match(PC);
			setState(136);
			instruccion();
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
		enterRule(_localctx, 30, RULE_comparacion);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				expresion();
				setState(139);
				match(COMP);
				setState(140);
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
		enterRule(_localctx, 32, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			termino();
			setState(146);
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
		enterRule(_localctx, 34, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			factor();
			setState(149);
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
		enterRule(_localctx, 36, RULE_exp);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(SUMA);
				setState(152);
				termino();
				setState(153);
				exp();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(RESTA);
				setState(156);
				termino();
				setState(157);
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
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(MULT);
				setState(163);
				factor();
				setState(164);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(DIV);
				setState(167);
				factor();
				setState(168);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(MOD);
				setState(171);
				factor();
				setState(172);
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
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(PA);
				setState(180);
				expresion();
				setState(181);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00bc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\rr\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0092\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00a3\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b2\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00ba\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\3\3\2\22\23\2\u00bc\2,\3\2\2\2\4\63\3\2\2\2\6;\3\2\2\2\b"+
		"=\3\2\2\2\nA\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24"+
		"d\3\2\2\2\26f\3\2\2\2\30m\3\2\2\2\32u\3\2\2\2\34{\3\2\2\2\36\u0083\3\2"+
		"\2\2 \u0091\3\2\2\2\"\u0093\3\2\2\2$\u0096\3\2\2\2&\u00a2\3\2\2\2(\u00b1"+
		"\3\2\2\2*\u00b9\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\3\3\2\2\2/\60\5\6\4\2\60"+
		"\61\5\4\3\2\61\64\3\2\2\2\62\64\3\2\2\2\63/\3\2\2\2\63\62\3\2\2\2\64\5"+
		"\3\2\2\2\65<\5\n\6\2\66<\5\16\b\2\67<\5\b\5\28<\5\32\16\29<\5\34\17\2"+
		":<\5\36\20\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;"+
		":\3\2\2\2<\7\3\2\2\2=>\7\b\2\2>?\5\4\3\2?@\7\t\2\2@\t\3\2\2\2AB\7\32\2"+
		"\2BC\7\n\2\2CD\5\"\22\2DE\7\5\2\2E\13\3\2\2\2FO\5\n\6\2GO\5\22\n\2HI\7"+
		"\32\2\2IJ\7\21\2\2JO\7\32\2\2KO\5&\24\2LO\5(\25\2MO\3\2\2\2NF\3\2\2\2"+
		"NG\3\2\2\2NH\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\r\3\2\2\2PQ\7\24\2"+
		"\2QR\7\32\2\2RS\5\20\t\2ST\5\24\13\2TU\7\5\2\2U\17\3\2\2\2VW\7\n\2\2W"+
		"Z\7\25\2\2XZ\3\2\2\2YV\3\2\2\2YX\3\2\2\2Z\21\3\2\2\2[\\\7\32\2\2\\]\t"+
		"\2\2\2]\23\3\2\2\2^_\7\13\2\2_`\7\32\2\2`a\5\20\t\2ab\5\24\13\2be\3\2"+
		"\2\2ce\3\2\2\2d^\3\2\2\2dc\3\2\2\2e\25\3\2\2\2fg\7\24\2\2gh\7\32\2\2h"+
		"i\7\6\2\2ij\5\n\6\2jk\7\7\2\2kl\5\6\4\2l\27\3\2\2\2mn\7\24\2\2nq\7\32"+
		"\2\2op\7\21\2\2pr\5\"\22\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\5\2\2t\31"+
		"\3\2\2\2uv\7\31\2\2vw\7\6\2\2wx\5 \21\2xy\7\7\2\2yz\5\6\4\2z\33\3\2\2"+
		"\2{|\7\26\2\2|}\7\6\2\2}~\5 \21\2~\177\7\7\2\2\177\u0080\5\6\4\2\u0080"+
		"\u0081\7\27\2\2\u0081\u0082\5\6\4\2\u0082\35\3\2\2\2\u0083\u0084\7\30"+
		"\2\2\u0084\u0085\7\6\2\2\u0085\u0086\5\16\b\2\u0086\u0087\5 \21\2\u0087"+
		"\u0088\7\5\2\2\u0088\u0089\5\f\7\2\u0089\u008a\7\7\2\2\u008a\u008b\5\6"+
		"\4\2\u008b\37\3\2\2\2\u008c\u008d\5\"\22\2\u008d\u008e\7\21\2\2\u008e"+
		"\u008f\5\"\22\2\u008f\u0092\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008c\3"+
		"\2\2\2\u0091\u0090\3\2\2\2\u0092!\3\2\2\2\u0093\u0094\5$\23\2\u0094\u0095"+
		"\5&\24\2\u0095#\3\2\2\2\u0096\u0097\5*\26\2\u0097\u0098\5(\25\2\u0098"+
		"%\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\5$\23\2\u009b\u009c\5&\24\2"+
		"\u009c\u00a3\3\2\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5$\23\2\u009f\u00a0"+
		"\5&\24\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2"+
		"\u009d\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\'\3\2\2\2\u00a4\u00a5\7\16\2"+
		"\2\u00a5\u00a6\5*\26\2\u00a6\u00a7\5(\25\2\u00a7\u00b2\3\2\2\2\u00a8\u00a9"+
		"\7\17\2\2\u00a9\u00aa\5*\26\2\u00aa\u00ab\5(\25\2\u00ab\u00b2\3\2\2\2"+
		"\u00ac\u00ad\7\20\2\2\u00ad\u00ae\5*\26\2\u00ae\u00af\5(\25\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1"+
		"\u00ac\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2)\3\2\2\2\u00b3\u00ba\7\25\2\2"+
		"\u00b4\u00ba\7\32\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8"+
		"\7\7\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9"+
		"\u00b5\3\2\2\2\u00ba+\3\2\2\2\f\63;NYdq\u0091\u00a2\u00b1\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}