// Generated from /Users/ashkanzarkhah/Documents/University/Compiler/Project/Part A/Code/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(FunctionCraftParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(FunctionCraftParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(FunctionCraftParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(FunctionCraftParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arg(FunctionCraftParser.Function_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arg(FunctionCraftParser.Function_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#predefine_arg}.
	 * @param ctx the parse tree
	 */
	void enterPredefine_arg(FunctionCraftParser.Predefine_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#predefine_arg}.
	 * @param ctx the parse tree
	 */
	void exitPredefine_arg(FunctionCraftParser.Predefine_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_body(FunctionCraftParser.Function_call_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_body(FunctionCraftParser.Function_call_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call_bodyp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_bodyp(FunctionCraftParser.Function_call_bodypContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call_bodyp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_bodyp(FunctionCraftParser.Function_call_bodypContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in_function(FunctionCraftParser.Built_in_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in_function(FunctionCraftParser.Built_in_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FunctionCraftParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#absolute_expression}.
	 * @param ctx the parse tree
	 */
	void enterAbsolute_expression(FunctionCraftParser.Absolute_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#absolute_expression}.
	 * @param ctx the parse tree
	 */
	void exitAbsolute_expression(FunctionCraftParser.Absolute_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(FunctionCraftParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(FunctionCraftParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression3}.
	 * @param ctx the parse tree
	 */
	void enterExpression3(FunctionCraftParser.Expression3Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression3}.
	 * @param ctx the parse tree
	 */
	void exitExpression3(FunctionCraftParser.Expression3Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression4}.
	 * @param ctx the parse tree
	 */
	void enterExpression4(FunctionCraftParser.Expression4Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression4}.
	 * @param ctx the parse tree
	 */
	void exitExpression4(FunctionCraftParser.Expression4Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression5}.
	 * @param ctx the parse tree
	 */
	void enterExpression5(FunctionCraftParser.Expression5Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression5}.
	 * @param ctx the parse tree
	 */
	void exitExpression5(FunctionCraftParser.Expression5Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression6}.
	 * @param ctx the parse tree
	 */
	void enterExpression6(FunctionCraftParser.Expression6Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression6}.
	 * @param ctx the parse tree
	 */
	void exitExpression6(FunctionCraftParser.Expression6Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression7}.
	 * @param ctx the parse tree
	 */
	void enterExpression7(FunctionCraftParser.Expression7Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression7}.
	 * @param ctx the parse tree
	 */
	void exitExpression7(FunctionCraftParser.Expression7Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression8}.
	 * @param ctx the parse tree
	 */
	void enterExpression8(FunctionCraftParser.Expression8Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression8}.
	 * @param ctx the parse tree
	 */
	void exitExpression8(FunctionCraftParser.Expression8Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression9}.
	 * @param ctx the parse tree
	 */
	void enterExpression9(FunctionCraftParser.Expression9Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression9}.
	 * @param ctx the parse tree
	 */
	void exitExpression9(FunctionCraftParser.Expression9Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#raw_value}.
	 * @param ctx the parse tree
	 */
	void enterRaw_value(FunctionCraftParser.Raw_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#raw_value}.
	 * @param ctx the parse tree
	 */
	void exitRaw_value(FunctionCraftParser.Raw_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 */
	void enterList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 */
	void exitList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignmentp}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentp(FunctionCraftParser.AssignmentpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignmentp}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentp(FunctionCraftParser.AssignmentpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_proposition}.
	 * @param ctx the parse tree
	 */
	void enterIf_proposition(FunctionCraftParser.If_propositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_proposition}.
	 * @param ctx the parse tree
	 */
	void exitIf_proposition(FunctionCraftParser.If_propositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_else_elseif}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_elseif(FunctionCraftParser.If_else_elseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_else_elseif}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_elseif(FunctionCraftParser.If_else_elseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(FunctionCraftParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(FunctionCraftParser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 */
	void enterLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_do}.
	 * @param ctx the parse tree
	 */
	void exitLoop_do(FunctionCraftParser.Loop_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 */
	void enterNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next_if}.
	 * @param ctx the parse tree
	 */
	void exitNext_if(FunctionCraftParser.Next_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 */
	void enterBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break_if}.
	 * @param ctx the parse tree
	 */
	void exitBreak_if(FunctionCraftParser.Break_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(FunctionCraftParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for_in}.
	 * @param ctx the parse tree
	 */
	void enterFor_in(FunctionCraftParser.For_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for_in}.
	 * @param ctx the parse tree
	 */
	void exitFor_in(FunctionCraftParser.For_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern_matching}.
	 * @param ctx the parse tree
	 */
	void enterPattern_matching(FunctionCraftParser.Pattern_matchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern_matching}.
	 * @param ctx the parse tree
	 */
	void exitPattern_matching(FunctionCraftParser.Pattern_matchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return_val}.
	 * @param ctx the parse tree
	 */
	void enterReturn_val(FunctionCraftParser.Return_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return_val}.
	 * @param ctx the parse tree
	 */
	void exitReturn_val(FunctionCraftParser.Return_valContext ctx);
}