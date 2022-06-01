// Generated from C:/Users/Lenovo/Desktop/YAPIS/src/main/java\Green.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GreenParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GreenVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GreenParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GreenParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram(GreenParser.SubprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GreenParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GreenParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GreenParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#for_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_block(GreenParser.For_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(GreenParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(GreenParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#var_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_action(GreenParser.Var_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(GreenParser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#var_reform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_reform(GreenParser.Var_reformContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo(GreenParser.IoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#landing_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanding_expression(GreenParser.Landing_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(GreenParser.Math_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(GreenParser.TypeCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#inBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInBrackets(GreenParser.InBracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#var_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_define(GreenParser.Var_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#have_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHave_value(GreenParser.Have_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#list_special_define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_special_define(GreenParser.List_special_defineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#operations_with_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations_with_list(GreenParser.Operations_with_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GreenParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(GreenParser.For_eachContext ctx);
}