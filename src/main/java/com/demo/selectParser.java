// Generated from C:/Users/sinca/IdeaProjects/Compiler/src/main/java/com/demo/select.g4 by ANTLR 4.13.1
package com.demo;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class selectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, ID=33, COND=34, NUMERO=35, LITERAL=36, OPER_COND=37, LETTER=38, 
		NEWLINE=39;
	public static final int
		RULE_start = 0, RULE_select = 1, RULE_from = 2, RULE_as = 3, RULE_joinClause = 4, 
		RULE_on = 5, RULE_and = 6, RULE_or = 7, RULE_where = 8, RULE_orderBy = 9, 
		RULE_order = 10, RULE_igual = 11, RULE_distinct = 12, RULE_limit = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "select", "from", "as", "joinClause", "on", "and", "or", "where", 
			"orderBy", "order", "igual", "distinct", "limit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "','", "'.'", "'select'", "'SELECT'", "'Select'", "'from'", 
			"'FROM'", "'as'", "'AS'", "'INNER JOIN'", "'inner join'", "'LEFT JOIN'", 
			"'left join'", "'on'", "'ON'", "'and'", "'AND'", "'or'", "'OR'", "'where'", 
			"'WHERE'", "'order by'", "'ORDER BY'", "'asc'", "'ASC'", "'desc'", "'DESC'", 
			"'='", "'distinct'", "'DISTINCT'", "'LIMIT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ID", "COND", "NUMERO", 
			"LITERAL", "OPER_COND", "LETTER", "NEWLINE"
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
	public String getGrammarFileName() { return "select.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public selectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(selectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(selectParser.ID, i);
		}
		public TerminalNode EOF() { return getToken(selectParser.EOF, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<AsContext> as() {
			return getRuleContexts(AsContext.class);
		}
		public AsContext as(int i) {
			return getRuleContext(AsContext.class,i);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public OrderByContext orderBy() {
			return getRuleContext(OrderByContext.class,0);
		}
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public List<TerminalNode> NUMERO() { return getTokens(selectParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(selectParser.NUMERO, i);
		}
		public List<OnContext> on() {
			return getRuleContexts(OnContext.class);
		}
		public OnContext on(int i) {
			return getRuleContext(OnContext.class,i);
		}
		public List<IgualContext> igual() {
			return getRuleContexts(IgualContext.class);
		}
		public IgualContext igual(int i) {
			return getRuleContext(IgualContext.class,i);
		}
		public List<TerminalNode> LITERAL() { return getTokens(selectParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(selectParser.LITERAL, i);
		}
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public List<TerminalNode> OPER_COND() { return getTokens(selectParser.OPER_COND); }
		public TerminalNode OPER_COND(int i) {
			return getToken(selectParser.OPER_COND, i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<OrContext> or() {
			return getRuleContexts(OrContext.class);
		}
		public OrContext or(int i) {
			return getRuleContext(OrContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			select();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==T__30) {
				{
				setState(29);
				distinct();
				}
			}

			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(32);
				match(T__0);
				}
				break;
			case ID:
				{
				setState(33);
				match(ID);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__9) {
					{
					setState(34);
					as();
					setState(35);
					match(ID);
					}
				}

				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(39);
					match(T__1);
					setState(40);
					match(ID);
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__8 || _la==T__9) {
						{
						setState(41);
						as();
						setState(42);
						match(ID);
						}
					}

					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53);
			from();
			setState(54);
			match(ID);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(55);
				as();
				setState(56);
				match(ID);
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(60);
				match(T__1);
				setState(61);
				match(ID);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__9) {
					{
					setState(62);
					as();
					setState(63);
					match(ID);
					}
				}

				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
				{
				setState(72);
				joinClause();
				{
				setState(73);
				match(ID);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__9) {
					{
					setState(74);
					as();
					setState(75);
					match(ID);
					}
				}

				setState(79);
				on();
				setState(80);
				match(ID);
				setState(81);
				match(T__2);
				setState(82);
				match(ID);
				setState(83);
				igual();
				setState(84);
				match(ID);
				setState(85);
				match(T__2);
				setState(86);
				match(ID);
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
					{
					{
					setState(88);
					joinClause();
					{
					setState(89);
					match(ID);
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__8 || _la==T__9) {
						{
						setState(90);
						as();
						setState(91);
						match(ID);
						}
					}

					setState(95);
					on();
					setState(96);
					match(ID);
					setState(97);
					match(T__2);
					setState(98);
					match(ID);
					setState(99);
					igual();
					setState(100);
					match(ID);
					setState(101);
					match(T__2);
					setState(102);
					match(ID);
					}
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20 || _la==T__21) {
				{
				setState(111);
				where();
				{
				{
				setState(112);
				match(ID);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(113);
					match(T__2);
					setState(114);
					match(ID);
					}
				}

				}
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPER_COND:
					{
					setState(117);
					match(OPER_COND);
					}
					break;
				case T__28:
					{
					setState(118);
					igual();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(121);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 111669149696L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) {
					{
					{
					setState(125);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
					case T__17:
						{
						setState(123);
						and();
						}
						break;
					case T__18:
					case T__19:
						{
						setState(124);
						or();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					{
					{
					setState(127);
					match(ID);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(128);
						match(T__2);
						setState(129);
						match(ID);
						}
					}

					}
					setState(134);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPER_COND:
						{
						setState(132);
						match(OPER_COND);
						}
						break;
					case T__28:
						{
						setState(133);
						igual();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(136);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 111669149696L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22 || _la==T__23) {
				{
				setState(145);
				orderBy();
				setState(146);
				match(ID);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) {
					{
					setState(147);
					order();
					}
				}

				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(150);
					match(T__1);
					setState(151);
					match(ID);
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) {
						{
						setState(152);
						order();
						}
					}

					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(162);
				limit();
				setState(163);
				match(NUMERO);
				}
			}

			setState(167);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromContext extends ParserRuleContext {
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsContext extends ParserRuleContext {
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitAs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_as);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class JoinClauseContext extends ParserRuleContext {
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnContext extends ParserRuleContext {
		public OnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitOn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnContext on() throws RecognitionException {
		OnContext _localctx = new OnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereContext extends ParserRuleContext {
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByContext extends ParserRuleContext {
		public OrderByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterOrderBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitOrderBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitOrderBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByContext orderBy() throws RecognitionException {
		OrderByContext _localctx = new OrderByContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_orderBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderContext extends ParserRuleContext {
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IgualContext extends ParserRuleContext {
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__28);
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
	public static class DistinctContext extends ParserRuleContext {
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimitContext extends ParserRuleContext {
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof selectListener ) ((selectListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof selectVisitor ) return ((selectVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__31);
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
		"\u0004\u0001\'\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0003\u0000\u001f\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000&\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000-\b\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000"+
		"\u0003\u00004\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000B\b\u0000\u0005\u0000D\b\u0000\n\u0000"+
		"\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000N\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000^\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000i\b\u0000\n\u0000"+
		"\f\u0000l\t\u0000\u0003\u0000n\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000t\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"x\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"~\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0083\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u0087\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u008b\b\u0000\n\u0000\f\u0000\u008e\t\u0000\u0003\u0000\u0090"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0095\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u009a\b\u0000\u0005\u0000"+
		"\u009c\b\u0000\n\u0000\f\u0000\u009f\t\u0000\u0003\u0000\u00a1\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00a6\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u0000\f\u0002\u0000!!#$\u0001\u0000\u0004\u0006\u0001"+
		"\u0000\u0007\b\u0001\u0000\t\n\u0001\u0000\u000b\u000e\u0001\u0000\u000f"+
		"\u0010\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0014\u0001\u0000\u0015"+
		"\u0016\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001c\u0001\u0000\u001e"+
		"\u001f\u00cd\u0000\u001c\u0001\u0000\u0000\u0000\u0002\u00a9\u0001\u0000"+
		"\u0000\u0000\u0004\u00ab\u0001\u0000\u0000\u0000\u0006\u00ad\u0001\u0000"+
		"\u0000\u0000\b\u00af\u0001\u0000\u0000\u0000\n\u00b1\u0001\u0000\u0000"+
		"\u0000\f\u00b3\u0001\u0000\u0000\u0000\u000e\u00b5\u0001\u0000\u0000\u0000"+
		"\u0010\u00b7\u0001\u0000\u0000\u0000\u0012\u00b9\u0001\u0000\u0000\u0000"+
		"\u0014\u00bb\u0001\u0000\u0000\u0000\u0016\u00bd\u0001\u0000\u0000\u0000"+
		"\u0018\u00bf\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001f\u0003\u0018\f\u0000\u001e"+
		"\u001d\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		"3\u0001\u0000\u0000\u0000 4\u0005\u0001\u0000\u0000!%\u0005!\u0000\u0000"+
		"\"#\u0003\u0006\u0003\u0000#$\u0005!\u0000\u0000$&\u0001\u0000\u0000\u0000"+
		"%\"\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&0\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0002\u0000\u0000(,\u0005!\u0000\u0000)*\u0003\u0006\u0003"+
		"\u0000*+\u0005!\u0000\u0000+-\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.\'\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"3 \u0001\u0000\u0000\u00003!\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000056\u0003\u0004\u0002\u00006:\u0005!\u0000\u000078\u0003\u0006\u0003"+
		"\u000089\u0005!\u0000\u00009;\u0001\u0000\u0000\u0000:7\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;E\u0001\u0000\u0000\u0000<=\u0005\u0002"+
		"\u0000\u0000=A\u0005!\u0000\u0000>?\u0003\u0006\u0003\u0000?@\u0005!\u0000"+
		"\u0000@B\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BD\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000\u0000DG\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"Fm\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0003\b\u0004\u0000"+
		"IM\u0005!\u0000\u0000JK\u0003\u0006\u0003\u0000KL\u0005!\u0000\u0000L"+
		"N\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OP\u0003\n\u0005\u0000PQ\u0005!\u0000"+
		"\u0000QR\u0005\u0003\u0000\u0000RS\u0005!\u0000\u0000ST\u0003\u0016\u000b"+
		"\u0000TU\u0005!\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u0005!\u0000\u0000"+
		"Wj\u0001\u0000\u0000\u0000XY\u0003\b\u0004\u0000Y]\u0005!\u0000\u0000"+
		"Z[\u0003\u0006\u0003\u0000[\\\u0005!\u0000\u0000\\^\u0001\u0000\u0000"+
		"\u0000]Z\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_`\u0003\n\u0005\u0000`a\u0005!\u0000\u0000ab\u0005\u0003"+
		"\u0000\u0000bc\u0005!\u0000\u0000cd\u0003\u0016\u000b\u0000de\u0005!\u0000"+
		"\u0000ef\u0005\u0003\u0000\u0000fg\u0005!\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hX\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mH\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"n\u008f\u0001\u0000\u0000\u0000op\u0003\u0010\b\u0000ps\u0005!\u0000\u0000"+
		"qr\u0005\u0003\u0000\u0000rt\u0005!\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000ux\u0005%\u0000\u0000"+
		"vx\u0003\u0016\u000b\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0007\u0000\u0000\u0000z\u008c\u0001"+
		"\u0000\u0000\u0000{~\u0003\f\u0006\u0000|~\u0003\u000e\u0007\u0000}{\u0001"+
		"\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0005!\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000"+
		"\u0081\u0083\u0005!\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0005%\u0000\u0000\u0085\u0087\u0003\u0016\u000b\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0000\u0000\u0000\u0089\u008b"+
		"\u0001\u0000\u0000\u0000\u008a}\u0001\u0000\u0000\u0000\u008b\u008e\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008fo\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u00a0\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0012"+
		"\t\u0000\u0092\u0094\u0005!\u0000\u0000\u0093\u0095\u0003\u0014\n\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u009d\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0002\u0000\u0000"+
		"\u0097\u0099\u0005!\u0000\u0000\u0098\u009a\u0003\u0014\n\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u0091\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a5\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0003\u001a\r\u0000\u00a3\u00a4\u0005#\u0000\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0000\u0000\u0001\u00a8\u0001\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0007\u0001\u0000\u0000\u00aa\u0003\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0007\u0002\u0000\u0000\u00ac\u0005\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0007\u0003\u0000\u0000\u00ae\u0007\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0007\u0004\u0000\u0000\u00b0\t\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007"+
		"\u0005\u0000\u0000\u00b2\u000b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007"+
		"\u0006\u0000\u0000\u00b4\r\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0007"+
		"\u0000\u0000\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\b\u0000"+
		"\u0000\u00b8\u0011\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\t\u0000\u0000"+
		"\u00ba\u0013\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007\n\u0000\u0000\u00bc"+
		"\u0015\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u001d\u0000\u0000\u00be"+
		"\u0017\u0001\u0000\u0000\u0000\u00bf\u00c0\u0007\u000b\u0000\u0000\u00c0"+
		"\u0019\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005 \u0000\u0000\u00c2\u001b"+
		"\u0001\u0000\u0000\u0000\u0018\u001e%,03:AEM]jmsw}\u0082\u0086\u008c\u008f"+
		"\u0094\u0099\u009d\u00a0\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}