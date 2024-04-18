// Generated from C:/Users/sinca/IdeaProjects/Compiler/src/main/java/com/demo/select.g4 by ANTLR 4.13.1
package com.demo;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link selectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface selectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link selectParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(selectParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(selectParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(selectParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs(selectParser.AsContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(selectParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#on}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn(selectParser.OnContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(selectParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(selectParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(selectParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#orderBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderBy(selectParser.OrderByContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(selectParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(selectParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(selectParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link selectParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(selectParser.LimitContext ctx);
}