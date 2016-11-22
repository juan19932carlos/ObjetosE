// Generated from Objetosespanol.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjetosespanolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjetosespanolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ObjetosespanolParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#declarar_clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_clase(ObjetosespanolParser.Declarar_claseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#declarar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_funcion(ObjetosespanolParser.Declarar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#llamar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_funcion(ObjetosespanolParser.Llamar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(ObjetosespanolParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#linea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinea(ObjetosespanolParser.LineaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(ObjetosespanolParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(ObjetosespanolParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ObjetosespanolParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(ObjetosespanolParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(ObjetosespanolParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(ObjetosespanolParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#operacion_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_or(ObjetosespanolParser.Operacion_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#operacion_AND}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_AND(ObjetosespanolParser.Operacion_ANDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#factor_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_logico(ObjetosespanolParser.Factor_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#operacion_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_not(ObjetosespanolParser.Operacion_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjetosespanolParser#operacion_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_comparacion(ObjetosespanolParser.Operacion_comparacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_comparacion_1}
	 * labeled alternative in {@link ObjetosespanolParser#factor_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_comparacion_1(ObjetosespanolParser.Factor_comparacion_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_comparacion_numero}
	 * labeled alternative in {@link ObjetosespanolParser#factor_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_comparacion_numero(ObjetosespanolParser.Factor_comparacion_numeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_comparacion_nombre}
	 * labeled alternative in {@link ObjetosespanolParser#factor_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_comparacion_nombre(ObjetosespanolParser.Factor_comparacion_nombreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_comparacion_2}
	 * labeled alternative in {@link ObjetosespanolParser#factor_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_comparacion_2(ObjetosespanolParser.Factor_comparacion_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code operacion_suma_oper}
	 * labeled alternative in {@link ObjetosespanolParser#operacion_suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_suma_oper(ObjetosespanolParser.Operacion_suma_operContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operacion_suma_negacion}
	 * labeled alternative in {@link ObjetosespanolParser#operacion_suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_suma_negacion(ObjetosespanolParser.Operacion_suma_negacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operacion_suma_1}
	 * labeled alternative in {@link ObjetosespanolParser#operacion_suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_suma_1(ObjetosespanolParser.Operacion_suma_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code operacion_mult_1}
	 * labeled alternative in {@link ObjetosespanolParser#operacion_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_mult_1(ObjetosespanolParser.Operacion_mult_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code operacion_mult_oper}
	 * labeled alternative in {@link ObjetosespanolParser#operacion_mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_mult_oper(ObjetosespanolParser.Operacion_mult_operContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_aritmetico_1}
	 * labeled alternative in {@link ObjetosespanolParser#factor_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_aritmetico_1(ObjetosespanolParser.Factor_aritmetico_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_aritmetico_numero}
	 * labeled alternative in {@link ObjetosespanolParser#factor_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_aritmetico_numero(ObjetosespanolParser.Factor_aritmetico_numeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_aritmetico_nombre}
	 * labeled alternative in {@link ObjetosespanolParser#factor_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_aritmetico_nombre(ObjetosespanolParser.Factor_aritmetico_nombreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_aritmetico_anidado}
	 * labeled alternative in {@link ObjetosespanolParser#factor_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_aritmetico_anidado(ObjetosespanolParser.Factor_aritmetico_anidadoContext ctx);
}