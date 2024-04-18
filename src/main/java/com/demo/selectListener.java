// Generated from C:/Users/sinca/IdeaProjects/Compiler/src/main/java/com/demo/select.g4 by ANTLR 4.13.1
package com.demo;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link selectParser}.
 */
public interface selectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link selectParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(selectParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(selectParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(selectParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(selectParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(selectParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(selectParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(selectParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(selectParser.AsContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(selectParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(selectParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#on}.
	 * @param ctx the parse tree
	 */
	void enterOn(selectParser.OnContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#on}.
	 * @param ctx the parse tree
	 */
	void exitOn(selectParser.OnContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(selectParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(selectParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(selectParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(selectParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(selectParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(selectParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void enterOrderBy(selectParser.OrderByContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void exitOrderBy(selectParser.OrderByContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(selectParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(selectParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#igual}.
	 * @param ctx the parse tree
	 */
	void enterIgual(selectParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#igual}.
	 * @param ctx the parse tree
	 */
	void exitIgual(selectParser.IgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(selectParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(selectParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link selectParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(selectParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link selectParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(selectParser.LimitContext ctx);
}