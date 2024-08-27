// Generated from /Users/ashkanzarkhah/Documents/University/Compiler/Project/Part A/Code/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(FunctionCraftParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(FunctionCraftParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arg(FunctionCraftParser.Function_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#predefine_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefine_arg(FunctionCraftParser.Predefine_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_body(FunctionCraftParser.Function_call_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call_bodyp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_bodyp(FunctionCraftParser.Function_call_bodypContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in_function(FunctionCraftParser.Built_in_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#absolute_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolute_expression(FunctionCraftParser.Absolute_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(FunctionCraftParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression3(FunctionCraftParser.Expression3Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression4(FunctionCraftParser.Expression4Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression5(FunctionCraftParser.Expression5Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression6(FunctionCraftParser.Expression6Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression7(FunctionCraftParser.Expression7Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression8(FunctionCraftParser.Expression8Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression9(FunctionCraftParser.Expression9Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#raw_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value(FunctionCraftParser.Raw_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignmentp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentp(FunctionCraftParser.AssignmentpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_proposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_proposition(FunctionCraftParser.If_propositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_else_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_elseif(FunctionCraftParser.If_else_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_body(FunctionCraftParser.If_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in(FunctionCraftParser.For_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern_matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_matching(FunctionCraftParser.Pattern_matchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_val(FunctionCraftParser.Return_valContext ctx);
}