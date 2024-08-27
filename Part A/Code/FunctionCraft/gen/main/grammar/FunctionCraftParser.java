// Generated from /Users/ashkanzarkhah/Documents/University/Compiler/Project/Part A/Code/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT_VAL=2, FLOAT_VAL=3, STRING_VAL=4, DOT=5, MULT=6, MOD=7, PLUS=8, 
		MINUS=9, DIV=10, DMINUS=11, DPLUS=12, LES=13, GRT=14, COLON=15, LESE=16, 
		GRTE=17, AND=18, OR=19, NOT=20, APPEND=21, ASSIGN=22, EQUAL=23, NEQUAL=24, 
		PLUS_ASSIGN=25, MINUS_ASSIGN=26, MULT_ASSIGN=27, MOD_ASSIGN=28, SEMICOLON=29, 
		COMMA=30, RETURN=31, MAIN=32, END=33, DEF=34, TRUE=35, FALSE=36, ELSEIF=37, 
		ELSE=38, IF=39, PUSH=40, PUTS=41, CHOP=42, CHOMP=43, LOOP=44, BREAK=45, 
		NEXT=46, MATCH=47, METHOD=48, PATTERN=49, PATTERNOR=50, LEN=51, IN=52, 
		FOR=53, DO=54, LPAR=55, RPAR=56, LBRACE=57, RBRACE=58, LBRACKET=59, RBRACKET=60, 
		POINTER=61, IDENTIFIER=62, SIGMA=63, OLCOMMENT=64, COMMENT=65, OWS=66, 
		TWS=67, WN=68, TAB=69;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_main_function = 2, RULE_function_body = 3, 
		RULE_function_arg = 4, RULE_lambda_function = 5, RULE_predefine_arg = 6, 
		RULE_return_statement = 7, RULE_function_call = 8, RULE_function_call_body = 9, 
		RULE_function_call_bodyp = 10, RULE_built_in_function = 11, RULE_value = 12, 
		RULE_statement = 13, RULE_absolute_expression = 14, RULE_expression = 15, 
		RULE_expression2 = 16, RULE_expression3 = 17, RULE_expression4 = 18, RULE_expression5 = 19, 
		RULE_expression6 = 20, RULE_expression7 = 21, RULE_expression8 = 22, RULE_expression9 = 23, 
		RULE_raw_value = 24, RULE_list_val = 25, RULE_assignment = 26, RULE_assignmentp = 27, 
		RULE_if_proposition = 28, RULE_if_else_elseif = 29, RULE_if_body = 30, 
		RULE_loop_do = 31, RULE_range = 32, RULE_next_if = 33, RULE_break_if = 34, 
		RULE_loop_body = 35, RULE_for_in = 36, RULE_puts = 37, RULE_push = 38, 
		RULE_len = 39, RULE_chop = 40, RULE_chomp = 41, RULE_method = 42, RULE_pattern = 43, 
		RULE_pattern_matching = 44, RULE_return_val = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "main_function", "function_body", "function_arg", 
			"lambda_function", "predefine_arg", "return_statement", "function_call", 
			"function_call_body", "function_call_bodyp", "built_in_function", "value", 
			"statement", "absolute_expression", "expression", "expression2", "expression3", 
			"expression4", "expression5", "expression6", "expression7", "expression8", 
			"expression9", "raw_value", "list_val", "assignment", "assignmentp", 
			"if_proposition", "if_else_elseif", "if_body", "loop_do", "range", "next_if", 
			"break_if", "loop_body", "for_in", "puts", "push", "len", "chop", "chomp", 
			"method", "pattern", "pattern_matching", "return_val"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'..'", null, null, null, "'.'", "'*'", "'%'", "'+'", "'-'", "'/'", 
			"'--'", "'++'", "'<'", "'>'", "':'", "'<='", "'>='", "'&&'", "'||'", 
			"'!'", "'<<'", "'='", "'=='", "'!='", "'+='", "'-='", "'*='", "'%='", 
			"';'", "','", "'return'", "'main'", "'end'", "'def'", "'true'", "'false'", 
			"'elseif'", "'else'", "'if'", "'push'", "'puts'", "'chop'", "'chomp'", 
			"'loop'", "'break'", "'next'", "'match'", "'method'", "'pattern'", "'|'", 
			"'Len'", "'in'", "'for'", "'do'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'->'", null, null, null, null, null, "'  '", null, "'    |'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT_VAL", "FLOAT_VAL", "STRING_VAL", "DOT", "MULT", "MOD", 
			"PLUS", "MINUS", "DIV", "DMINUS", "DPLUS", "LES", "GRT", "COLON", "LESE", 
			"GRTE", "AND", "OR", "NOT", "APPEND", "ASSIGN", "EQUAL", "NEQUAL", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "MULT_ASSIGN", "MOD_ASSIGN", "SEMICOLON", "COMMA", "RETURN", 
			"MAIN", "END", "DEF", "TRUE", "FALSE", "ELSEIF", "ELSE", "IF", "PUSH", 
			"PUTS", "CHOP", "CHOMP", "LOOP", "BREAK", "NEXT", "MATCH", "METHOD", 
			"PATTERN", "PATTERNOR", "LEN", "IN", "FOR", "DO", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "POINTER", "IDENTIFIER", "SIGMA", "OLCOMMENT", 
			"COMMENT", "OWS", "TWS", "WN", "TAB"
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
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(94);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(92);
						function();
						}
						break;
					case PATTERN:
						{
						setState(93);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(99);
			main_function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public Function_argContext function_arg() {
			return getRuleContext(Function_argContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(DEF);
			setState(102);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			System.out.println("FuncDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null));
			setState(104);
			function_arg();
			setState(105);
			function_body();
			setState(106);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DEF);
			setState(109);
			match(MAIN);
			System.out.println("MAIN");
			setState(111);
			match(LPAR);
			setState(112);
			match(RPAR);
			setState(113);
			function_body();
			setState(114);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6929104136302493696L) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(122);
				return_statement();
				}
				break;
			case END:
			case RBRACE:
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_argContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public Predefine_argContext predefine_arg() {
			return getRuleContext(Predefine_argContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Function_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argContext function_arg() throws RecognitionException {
		Function_argContext _localctx = new Function_argContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_arg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LPAR);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(127);
						match(IDENTIFIER);
						setState(128);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(131); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(133);
					match(IDENTIFIER);
					}
					break;
				case LBRACKET:
					{
					setState(134);
					predefine_arg();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(137);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(138);
				predefine_arg();
				}
				break;
			case 4:
				{
				}
				break;
			}
			setState(142);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lambda_functionContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(FunctionCraftParser.POINTER, 0); }
		public Function_argContext function_arg() {
			return getRuleContext(Function_argContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public Lambda_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_functionContext lambda_function() throws RecognitionException {
		Lambda_functionContext _localctx = new Lambda_functionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lambda_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(POINTER);
			System.out.println("Structure: LAMBDA");
			setState(146);
			function_arg();
			setState(147);
			match(LBRACE);
			setState(148);
			function_body();
			setState(149);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Predefine_argContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public List<AssignmentpContext> assignmentp() {
			return getRuleContexts(AssignmentpContext.class);
		}
		public AssignmentpContext assignmentp(int i) {
			return getRuleContext(AssignmentpContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Predefine_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefine_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPredefine_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPredefine_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPredefine_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predefine_argContext predefine_arg() throws RecognitionException {
		Predefine_argContext _localctx = new Predefine_argContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predefine_arg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(LBRACKET);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					assignmentp();
					setState(153);
					match(COMMA);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(160);
			assignmentp();
			setState(161);
			match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public Return_valContext return_val() {
			return getRuleContext(Return_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(RETURN);
			System.out.println("RETURN");
			setState(165);
			return_val();
			setState(166);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public Function_call_bodypContext function_call_bodyp() {
			return getRuleContext(Function_call_bodypContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(168);
				match(IDENTIFIER);
				}
				break;
			case POINTER:
				{
				setState(169);
				lambda_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
			function_call_bodyp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_bodyContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Lambda_functionContext> lambda_function() {
			return getRuleContexts(Lambda_functionContext.class);
		}
		public Lambda_functionContext lambda_function(int i) {
			return getRuleContext(Lambda_functionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Function_call_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_bodyContext function_call_body() throws RecognitionException {
		Function_call_bodyContext _localctx = new Function_call_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LPAR);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
							{
							setState(175);
							value();
							}
							break;
						case 2:
							{
							setState(176);
							lambda_function();
							}
							break;
						}
						setState(179);
						match(COMMA);
						}
						} 
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(186);
					value();
					}
					break;
				case 2:
					{
					setState(187);
					lambda_function();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case MINUS:
				case NOT:
				case TRUE:
				case FALSE:
				case PUSH:
				case PUTS:
				case CHOP:
				case CHOMP:
				case METHOD:
				case LEN:
				case LPAR:
				case LBRACKET:
				case POINTER:
				case IDENTIFIER:
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(190);
						value();
						}
						break;
					case 2:
						{
						setState(191);
						lambda_function();
						}
						break;
					}
					}
					break;
				case RPAR:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(199);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_call_bodypContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Lambda_functionContext> lambda_function() {
			return getRuleContexts(Lambda_functionContext.class);
		}
		public Lambda_functionContext lambda_function(int i) {
			return getRuleContext(Lambda_functionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Function_call_bodypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_bodyp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call_bodyp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call_bodyp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call_bodyp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_bodypContext function_call_bodyp() throws RecognitionException {
		Function_call_bodypContext _localctx = new Function_call_bodypContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call_bodyp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LPAR);
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				System.out.println("Function Call");
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(205);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(203);
							value();
							}
							break;
						case 2:
							{
							setState(204);
							lambda_function();
							}
							break;
						}
						setState(207);
						match(COMMA);
						}
						} 
					}
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(214);
					value();
					}
					break;
				case 2:
					{
					setState(215);
					lambda_function();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case MINUS:
				case NOT:
				case TRUE:
				case FALSE:
				case PUSH:
				case PUTS:
				case CHOP:
				case CHOMP:
				case METHOD:
				case LEN:
				case LPAR:
				case LBRACKET:
				case POINTER:
				case IDENTIFIER:
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(218);
						value();
						}
						break;
					case 2:
						{
						setState(219);
						lambda_function();
						}
						break;
					}
					}
					break;
				case RPAR:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(227);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Built_in_functionContext extends ParserRuleContext {
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Built_in_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuilt_in_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuilt_in_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuilt_in_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_functionContext built_in_function() throws RecognitionException {
		Built_in_functionContext _localctx = new Built_in_functionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_built_in_function);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				puts();
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				push();
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				chomp();
				}
				break;
			case CHOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				chop();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				len();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				method();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Absolute_expressionContext absolute_expression() {
			return getRuleContext(Absolute_expressionContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(FunctionCraftParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(FunctionCraftParser.LBRACKET, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(FunctionCraftParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(FunctionCraftParser.RBRACKET, i);
		}
		public Raw_valueContext raw_value() {
			return getRuleContext(Raw_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				absolute_expression();
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					match(LBRACKET);
					setState(239);
					value();
					setState(240);
					match(RBRACKET);
					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACKET );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				absolute_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				raw_value(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Built_in_functionContext built_in_function() {
			return getRuleContext(Built_in_functionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Pattern_matchingContext pattern_matching() {
			return getRuleContext(Pattern_matchingContext.class,0);
		}
		public If_else_elseifContext if_else_elseif() {
			return getRuleContext(If_else_elseifContext.class,0);
		}
		public Loop_doContext loop_do() {
			return getRuleContext(Loop_doContext.class,0);
		}
		public For_inContext for_in() {
			return getRuleContext(For_inContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				built_in_function();
				setState(251);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				function_call();
				setState(254);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				pattern_matching();
				setState(257);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				if_else_elseif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				loop_do();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				for_in();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				assignment();
				setState(263);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Absolute_expressionContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode EQUAL() { return getToken(FunctionCraftParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(FunctionCraftParser.NEQUAL, 0); }
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public TerminalNode LESE() { return getToken(FunctionCraftParser.LESE, 0); }
		public TerminalNode GRT() { return getToken(FunctionCraftParser.GRT, 0); }
		public TerminalNode GRTE() { return getToken(FunctionCraftParser.GRTE, 0); }
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Expression8Context expression8() {
			return getRuleContext(Expression8Context.class,0);
		}
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public Expression9Context expression9() {
			return getRuleContext(Expression9Context.class,0);
		}
		public TerminalNode DPLUS() { return getToken(FunctionCraftParser.DPLUS, 0); }
		public TerminalNode DMINUS() { return getToken(FunctionCraftParser.DMINUS, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Absolute_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolute_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAbsolute_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAbsolute_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAbsolute_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Absolute_expressionContext absolute_expression() throws RecognitionException {
		Absolute_expressionContext _localctx = new Absolute_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_absolute_expression);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				expression(0);
				setState(268);
				((Absolute_expressionContext)_localctx).name = match(APPEND);
				setState(269);
				expression2(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				expression2(0);
				setState(273);
				((Absolute_expressionContext)_localctx).name = match(OR);
				setState(274);
				expression3(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				expression3(0);
				setState(278);
				((Absolute_expressionContext)_localctx).name = match(AND);
				setState(279);
				expression4(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				expression4(0);
				setState(283);
				((Absolute_expressionContext)_localctx).name = match(EQUAL);
				setState(284);
				expression5(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				expression4(0);
				setState(288);
				((Absolute_expressionContext)_localctx).name = match(NEQUAL);
				setState(289);
				expression5(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				expression5(0);
				setState(293);
				((Absolute_expressionContext)_localctx).name = match(LES);
				setState(294);
				expression6(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				expression5(0);
				setState(298);
				((Absolute_expressionContext)_localctx).name = match(LESE);
				setState(299);
				expression6(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(302);
				expression5(0);
				setState(303);
				((Absolute_expressionContext)_localctx).name = match(GRT);
				setState(304);
				expression6(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(307);
				expression5(0);
				setState(308);
				((Absolute_expressionContext)_localctx).name = match(GRTE);
				setState(309);
				expression6(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(312);
				expression6(0);
				setState(313);
				((Absolute_expressionContext)_localctx).name = match(PLUS);
				setState(314);
				expression7(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(317);
				expression6(0);
				setState(318);
				((Absolute_expressionContext)_localctx).name = match(MINUS);
				setState(319);
				expression7(0);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(322);
				expression7(0);
				setState(323);
				((Absolute_expressionContext)_localctx).name = match(MULT);
				setState(324);
				expression8();
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(327);
				expression7(0);
				setState(328);
				((Absolute_expressionContext)_localctx).name = match(DIV);
				setState(329);
				expression8();
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(332);
				expression7(0);
				setState(333);
				((Absolute_expressionContext)_localctx).name = match(MOD);
				setState(334);
				expression8();
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(337);
				((Absolute_expressionContext)_localctx).name = match(NOT);
				setState(338);
				expression8();
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(341);
				((Absolute_expressionContext)_localctx).name = match(MINUS);
				setState(342);
				expression8();
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(345);
				expression9(0);
				setState(346);
				((Absolute_expressionContext)_localctx).name = match(DPLUS);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(349);
				expression9(0);
				setState(350);
				((Absolute_expressionContext)_localctx).name = match(DMINUS);
				System.out.println("Operator: " + (((Absolute_expressionContext)_localctx).name!=null?((Absolute_expressionContext)_localctx).name.getText():null));
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(353);
				match(LPAR);
				setState(354);
				expression(0);
				setState(355);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Token name;
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(360);
			expression2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(362);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(363);
					((ExpressionContext)_localctx).name = match(APPEND);
					setState(364);
					expression2(0);
					System.out.println("Operator: " + (((ExpressionContext)_localctx).name!=null?((ExpressionContext)_localctx).name.getText():null));
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression2Context extends ParserRuleContext {
		public Token name;
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		return expression2(0);
	}

	private Expression2Context expression2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression2Context _localctx = new Expression2Context(_ctx, _parentState);
		Expression2Context _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(373);
			expression3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression2);
					setState(375);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(376);
					((Expression2Context)_localctx).name = match(OR);
					setState(377);
					expression3(0);
					System.out.println("Operator: " + (((Expression2Context)_localctx).name!=null?((Expression2Context)_localctx).name.getText():null));
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression3Context extends ParserRuleContext {
		public Token name;
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		return expression3(0);
	}

	private Expression3Context expression3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression3Context _localctx = new Expression3Context(_ctx, _parentState);
		Expression3Context _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(386);
			expression4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression3);
					setState(388);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(389);
					((Expression3Context)_localctx).name = match(AND);
					setState(390);
					expression4(0);
					System.out.println("Operator: " + (((Expression3Context)_localctx).name!=null?((Expression3Context)_localctx).name.getText():null));
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression4Context extends ParserRuleContext {
		public Token name;
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public TerminalNode EQUAL() { return getToken(FunctionCraftParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(FunctionCraftParser.NEQUAL, 0); }
		public Expression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression4Context expression4() throws RecognitionException {
		return expression4(0);
	}

	private Expression4Context expression4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression4Context _localctx = new Expression4Context(_ctx, _parentState);
		Expression4Context _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(399);
			expression5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Expression4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression4);
						setState(401);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(402);
						((Expression4Context)_localctx).name = match(EQUAL);
						setState(403);
						expression5(0);
						System.out.println("Operator: " + (((Expression4Context)_localctx).name!=null?((Expression4Context)_localctx).name.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new Expression4Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression4);
						setState(406);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(407);
						((Expression4Context)_localctx).name = match(NEQUAL);
						setState(408);
						expression5(0);
						System.out.println("Operator: " + (((Expression4Context)_localctx).name!=null?((Expression4Context)_localctx).name.getText():null));
						}
						break;
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression5Context extends ParserRuleContext {
		public Token name;
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public TerminalNode LESE() { return getToken(FunctionCraftParser.LESE, 0); }
		public TerminalNode GRT() { return getToken(FunctionCraftParser.GRT, 0); }
		public TerminalNode GRTE() { return getToken(FunctionCraftParser.GRTE, 0); }
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression5Context expression5() throws RecognitionException {
		return expression5(0);
	}

	private Expression5Context expression5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression5Context _localctx = new Expression5Context(_ctx, _parentState);
		Expression5Context _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(417);
			expression6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new Expression5Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression5);
						setState(419);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(420);
						((Expression5Context)_localctx).name = match(LES);
						setState(421);
						expression6(0);
						System.out.println("Operator: " + (((Expression5Context)_localctx).name!=null?((Expression5Context)_localctx).name.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new Expression5Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression5);
						setState(424);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(425);
						((Expression5Context)_localctx).name = match(LESE);
						setState(426);
						expression6(0);
						System.out.println("Operator: " + (((Expression5Context)_localctx).name!=null?((Expression5Context)_localctx).name.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new Expression5Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression5);
						setState(429);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(430);
						((Expression5Context)_localctx).name = match(GRT);
						setState(431);
						expression6(0);
						System.out.println("Operator: " + (((Expression5Context)_localctx).name!=null?((Expression5Context)_localctx).name.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new Expression5Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression5);
						setState(434);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(435);
						((Expression5Context)_localctx).name = match(GRTE);
						setState(436);
						expression6(0);
						System.out.println("Operator: " + (((Expression5Context)_localctx).name!=null?((Expression5Context)_localctx).name.getText():null));
						}
						break;
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression6Context extends ParserRuleContext {
		public Token name;
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Expression6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression6Context expression6() throws RecognitionException {
		return expression6(0);
	}

	private Expression6Context expression6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression6Context _localctx = new Expression6Context(_ctx, _parentState);
		Expression6Context _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression6, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(445);
			expression7(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(457);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new Expression6Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression6);
						setState(447);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(448);
						((Expression6Context)_localctx).name = match(PLUS);
						setState(449);
						expression7(0);
						System.out.println("Operator: " + (((Expression6Context)_localctx).name!=null?((Expression6Context)_localctx).name.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new Expression6Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression6);
						setState(452);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(453);
						((Expression6Context)_localctx).name = match(MINUS);
						setState(454);
						expression7(0);
						System.out.println("Operator: " + (((Expression6Context)_localctx).name!=null?((Expression6Context)_localctx).name.getText():null));
						}
						break;
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression7Context extends ParserRuleContext {
		public Token name;
		public Expression8Context expression8() {
			return getRuleContext(Expression8Context.class,0);
		}
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public Expression7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression7Context expression7() throws RecognitionException {
		return expression7(0);
	}

	private Expression7Context expression7(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression7Context _localctx = new Expression7Context(_ctx, _parentState);
		Expression7Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression7, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(463);
			expression8();
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(480);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new Expression7Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression7);
						setState(465);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(466);
						((Expression7Context)_localctx).name = match(MULT);
						setState(467);
						expression8();
						System.out.println("Operator: " + (((Expression7Context)_localctx).name!=null?((Expression7Context)_localctx).name.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new Expression7Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression7);
						setState(470);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(471);
						((Expression7Context)_localctx).name = match(DIV);
						setState(472);
						expression8();
						System.out.println("Operator: " + (((Expression7Context)_localctx).name!=null?((Expression7Context)_localctx).name.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new Expression7Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression7);
						setState(475);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(476);
						((Expression7Context)_localctx).name = match(MOD);
						setState(477);
						expression8();
						System.out.println("Operator: " + (((Expression7Context)_localctx).name!=null?((Expression7Context)_localctx).name.getText():null));
						}
						break;
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression8Context extends ParserRuleContext {
		public Token name;
		public Expression8Context expression8() {
			return getRuleContext(Expression8Context.class,0);
		}
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Expression9Context expression9() {
			return getRuleContext(Expression9Context.class,0);
		}
		public Expression8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression8Context expression8() throws RecognitionException {
		Expression8Context _localctx = new Expression8Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression8);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				((Expression8Context)_localctx).name = match(NOT);
				setState(486);
				expression8();
				System.out.println("Operator: " + (((Expression8Context)_localctx).name!=null?((Expression8Context)_localctx).name.getText():null));
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				((Expression8Context)_localctx).name = match(MINUS);
				setState(490);
				expression8();
				System.out.println("Operator: " + (((Expression8Context)_localctx).name!=null?((Expression8Context)_localctx).name.getText():null));
				}
				break;
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case TRUE:
			case FALSE:
			case PUSH:
			case PUTS:
			case CHOP:
			case CHOMP:
			case METHOD:
			case LEN:
			case LPAR:
			case LBRACKET:
			case POINTER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				expression9(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression9Context extends ParserRuleContext {
		public Token name;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Raw_valueContext raw_value() {
			return getRuleContext(Raw_valueContext.class,0);
		}
		public Expression9Context expression9() {
			return getRuleContext(Expression9Context.class,0);
		}
		public TerminalNode DPLUS() { return getToken(FunctionCraftParser.DPLUS, 0); }
		public TerminalNode DMINUS() { return getToken(FunctionCraftParser.DMINUS, 0); }
		public Expression9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpression9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpression9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpression9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression9Context expression9() throws RecognitionException {
		return expression9(0);
	}

	private Expression9Context expression9(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression9Context _localctx = new Expression9Context(_ctx, _parentState);
		Expression9Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression9, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(497);
				match(LPAR);
				setState(498);
				expression(0);
				setState(499);
				match(RPAR);
				}
				break;
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case TRUE:
			case FALSE:
			case PUSH:
			case PUTS:
			case CHOP:
			case CHOMP:
			case METHOD:
			case LEN:
			case LBRACKET:
			case POINTER:
			case IDENTIFIER:
				{
				setState(501);
				raw_value(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(510);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new Expression9Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression9);
						setState(504);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(505);
						((Expression9Context)_localctx).name = match(DPLUS);
						System.out.println("Operator: " + (((Expression9Context)_localctx).name!=null?((Expression9Context)_localctx).name.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new Expression9Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression9);
						setState(507);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(508);
						((Expression9Context)_localctx).name = match(DMINUS);
						System.out.println("Operator: " + (((Expression9Context)_localctx).name!=null?((Expression9Context)_localctx).name.getText():null));
						}
						break;
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Raw_valueContext extends ParserRuleContext {
		public Built_in_functionContext built_in_function() {
			return getRuleContext(Built_in_functionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Pattern_matchingContext pattern_matching() {
			return getRuleContext(Pattern_matchingContext.class,0);
		}
		public List_valContext list_val() {
			return getRuleContext(List_valContext.class,0);
		}
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public Raw_valueContext raw_value() {
			return getRuleContext(Raw_valueContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(FunctionCraftParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(FunctionCraftParser.LBRACKET, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(FunctionCraftParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(FunctionCraftParser.RBRACKET, i);
		}
		public Raw_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRaw_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRaw_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRaw_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_valueContext raw_value() throws RecognitionException {
		return raw_value(0);
	}

	private Raw_valueContext raw_value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Raw_valueContext _localctx = new Raw_valueContext(_ctx, _parentState);
		Raw_valueContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_raw_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(516);
				built_in_function();
				}
				break;
			case 2:
				{
				setState(517);
				function_call();
				}
				break;
			case 3:
				{
				setState(518);
				pattern_matching();
				}
				break;
			case 4:
				{
				setState(519);
				list_val();
				}
				break;
			case 5:
				{
				setState(520);
				match(STRING_VAL);
				}
				break;
			case 6:
				{
				setState(521);
				match(INT_VAL);
				}
				break;
			case 7:
				{
				setState(522);
				match(FLOAT_VAL);
				}
				break;
			case 8:
				{
				setState(523);
				match(TRUE);
				}
				break;
			case 9:
				{
				setState(524);
				match(FALSE);
				}
				break;
			case 10:
				{
				setState(525);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Raw_valueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_raw_value);
					setState(528);
					if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
					setState(533); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(529);
							match(LBRACKET);
							setState(530);
							value();
							setState(531);
							match(RBRACKET);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(535); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_valContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public List_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valContext list_val() throws RecognitionException {
		List_valContext _localctx = new List_valContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_list_val);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(LBRACKET);
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(546); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(543);
						value();
						setState(544);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(548); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(550);
				value();
				}
				break;
			case 2:
				{
				setState(554);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case MINUS:
				case NOT:
				case TRUE:
				case FALSE:
				case PUSH:
				case PUTS:
				case CHOP:
				case CHOMP:
				case METHOD:
				case LEN:
				case LPAR:
				case LBRACKET:
				case POINTER:
				case IDENTIFIER:
					{
					setState(552);
					value();
					}
					break;
				case RBRACKET:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(558);
			match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(FunctionCraftParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FunctionCraftParser.MULT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(560);
				((AssignmentContext)_localctx).name = match(IDENTIFIER);
				setState(561);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 507510784L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(562);
					value();
					}
					break;
				case 2:
					{
					setState(563);
					lambda_function();
					}
					break;
				}
				System.out.println("Assignment: " + (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(568);
				match(IDENTIFIER);
				setState(569);
				((AssignmentContext)_localctx).name = match(APPEND);
				System.out.println("Operator: " + (((AssignmentContext)_localctx).name!=null?((AssignmentContext)_localctx).name.getText():null));
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(571);
					value();
					}
					break;
				case 2:
					{
					setState(572);
					lambda_function();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentpContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public AssignmentpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignmentp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignmentp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignmentp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentpContext assignmentp() throws RecognitionException {
		AssignmentpContext _localctx = new AssignmentpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			((AssignmentpContext)_localctx).name = match(IDENTIFIER);
			setState(578);
			match(ASSIGN);
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(579);
				value();
				}
				break;
			case 2:
				{
				setState(580);
				lambda_function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_propositionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<If_propositionContext> if_proposition() {
			return getRuleContexts(If_propositionContext.class);
		}
		public If_propositionContext if_proposition(int i) {
			return getRuleContext(If_propositionContext.class,i);
		}
		public List<Raw_valueContext> raw_value() {
			return getRuleContexts(Raw_valueContext.class);
		}
		public Raw_valueContext raw_value(int i) {
			return getRuleContext(Raw_valueContext.class,i);
		}
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public TerminalNode EQUAL() { return getToken(FunctionCraftParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(FunctionCraftParser.NEQUAL, 0); }
		public TerminalNode LESE() { return getToken(FunctionCraftParser.LESE, 0); }
		public TerminalNode GRTE() { return getToken(FunctionCraftParser.GRTE, 0); }
		public TerminalNode GRT() { return getToken(FunctionCraftParser.GRT, 0); }
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public If_propositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_proposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_proposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_proposition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_proposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_propositionContext if_proposition() throws RecognitionException {
		If_propositionContext _localctx = new If_propositionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_proposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(LPAR);
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(584);
				if_proposition();
				setState(585);
				((If_propositionContext)_localctx).name = match(AND);
				setState(586);
				if_proposition();
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 2:
				{
				setState(589);
				if_proposition();
				setState(590);
				((If_propositionContext)_localctx).name = match(OR);
				setState(591);
				if_proposition();
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 3:
				{
				setState(594);
				((If_propositionContext)_localctx).name = match(NOT);
				setState(595);
				if_proposition();
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 4:
				{
				setState(598);
				raw_value(0);
				setState(599);
				((If_propositionContext)_localctx).name = match(EQUAL);
				setState(600);
				raw_value(0);
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 5:
				{
				setState(603);
				raw_value(0);
				setState(604);
				((If_propositionContext)_localctx).name = match(NEQUAL);
				setState(605);
				raw_value(0);
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 6:
				{
				setState(608);
				raw_value(0);
				setState(609);
				((If_propositionContext)_localctx).name = match(LESE);
				setState(610);
				raw_value(0);
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 7:
				{
				setState(613);
				raw_value(0);
				setState(614);
				((If_propositionContext)_localctx).name = match(GRTE);
				setState(615);
				raw_value(0);
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 8:
				{
				setState(618);
				raw_value(0);
				setState(619);
				((If_propositionContext)_localctx).name = match(GRT);
				setState(620);
				raw_value(0);
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 9:
				{
				setState(623);
				raw_value(0);
				setState(624);
				((If_propositionContext)_localctx).name = match(LES);
				setState(625);
				raw_value(0);
				System.out.println("Operator: " + (((If_propositionContext)_localctx).name!=null?((If_propositionContext)_localctx).name.getText():null));
				}
				break;
			case 10:
				{
				setState(628);
				raw_value(0);
				}
				break;
			}
			setState(631);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_else_elseifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public List<If_propositionContext> if_proposition() {
			return getRuleContexts(If_propositionContext.class);
		}
		public If_propositionContext if_proposition(int i) {
			return getRuleContext(If_propositionContext.class,i);
		}
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public If_else_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_else_elseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_else_elseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_else_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_elseifContext if_else_elseif() throws RecognitionException {
		If_else_elseifContext _localctx = new If_else_elseifContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_else_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(IF);
			System.out.println("Decision: IF");
			setState(635);
			if_proposition();
			setState(636);
			if_body();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(637);
				match(ELSEIF);
				System.out.println("Decision: ELSE IF");
				setState(639);
				if_proposition();
				setState(640);
				if_body();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(647);
				match(ELSE);
				System.out.println("Decision: ELSE");
				setState(649);
				if_body();
				}
				break;
			case END:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(653);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_bodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6929104136302493696L) != 0)) {
				{
				{
				setState(655);
				statement();
				}
				}
				setState(660);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_doContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public Loop_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_doContext loop_do() throws RecognitionException {
		Loop_doContext _localctx = new Loop_doContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loop_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(LOOP);
			setState(662);
			match(DO);
			System.out.println("Loop: DO");
			setState(664);
			loop_body();
			setState(665);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<TerminalNode> INT_VAL() { return getTokens(FunctionCraftParser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(FunctionCraftParser.INT_VAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List_valContext list_val() {
			return getRuleContext(List_valContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_range);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(LPAR);
				setState(668);
				_la = _input.LA(1);
				if ( !(_la==INT_VAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(669);
				match(T__0);
				setState(670);
				_la = _input.LA(1);
				if ( !(_la==INT_VAL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(671);
				match(RPAR);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(IDENTIFIER);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(673);
				list_val();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Next_ifContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public If_propositionContext if_proposition() {
			return getRuleContext(If_propositionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Next_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_ifContext next_if() throws RecognitionException {
		Next_ifContext _localctx = new Next_ifContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_next_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(NEXT);
			setState(677);
			match(IF);
			System.out.println("Control: NEXT");
			setState(679);
			if_proposition();
			setState(680);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Break_ifContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public If_propositionContext if_proposition() {
			return getRuleContext(If_propositionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Break_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_ifContext break_if() throws RecognitionException {
		Break_ifContext _localctx = new Break_ifContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_break_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(BREAK);
			setState(683);
			match(IF);
			System.out.println("Control: BREAK");
			setState(685);
			if_proposition();
			setState(686);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_bodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEXT() { return getTokens(FunctionCraftParser.NEXT); }
		public TerminalNode NEXT(int i) {
			return getToken(FunctionCraftParser.NEXT, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(FunctionCraftParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FunctionCraftParser.SEMICOLON, i);
		}
		public List<Next_ifContext> next_if() {
			return getRuleContexts(Next_ifContext.class);
		}
		public Next_ifContext next_if(int i) {
			return getRuleContext(Next_ifContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(FunctionCraftParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(FunctionCraftParser.BREAK, i);
		}
		public List<Break_ifContext> break_if() {
			return getRuleContexts(Break_ifContext.class);
		}
		public Break_ifContext break_if(int i) {
			return getRuleContext(Break_ifContext.class,i);
		}
		public Loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_bodyContext loop_body() throws RecognitionException {
		Loop_bodyContext _localctx = new Loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loop_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6929209689418760192L) != 0)) {
				{
				setState(697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(688);
					statement();
					}
					break;
				case 2:
					{
					setState(689);
					match(NEXT);
					System.out.println("Control: NEXT");
					setState(691);
					match(SEMICOLON);
					}
					break;
				case 3:
					{
					setState(692);
					next_if();
					}
					break;
				case 4:
					{
					setState(693);
					match(BREAK);
					System.out.println("Control: BREAK");
					setState(695);
					match(SEMICOLON);
					}
					break;
				case 5:
					{
					setState(696);
					break_if();
					}
					break;
				}
				}
				setState(701);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_inContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public For_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_inContext for_in() throws RecognitionException {
		For_inContext _localctx = new For_inContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_for_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(FOR);
			setState(703);
			match(IDENTIFIER);
			setState(704);
			match(IN);
			System.out.println("Loop: FOR");
			setState(706);
			range();
			setState(707);
			loop_body();
			setState(708);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public Function_call_bodyContext function_call_body() {
			return getRuleContext(Function_call_bodyContext.class,0);
		}
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(PUTS);
			System.out.println("Built-In: PUTS");
			setState(712);
			function_call_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public Function_call_bodyContext function_call_body() {
			return getRuleContext(Function_call_bodyContext.class,0);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(PUSH);
			System.out.println("Built-In: PUSH");
			setState(716);
			function_call_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public Function_call_bodyContext function_call_body() {
			return getRuleContext(Function_call_bodyContext.class,0);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(LEN);
			System.out.println("Built-In: LEN");
			setState(720);
			function_call_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public Function_call_bodyContext function_call_body() {
			return getRuleContext(Function_call_bodyContext.class,0);
		}
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(CHOP);
			System.out.println("Built-In: CHOP");
			setState(724);
			function_call_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public Function_call_bodyContext function_call_body() {
			return getRuleContext(Function_call_bodyContext.class,0);
		}
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(CHOMP);
			System.out.println("Built-In: CHOMP");
			setState(728);
			function_call_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(METHOD);
			setState(731);
			match(LPAR);
			setState(732);
			match(COLON);
			setState(733);
			match(IDENTIFIER);
			setState(734);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public Function_argContext function_arg() {
			return getRuleContext(Function_argContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<TerminalNode> TAB() { return getTokens(FunctionCraftParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(FunctionCraftParser.TAB, i);
		}
		public List<If_propositionContext> if_proposition() {
			return getRuleContexts(If_propositionContext.class);
		}
		public If_propositionContext if_proposition(int i) {
			return getRuleContext(If_propositionContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(PATTERN);
			setState(737);
			((PatternContext)_localctx).name = match(IDENTIFIER);
			System.out.println("PatternDec: " + (((PatternContext)_localctx).name!=null?((PatternContext)_localctx).name.getText():null));
			setState(739);
			function_arg();
			setState(745); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(740);
				match(TAB);
				setState(741);
				if_proposition();
				setState(742);
				match(ASSIGN);
				setState(743);
				value();
				}
				}
				setState(747); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(749);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_matchingContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public Function_call_bodyContext function_call_body() {
			return getRuleContext(Function_call_bodyContext.class,0);
		}
		public Pattern_matchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern_matching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern_matching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern_matching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_matchingContext pattern_matching() throws RecognitionException {
		Pattern_matchingContext _localctx = new Pattern_matchingContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pattern_matching);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(IDENTIFIER);
			setState(752);
			match(DOT);
			setState(753);
			match(MATCH);
			System.out.println("Built-In: MATCH");
			setState(755);
			function_call_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_valContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Return_valContext return_val() {
			return getRuleContext(Return_valContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Return_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_valContext return_val() throws RecognitionException {
		Return_valContext _localctx = new Return_valContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_return_val);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				lambda_function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(759);
				match(LPAR);
				setState(760);
				return_val();
				setState(761);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return expression2_sempred((Expression2Context)_localctx, predIndex);
		case 17:
			return expression3_sempred((Expression3Context)_localctx, predIndex);
		case 18:
			return expression4_sempred((Expression4Context)_localctx, predIndex);
		case 19:
			return expression5_sempred((Expression5Context)_localctx, predIndex);
		case 20:
			return expression6_sempred((Expression6Context)_localctx, predIndex);
		case 21:
			return expression7_sempred((Expression7Context)_localctx, predIndex);
		case 23:
			return expression9_sempred((Expression9Context)_localctx, predIndex);
		case 24:
			return raw_value_sempred((Raw_valueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression2_sempred(Expression2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression3_sempred(Expression3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression4_sempred(Expression4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression5_sempred(Expression5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression6_sempred(Expression6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression7_sempred(Expression7Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression9_sempred(Expression9Context _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean raw_value_sempred(Raw_valueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001E\u02ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0001\u0000\u0005\u0000_\b\u0000\n\u0000\f\u0000"+
		"b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0005\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u0082\b\u0004\u000b\u0004\f\u0004\u0083\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0088\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u008d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009c\b\u0006\n\u0006\f\u0006"+
		"\u009f\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00ab\b\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00b2\b\t\u0001\t\u0001"+
		"\t\u0005\t\u00b6\b\t\n\t\f\t\u00b9\t\t\u0001\t\u0001\t\u0003\t\u00bd\b"+
		"\t\u0001\t\u0001\t\u0003\t\u00c1\b\t\u0001\t\u0003\t\u00c4\b\t\u0003\t"+
		"\u00c6\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ce"+
		"\b\n\u0001\n\u0001\n\u0005\n\u00d2\b\n\n\n\f\n\u00d5\t\n\u0001\n\u0001"+
		"\n\u0003\n\u00d9\b\n\u0001\n\u0001\n\u0003\n\u00dd\b\n\u0001\n\u0003\n"+
		"\u00e0\b\n\u0003\n\u00e2\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ec\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00f3\b\f\u000b\f\f\f\u00f4"+
		"\u0001\f\u0001\f\u0003\f\u00f9\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u010a\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0166\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0170\b\u000f\n\u000f\f\u000f\u0173\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u017d\b\u0010\n\u0010\f\u0010\u0180\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u018a\b\u0011\n\u0011\f\u0011\u018d\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u019c\b\u0012\n\u0012\f\u0012\u019f\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01b8"+
		"\b\u0013\n\u0013\f\u0013\u01bb\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01ca\b\u0014"+
		"\n\u0014\f\u0014\u01cd\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01e1\b\u0015\n\u0015\f\u0015"+
		"\u01e4\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01ef\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01f7\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u01ff\b\u0017\n\u0017\f\u0017\u0202"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u020f\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0004\u0018\u0216\b\u0018\u000b\u0018\f\u0018\u0217\u0005\u0018"+
		"\u021a\b\u0018\n\u0018\f\u0018\u021d\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0004\u0019\u0223\b\u0019\u000b\u0019\f\u0019\u0224"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u022b\b\u0019"+
		"\u0003\u0019\u022d\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0235\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u023e\b\u001a\u0003\u001a\u0240\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0246\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0276\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0283\b\u001d\n\u001d\f\u001d"+
		"\u0286\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u028c\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0005\u001e\u0291\b"+
		"\u001e\n\u001e\f\u001e\u0294\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u02a3\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u02ba\b#\n#\f#\u02bd"+
		"\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0004+\u02ea\b+\u000b+\f+\u02eb\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u02fd\b-\u0001-\u0000\t\u001e \"$&(*.0.\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0002\u0002\u0000\u0016\u0016\u0019"+
		"\u001c\u0002\u0000\u0002\u0002>>\u0343\u0000`\u0001\u0000\u0000\u0000"+
		"\u0002e\u0001\u0000\u0000\u0000\u0004l\u0001\u0000\u0000\u0000\u0006w"+
		"\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000\n\u0090\u0001\u0000"+
		"\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u00a3\u0001\u0000\u0000"+
		"\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012\u00ae\u0001\u0000\u0000"+
		"\u0000\u0014\u00c9\u0001\u0000\u0000\u0000\u0016\u00eb\u0001\u0000\u0000"+
		"\u0000\u0018\u00f8\u0001\u0000\u0000\u0000\u001a\u0109\u0001\u0000\u0000"+
		"\u0000\u001c\u0165\u0001\u0000\u0000\u0000\u001e\u0167\u0001\u0000\u0000"+
		"\u0000 \u0174\u0001\u0000\u0000\u0000\"\u0181\u0001\u0000\u0000\u0000"+
		"$\u018e\u0001\u0000\u0000\u0000&\u01a0\u0001\u0000\u0000\u0000(\u01bc"+
		"\u0001\u0000\u0000\u0000*\u01ce\u0001\u0000\u0000\u0000,\u01ee\u0001\u0000"+
		"\u0000\u0000.\u01f6\u0001\u0000\u0000\u00000\u020e\u0001\u0000\u0000\u0000"+
		"2\u021e\u0001\u0000\u0000\u00004\u023f\u0001\u0000\u0000\u00006\u0241"+
		"\u0001\u0000\u0000\u00008\u0247\u0001\u0000\u0000\u0000:\u0279\u0001\u0000"+
		"\u0000\u0000<\u0292\u0001\u0000\u0000\u0000>\u0295\u0001\u0000\u0000\u0000"+
		"@\u02a2\u0001\u0000\u0000\u0000B\u02a4\u0001\u0000\u0000\u0000D\u02aa"+
		"\u0001\u0000\u0000\u0000F\u02bb\u0001\u0000\u0000\u0000H\u02be\u0001\u0000"+
		"\u0000\u0000J\u02c6\u0001\u0000\u0000\u0000L\u02ca\u0001\u0000\u0000\u0000"+
		"N\u02ce\u0001\u0000\u0000\u0000P\u02d2\u0001\u0000\u0000\u0000R\u02d6"+
		"\u0001\u0000\u0000\u0000T\u02da\u0001\u0000\u0000\u0000V\u02e0\u0001\u0000"+
		"\u0000\u0000X\u02ef\u0001\u0000\u0000\u0000Z\u02fc\u0001\u0000\u0000\u0000"+
		"\\_\u0003\u0002\u0001\u0000]_\u0003V+\u0000^\\\u0001\u0000\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000cd\u0003\u0004\u0002\u0000d\u0001\u0001\u0000\u0000\u0000"+
		"ef\u0005\"\u0000\u0000fg\u0005>\u0000\u0000gh\u0006\u0001\uffff\uffff"+
		"\u0000hi\u0003\b\u0004\u0000ij\u0003\u0006\u0003\u0000jk\u0005!\u0000"+
		"\u0000k\u0003\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000mn\u0005 \u0000"+
		"\u0000no\u0006\u0002\uffff\uffff\u0000op\u00057\u0000\u0000pq\u00058\u0000"+
		"\u0000qr\u0003\u0006\u0003\u0000rs\u0005!\u0000\u0000s\u0005\u0001\u0000"+
		"\u0000\u0000tv\u0003\u001a\r\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x|\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z}\u0003\u000e\u0007\u0000"+
		"{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u0007\u0001\u0000\u0000\u0000~\u008c\u00057\u0000\u0000\u007f"+
		"\u0080\u0005>\u0000\u0000\u0080\u0082\u0005\u001e\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0005>\u0000\u0000\u0086\u0088\u0003"+
		"\f\u0006\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u008d\u0001\u0000\u0000\u0000\u0089\u008d\u0005>\u0000"+
		"\u0000\u008a\u008d\u0003\f\u0006\u0000\u008b\u008d\u0001\u0000\u0000\u0000"+
		"\u008c\u0081\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u00058\u0000\u0000\u008f"+
		"\t\u0001\u0000\u0000\u0000\u0090\u0091\u0005=\u0000\u0000\u0091\u0092"+
		"\u0006\u0005\uffff\uffff\u0000\u0092\u0093\u0003\b\u0004\u0000\u0093\u0094"+
		"\u00059\u0000\u0000\u0094\u0095\u0003\u0006\u0003\u0000\u0095\u0096\u0005"+
		":\u0000\u0000\u0096\u000b\u0001\u0000\u0000\u0000\u0097\u009d\u0005;\u0000"+
		"\u0000\u0098\u0099\u00036\u001b\u0000\u0099\u009a\u0005\u001e\u0000\u0000"+
		"\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000"+
		"\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u00036\u001b\u0000\u00a1"+
		"\u00a2\u0005<\u0000\u0000\u00a2\r\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\u001f\u0000\u0000\u00a4\u00a5\u0006\u0007\uffff\uffff\u0000\u00a5"+
		"\u00a6\u0003Z-\u0000\u00a6\u00a7\u0005\u001d\u0000\u0000\u00a7\u000f\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ab\u0005>\u0000\u0000\u00a9\u00ab\u0003\n"+
		"\u0005\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u0014"+
		"\n\u0000\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00c5\u00057\u0000"+
		"\u0000\u00af\u00b2\u0003\u0018\f\u0000\u00b0\u00b2\u0003\n\u0005\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u001e\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bc\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0003\u0018\f\u0000\u00bb"+
		"\u00bd\u0003\n\u0005\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c6\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0003\u0018\f\u0000\u00bf\u00c1\u0003\n\u0005\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c5\u00b7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"8\u0000\u0000\u00c8\u0013\u0001\u0000\u0000\u0000\u00c9\u00e1\u00057\u0000"+
		"\u0000\u00ca\u00d3\u0006\n\uffff\uffff\u0000\u00cb\u00ce\u0003\u0018\f"+
		"\u0000\u00cc\u00ce\u0003\n\u0005\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005\u001e\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d8\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d9\u0003\u0018\f\u0000\u00d7\u00d9\u0003\n\u0005\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00e2\u0001\u0000\u0000\u0000\u00da\u00dd\u0003\u0018\f\u0000\u00db\u00dd"+
		"\u0003\n\u0005\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00e0\u0001"+
		"\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00df\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00ca\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u00058\u0000\u0000\u00e4\u0015\u0001\u0000"+
		"\u0000\u0000\u00e5\u00ec\u0003J%\u0000\u00e6\u00ec\u0003L&\u0000\u00e7"+
		"\u00ec\u0003R)\u0000\u00e8\u00ec\u0003P(\u0000\u00e9\u00ec\u0003N\'\u0000"+
		"\u00ea\u00ec\u0003T*\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e6"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u0017\u0001\u0000\u0000\u0000\u00ed\u00f2"+
		"\u0003\u001c\u000e\u0000\u00ee\u00ef\u0005;\u0000\u0000\u00ef\u00f0\u0003"+
		"\u0018\f\u0000\u00f0\u00f1\u0005<\u0000\u0000\u00f1\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f2\u00ee\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f9\u0001\u0000\u0000\u0000\u00f6\u00f9\u0003\u001c"+
		"\u000e\u0000\u00f7\u00f9\u00030\u0018\u0000\u00f8\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u0019\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003\u0016\u000b"+
		"\u0000\u00fb\u00fc\u0005\u001d\u0000\u0000\u00fc\u010a\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0003\u0010\b\u0000\u00fe\u00ff\u0005\u001d\u0000\u0000"+
		"\u00ff\u010a\u0001\u0000\u0000\u0000\u0100\u0101\u0003X,\u0000\u0101\u0102"+
		"\u0005\u001d\u0000\u0000\u0102\u010a\u0001\u0000\u0000\u0000\u0103\u010a"+
		"\u0003:\u001d\u0000\u0104\u010a\u0003>\u001f\u0000\u0105\u010a\u0003H"+
		"$\u0000\u0106\u0107\u00034\u001a\u0000\u0107\u0108\u0005\u001d\u0000\u0000"+
		"\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u00fa\u0001\u0000\u0000\u0000"+
		"\u0109\u00fd\u0001\u0000\u0000\u0000\u0109\u0100\u0001\u0000\u0000\u0000"+
		"\u0109\u0103\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000\u0000\u0000"+
		"\u0109\u0105\u0001\u0000\u0000\u0000\u0109\u0106\u0001\u0000\u0000\u0000"+
		"\u010a\u001b\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u001e\u000f\u0000"+
		"\u010c\u010d\u0005\u0015\u0000\u0000\u010d\u010e\u0003 \u0010\u0000\u010e"+
		"\u010f\u0006\u000e\uffff\uffff\u0000\u010f\u0166\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0003 \u0010\u0000\u0111\u0112\u0005\u0013\u0000\u0000\u0112"+
		"\u0113\u0003\"\u0011\u0000\u0113\u0114\u0006\u000e\uffff\uffff\u0000\u0114"+
		"\u0166\u0001\u0000\u0000\u0000\u0115\u0116\u0003\"\u0011\u0000\u0116\u0117"+
		"\u0005\u0012\u0000\u0000\u0117\u0118\u0003$\u0012\u0000\u0118\u0119\u0006"+
		"\u000e\uffff\uffff\u0000\u0119\u0166\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0003$\u0012\u0000\u011b\u011c\u0005\u0017\u0000\u0000\u011c\u011d\u0003"+
		"&\u0013\u0000\u011d\u011e\u0006\u000e\uffff\uffff\u0000\u011e\u0166\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0003$\u0012\u0000\u0120\u0121\u0005\u0018"+
		"\u0000\u0000\u0121\u0122\u0003&\u0013\u0000\u0122\u0123\u0006\u000e\uffff"+
		"\uffff\u0000\u0123\u0166\u0001\u0000\u0000\u0000\u0124\u0125\u0003&\u0013"+
		"\u0000\u0125\u0126\u0005\r\u0000\u0000\u0126\u0127\u0003(\u0014\u0000"+
		"\u0127\u0128\u0006\u000e\uffff\uffff\u0000\u0128\u0166\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0003&\u0013\u0000\u012a\u012b\u0005\u0010\u0000\u0000"+
		"\u012b\u012c\u0003(\u0014\u0000\u012c\u012d\u0006\u000e\uffff\uffff\u0000"+
		"\u012d\u0166\u0001\u0000\u0000\u0000\u012e\u012f\u0003&\u0013\u0000\u012f"+
		"\u0130\u0005\u000e\u0000\u0000\u0130\u0131\u0003(\u0014\u0000\u0131\u0132"+
		"\u0006\u000e\uffff\uffff\u0000\u0132\u0166\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0003&\u0013\u0000\u0134\u0135\u0005\u0011\u0000\u0000\u0135\u0136"+
		"\u0003(\u0014\u0000\u0136\u0137\u0006\u000e\uffff\uffff\u0000\u0137\u0166"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0003(\u0014\u0000\u0139\u013a\u0005"+
		"\b\u0000\u0000\u013a\u013b\u0003*\u0015\u0000\u013b\u013c\u0006\u000e"+
		"\uffff\uffff\u0000\u013c\u0166\u0001\u0000\u0000\u0000\u013d\u013e\u0003"+
		"(\u0014\u0000\u013e\u013f\u0005\t\u0000\u0000\u013f\u0140\u0003*\u0015"+
		"\u0000\u0140\u0141\u0006\u000e\uffff\uffff\u0000\u0141\u0166\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0003*\u0015\u0000\u0143\u0144\u0005\u0006\u0000"+
		"\u0000\u0144\u0145\u0003,\u0016\u0000\u0145\u0146\u0006\u000e\uffff\uffff"+
		"\u0000\u0146\u0166\u0001\u0000\u0000\u0000\u0147\u0148\u0003*\u0015\u0000"+
		"\u0148\u0149\u0005\n\u0000\u0000\u0149\u014a\u0003,\u0016\u0000\u014a"+
		"\u014b\u0006\u000e\uffff\uffff\u0000\u014b\u0166\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0003*\u0015\u0000\u014d\u014e\u0005\u0007\u0000\u0000\u014e"+
		"\u014f\u0003,\u0016\u0000\u014f\u0150\u0006\u000e\uffff\uffff\u0000\u0150"+
		"\u0166\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0014\u0000\u0000\u0152"+
		"\u0153\u0003,\u0016\u0000\u0153\u0154\u0006\u000e\uffff\uffff\u0000\u0154"+
		"\u0166\u0001\u0000\u0000\u0000\u0155\u0156\u0005\t\u0000\u0000\u0156\u0157"+
		"\u0003,\u0016\u0000\u0157\u0158\u0006\u000e\uffff\uffff\u0000\u0158\u0166"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0003.\u0017\u0000\u015a\u015b\u0005"+
		"\f\u0000\u0000\u015b\u015c\u0006\u000e\uffff\uffff\u0000\u015c\u0166\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0003.\u0017\u0000\u015e\u015f\u0005\u000b"+
		"\u0000\u0000\u015f\u0160\u0006\u000e\uffff\uffff\u0000\u0160\u0166\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u00057\u0000\u0000\u0162\u0163\u0003\u001e"+
		"\u000f\u0000\u0163\u0164\u00058\u0000\u0000\u0164\u0166\u0001\u0000\u0000"+
		"\u0000\u0165\u010b\u0001\u0000\u0000\u0000\u0165\u0110\u0001\u0000\u0000"+
		"\u0000\u0165\u0115\u0001\u0000\u0000\u0000\u0165\u011a\u0001\u0000\u0000"+
		"\u0000\u0165\u011f\u0001\u0000\u0000\u0000\u0165\u0124\u0001\u0000\u0000"+
		"\u0000\u0165\u0129\u0001\u0000\u0000\u0000\u0165\u012e\u0001\u0000\u0000"+
		"\u0000\u0165\u0133\u0001\u0000\u0000\u0000\u0165\u0138\u0001\u0000\u0000"+
		"\u0000\u0165\u013d\u0001\u0000\u0000\u0000\u0165\u0142\u0001\u0000\u0000"+
		"\u0000\u0165\u0147\u0001\u0000\u0000\u0000\u0165\u014c\u0001\u0000\u0000"+
		"\u0000\u0165\u0151\u0001\u0000\u0000\u0000\u0165\u0155\u0001\u0000\u0000"+
		"\u0000\u0165\u0159\u0001\u0000\u0000\u0000\u0165\u015d\u0001\u0000\u0000"+
		"\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0166\u001d\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0006\u000f\uffff\uffff\u0000\u0168\u0169\u0003 \u0010"+
		"\u0000\u0169\u0171\u0001\u0000\u0000\u0000\u016a\u016b\n\u0002\u0000\u0000"+
		"\u016b\u016c\u0005\u0015\u0000\u0000\u016c\u016d\u0003 \u0010\u0000\u016d"+
		"\u016e\u0006\u000f\uffff\uffff\u0000\u016e\u0170\u0001\u0000\u0000\u0000"+
		"\u016f\u016a\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u001f\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0006\u0010\uffff\uffff\u0000\u0175\u0176\u0003\"\u0011\u0000"+
		"\u0176\u017e\u0001\u0000\u0000\u0000\u0177\u0178\n\u0002\u0000\u0000\u0178"+
		"\u0179\u0005\u0013\u0000\u0000\u0179\u017a\u0003\"\u0011\u0000\u017a\u017b"+
		"\u0006\u0010\uffff\uffff\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c"+
		"\u0177\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e"+
		"\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f"+
		"!\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0006\u0011\uffff\uffff\u0000\u0182\u0183\u0003$\u0012\u0000\u0183\u018b"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\n\u0002\u0000\u0000\u0185\u0186\u0005"+
		"\u0012\u0000\u0000\u0186\u0187\u0003$\u0012\u0000\u0187\u0188\u0006\u0011"+
		"\uffff\uffff\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0184\u0001"+
		"\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c#\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u018f\u0006\u0012"+
		"\uffff\uffff\u0000\u018f\u0190\u0003&\u0013\u0000\u0190\u019d\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\n\u0003\u0000\u0000\u0192\u0193\u0005\u0017\u0000"+
		"\u0000\u0193\u0194\u0003&\u0013\u0000\u0194\u0195\u0006\u0012\uffff\uffff"+
		"\u0000\u0195\u019c\u0001\u0000\u0000\u0000\u0196\u0197\n\u0002\u0000\u0000"+
		"\u0197\u0198\u0005\u0018\u0000\u0000\u0198\u0199\u0003&\u0013\u0000\u0199"+
		"\u019a\u0006\u0012\uffff\uffff\u0000\u019a\u019c\u0001\u0000\u0000\u0000"+
		"\u019b\u0191\u0001\u0000\u0000\u0000\u019b\u0196\u0001\u0000\u0000\u0000"+
		"\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\u0001\u0000\u0000\u0000\u019e%\u0001\u0000\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0006\u0013\uffff\uffff\u0000"+
		"\u01a1\u01a2\u0003(\u0014\u0000\u01a2\u01b9\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\n\u0005\u0000\u0000\u01a4\u01a5\u0005\r\u0000\u0000\u01a5\u01a6"+
		"\u0003(\u0014\u0000\u01a6\u01a7\u0006\u0013\uffff\uffff\u0000\u01a7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\n\u0004\u0000\u0000\u01a9\u01aa\u0005"+
		"\u0010\u0000\u0000\u01aa\u01ab\u0003(\u0014\u0000\u01ab\u01ac\u0006\u0013"+
		"\uffff\uffff\u0000\u01ac\u01b8\u0001\u0000\u0000\u0000\u01ad\u01ae\n\u0003"+
		"\u0000\u0000\u01ae\u01af\u0005\u000e\u0000\u0000\u01af\u01b0\u0003(\u0014"+
		"\u0000\u01b0\u01b1\u0006\u0013\uffff\uffff\u0000\u01b1\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\n\u0002\u0000\u0000\u01b3\u01b4\u0005\u0011\u0000"+
		"\u0000\u01b4\u01b5\u0003(\u0014\u0000\u01b5\u01b6\u0006\u0013\uffff\uffff"+
		"\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01a3\u0001\u0000\u0000"+
		"\u0000\u01b7\u01a8\u0001\u0000\u0000\u0000\u01b7\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b2\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\'\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0006\u0014\uffff\uffff\u0000\u01bd\u01be\u0003*\u0015\u0000"+
		"\u01be\u01cb\u0001\u0000\u0000\u0000\u01bf\u01c0\n\u0003\u0000\u0000\u01c0"+
		"\u01c1\u0005\b\u0000\u0000\u01c1\u01c2\u0003*\u0015\u0000\u01c2\u01c3"+
		"\u0006\u0014\uffff\uffff\u0000\u01c3\u01ca\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\n\u0002\u0000\u0000\u01c5\u01c6\u0005\t\u0000\u0000\u01c6\u01c7"+
		"\u0003*\u0015\u0000\u01c7\u01c8\u0006\u0014\uffff\uffff\u0000\u01c8\u01ca"+
		"\u0001\u0000\u0000\u0000\u01c9\u01bf\u0001\u0000\u0000\u0000\u01c9\u01c4"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc)\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf\u0006"+
		"\u0015\uffff\uffff\u0000\u01cf\u01d0\u0003,\u0016\u0000\u01d0\u01e2\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\n\u0004\u0000\u0000\u01d2\u01d3\u0005\u0006"+
		"\u0000\u0000\u01d3\u01d4\u0003,\u0016\u0000\u01d4\u01d5\u0006\u0015\uffff"+
		"\uffff\u0000\u01d5\u01e1\u0001\u0000\u0000\u0000\u01d6\u01d7\n\u0003\u0000"+
		"\u0000\u01d7\u01d8\u0005\n\u0000\u0000\u01d8\u01d9\u0003,\u0016\u0000"+
		"\u01d9\u01da\u0006\u0015\uffff\uffff\u0000\u01da\u01e1\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\n\u0002\u0000\u0000\u01dc\u01dd\u0005\u0007\u0000\u0000"+
		"\u01dd\u01de\u0003,\u0016\u0000\u01de\u01df\u0006\u0015\uffff\uffff\u0000"+
		"\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01e0\u01d6\u0001\u0000\u0000\u0000\u01e0\u01db\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3+\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005\u0014\u0000\u0000\u01e6"+
		"\u01e7\u0003,\u0016\u0000\u01e7\u01e8\u0006\u0016\uffff\uffff\u0000\u01e8"+
		"\u01ef\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\t\u0000\u0000\u01ea\u01eb"+
		"\u0003,\u0016\u0000\u01eb\u01ec\u0006\u0016\uffff\uffff\u0000\u01ec\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ef\u0003.\u0017\u0000\u01ee\u01e5\u0001"+
		"\u0000\u0000\u0000\u01ee\u01e9\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ef-\u0001\u0000\u0000\u0000\u01f0\u01f1\u0006\u0017"+
		"\uffff\uffff\u0000\u01f1\u01f2\u00057\u0000\u0000\u01f2\u01f3\u0003\u001e"+
		"\u000f\u0000\u01f3\u01f4\u00058\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f7\u00030\u0018\u0000\u01f6\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7\u0200\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\n\u0004\u0000\u0000\u01f9\u01fa\u0005\f\u0000\u0000\u01fa"+
		"\u01ff\u0006\u0017\uffff\uffff\u0000\u01fb\u01fc\n\u0003\u0000\u0000\u01fc"+
		"\u01fd\u0005\u000b\u0000\u0000\u01fd\u01ff\u0006\u0017\uffff\uffff\u0000"+
		"\u01fe\u01f8\u0001\u0000\u0000\u0000\u01fe\u01fb\u0001\u0000\u0000\u0000"+
		"\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0001\u0000\u0000\u0000\u0201/\u0001\u0000\u0000\u0000\u0202"+
		"\u0200\u0001\u0000\u0000\u0000\u0203\u0204\u0006\u0018\uffff\uffff\u0000"+
		"\u0204\u020f\u0003\u0016\u000b\u0000\u0205\u020f\u0003\u0010\b\u0000\u0206"+
		"\u020f\u0003X,\u0000\u0207\u020f\u00032\u0019\u0000\u0208\u020f\u0005"+
		"\u0004\u0000\u0000\u0209\u020f\u0005\u0002\u0000\u0000\u020a\u020f\u0005"+
		"\u0003\u0000\u0000\u020b\u020f\u0005#\u0000\u0000\u020c\u020f\u0005$\u0000"+
		"\u0000\u020d\u020f\u0005>\u0000\u0000\u020e\u0203\u0001\u0000\u0000\u0000"+
		"\u020e\u0205\u0001\u0000\u0000\u0000\u020e\u0206\u0001\u0000\u0000\u0000"+
		"\u020e\u0207\u0001\u0000\u0000\u0000\u020e\u0208\u0001\u0000\u0000\u0000"+
		"\u020e\u0209\u0001\u0000\u0000\u0000\u020e\u020a\u0001\u0000\u0000\u0000"+
		"\u020e\u020b\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u021b\u0001\u0000\u0000\u0000"+
		"\u0210\u0215\n\u000b\u0000\u0000\u0211\u0212\u0005;\u0000\u0000\u0212"+
		"\u0213\u0003\u0018\f\u0000\u0213\u0214\u0005<\u0000\u0000\u0214\u0216"+
		"\u0001\u0000\u0000\u0000\u0215\u0211\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218"+
		"\u0001\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u0210"+
		"\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c1\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u022c\u0005"+
		";\u0000\u0000\u021f\u0220\u0003\u0018\f\u0000\u0220\u0221\u0005\u001e"+
		"\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u021f\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000"+
		"\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0003\u0018\f\u0000\u0227\u022d\u0001\u0000\u0000"+
		"\u0000\u0228\u022b\u0003\u0018\f\u0000\u0229\u022b\u0001\u0000\u0000\u0000"+
		"\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u0229\u0001\u0000\u0000\u0000"+
		"\u022b\u022d\u0001\u0000\u0000\u0000\u022c\u0222\u0001\u0000\u0000\u0000"+
		"\u022c\u022a\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0005<\u0000\u0000\u022f3\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0005>\u0000\u0000\u0231\u0234\u0007\u0000\u0000\u0000\u0232\u0235\u0003"+
		"\u0018\f\u0000\u0233\u0235\u0003\n\u0005\u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0006\u001a\uffff\uffff\u0000\u0237\u0240\u0001"+
		"\u0000\u0000\u0000\u0238\u0239\u0005>\u0000\u0000\u0239\u023a\u0005\u0015"+
		"\u0000\u0000\u023a\u023d\u0006\u001a\uffff\uffff\u0000\u023b\u023e\u0003"+
		"\u0018\f\u0000\u023c\u023e\u0003\n\u0005\u0000\u023d\u023b\u0001\u0000"+
		"\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000"+
		"\u0000\u0000\u023f\u0230\u0001\u0000\u0000\u0000\u023f\u0238\u0001\u0000"+
		"\u0000\u0000\u02405\u0001\u0000\u0000\u0000\u0241\u0242\u0005>\u0000\u0000"+
		"\u0242\u0245\u0005\u0016\u0000\u0000\u0243\u0246\u0003\u0018\f\u0000\u0244"+
		"\u0246\u0003\n\u0005\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0244"+
		"\u0001\u0000\u0000\u0000\u02467\u0001\u0000\u0000\u0000\u0247\u0275\u0005"+
		"7\u0000\u0000\u0248\u0249\u00038\u001c\u0000\u0249\u024a\u0005\u0012\u0000"+
		"\u0000\u024a\u024b\u00038\u001c\u0000\u024b\u024c\u0006\u001c\uffff\uffff"+
		"\u0000\u024c\u0276\u0001\u0000\u0000\u0000\u024d\u024e\u00038\u001c\u0000"+
		"\u024e\u024f\u0005\u0013\u0000\u0000\u024f\u0250\u00038\u001c\u0000\u0250"+
		"\u0251\u0006\u001c\uffff\uffff\u0000\u0251\u0276\u0001\u0000\u0000\u0000"+
		"\u0252\u0253\u0005\u0014\u0000\u0000\u0253\u0254\u00038\u001c\u0000\u0254"+
		"\u0255\u0006\u001c\uffff\uffff\u0000\u0255\u0276\u0001\u0000\u0000\u0000"+
		"\u0256\u0257\u00030\u0018\u0000\u0257\u0258\u0005\u0017\u0000\u0000\u0258"+
		"\u0259\u00030\u0018\u0000\u0259\u025a\u0006\u001c\uffff\uffff\u0000\u025a"+
		"\u0276\u0001\u0000\u0000\u0000\u025b\u025c\u00030\u0018\u0000\u025c\u025d"+
		"\u0005\u0018\u0000\u0000\u025d\u025e\u00030\u0018\u0000\u025e\u025f\u0006"+
		"\u001c\uffff\uffff\u0000\u025f\u0276\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u00030\u0018\u0000\u0261\u0262\u0005\u0010\u0000\u0000\u0262\u0263\u0003"+
		"0\u0018\u0000\u0263\u0264\u0006\u001c\uffff\uffff\u0000\u0264\u0276\u0001"+
		"\u0000\u0000\u0000\u0265\u0266\u00030\u0018\u0000\u0266\u0267\u0005\u0011"+
		"\u0000\u0000\u0267\u0268\u00030\u0018\u0000\u0268\u0269\u0006\u001c\uffff"+
		"\uffff\u0000\u0269\u0276\u0001\u0000\u0000\u0000\u026a\u026b\u00030\u0018"+
		"\u0000\u026b\u026c\u0005\u000e\u0000\u0000\u026c\u026d\u00030\u0018\u0000"+
		"\u026d\u026e\u0006\u001c\uffff\uffff\u0000\u026e\u0276\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u00030\u0018\u0000\u0270\u0271\u0005\r\u0000\u0000"+
		"\u0271\u0272\u00030\u0018\u0000\u0272\u0273\u0006\u001c\uffff\uffff\u0000"+
		"\u0273\u0276\u0001\u0000\u0000\u0000\u0274\u0276\u00030\u0018\u0000\u0275"+
		"\u0248\u0001\u0000\u0000\u0000\u0275\u024d\u0001\u0000\u0000\u0000\u0275"+
		"\u0252\u0001\u0000\u0000\u0000\u0275\u0256\u0001\u0000\u0000\u0000\u0275"+
		"\u025b\u0001\u0000\u0000\u0000\u0275\u0260\u0001\u0000\u0000\u0000\u0275"+
		"\u0265\u0001\u0000\u0000\u0000\u0275\u026a\u0001\u0000\u0000\u0000\u0275"+
		"\u026f\u0001\u0000\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0276"+
		"\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u00058\u0000\u0000\u02789\u0001"+
		"\u0000\u0000\u0000\u0279\u027a\u0005\'\u0000\u0000\u027a\u027b\u0006\u001d"+
		"\uffff\uffff\u0000\u027b\u027c\u00038\u001c\u0000\u027c\u0284\u0003<\u001e"+
		"\u0000\u027d\u027e\u0005%\u0000\u0000\u027e\u027f\u0006\u001d\uffff\uffff"+
		"\u0000\u027f\u0280\u00038\u001c\u0000\u0280\u0281\u0003<\u001e\u0000\u0281"+
		"\u0283\u0001\u0000\u0000\u0000\u0282\u027d\u0001\u0000\u0000\u0000\u0283"+
		"\u0286\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0001\u0000\u0000\u0000\u0285\u028b\u0001\u0000\u0000\u0000\u0286"+
		"\u0284\u0001\u0000\u0000\u0000\u0287\u0288\u0005&\u0000\u0000\u0288\u0289"+
		"\u0006\u001d\uffff\uffff\u0000\u0289\u028c\u0003<\u001e\u0000\u028a\u028c"+
		"\u0001\u0000\u0000\u0000\u028b\u0287\u0001\u0000\u0000\u0000\u028b\u028a"+
		"\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\u0005!\u0000\u0000\u028e;\u0001\u0000\u0000\u0000\u028f\u0291\u0003\u001a"+
		"\r\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291\u0294\u0001\u0000\u0000"+
		"\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000"+
		"\u0000\u0293=\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000"+
		"\u0295\u0296\u0005,\u0000\u0000\u0296\u0297\u00056\u0000\u0000\u0297\u0298"+
		"\u0006\u001f\uffff\uffff\u0000\u0298\u0299\u0003F#\u0000\u0299\u029a\u0005"+
		"!\u0000\u0000\u029a?\u0001\u0000\u0000\u0000\u029b\u029c\u00057\u0000"+
		"\u0000\u029c\u029d\u0007\u0001\u0000\u0000\u029d\u029e\u0005\u0001\u0000"+
		"\u0000\u029e\u029f\u0007\u0001\u0000\u0000\u029f\u02a3\u00058\u0000\u0000"+
		"\u02a0\u02a3\u0005>\u0000\u0000\u02a1\u02a3\u00032\u0019\u0000\u02a2\u029b"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a3A\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005"+
		".\u0000\u0000\u02a5\u02a6\u0005\'\u0000\u0000\u02a6\u02a7\u0006!\uffff"+
		"\uffff\u0000\u02a7\u02a8\u00038\u001c\u0000\u02a8\u02a9\u0005\u001d\u0000"+
		"\u0000\u02a9C\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005-\u0000\u0000\u02ab"+
		"\u02ac\u0005\'\u0000\u0000\u02ac\u02ad\u0006\"\uffff\uffff\u0000\u02ad"+
		"\u02ae\u00038\u001c\u0000\u02ae\u02af\u0005\u001d\u0000\u0000\u02afE\u0001"+
		"\u0000\u0000\u0000\u02b0\u02ba\u0003\u001a\r\u0000\u02b1\u02b2\u0005."+
		"\u0000\u0000\u02b2\u02b3\u0006#\uffff\uffff\u0000\u02b3\u02ba\u0005\u001d"+
		"\u0000\u0000\u02b4\u02ba\u0003B!\u0000\u02b5\u02b6\u0005-\u0000\u0000"+
		"\u02b6\u02b7\u0006#\uffff\uffff\u0000\u02b7\u02ba\u0005\u001d\u0000\u0000"+
		"\u02b8\u02ba\u0003D\"\u0000\u02b9\u02b0\u0001\u0000\u0000\u0000\u02b9"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b9\u02b4\u0001\u0000\u0000\u0000\u02b9"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb"+
		"\u02bc\u0001\u0000\u0000\u0000\u02bcG\u0001\u0000\u0000\u0000\u02bd\u02bb"+
		"\u0001\u0000\u0000\u0000\u02be\u02bf\u00055\u0000\u0000\u02bf\u02c0\u0005"+
		">\u0000\u0000\u02c0\u02c1\u00054\u0000\u0000\u02c1\u02c2\u0006$\uffff"+
		"\uffff\u0000\u02c2\u02c3\u0003@ \u0000\u02c3\u02c4\u0003F#\u0000\u02c4"+
		"\u02c5\u0005!\u0000\u0000\u02c5I\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005"+
		")\u0000\u0000\u02c7\u02c8\u0006%\uffff\uffff\u0000\u02c8\u02c9\u0003\u0012"+
		"\t\u0000\u02c9K\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005(\u0000\u0000"+
		"\u02cb\u02cc\u0006&\uffff\uffff\u0000\u02cc\u02cd\u0003\u0012\t\u0000"+
		"\u02cdM\u0001\u0000\u0000\u0000\u02ce\u02cf\u00053\u0000\u0000\u02cf\u02d0"+
		"\u0006\'\uffff\uffff\u0000\u02d0\u02d1\u0003\u0012\t\u0000\u02d1O\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d3\u0005*\u0000\u0000\u02d3\u02d4\u0006(\uffff"+
		"\uffff\u0000\u02d4\u02d5\u0003\u0012\t\u0000\u02d5Q\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0005+\u0000\u0000\u02d7\u02d8\u0006)\uffff\uffff\u0000"+
		"\u02d8\u02d9\u0003\u0012\t\u0000\u02d9S\u0001\u0000\u0000\u0000\u02da"+
		"\u02db\u00050\u0000\u0000\u02db\u02dc\u00057\u0000\u0000\u02dc\u02dd\u0005"+
		"\u000f\u0000\u0000\u02dd\u02de\u0005>\u0000\u0000\u02de\u02df\u00058\u0000"+
		"\u0000\u02dfU\u0001\u0000\u0000\u0000\u02e0\u02e1\u00051\u0000\u0000\u02e1"+
		"\u02e2\u0005>\u0000\u0000\u02e2\u02e3\u0006+\uffff\uffff\u0000\u02e3\u02e9"+
		"\u0003\b\u0004\u0000\u02e4\u02e5\u0005E\u0000\u0000\u02e5\u02e6\u0003"+
		"8\u001c\u0000\u02e6\u02e7\u0005\u0016\u0000\u0000\u02e7\u02e8\u0003\u0018"+
		"\f\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e4\u0001\u0000\u0000"+
		"\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000"+
		"\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0005\u001d\u0000\u0000\u02eeW\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0005>\u0000\u0000\u02f0\u02f1\u0005\u0005\u0000\u0000\u02f1"+
		"\u02f2\u0005/\u0000\u0000\u02f2\u02f3\u0006,\uffff\uffff\u0000\u02f3\u02f4"+
		"\u0003\u0012\t\u0000\u02f4Y\u0001\u0000\u0000\u0000\u02f5\u02fd\u0003"+
		"\u0018\f\u0000\u02f6\u02fd\u0003\n\u0005\u0000\u02f7\u02f8\u00057\u0000"+
		"\u0000\u02f8\u02f9\u0003Z-\u0000\u02f9\u02fa\u00058\u0000\u0000\u02fa"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc"+
		"\u02f5\u0001\u0000\u0000\u0000\u02fc\u02f6\u0001\u0000\u0000\u0000\u02fc"+
		"\u02f7\u0001\u0000\u0000\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fd"+
		"[\u0001\u0000\u0000\u0000<^`w|\u0083\u0087\u008c\u009d\u00aa\u00b1\u00b7"+
		"\u00bc\u00c0\u00c3\u00c5\u00cd\u00d3\u00d8\u00dc\u00df\u00e1\u00eb\u00f4"+
		"\u00f8\u0109\u0165\u0171\u017e\u018b\u019b\u019d\u01b7\u01b9\u01c9\u01cb"+
		"\u01e0\u01e2\u01ee\u01f6\u01fe\u0200\u020e\u0217\u021b\u0224\u022a\u022c"+
		"\u0234\u023d\u023f\u0245\u0275\u0284\u028b\u0292\u02a2\u02b9\u02bb\u02eb"+
		"\u02fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}