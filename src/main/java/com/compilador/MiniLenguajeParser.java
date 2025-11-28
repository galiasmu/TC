// Generated from com/compilador/MiniLenguaje.g4 by ANTLR 4.9.3
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, TIPO=30, ID=31, NUMERO=32, 
		DECIMAL=33, CADENA=34, CHAR=35, WS=36, COMENTARIO=37, MULTILINEA=38;
	public static final int
		RULE_programa = 0, RULE_funcion = 1, RULE_parametros = 2, RULE_param = 3, 
		RULE_bloque = 4, RULE_instructions = 5, RULE_instruccion = 6, RULE_declaracion = 7, 
		RULE_asignacion = 8, RULE_expresion = 9, RULE_argumentos = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcion", "parametros", "param", "bloque", "instructions", 
			"instruccion", "declaracion", "asignacion", "expresion", "argumentos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'{'", "'}'", "';'", "'if'", "'else'", "'while'", 
			"'return'", "'['", "']'", "'='", "'!'", "'-'", "'*'", "'/'", "'%'", "'+'", 
			"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TIPO", "ID", "NUMERO", "DECIMAL", 
			"CADENA", "CHAR", "WS", "COMENTARIO", "MULTILINEA"
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << TIPO) | (1L << ID) | (1L << NUMERO) | (1L << DECIMAL) | (1L << CADENA) | (1L << CHAR))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					instruccion();
					}
					break;
				case 2:
					{
					setState(23);
					funcion();
					}
					break;
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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
			setState(31);
			match(TIPO);
			setState(32);
			match(ID);
			setState(33);
			match(T__0);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(34);
				parametros();
				}
			}

			setState(37);
			match(T__1);
			setState(38);
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
			setState(40);
			param();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(41);
				match(T__2);
				setState(42);
				param();
				}
				}
				setState(47);
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
			setState(48);
			match(TIPO);
			setState(49);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__3);
			setState(52);
			instructions();
			setState(53);
			match(T__4);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << TIPO) | (1L << ID) | (1L << NUMERO) | (1L << DECIMAL) | (1L << CADENA) | (1L << CHAR))) != 0)) {
				{
				{
				setState(55);
				instruccion();
				}
				}
				setState(60);
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
	public static class InstrBloqueContext extends InstruccionContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstrBloqueContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstrBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstrBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstrBloque(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstrWhileContext extends InstruccionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
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
	public static class InstrReturnContext extends InstruccionContext {
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
	public static class InstrExpresionContext extends InstruccionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstrExpresionContext(InstruccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterInstrExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitInstrExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitInstrExpresion(this);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new InstrDeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				declaracion();
				}
				break;
			case 2:
				_localctx = new InstrAsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				asignacion();
				setState(63);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new InstrIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(T__6);
				setState(66);
				match(T__0);
				setState(67);
				expresion(0);
				setState(68);
				match(T__1);
				setState(69);
				bloque();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(70);
					match(T__7);
					setState(71);
					bloque();
					}
				}

				}
				break;
			case 4:
				_localctx = new InstrWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__8);
				setState(75);
				match(T__0);
				setState(76);
				expresion(0);
				setState(77);
				match(T__1);
				setState(78);
				bloque();
				}
				break;
			case 5:
				_localctx = new InstrReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(T__9);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << ID) | (1L << NUMERO) | (1L << DECIMAL) | (1L << CADENA) | (1L << CHAR))) != 0)) {
					{
					setState(81);
					expresion(0);
					}
				}

				setState(84);
				match(T__5);
				}
				break;
			case 6:
				_localctx = new InstrExpresionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				expresion(0);
				setState(86);
				match(T__5);
				}
				break;
			case 7:
				_localctx = new InstrBloqueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				bloque();
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
		public TerminalNode TIPO() { return getToken(MiniLenguajeParser.TIPO, 0); }
		public List<TerminalNode> ID() { return getTokens(MiniLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniLenguajeParser.ID, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(MiniLenguajeParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(MiniLenguajeParser.NUMERO, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
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
			setState(91);
			match(TIPO);
			setState(92);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(93);
				match(T__10);
				setState(94);
				match(NUMERO);
				setState(95);
				match(T__11);
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(98);
				match(T__12);
				setState(99);
				expresion(0);
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(102);
				match(T__2);
				setState(103);
				match(ID);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(104);
					match(T__10);
					setState(105);
					match(NUMERO);
					setState(106);
					match(T__11);
					}
				}

				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(109);
					match(T__12);
					setState(110);
					expresion(0);
					}
				}

				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__5);
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
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
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
		enterRule(_localctx, 16, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(121);
				match(T__10);
				setState(122);
				expresion(0);
				setState(123);
				match(T__11);
				}
			}

			setState(127);
			match(T__12);
			setState(128);
			expresion(0);
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
	public static class ExprRelacionalContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ExprRelacionalContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprRelacional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIgualdadContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ExprIgualdadContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCadenaContext extends ExpresionContext {
		public TerminalNode CADENA() { return getToken(MiniLenguajeParser.CADENA, 0); }
		public ExprCadenaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprCadena(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNegativoContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprNegativoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprNegativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprNegativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprNegativo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBooleanContext extends ExpresionContext {
		public ExprBooleanContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCharContext extends ExpresionContext {
		public TerminalNode CHAR() { return getToken(MiniLenguajeParser.CHAR, 0); }
		public ExprCharContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprLlamadaContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ExprLlamadaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprLlamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprLlamada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExpresionContext {
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
	public static class ExprSumRestContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ExprSumRestContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprSumRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprSumRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprSumRest(this);
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
	public static class ExprParentesisContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDecimalContext extends ExpresionContext {
		public TerminalNode DECIMAL() { return getToken(MiniLenguajeParser.DECIMAL, 0); }
		public ExprDecimalContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprDecimal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ExprMulDivContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumeroContext extends ExpresionContext {
		public TerminalNode NUMERO() { return getToken(MiniLenguajeParser.NUMERO, 0); }
		public ExprNumeroContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprNumero(this);
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
	public static class ExprIDContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(MiniLenguajeParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExprIDContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLenguajeListener ) ((MiniLenguajeListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLenguajeVisitor ) return ((MiniLenguajeVisitor<? extends T>)visitor).visitExprID(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				match(T__0);
				setState(132);
				expresion(0);
				setState(133);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__13);
				setState(136);
				expresion(15);
				}
				break;
			case 3:
				{
				_localctx = new ExprNegativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(T__14);
				setState(138);
				expresion(14);
				}
				break;
			case 4:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(ID);
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(140);
					match(T__10);
					setState(141);
					expresion(0);
					setState(142);
					match(T__11);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new ExprLlamadaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(ID);
				setState(147);
				match(T__0);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__13) | (1L << T__14) | (1L << T__27) | (1L << T__28) | (1L << ID) | (1L << NUMERO) | (1L << DECIMAL) | (1L << CADENA) | (1L << CHAR))) != 0)) {
					{
					setState(148);
					argumentos();
					}
				}

				setState(151);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new ExprNumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(NUMERO);
				}
				break;
			case 7:
				{
				_localctx = new ExprDecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(DECIMAL);
				}
				break;
			case 8:
				{
				_localctx = new ExprCadenaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(CADENA);
				}
				break;
			case 9:
				{
				_localctx = new ExprCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(CHAR);
				}
				break;
			case 10:
				{
				_localctx = new ExprBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(159);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(160);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(161);
						expresion(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprSumRestContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(162);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(163);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(164);
						expresion(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelacionalContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(165);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(166);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expresion(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprIgualdadContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(168);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(169);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						expresion(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(171);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(172);
						match(T__25);
						setState(173);
						expresion(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprOrContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(174);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(175);
						match(T__26);
						setState(176);
						expresion(9);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
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
		enterRule(_localctx, 20, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expresion(0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(183);
				match(T__2);
				setState(184);
				expresion(0);
				}
				}
				setState(189);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\5\3&\n\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bK\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bU\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\t\3\t"+
		"\5\tg\n\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\t\3\t\5\tr\n\t\7\tt\n\t\f\t\16"+
		"\tw\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0093"+
		"\n\13\3\13\3\13\3\13\5\13\u0098\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00a0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13"+
		"\3\f\3\f\3\f\7\f\u00bc\n\f\f\f\16\f\u00bf\13\f\3\f\2\3\24\r\2\4\6\b\n"+
		"\f\16\20\22\24\26\2\7\3\2\36\37\3\2\22\24\4\2\21\21\25\25\3\2\26\31\3"+
		"\2\32\33\2\u00da\2\34\3\2\2\2\4!\3\2\2\2\6*\3\2\2\2\b\62\3\2\2\2\n\65"+
		"\3\2\2\2\f<\3\2\2\2\16[\3\2\2\2\20]\3\2\2\2\22z\3\2\2\2\24\u009f\3\2\2"+
		"\2\26\u00b8\3\2\2\2\30\33\5\16\b\2\31\33\5\4\3\2\32\30\3\2\2\2\32\31\3"+
		"\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3"+
		"\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\7 \2\2\"#\7!\2\2#%\7\3\2\2$&\5\6\4\2"+
		"%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\4\2\2()\5\n\6\2)\5\3\2\2\2*/\5\b"+
		"\5\2+,\7\5\2\2,.\5\b\5\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\7\3\2\2\2\61/\3\2\2\2\62\63\7 \2\2\63\64\7!\2\2\64\t\3\2\2\2\65\66\7"+
		"\6\2\2\66\67\5\f\7\2\678\7\7\2\28\13\3\2\2\29;\5\16\b\2:9\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=\r\3\2\2\2><\3\2\2\2?\\\5\20\t\2@A\5\22\n\2"+
		"AB\7\b\2\2B\\\3\2\2\2CD\7\t\2\2DE\7\3\2\2EF\5\24\13\2FG\7\4\2\2GJ\5\n"+
		"\6\2HI\7\n\2\2IK\5\n\6\2JH\3\2\2\2JK\3\2\2\2K\\\3\2\2\2LM\7\13\2\2MN\7"+
		"\3\2\2NO\5\24\13\2OP\7\4\2\2PQ\5\n\6\2Q\\\3\2\2\2RT\7\f\2\2SU\5\24\13"+
		"\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2V\\\7\b\2\2WX\5\24\13\2XY\7\b\2\2Y\\\3"+
		"\2\2\2Z\\\5\n\6\2[?\3\2\2\2[@\3\2\2\2[C\3\2\2\2[L\3\2\2\2[R\3\2\2\2[W"+
		"\3\2\2\2[Z\3\2\2\2\\\17\3\2\2\2]^\7 \2\2^b\7!\2\2_`\7\r\2\2`a\7\"\2\2"+
		"ac\7\16\2\2b_\3\2\2\2bc\3\2\2\2cf\3\2\2\2de\7\17\2\2eg\5\24\13\2fd\3\2"+
		"\2\2fg\3\2\2\2gu\3\2\2\2hi\7\5\2\2im\7!\2\2jk\7\r\2\2kl\7\"\2\2ln\7\16"+
		"\2\2mj\3\2\2\2mn\3\2\2\2nq\3\2\2\2op\7\17\2\2pr\5\24\13\2qo\3\2\2\2qr"+
		"\3\2\2\2rt\3\2\2\2sh\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2w"+
		"u\3\2\2\2xy\7\b\2\2y\21\3\2\2\2z\177\7!\2\2{|\7\r\2\2|}\5\24\13\2}~\7"+
		"\16\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0082\7\17\2\2\u0082\u0083\5\24\13\2\u0083\23\3\2\2\2\u0084"+
		"\u0085\b\13\1\2\u0085\u0086\7\3\2\2\u0086\u0087\5\24\13\2\u0087\u0088"+
		"\7\4\2\2\u0088\u00a0\3\2\2\2\u0089\u008a\7\20\2\2\u008a\u00a0\5\24\13"+
		"\21\u008b\u008c\7\21\2\2\u008c\u00a0\5\24\13\20\u008d\u0092\7!\2\2\u008e"+
		"\u008f\7\r\2\2\u008f\u0090\5\24\13\2\u0090\u0091\7\16\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00a0\3\2\2\2\u0094"+
		"\u0095\7!\2\2\u0095\u0097\7\3\2\2\u0096\u0098\5\26\f\2\u0097\u0096\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a0\7\4\2\2\u009a"+
		"\u00a0\7\"\2\2\u009b\u00a0\7#\2\2\u009c\u00a0\7$\2\2\u009d\u00a0\7%\2"+
		"\2\u009e\u00a0\t\2\2\2\u009f\u0084\3\2\2\2\u009f\u0089\3\2\2\2\u009f\u008b"+
		"\3\2\2\2\u009f\u008d\3\2\2\2\u009f\u0094\3\2\2\2\u009f\u009a\3\2\2\2\u009f"+
		"\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2"+
		"\2\2\u00a0\u00b5\3\2\2\2\u00a1\u00a2\f\17\2\2\u00a2\u00a3\t\3\2\2\u00a3"+
		"\u00b4\5\24\13\20\u00a4\u00a5\f\16\2\2\u00a5\u00a6\t\4\2\2\u00a6\u00b4"+
		"\5\24\13\17\u00a7\u00a8\f\r\2\2\u00a8\u00a9\t\5\2\2\u00a9\u00b4\5\24\13"+
		"\16\u00aa\u00ab\f\f\2\2\u00ab\u00ac\t\6\2\2\u00ac\u00b4\5\24\13\r\u00ad"+
		"\u00ae\f\13\2\2\u00ae\u00af\7\34\2\2\u00af\u00b4\5\24\13\f\u00b0\u00b1"+
		"\f\n\2\2\u00b1\u00b2\7\35\2\2\u00b2\u00b4\5\24\13\13\u00b3\u00a1\3\2\2"+
		"\2\u00b3\u00a4\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ad"+
		"\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\25\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bd\5\24\13"+
		"\2\u00b9\u00ba\7\5\2\2\u00ba\u00bc\5\24\13\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\27\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\26\32\34%/<JT[bfmqu\177\u0092\u0097\u009f\u00b3"+
		"\u00b5\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}