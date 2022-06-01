// Generated from C:/Users/Lenovo/Desktop/YAPIS/src/main/java\Green.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GreenParser}.
 */
public interface GreenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GreenParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GreenParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GreenParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram(GreenParser.SubprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#subprogram}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram(GreenParser.SubprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(GreenParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(GreenParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GreenParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GreenParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GreenParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GreenParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(GreenParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(GreenParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(GreenParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(GreenParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(GreenParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(GreenParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#var_action}.
	 * @param ctx the parse tree
	 */
	void enterVar_action(GreenParser.Var_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#var_action}.
	 * @param ctx the parse tree
	 */
	void exitVar_action(GreenParser.Var_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(GreenParser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(GreenParser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#var_reform}.
	 * @param ctx the parse tree
	 */
	void enterVar_reform(GreenParser.Var_reformContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#var_reform}.
	 * @param ctx the parse tree
	 */
	void exitVar_reform(GreenParser.Var_reformContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(GreenParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(GreenParser.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#landing_expression}.
	 * @param ctx the parse tree
	 */
	void enterLanding_expression(GreenParser.Landing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#landing_expression}.
	 * @param ctx the parse tree
	 */
	void exitLanding_expression(GreenParser.Landing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMath_expression(GreenParser.Math_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMath_expression(GreenParser.Math_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(GreenParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(GreenParser.TypeCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#inBrackets}.
	 * @param ctx the parse tree
	 */
	void enterInBrackets(GreenParser.InBracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#inBrackets}.
	 * @param ctx the parse tree
	 */
	void exitInBrackets(GreenParser.InBracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#var_define}.
	 * @param ctx the parse tree
	 */
	void enterVar_define(GreenParser.Var_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#var_define}.
	 * @param ctx the parse tree
	 */
	void exitVar_define(GreenParser.Var_defineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#have_value}.
	 * @param ctx the parse tree
	 */
	void enterHave_value(GreenParser.Have_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#have_value}.
	 * @param ctx the parse tree
	 */
	void exitHave_value(GreenParser.Have_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#list_special_define}.
	 * @param ctx the parse tree
	 */
	void enterList_special_define(GreenParser.List_special_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#list_special_define}.
	 * @param ctx the parse tree
	 */
	void exitList_special_define(GreenParser.List_special_defineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#operations_with_list}.
	 * @param ctx the parse tree
	 */
	void enterOperations_with_list(GreenParser.Operations_with_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#operations_with_list}.
	 * @param ctx the parse tree
	 */
	void exitOperations_with_list(GreenParser.Operations_with_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GreenParser#for_each}.
	 * @param ctx the parse tree
	 */
	void enterFor_each(GreenParser.For_eachContext ctx);
	/**
	 * Exit a parse tree produced by {@link GreenParser#for_each}.
	 * @param ctx the parse tree
	 */
	void exitFor_each(GreenParser.For_eachContext ctx);
}