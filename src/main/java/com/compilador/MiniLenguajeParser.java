// Generated from com\compilador\MiniLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, COR_IZQ=2, COR_DER=3, IF=4, ELSE=5, WHILE=6, FOR=7, RETURN=8, 
		BREAK=9, CONTINUE=10, TRUE=11, FALSE=12, ID=13, NUMERO=14, DECIMAL=15, 
		CHAR=16, MAS=17, MENOS=18, POR=19, DIV=20, MOD=21, MAYORIGUAL=22, MENORIGUAL=23, 
		IGUALIGUAL=24, DISTINTO=25, MAYOR=26, MENOR=27, AND=28, OR=29, NOT=30, 
		ASIGN=31, PAREN_IZQ=32, PAREN_DER=33, LLAVE_IZQ=34, LLAVE_DER=35, COMA=36, 
		PUNTOYCOMA=37, WS=38, LINE_COMMENT=39, BLOCK_COMMENT=40;
	public static final int
		RULE_programa = 0, RULE_funcion = 1, RULE_parametros = 2, RULE_param = 3, 
		RULE_bloque = 4, RULE_instructions = 5, RULE_instruccion = 6, RULE_declaracion = 7, 
		RULE_lvalue = 8, RULE_asignacion = 9, RULE_forInit = 10, RULE_forUpdate = 11, 
		RULE_argumentos = 12, RULE_expresion = 13, RULE_atomo = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcion", "parametros", "param", "bloque", "instructions", 
			"instruccion", "declaracion", "lvalue", "asignacion", "forInit", "forUpdate", 
			"argumentos", "expresion", "atomo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'['", "']'", "'if'", "'else'", "'while'", "'for'", "'return'", 
			"'break'", "'continue'", "'true'", "'false'", null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'>='", "'<='", "'=='", "'!='", "'>'", 
			"'<'", "'&&'", "'||'", "'!'", "'='", "'('", "')'", "'{'", "'}'", "','", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "COR_IZQ", "COR_DER", "IF", "ELSE", "WHILE", "FOR", "RETURN", 
			"BREAK", "CONTINUE", "TRUE", "FALSE", "ID", "NUMERO", "DECIMAL", "CHAR", 
			"MAS", "MENOS", "POR", "DIV", "MOD", "MAYORIGUAL", "MENORIGUAL", "IGUALIGUAL", 
			"DISTINTO", "MAYOR", "MENOR", "AND", "OR", "NOT", "ASIGN", "PAREN_IZQ", 
			"PAREN_DER", "LLAVE_IZQ", "LLAVE_DER", "COMA", "PUNTOYCOMA", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "MiniLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniLenguajeParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					instruccion();
					}
					break;
				case 2:
					{
					setState(31);
					funcion();
					}
					break;
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MiniLenguajeParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiniLenguajeParser.PAREN_IZQ, 0); }
		public TerminalNode PAREN_DER() { return getToken(MiniLenguajeParser.PAREN_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(TIPO);
			setState(40);
			match(ID);
			setState(41);
			match(PAREN_IZQ);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(42);
				parametros();
				}
			}

			setState(45);
			match(PAREN_DER);
			setState(46);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiniLenguajeParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiniLenguajeParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			param();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(49);
				match(COMA);
				setState(50);
				param();
				}
				}
				setState(55);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MiniLenguajeParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(TIPO);
			setState(57);
			match(ID);
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
		public TerminalNode LLAVE_IZQ() { return getToken(MiniLenguajeParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(MiniLenguajeParser.LLAVE_DER, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LLAVE_IZQ);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				setState(60);
				instructions();
				}
			}

			setState(63);
			match(LLAVE_DER);
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

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				instruccion();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << ID))) != 0) );
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
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	 
		public InstruccionContext() { }
		public void copyFrom(InstruccionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InstrWhileContext extends InstruccionContext {
		public TerminalNode WHILE() { return getToken(MiniLenguajeParser.WHILE, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiniLenguajeParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(MiniLenguajeParser.PAREN_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstrWhileContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstrWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstrWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstrWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrForContext extends InstruccionContext {
		public TerminalNode FOR() { return getToken(MiniLenguajeParser.FOR, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiniLenguajeParser.PAREN_IZQ, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> PUNTOYCOMA() { return getTokens(MiniLenguajeParser.PUNTOYCOMA); }
		public TerminalNode PUNTOYCOMA(int i) {
			return getToken(MiniLenguajeParser.PUNTOYCOMA, i);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(MiniLenguajeParser.PAREN_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstrForContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstrFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstrFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstrFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrReturnContext extends InstruccionContext {
		public TerminalNode RETURN() { return getToken(MiniLenguajeParser.RETURN, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(MiniLenguajeParser.PUNTOYCOMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstrReturnContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstrReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstrReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstrReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrDeclaracionContext extends InstruccionContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public InstrDeclaracionContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstrDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstrDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstrDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrAsignacionContext extends InstruccionContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public InstrAsignacionContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstrAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstrAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstrAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrIfContext extends InstruccionContext {
		public TerminalNode IF() { return getToken(MiniLenguajeParser.IF, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiniLenguajeParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(MiniLenguajeParser.PAREN_DER, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniLenguajeParser.ELSE, 0); }
		public InstrIfContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstrIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstrIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstrIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccion);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				_localctx = new InstrDeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				declaracion();
				}
				break;
			case ID:
				_localctx = new InstrAsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				asignacion();
				}
				break;
			case RETURN:
				_localctx = new InstrReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(RETURN);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUMERO) | (1L << DECIMAL) | (1L << CHAR) | (1L << MENOS) | (1L << NOT) | (1L << PAREN_IZQ))) != 0)) {
					{
					setState(73);
					expresion(0);
					}
				}

				setState(76);
				match(PUNTOYCOMA);
				}
				break;
			case IF:
				_localctx = new InstrIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(IF);
				setState(78);
				match(PAREN_IZQ);
				setState(79);
				expresion(0);
				setState(80);
				match(PAREN_DER);
				setState(81);
				bloque();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(82);
					match(ELSE);
					setState(83);
					bloque();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new InstrWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(WHILE);
				setState(87);
				match(PAREN_IZQ);
				setState(88);
				expresion(0);
				setState(89);
				match(PAREN_DER);
				setState(90);
				bloque();
				}
				break;
			case FOR:
				_localctx = new InstrForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(FOR);
				setState(93);
				match(PAREN_IZQ);
				setState(94);
				forInit();
				setState(95);
				match(PUNTOYCOMA);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUMERO) | (1L << DECIMAL) | (1L << CHAR) | (1L << MENOS) | (1L << NOT) | (1L << PAREN_IZQ))) != 0)) {
					{
					setState(96);
					expresion(0);
					}
				}

				setState(99);
				match(PUNTOYCOMA);
				setState(100);
				forUpdate();
				setState(101);
				match(PAREN_DER);
				setState(102);
				bloque();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MiniLenguajeParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(MiniLenguajeParser.PUNTOYCOMA, 0); }
		public TerminalNode COR_IZQ() { return getToken(MiniLenguajeParser.COR_IZQ, 0); }
		public TerminalNode NUMERO() { return getToken(MiniLenguajeParser.NUMERO, 0); }
		public TerminalNode COR_DER() { return getToken(MiniLenguajeParser.COR_DER, 0); }
		public TerminalNode ASIGN() { return getToken(MiniLenguajeParser.ASIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(TIPO);
			setState(107);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COR_IZQ) {
				{
				setState(108);
				match(COR_IZQ);
				setState(109);
				match(NUMERO);
				setState(110);
				match(COR_DER);
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGN) {
				{
				setState(113);
				match(ASIGN);
				setState(114);
				expresion(0);
				}
			}

			setState(117);
			match(PUNTOYCOMA);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public TerminalNode COR_IZQ() { return getToken(MiniLenguajeParser.COR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(MiniLenguajeParser.COR_DER, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COR_IZQ) {
				{
				setState(120);
				match(COR_IZQ);
				setState(121);
				expresion(0);
				setState(122);
				match(COR_DER);
				}
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

	public static class AsignacionContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASIGN() { return getToken(MiniLenguajeParser.ASIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(MiniLenguajeParser.PUNTOYCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			lvalue();
			setState(127);
			match(ASIGN);
			setState(128);
			expresion(0);
			setState(129);
			match(PUNTOYCOMA);
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

	public static class ForInitContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MiniLenguajeParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public TerminalNode ASIGN() { return getToken(MiniLenguajeParser.ASIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forInit);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(TIPO);
				setState(132);
				match(ID);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASIGN) {
					{
					setState(133);
					match(ASIGN);
					setState(134);
					expresion(0);
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				lvalue();
				setState(138);
				match(ASIGN);
				setState(139);
				expresion(0);
				}
				break;
			case PUNTOYCOMA:
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

	public static class ForUpdateContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASIGN() { return getToken(MiniLenguajeParser.ASIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forUpdate);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				lvalue();
				setState(145);
				match(ASIGN);
				setState(146);
				expresion(0);
				}
				break;
			case PAREN_DER:
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

	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiniLenguajeParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiniLenguajeParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			expresion(0);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(152);
				match(COMA);
				setState(153);
				expresion(0);
				}
				}
				setState(158);
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprLeContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENORIGUAL() { return getToken(MiniLenguajeParser.MENORIGUAL, 0); }
		public ExprLeContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprLe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprLe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprLe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenContext extends ExpresionContext {
		public TerminalNode PAREN_IZQ() { return getToken(MiniLenguajeParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(MiniLenguajeParser.PAREN_DER, 0); }
		public ExprParenContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAtomContext extends ExpresionContext {
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public ExprAtomContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNegContext extends ExpresionContext {
		public TerminalNode MENOS() { return getToken(MiniLenguajeParser.MENOS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprNegContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExpresionContext {
		public TerminalNode NOT() { return getToken(MiniLenguajeParser.NOT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprNotContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGtContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(MiniLenguajeParser.MAYOR, 0); }
		public ExprGtContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprGt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDivContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MiniLenguajeParser.DIV, 0); }
		public ExprDivContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEqContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode IGUALIGUAL() { return getToken(MiniLenguajeParser.IGUALIGUAL, 0); }
		public ExprEqContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniLenguajeParser.AND, 0); }
		public ExprAndContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCallContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiniLenguajeParser.PAREN_IZQ, 0); }
		public TerminalNode PAREN_DER() { return getToken(MiniLenguajeParser.PAREN_DER, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ExprCallContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLtContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(MiniLenguajeParser.MENOR, 0); }
		public ExprLtContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MiniLenguajeParser.OR, 0); }
		public ExprOrContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNeqContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DISTINTO() { return getToken(MiniLenguajeParser.DISTINTO, 0); }
		public ExprNeqContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprNeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprNeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOS() { return getToken(MiniLenguajeParser.MENOS, 0); }
		public ExprSubContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprGeContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAYORIGUAL() { return getToken(MiniLenguajeParser.MAYORIGUAL, 0); }
		public ExprGeContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprGe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode POR() { return getToken(MiniLenguajeParser.POR, 0); }
		public ExprMulContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAS() { return getToken(MiniLenguajeParser.MAS, 0); }
		public ExprAddContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprModContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(MiniLenguajeParser.MOD, 0); }
		public ExprModContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				match(NOT);
				setState(161);
				expresion(5);
				}
				break;
			case 2:
				{
				_localctx = new ExprNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(MENOS);
				setState(163);
				expresion(4);
				}
				break;
			case 3:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(PAREN_IZQ);
				setState(165);
				expresion(0);
				setState(166);
				match(PAREN_DER);
				}
				break;
			case 4:
				{
				_localctx = new ExprCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(ID);
				setState(169);
				match(PAREN_IZQ);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUMERO) | (1L << DECIMAL) | (1L << CHAR) | (1L << MENOS) | (1L << NOT) | (1L << PAREN_IZQ))) != 0)) {
					{
					setState(170);
					argumentos();
					}
				}

				setState(173);
				match(PAREN_DER);
				}
				break;
			case 5:
				{
				_localctx = new ExprAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				atomo();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprOrContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(177);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(178);
						match(OR);
						setState(179);
						expresion(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprAndContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(180);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(181);
						match(AND);
						setState(182);
						expresion(18);
						}
						break;
					case 3:
						{
						_localctx = new ExprEqContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(183);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(184);
						match(IGUALIGUAL);
						setState(185);
						expresion(17);
						}
						break;
					case 4:
						{
						_localctx = new ExprNeqContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(186);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(187);
						match(DISTINTO);
						setState(188);
						expresion(16);
						}
						break;
					case 5:
						{
						_localctx = new ExprGtContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(189);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(190);
						match(MAYOR);
						setState(191);
						expresion(15);
						}
						break;
					case 6:
						{
						_localctx = new ExprLtContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(192);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(193);
						match(MENOR);
						setState(194);
						expresion(14);
						}
						break;
					case 7:
						{
						_localctx = new ExprGeContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(195);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(196);
						match(MAYORIGUAL);
						setState(197);
						expresion(13);
						}
						break;
					case 8:
						{
						_localctx = new ExprLeContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(198);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(199);
						match(MENORIGUAL);
						setState(200);
						expresion(12);
						}
						break;
					case 9:
						{
						_localctx = new ExprAddContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(201);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(202);
						match(MAS);
						setState(203);
						expresion(11);
						}
						break;
					case 10:
						{
						_localctx = new ExprSubContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(204);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(205);
						match(MENOS);
						setState(206);
						expresion(10);
						}
						break;
					case 11:
						{
						_localctx = new ExprMulContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(207);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(208);
						match(POR);
						setState(209);
						expresion(9);
						}
						break;
					case 12:
						{
						_localctx = new ExprDivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(210);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(211);
						match(DIV);
						setState(212);
						expresion(8);
						}
						break;
					case 13:
						{
						_localctx = new ExprModContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(213);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(214);
						match(MOD);
						setState(215);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public TerminalNode COR_IZQ() { return getToken(MiniLenguajeParser.COR_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(MiniLenguajeParser.COR_DER, 0); }
		public TerminalNode NUMERO() { return getToken(MiniLenguajeParser.NUMERO, 0); }
		public TerminalNode DECIMAL() { return getToken(MiniLenguajeParser.DECIMAL, 0); }
		public TerminalNode CHAR() { return getToken(MiniLenguajeParser.CHAR, 0); }
		public TerminalNode TRUE() { return getToken(MiniLenguajeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniLenguajeParser.FALSE, 0); }
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterAtomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitAtomo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitAtomo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomo);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(ID);
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(222);
					match(COR_IZQ);
					setState(223);
					expresion(0);
					setState(224);
					match(COR_DER);
					}
					break;
				}
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(NUMERO);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(DECIMAL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(CHAR);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(FALSE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\4\3\4\3\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\5\3\6\3\6\5\6@\n\6\3\6\3\6\3\7\6\7"+
		"E\n\7\r\7\16\7F\3\b\3\b\3\b\3\b\5\bM\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bW\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\t\3\t\5\tv\n\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\5\f\u008a\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0091\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0098\n\r\3\16\3\16\3\16\7\16\u009d\n\16\f\16\16\16\u00a0"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00ae\n\17\3\17\3\17\5\17\u00b2\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u00db\n\17\f\17\16\17\u00de\13\17\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00e5\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ec"+
		"\n\20\3\20\2\3\34\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u010c"+
		"\2$\3\2\2\2\4)\3\2\2\2\6\62\3\2\2\2\b:\3\2\2\2\n=\3\2\2\2\fD\3\2\2\2\16"+
		"j\3\2\2\2\20l\3\2\2\2\22y\3\2\2\2\24\u0080\3\2\2\2\26\u0090\3\2\2\2\30"+
		"\u0097\3\2\2\2\32\u0099\3\2\2\2\34\u00b1\3\2\2\2\36\u00eb\3\2\2\2 #\5"+
		"\16\b\2!#\5\4\3\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2"+
		"%\'\3\2\2\2&$\3\2\2\2\'(\7\2\2\3(\3\3\2\2\2)*\7\3\2\2*+\7\17\2\2+-\7\""+
		"\2\2,.\5\6\4\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7#\2\2\60\61\5\n\6\2"+
		"\61\5\3\2\2\2\62\67\5\b\5\2\63\64\7&\2\2\64\66\5\b\5\2\65\63\3\2\2\2\66"+
		"9\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67\3\2\2\2:;\7\3\2\2;"+
		"<\7\17\2\2<\t\3\2\2\2=?\7$\2\2>@\5\f\7\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2"+
		"AB\7%\2\2B\13\3\2\2\2CE\5\16\b\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2G\r\3\2\2\2Hk\5\20\t\2Ik\5\24\13\2JL\7\n\2\2KM\5\34\17\2LK\3\2\2\2L"+
		"M\3\2\2\2MN\3\2\2\2Nk\7\'\2\2OP\7\6\2\2PQ\7\"\2\2QR\5\34\17\2RS\7#\2\2"+
		"SV\5\n\6\2TU\7\7\2\2UW\5\n\6\2VT\3\2\2\2VW\3\2\2\2Wk\3\2\2\2XY\7\b\2\2"+
		"YZ\7\"\2\2Z[\5\34\17\2[\\\7#\2\2\\]\5\n\6\2]k\3\2\2\2^_\7\t\2\2_`\7\""+
		"\2\2`a\5\26\f\2ac\7\'\2\2bd\5\34\17\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef"+
		"\7\'\2\2fg\5\30\r\2gh\7#\2\2hi\5\n\6\2ik\3\2\2\2jH\3\2\2\2jI\3\2\2\2j"+
		"J\3\2\2\2jO\3\2\2\2jX\3\2\2\2j^\3\2\2\2k\17\3\2\2\2lm\7\3\2\2mq\7\17\2"+
		"\2no\7\4\2\2op\7\20\2\2pr\7\5\2\2qn\3\2\2\2qr\3\2\2\2ru\3\2\2\2st\7!\2"+
		"\2tv\5\34\17\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\'\2\2x\21\3\2\2\2y~\7"+
		"\17\2\2z{\7\4\2\2{|\5\34\17\2|}\7\5\2\2}\177\3\2\2\2~z\3\2\2\2~\177\3"+
		"\2\2\2\177\23\3\2\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7!\2\2\u0082\u0083"+
		"\5\34\17\2\u0083\u0084\7\'\2\2\u0084\25\3\2\2\2\u0085\u0086\7\3\2\2\u0086"+
		"\u0089\7\17\2\2\u0087\u0088\7!\2\2\u0088\u008a\5\34\17\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u0091\3\2\2\2\u008b\u008c\5\22\n\2\u008c"+
		"\u008d\7!\2\2\u008d\u008e\5\34\17\2\u008e\u0091\3\2\2\2\u008f\u0091\3"+
		"\2\2\2\u0090\u0085\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\27\3\2\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7!\2\2\u0094\u0095\5\34\17"+
		"\2\u0095\u0098\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\31\3\2\2\2\u0099\u009e\5\34\17\2\u009a\u009b\7&\2\2\u009b"+
		"\u009d\5\34\17\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\33\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\b\17\1\2\u00a2\u00a3\7 \2\2\u00a3\u00b2\5\34\17\7\u00a4\u00a5\7"+
		"\24\2\2\u00a5\u00b2\5\34\17\6\u00a6\u00a7\7\"\2\2\u00a7\u00a8\5\34\17"+
		"\2\u00a8\u00a9\7#\2\2\u00a9\u00b2\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ad"+
		"\7\"\2\2\u00ac\u00ae\5\32\16\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b2\7#\2\2\u00b0\u00b2\5\36\20\2\u00b1\u00a1"+
		"\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00dc\3\2\2\2\u00b3\u00b4\f\24\2\2\u00b4\u00b5\7"+
		"\37\2\2\u00b5\u00db\5\34\17\25\u00b6\u00b7\f\23\2\2\u00b7\u00b8\7\36\2"+
		"\2\u00b8\u00db\5\34\17\24\u00b9\u00ba\f\22\2\2\u00ba\u00bb\7\32\2\2\u00bb"+
		"\u00db\5\34\17\23\u00bc\u00bd\f\21\2\2\u00bd\u00be\7\33\2\2\u00be\u00db"+
		"\5\34\17\22\u00bf\u00c0\f\20\2\2\u00c0\u00c1\7\34\2\2\u00c1\u00db\5\34"+
		"\17\21\u00c2\u00c3\f\17\2\2\u00c3\u00c4\7\35\2\2\u00c4\u00db\5\34\17\20"+
		"\u00c5\u00c6\f\16\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00db\5\34\17\17\u00c8"+
		"\u00c9\f\r\2\2\u00c9\u00ca\7\31\2\2\u00ca\u00db\5\34\17\16\u00cb\u00cc"+
		"\f\f\2\2\u00cc\u00cd\7\23\2\2\u00cd\u00db\5\34\17\r\u00ce\u00cf\f\13\2"+
		"\2\u00cf\u00d0\7\24\2\2\u00d0\u00db\5\34\17\f\u00d1\u00d2\f\n\2\2\u00d2"+
		"\u00d3\7\25\2\2\u00d3\u00db\5\34\17\13\u00d4\u00d5\f\t\2\2\u00d5\u00d6"+
		"\7\26\2\2\u00d6\u00db\5\34\17\n\u00d7\u00d8\f\b\2\2\u00d8\u00d9\7\27\2"+
		"\2\u00d9\u00db\5\34\17\t\u00da\u00b3\3\2\2\2\u00da\u00b6\3\2\2\2\u00da"+
		"\u00b9\3\2\2\2\u00da\u00bc\3\2\2\2\u00da\u00bf\3\2\2\2\u00da\u00c2\3\2"+
		"\2\2\u00da\u00c5\3\2\2\2\u00da\u00c8\3\2\2\2\u00da\u00cb\3\2\2\2\u00da"+
		"\u00ce\3\2\2\2\u00da\u00d1\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2"+
		"\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\35\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e4\7\17\2\2\u00e0\u00e1\7\4\2"+
		"\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\7\5\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ec\3\2\2\2\u00e6\u00ec\7\20"+
		"\2\2\u00e7\u00ec\7\21\2\2\u00e8\u00ec\7\22\2\2\u00e9\u00ec\7\r\2\2\u00ea"+
		"\u00ec\7\16\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3"+
		"\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\37\3\2\2\2\31\"$-\67?FLVcjqu~\u0089\u0090\u0097\u009e\u00ad\u00b1\u00da"+
		"\u00dc\u00e4\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}