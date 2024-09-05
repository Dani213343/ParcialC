// Generated from TrigFunctions.g4 by ANTLR 4.13.2

import java.util.*;
import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigFunctionsParser}.
 */
public interface TrigFunctionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigFunctionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TrigFunctionsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigFunctionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TrigFunctionsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigFunctionsParser#sin}.
	 * @param ctx the parse tree
	 */
	void enterSin(TrigFunctionsParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigFunctionsParser#sin}.
	 * @param ctx the parse tree
	 */
	void exitSin(TrigFunctionsParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigFunctionsParser#cos}.
	 * @param ctx the parse tree
	 */
	void enterCos(TrigFunctionsParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigFunctionsParser#cos}.
	 * @param ctx the parse tree
	 */
	void exitCos(TrigFunctionsParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigFunctionsParser#tan}.
	 * @param ctx the parse tree
	 */
	void enterTan(TrigFunctionsParser.TanContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigFunctionsParser#tan}.
	 * @param ctx the parse tree
	 */
	void exitTan(TrigFunctionsParser.TanContext ctx);
}