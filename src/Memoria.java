import java.util.HashMap;

public class Memoria {
	
	public static HashMap<String, Double> variables;
	
	public Memoria(){
		this.variables = new HashMap<String,Double>();
		this.variables.put("a", 10.0);
		this.variables.put("b", 11.0);
	}
	
	public static boolean addVariable(String id, double val){
		try {
			variables.put(id, val);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	public static boolean updateVariable(String id, double val){
		try {
			variables.remove(id);
		}catch(Exception e){
			return false;
		}
		variables.put(id, val);
		return true;
	}
	public static boolean delVariable(String id){
		try {
			variables.remove(id);
		}catch(Exception e){
			return false;
		}
		return true;
	}
	public static double  getVariable(String id){
		double  ans = variables.get(id);
		return ans;
	}
}
