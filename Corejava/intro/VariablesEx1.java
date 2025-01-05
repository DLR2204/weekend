package intro;

public class VariablesEx1 {
	
	static String name1 = "apple";  //static global variable
	
	String name2 = "rose";      //instance global variable
	
	public static void main(String[] args) {
		
		VariablesEx1 obj = new VariablesEx1();//object creation
		
		
		System.out.println(obj.name2);
		
		System.out.println(VariablesEx1.name1);
		
		
	}

}
