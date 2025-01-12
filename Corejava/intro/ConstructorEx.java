package intro;

public class ConstructorEx {

	public ConstructorEx() {
		System.out.println("6.Iam from the default constructor");
	}
	
	
	public ConstructorEx(String name) {
		System.out.println("11.My name is :- "+name);
		
		System.out.println("13.Nd Iam from the Parametrized constructor");
	}
	

	public static void main(String[] args) {

		ConstructorEx obj = new ConstructorEx("Apple");// constructor calling ,obj creation

	}
}
