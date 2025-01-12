package intro;

public class MethodEx2 {
	
	public void welcome(String name) {   //dynamic-void
		System.out.println("Hello "+name);
	}

	public static int square(int a) {   //static - int
		return (a*a);
	}
	
	public static String hello() {   //static - String
		return "Hello Everyone";
	}
	
	public static void main(String []args) { //static - void
		
		MethodEx2 obj = new MethodEx2();
		
		obj.welcome("SteveJobs");
		
		System.out.println(MethodEx2.square(11));
		
		System.out.println(MethodEx2.hello());
		
		
	}
}
