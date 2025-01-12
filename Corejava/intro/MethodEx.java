package intro;


public class MethodEx {
	
	public String display() {  //String
		
		return "What the hell is the matter with this java class......";
	}
	
	
	public int add(int a,int b) {//int
		return (a+b);
	}
	
	
	public void hi() { //void-nothing
		
		System.out.println("Hello Everyone!!!!!");
	}
	
	
	public static void main(String []args) { //void
	
		MethodEx obj = new MethodEx();  //object creation
		
		System.out.println(obj.display());
		
		System.out.println(obj.add(34, 36));
		
		obj.hi();
		
		
		
	}
}
