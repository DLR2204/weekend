package oops;

class GrandParent {

	public void display() {
		System.out.println("Iam from the grandParent class");
	}
}

class Parent extends GrandParent {

	public void hi() {
		System.out.println("Iam from the parent class");
	}

	public int mul(int a, int b) { // dynamic
		return (a * b);
	}

}

public class Child extends Parent {

	public static void main(String[] args) {

		Child obj = new Child();

		obj.hi();

		System.out.println(obj.mul(12, 12));

		obj.display();

	}
}
