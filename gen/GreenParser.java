// Generated from C:/Users/Lenovo/Desktop/YAPIS/src/main/java\Green.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GreenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, OP=12, RANGE=13, RETURN=14, FUNK=15, ADD=16, DELETE=17, 
		TYPE=18, STREAM_OP=19, ELEMENT_POINTER=20, BINARY_OP=21, WS=22, NUM=23, 
		ID=24, PARAM=25, COMPARE_OP=26, ASSIG=27, LANDING=28, DOT=29, IF=30, ELSE=31, 
		THEN=32, FOR=33, IN=34, OUT=35;
	public static final int
		RULE_program = 0, RULE_subprogram = 1, RULE_func = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_for_block = 5, RULE_if_block = 6, RULE_func_call = 7, 
		RULE_var_action = 8, RULE_binary_expression = 9, RULE_var_reform = 10, 
		RULE_io = 11, RULE_landing_expression = 12, RULE_math_expression = 13, 
		RULE_typeCast = 14, RULE_inBrackets = 15, RULE_var_define = 16, RULE_have_value = 17, 
		RULE_list_special_define = 18, RULE_operations_with_list = 19, RULE_for_each = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "subprogram", "func", "statement", "block", "for_block", "if_block", 
			"func_call", "var_action", "binary_expression", "var_reform", "io", "landing_expression", 
			"math_expression", "typeCast", "inBrackets", "var_define", "have_value", 
			"list_special_define", "operations_with_list", "for_each"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'<'", "';'", "'>'", "'('", "','", "')'", "'->'", "'{'", 
			"'}'", "':'", null, "'range'", null, "'void'", "'add'", "'delete'", null, 
			null, null, null, null, null, null, null, null, "'='", "'_'", "'.'", 
			"'?'", "'else'", "'then'", "'for'", "'in'", "'out'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"OP", "RANGE", "RETURN", "FUNK", "ADD", "DELETE", "TYPE", "STREAM_OP", 
			"ELEMENT_POINTER", "BINARY_OP", "WS", "NUM", "ID", "PARAM", "COMPARE_OP", 
			"ASSIG", "LANDING", "DOT", "IF", "ELSE", "THEN", "FOR", "IN", "OUT"
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
	public String getGrammarFileName() { return "Green.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GreenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public SubprogramContext subprogram() {
			return getRuleContext(SubprogramContext.class,0);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			subprogram();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNK) {
				{
				{
				setState(44);
				func();
				}
				}
				setState(49);
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

	public static class SubprogramContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GreenParser.RETURN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SubprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterSubprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitSubprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitSubprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramContext subprogram() throws RecognitionException {
		SubprogramContext _localctx = new SubprogramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subprogram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__1);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RANGE) | (1L << STREAM_OP) | (1L << WS) | (1L << ID) | (1L << LANDING) | (1L << IF) | (1L << FOR))) != 0)) {
				{
				{
				setState(51);
				statement();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(RETURN);
			setState(58);
			match(T__2);
			setState(59);
			match(T__3);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode FUNK() { return getToken(GreenParser.FUNK, 0); }
		public List<TerminalNode> PARAM() { return getTokens(GreenParser.PARAM); }
		public TerminalNode PARAM(int i) {
			return getToken(GreenParser.PARAM, i);
		}
		public SubprogramContext subprogram() {
			return getRuleContext(SubprogramContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(FUNK);
			setState(62);
			match(PARAM);
			setState(63);
			match(T__4);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARAM) {
				{
				setState(64);
				match(PARAM);
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(67);
				match(T__5);
				setState(68);
				match(PARAM);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__6);
			setState(75);
			subprogram();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public Var_defineContext var_define() {
			return getRuleContext(Var_defineContext.class,0);
		}
		public Landing_expressionContext landing_expression() {
			return getRuleContext(Landing_expressionContext.class,0);
		}
		public Var_actionContext var_action() {
			return getRuleContext(Var_actionContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Operations_with_listContext operations_with_list() {
			return getRuleContext(Operations_with_listContext.class,0);
		}
		public TerminalNode WS() { return getToken(GreenParser.WS, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(77);
				match(WS);
				}
			}

			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				block();
				}
				break;
			case 2:
				{
				setState(81);
				io();
				}
				break;
			case 3:
				{
				setState(82);
				var_define();
				}
				break;
			case 4:
				{
				setState(83);
				landing_expression();
				}
				break;
			case 5:
				{
				setState(84);
				var_action();
				}
				break;
			case 6:
				{
				setState(85);
				func_call();
				}
				break;
			case 7:
				{
				setState(86);
				operations_with_list();
				}
				break;
			}
			setState(89);
			match(T__2);
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

	public static class BlockContext extends ParserRuleContext {
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public For_eachContext for_each() {
			return getRuleContext(For_eachContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANGE:
				{
				setState(91);
				for_block();
				}
				break;
			case IF:
				{
				setState(92);
				if_block();
				}
				break;
			case FOR:
				{
				setState(93);
				for_each();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(96);
			match(T__1);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RANGE) | (1L << STREAM_OP) | (1L << WS) | (1L << ID) | (1L << LANDING) | (1L << IF) | (1L << FOR))) != 0)) {
				{
				{
				setState(97);
				statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__3);
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(GreenParser.RANGE, 0); }
		public List<TerminalNode> ID() { return getTokens(GreenParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GreenParser.ID, i);
		}
		public TerminalNode NUM() { return getToken(GreenParser.NUM, 0); }
		public List<TerminalNode> WS() { return getTokens(GreenParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GreenParser.WS, i);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitFor_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitFor_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(RANGE);
			setState(106);
			match(ID);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(107);
				match(WS);
				}
			}

			setState(110);
			match(T__7);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(111);
				match(WS);
				}
			}

			setState(114);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GreenParser.IF, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode COMPARE_OP() { return getToken(GreenParser.COMPARE_OP, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IF);
			setState(117);
			match(T__4);
			setState(118);
			math_expression(0);
			setState(119);
			match(COMPARE_OP);
			setState(120);
			math_expression(0);
			setState(121);
			match(T__6);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GreenParser.ID, 0); }
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(124);
			match(T__4);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				setState(125);
				math_expression(0);
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(128);
				match(T__5);
				setState(129);
				math_expression(0);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T__6);
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

	public static class Var_actionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GreenParser.ID, 0); }
		public Var_reformContext var_reform() {
			return getRuleContext(Var_reformContext.class,0);
		}
		public Binary_expressionContext binary_expression() {
			return getRuleContext(Binary_expressionContext.class,0);
		}
		public Var_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterVar_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitVar_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitVar_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_actionContext var_action() throws RecognitionException {
		Var_actionContext _localctx = new Var_actionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIG:
				{
				setState(138);
				var_reform();
				}
				break;
			case BINARY_OP:
				{
				setState(139);
				binary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Binary_expressionContext extends ParserRuleContext {
		public TerminalNode BINARY_OP() { return getToken(GreenParser.BINARY_OP, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitBinary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitBinary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binary_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(BINARY_OP);
			setState(143);
			math_expression(0);
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

	public static class Var_reformContext extends ParserRuleContext {
		public TerminalNode ASSIG() { return getToken(GreenParser.ASSIG, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Var_reformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_reform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterVar_reform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitVar_reform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitVar_reform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_reformContext var_reform() throws RecognitionException {
		Var_reformContext _localctx = new Var_reformContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_reform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ASSIG);
			setState(146);
			math_expression(0);
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

	public static class IoContext extends ParserRuleContext {
		public TerminalNode STREAM_OP() { return getToken(GreenParser.STREAM_OP, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitIo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitIo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_io);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(STREAM_OP);
			setState(149);
			math_expression(0);
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

	public static class Landing_expressionContext extends ParserRuleContext {
		public TerminalNode LANDING() { return getToken(GreenParser.LANDING, 0); }
		public TerminalNode ID() { return getToken(GreenParser.ID, 0); }
		public TerminalNode OP() { return getToken(GreenParser.OP, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Landing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_landing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterLanding_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitLanding_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitLanding_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Landing_expressionContext landing_expression() throws RecognitionException {
		Landing_expressionContext _localctx = new Landing_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_landing_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(LANDING);
			setState(152);
			match(ID);
			setState(153);
			match(OP);
			setState(154);
			math_expression(0);
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

	public static class Math_expressionContext extends ParserRuleContext {
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public InBracketsContext inBrackets() {
			return getRuleContext(InBracketsContext.class,0);
		}
		public Have_valueContext have_value() {
			return getRuleContext(Have_valueContext.class,0);
		}
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode OP() { return getToken(GreenParser.OP, 0); }
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterMath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitMath_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitMath_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		return math_expression(0);
	}

	private Math_expressionContext math_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, _parentState);
		Math_expressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_math_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(157);
				typeCast();
				}
				break;
			case 2:
				{
				setState(158);
				inBrackets();
				}
				break;
			case 3:
				{
				setState(159);
				have_value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Math_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					match(OP);
					setState(164);
					math_expression(3);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class TypeCastContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GreenParser.TYPE, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__4);
			setState(171);
			match(TYPE);
			setState(172);
			match(T__6);
			setState(173);
			math_expression(0);
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

	public static class InBracketsContext extends ParserRuleContext {
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public InBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InBracketsContext inBrackets() throws RecognitionException {
		InBracketsContext _localctx = new InBracketsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inBrackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__4);
			setState(176);
			math_expression(0);
			setState(177);
			match(T__6);
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

	public static class Var_defineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GreenParser.ID, 0); }
		public TerminalNode ASSIG() { return getToken(GreenParser.ASSIG, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public List_special_defineContext list_special_define() {
			return getRuleContext(List_special_defineContext.class,0);
		}
		public Var_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterVar_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitVar_define(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitVar_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defineContext var_define() throws RecognitionException {
		Var_defineContext _localctx = new Var_defineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			match(ASSIG);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case NUM:
			case ID:
				{
				setState(181);
				math_expression(0);
				}
				break;
			case T__8:
				{
				setState(182);
				list_special_define();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Have_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GreenParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GreenParser.NUM, 0); }
		public Have_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_have_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterHave_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitHave_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitHave_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Have_valueContext have_value() throws RecognitionException {
		Have_valueContext _localctx = new Have_valueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_have_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
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

	public static class List_special_defineContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(GreenParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GreenParser.NUM, i);
		}
		public List_special_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_special_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterList_special_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitList_special_define(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitList_special_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_special_defineContext list_special_define() throws RecognitionException {
		List_special_defineContext _localctx = new List_special_defineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_special_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__8);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				match(NUM);
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(193);
			match(T__9);
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

	public static class Operations_with_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GreenParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GreenParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(GreenParser.DOT, 0); }
		public TerminalNode ADD() { return getToken(GreenParser.ADD, 0); }
		public TerminalNode DELETE() { return getToken(GreenParser.DELETE, 0); }
		public Operations_with_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations_with_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterOperations_with_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitOperations_with_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitOperations_with_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operations_with_listContext operations_with_list() throws RecognitionException {
		Operations_with_listContext _localctx = new Operations_with_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operations_with_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(196);
			match(DOT);
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==DELETE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(198);
			match(T__4);
			setState(199);
			match(ID);
			setState(200);
			match(T__6);
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

	public static class For_eachContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GreenParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(GreenParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GreenParser.ID, i);
		}
		public For_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).enterFor_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GreenListener ) ((GreenListener)listener).exitFor_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GreenVisitor ) return ((GreenVisitor<? extends T>)visitor).visitFor_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_eachContext for_each() throws RecognitionException {
		For_eachContext _localctx = new For_eachContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(FOR);
			setState(203);
			match(T__4);
			setState(204);
			match(ID);
			setState(205);
			match(T__10);
			setState(206);
			match(ID);
			setState(207);
			match(T__6);
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
			return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expression_sempred(Math_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4D\n\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\4\3\5\5\5Q\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\6\3\6\3\6\5\6a\n\6\3"+
		"\6\3\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\5"+
		"\7s\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0081\n\t"+
		"\3\t\3\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u008f"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\17\3\17\3\17\7\17\u00a8\n\17\f\17"+
		"\16\17\u00ab\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\5\22\u00ba\n\22\3\23\3\23\3\24\3\24\6\24\u00c0\n\24\r\24"+
		"\16\24\u00c1\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\2\3\34\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\4\3\2\31\32\3\2\22\23\2\u00d6\2,\3\2\2\2\4\64\3\2\2\2"+
		"\6?\3\2\2\2\bP\3\2\2\2\n`\3\2\2\2\fk\3\2\2\2\16v\3\2\2\2\20}\3\2\2\2\22"+
		"\u008b\3\2\2\2\24\u0090\3\2\2\2\26\u0093\3\2\2\2\30\u0096\3\2\2\2\32\u0099"+
		"\3\2\2\2\34\u00a2\3\2\2\2\36\u00ac\3\2\2\2 \u00b1\3\2\2\2\"\u00b5\3\2"+
		"\2\2$\u00bb\3\2\2\2&\u00bd\3\2\2\2(\u00c5\3\2\2\2*\u00cc\3\2\2\2,-\7\3"+
		"\2\2-\61\5\4\3\2.\60\5\6\4\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\648\7\4\2\2\65\67\5\b\5\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\20\2"+
		"\2<=\7\5\2\2=>\7\6\2\2>\5\3\2\2\2?@\7\21\2\2@A\7\33\2\2AC\7\7\2\2BD\7"+
		"\33\2\2CB\3\2\2\2CD\3\2\2\2DI\3\2\2\2EF\7\b\2\2FH\7\33\2\2GE\3\2\2\2H"+
		"K\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\t\2\2MN\5\4\3\2"+
		"N\7\3\2\2\2OQ\7\30\2\2PO\3\2\2\2PQ\3\2\2\2QY\3\2\2\2RZ\5\n\6\2SZ\5\30"+
		"\r\2TZ\5\"\22\2UZ\5\32\16\2VZ\5\22\n\2WZ\5\20\t\2XZ\5(\25\2YR\3\2\2\2"+
		"YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z[\3\2\2\2"+
		"[\\\7\5\2\2\\\t\3\2\2\2]a\5\f\7\2^a\5\16\b\2_a\5*\26\2`]\3\2\2\2`^\3\2"+
		"\2\2`_\3\2\2\2ab\3\2\2\2bf\7\4\2\2ce\5\b\5\2dc\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\6\2\2j\13\3\2\2\2kl\7\17\2\2ln"+
		"\7\32\2\2mo\7\30\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7\n\2\2qs\7\30\2"+
		"\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\t\2\2\2u\r\3\2\2\2vw\7 \2\2wx\7\7\2"+
		"\2xy\5\34\17\2yz\7\34\2\2z{\5\34\17\2{|\7\t\2\2|\17\3\2\2\2}~\7\32\2\2"+
		"~\u0080\7\7\2\2\177\u0081\5\34\17\2\u0080\177\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0086\3\2\2\2\u0082\u0083\7\b\2\2\u0083\u0085\5\34\17\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\t\2\2\u008a"+
		"\21\3\2\2\2\u008b\u008e\7\32\2\2\u008c\u008f\5\26\f\2\u008d\u008f\5\24"+
		"\13\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\23\3\2\2\2\u0090\u0091"+
		"\7\27\2\2\u0091\u0092\5\34\17\2\u0092\25\3\2\2\2\u0093\u0094\7\35\2\2"+
		"\u0094\u0095\5\34\17\2\u0095\27\3\2\2\2\u0096\u0097\7\25\2\2\u0097\u0098"+
		"\5\34\17\2\u0098\31\3\2\2\2\u0099\u009a\7\36\2\2\u009a\u009b\7\32\2\2"+
		"\u009b\u009c\7\16\2\2\u009c\u009d\5\34\17\2\u009d\33\3\2\2\2\u009e\u009f"+
		"\b\17\1\2\u009f\u00a3\5\36\20\2\u00a0\u00a3\5 \21\2\u00a1\u00a3\5$\23"+
		"\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a9"+
		"\3\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7\16\2\2\u00a6\u00a8\5\34\17"+
		"\5\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\7\2\2\u00ad"+
		"\u00ae\7\24\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\5\34\17\2\u00b0\37\3\2"+
		"\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5\34\17\2\u00b3\u00b4\7\t\2\2\u00b4"+
		"!\3\2\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b9\7\35\2\2\u00b7\u00ba\5\34\17"+
		"\2\u00b8\u00ba\5&\24\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba#"+
		"\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc%\3\2\2\2\u00bd\u00bf\7\13\2\2\u00be"+
		"\u00c0\7\31\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c4"+
		"\'\3\2\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c7\7\37\2\2\u00c7\u00c8\t\3\2"+
		"\2\u00c8\u00c9\7\7\2\2\u00c9\u00ca\7\32\2\2\u00ca\u00cb\7\t\2\2\u00cb"+
		")\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd\u00ce\7\7\2\2\u00ce\u00cf\7\32\2\2"+
		"\u00cf\u00d0\7\r\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\7\t\2\2\u00d2+\3"+
		"\2\2\2\23\618CIPY`fnr\u0080\u0086\u008e\u00a2\u00a9\u00b9\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}