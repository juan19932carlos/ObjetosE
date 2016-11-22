import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		new Memoria();
		
		FileInputStream is = new FileInputStream("src/test/test.in");
		ANTLRInputStream input = new ANTLRInputStream(is);
		ObjetosespanolLexer lexer = new ObjetosespanolLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ObjetosespanolParser parser = new ObjetosespanolParser(tokens);
		ParseTree arbol = parser.operacion();
		Visitor v = new Visitor();
		v.visit(arbol);
		//System.out.println(arbol.toStringTree(parser));
	}
}
