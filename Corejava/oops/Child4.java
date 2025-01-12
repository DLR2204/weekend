package oops;

class Parent4 {
	public void marriage() {

		System.out.println("The marriage is fixed with kajol");
	}
	
	public  void display() {
		System.out.println("Iam from the parent class");
	}

}

public class Child4 extends Parent4{
	
	@Override
	public void marriage() {

		System.out.println("The marriage is fixed with deepika");
	}
	
	public static void main(String[] args) {
		
		Child4 obj = new Child4();
		
		obj.display();
		
		obj.marriage();
	}

	
	
}
