// Generated from C:/Users/Hoenn/OneDrive - Sheffield Hallam University/Important/FOPL_assigment2/src\pdl.g4 by ANTLR 4.9.1

package Compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		CHAR=18, COLON=19, SEMICOLON=20, LPARENS=21, RPARENS=22, QUOTE=23, COMMA=24, 
		DOT=25, LT=26, GT=27, EQUALS=28, LE=29, GE=30, NE=31, NLT=32, NGT=33, 
		ADD=34, SUB=35, MUL=36, DIV=37, MOD=38, NEWLINE=39, WS=40, QUESTION=41, 
		BANG=42, SPACE=43, SIGN=44, IDENT=45, NUMBER=46, STRING=47;
	public static final int
		RULE_program = 0, RULE_programHeader = 1, RULE_globals = 2, RULE_programEnds = 3, 
		RULE_block = 4, RULE_procDefun = 5, RULE_comparator = 6, RULE_math = 7, 
		RULE_outputStatement = 8, RULE_inputStatement = 9, RULE_procedureCall = 10, 
		RULE_expr = 11, RULE_assignment = 12, RULE_whileLoop = 13, RULE_ifElse = 14, 
		RULE_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeader", "globals", "programEnds", "block", "procDefun", 
			"comparator", "math", "outputStatement", "inputStatement", "procedureCall", 
			"expr", "assignment", "whileLoop", "ifElse", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'global'", "'endprogram'", "'proc'", "'endproc'", 
			"'output'", "'input'", "'call'", "'set'", "'to'", "'while'", "'do'", 
			"'endwhile'", "'if'", "'then'", "'else'", "'endif'", "'[A-Za-z]'", "':'", 
			"';'", "'('", "')'", "'\"'", "','", "'.'", "'<'", "'>'", "'='", "'<='", 
			"'>='", "'!='", "'!<'", "'!>'", "'+'", "'-'", "'*'", "'/'", "'%'", null, 
			null, "'?'", "'!'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "CHAR", "COLON", "SEMICOLON", "LPARENS", 
			"RPARENS", "QUOTE", "COMMA", "DOT", "LT", "GT", "EQUALS", "LE", "GE", 
			"NE", "NLT", "NGT", "ADD", "SUB", "MUL", "DIV", "MOD", "NEWLINE", "WS", 
			"QUESTION", "BANG", "SPACE", "SIGN", "IDENT", "NUMBER", "STRING"
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
	public String getGrammarFileName() { return "pdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeaderContext programHeader() {
			return getRuleContext(ProgramHeaderContext.class,0);
		}
		public ProgramEndsContext programEnds() {
			return getRuleContext(ProgramEndsContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ProcDefunContext> procDefun() {
			return getRuleContexts(ProcDefunContext.class);
		}
		public ProcDefunContext procDefun(int i) {
			return getRuleContext(ProcDefunContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(32);
			programHeader();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__13))) != 0)) {
				{
				{
				setState(33);
				block();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			programEnds();
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				procDefun();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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

	public static class ProgramHeaderContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(pdlParser.COLON, 0); }
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public ProgramHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterProgramHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitProgramHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitProgramHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeaderContext programHeader() throws RecognitionException {
		ProgramHeaderContext _localctx = new ProgramHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(IDENT);
			setState(47);
			match(COLON);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(48);
				globals();
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

	public static class GlobalsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(pdlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(pdlParser.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pdlParser.COMMA, i);
		}
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitGlobals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitGlobals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__1);
			setState(52);
			match(IDENT);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(53);
				match(COMMA);
				setState(54);
				match(IDENT);
				}
				}
				setState(59);
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

	public static class ProgramEndsContext extends ParserRuleContext {
		public ProgramEndsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programEnds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterProgramEnds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitProgramEnds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitProgramEnds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramEndsContext programEnds() throws RecognitionException {
		ProgramEndsContext _localctx = new ProgramEndsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programEnds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				outputStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				inputStatement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				procedureCall();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				assignment();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				whileLoop();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				ifElse();
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

	public static class ProcDefunContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ProcDefunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDefun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterProcDefun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitProcDefun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitProcDefun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcDefunContext procDefun() throws RecognitionException {
		ProcDefunContext _localctx = new ProcDefunContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procDefun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__3);
			setState(71);
			match(IDENT);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__13))) != 0)) {
				{
				{
				setState(72);
				block();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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

	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(pdlParser.LT, 0); }
		public TerminalNode GT() { return getToken(pdlParser.GT, 0); }
		public TerminalNode EQUALS() { return getToken(pdlParser.EQUALS, 0); }
		public TerminalNode LE() { return getToken(pdlParser.LE, 0); }
		public TerminalNode GE() { return getToken(pdlParser.GE, 0); }
		public TerminalNode NE() { return getToken(pdlParser.NE, 0); }
		public TerminalNode NLT() { return getToken(pdlParser.NLT, 0); }
		public TerminalNode NGT() { return getToken(pdlParser.NGT, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << EQUALS) | (1L << LE) | (1L << GE) | (1L << NE) | (1L << NLT) | (1L << NGT))) != 0)) ) {
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

	public static class MathContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(pdlParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(pdlParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(pdlParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(pdlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(pdlParser.MOD, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class OutputStatementContext extends ParserRuleContext {
		public TerminalNode LPARENS() { return getToken(pdlParser.LPARENS, 0); }
		public TerminalNode STRING() { return getToken(pdlParser.STRING, 0); }
		public TerminalNode RPARENS() { return getToken(pdlParser.RPARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pdlParser.COMMA, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(pdlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(pdlParser.IDENT, i);
		}
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterOutputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitOutputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitOutputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			match(LPARENS);
			setState(86);
			match(STRING);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87);
				match(COMMA);
				setState(88);
				match(IDENT);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(RPARENS);
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

	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode LPARENS() { return getToken(pdlParser.LPARENS, 0); }
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public TerminalNode RPARENS() { return getToken(pdlParser.RPARENS, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__6);
			setState(97);
			match(LPARENS);
			setState(98);
			match(IDENT);
			setState(99);
			match(RPARENS);
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

	public static class ProcedureCallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public TerminalNode LPARENS() { return getToken(pdlParser.LPARENS, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RPARENS() { return getToken(pdlParser.RPARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pdlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pdlParser.COMMA, i);
		}
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitProcedureCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procedureCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__7);
			setState(102);
			match(IDENT);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPARENS) {
				{
				setState(103);
				match(LPARENS);
				setState(104);
				value();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(105);
					match(COMMA);
					setState(106);
					value();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(RPARENS);
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

	public static class ExprContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode LPARENS() { return getToken(pdlParser.LPARENS, 0); }
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode RPARENS() { return getToken(pdlParser.RPARENS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				value();
				}
				break;
			case LPARENS:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(LPARENS);
				setState(118);
				match(IDENT);
				setState(119);
				math();
				setState(120);
				value();
				setState(121);
				match(RPARENS);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__8);
			setState(126);
			match(IDENT);
			setState(127);
			match(T__9);
			setState(128);
			expr();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode LPARENS() { return getToken(pdlParser.LPARENS, 0); }
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPARENS() { return getToken(pdlParser.RPARENS, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__10);
			setState(131);
			match(LPARENS);
			setState(132);
			match(IDENT);
			setState(133);
			comparator();
			setState(134);
			value();
			setState(135);
			match(RPARENS);
			setState(136);
			match(T__11);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__13))) != 0)) {
				{
				{
				setState(137);
				block();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__12);
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

	public static class IfElseContext extends ParserRuleContext {
		public TerminalNode LPARENS() { return getToken(pdlParser.LPARENS, 0); }
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPARENS() { return getToken(pdlParser.RPARENS, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__13);
			setState(146);
			match(LPARENS);
			setState(147);
			match(IDENT);
			setState(148);
			comparator();
			setState(149);
			value();
			setState(150);
			match(RPARENS);
			setState(151);
			match(T__14);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__13))) != 0)) {
				{
				{
				setState(152);
				block();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(158);
				match(T__15);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__13))) != 0)) {
					{
					{
					setState(159);
					block();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
			match(T__16);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pdlParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(pdlParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(pdlParser.IDENT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdlListener ) ((pdlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pdlVisitor ) return ((pdlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00ae\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6G\n\6\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\fn\n\f\f\f\16\fq\13\f\3"+
		"\f\3\f\5\fu\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r~\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u008d\n\17\f\17"+
		"\16\17\u0090\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u009c\n\20\f\20\16\20\u009f\13\20\3\20\3\20\7\20\u00a3\n\20\f\20\16"+
		"\20\u00a6\13\20\5\20\u00a8\n\20\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\34#\3\2$(\3\2/\61\2\u00af\2"+
		"\"\3\2\2\2\4/\3\2\2\2\6\65\3\2\2\2\b>\3\2\2\2\nF\3\2\2\2\fH\3\2\2\2\16"+
		"R\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24b\3\2\2\2\26g\3\2\2\2\30}\3\2\2\2"+
		"\32\177\3\2\2\2\34\u0084\3\2\2\2\36\u0093\3\2\2\2 \u00ab\3\2\2\2\"&\5"+
		"\4\3\2#%\5\n\6\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2("+
		"&\3\2\2\2)+\5\b\5\2*,\5\f\7\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
		".\3\3\2\2\2/\60\7\3\2\2\60\61\7/\2\2\61\63\7\25\2\2\62\64\5\6\4\2\63\62"+
		"\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\66\7\4\2\2\66;\7/\2\2\678\7\32"+
		"\2\28:\7/\2\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3"+
		"\2\2\2>?\7\5\2\2?\t\3\2\2\2@G\5\22\n\2AG\5\24\13\2BG\5\26\f\2CG\5\32\16"+
		"\2DG\5\34\17\2EG\5\36\20\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3"+
		"\2\2\2FE\3\2\2\2G\13\3\2\2\2HI\7\6\2\2IM\7/\2\2JL\5\n\6\2KJ\3\2\2\2LO"+
		"\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\7\2\2Q\r\3\2\2\2"+
		"RS\t\2\2\2S\17\3\2\2\2TU\t\3\2\2U\21\3\2\2\2VW\7\b\2\2WX\7\27\2\2X]\7"+
		"\61\2\2YZ\7\32\2\2Z\\\7/\2\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^`\3\2\2\2_]\3\2\2\2`a\7\30\2\2a\23\3\2\2\2bc\7\t\2\2cd\7\27\2\2de\7/"+
		"\2\2ef\7\30\2\2f\25\3\2\2\2gh\7\n\2\2ht\7/\2\2ij\7\27\2\2jo\5 \21\2kl"+
		"\7\32\2\2ln\5 \21\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2"+
		"qo\3\2\2\2rs\7\30\2\2su\3\2\2\2ti\3\2\2\2tu\3\2\2\2u\27\3\2\2\2v~\5 \21"+
		"\2wx\7\27\2\2xy\7/\2\2yz\5\20\t\2z{\5 \21\2{|\7\30\2\2|~\3\2\2\2}v\3\2"+
		"\2\2}w\3\2\2\2~\31\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\7/\2\2\u0081"+
		"\u0082\7\f\2\2\u0082\u0083\5\30\r\2\u0083\33\3\2\2\2\u0084\u0085\7\r\2"+
		"\2\u0085\u0086\7\27\2\2\u0086\u0087\7/\2\2\u0087\u0088\5\16\b\2\u0088"+
		"\u0089\5 \21\2\u0089\u008a\7\30\2\2\u008a\u008e\7\16\2\2\u008b\u008d\5"+
		"\n\6\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\17"+
		"\2\2\u0092\35\3\2\2\2\u0093\u0094\7\20\2\2\u0094\u0095\7\27\2\2\u0095"+
		"\u0096\7/\2\2\u0096\u0097\5\16\b\2\u0097\u0098\5 \21\2\u0098\u0099\7\30"+
		"\2\2\u0099\u009d\7\21\2\2\u009a\u009c\5\n\6\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a7\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a4\7\22\2\2\u00a1\u00a3\5\n\6\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\23\2\2\u00aa\37\3\2\2"+
		"\2\u00ab\u00ac\t\4\2\2\u00ac!\3\2\2\2\20&-\63;FM]ot}\u008e\u009d\u00a4"+
		"\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}