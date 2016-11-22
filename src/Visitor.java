
public class Visitor extends ObjetosespanolBaseVisitor<Object> {
		
	/*FACTOR ARITMETICO*/
	@Override
	public Double visitFactor_aritmetico_nombre(ObjetosespanolParser.Factor_aritmetico_nombreContext ctx) {
		Number a = Memoria.getVariable( ( ctx.NOMBRE().getText() ) ); //recibe un string y lo busca en la memoria
		System.out.println(a);
		return a.doubleValue();
	}
	@Override
	public Double visitFactor_aritmetico_anidado(ObjetosespanolParser.Factor_aritmetico_anidadoContext ctx) {
		// TODO Auto-generated method stub
		double ans = (double)visit(ctx.operacion_suma());
		return ans;
	}
	
	@Override
	public Double visitFactor_aritmetico_numero(ObjetosespanolParser.Factor_aritmetico_numeroContext ctx) {
		Double ans = Double.parseDouble( ctx.NUMERO().getText() ) ;
		//System.out.println(ans);
		return ans;
	}
	
	/*OPERACION_MULT*/
	@Override
	public Double visitOperacion_mult_oper(ObjetosespanolParser.Operacion_mult_operContext ctx) {
		double 	a = (double)visit( ctx.operacion_mult() ), //operador de la derecha
				b = (double)visit(ctx.factor_aritmetico()), //operador de la izquierda
				ans = 0.0;
		
		if( ctx.OP.getType() == ObjetosespanolParser.OP_MULTI )
			ans = a*b;
		else //if( ctx.OP.getType() == ObjetosespanolParser.OP_DIV )
			ans = a/b;
		return ans;
	}
	
	/*OPERACION_SUMA*/
	@Override
	public Double visitOperacion_suma_oper(ObjetosespanolParser.Operacion_suma_operContext ctx) {
		double 	a = (double)visit( ctx.operacion_mult() ), //operador de la derecha
				b = (double)visit(ctx.operacion_suma()), //operador de la izquierda
				ans = 0.0;
		
		if( ctx.OP.getType() == ObjetosespanolParser.OP_MAS )
			ans = a+b;
		else //if( ctx.OP.getType() == ObjetosespanolParser.OP_DIV )
			ans = a-b;
		return ans;
	}
	
	@Override
	public Double visitOperacion_suma_negacion(ObjetosespanolParser.Operacion_suma_negacionContext ctx) {
		double ans = (-1)*(double)visit( ctx.factor_aritmetico() ); //operador de la derecha
		return ans;
	}
	
	/*OPERACION_COMPARACION*/
	@Override
	public Double visitFactor_comparacion_nombre(ObjetosespanolParser.Factor_comparacion_nombreContext ctx) {
		// TODO Auto-generated method stub
		double ans = Memoria.getVariable( ctx.NOMBRE().getText() );
		System.out.println(ans);
		return ans;
	}
	@Override
	public Double visitFactor_comparacion_numero(ObjetosespanolParser.Factor_comparacion_numeroContext ctx) {
		double ans = Double.parseDouble(ctx.NUMERO().getText());
		return ans;
	}
}
