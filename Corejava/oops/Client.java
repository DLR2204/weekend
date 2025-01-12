package oops;

public class Client {
	
	public static void main(String[] args) {
		
		Calculator obj = new SubClass();
		
		
		obj.add(12, 12);
		
		obj.sub(23,20);
		
		obj.mul(12, 45);
		
		obj.div(12, 6);
		
	}

}
