package intro;

public class VariablesEx2 {
	
	static int staticCounter;
	
	int instanceCounter ;
	
	public void counter() {
		staticCounter++; //s.c = s.c+1
		
		instanceCounter++;
	}

	public void display() {
		System.out.println("StaticCounter :- " +staticCounter);
		
		System.out.println("InstanceCounter :- "+instanceCounter);
	}
	
	public static void main(String[] args) {
		
		VariablesEx2 obj1 = new VariablesEx2();
		
		VariablesEx2 obj2 = new VariablesEx2();
		
		VariablesEx2 obj3 = new VariablesEx2();
		
		
		obj1.counter();
		
		obj2.counter();
		
		obj3.counter();
		
		obj3.counter();
		
		obj3.display();
		
	}
}
