package collection;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		
		Vector vc = new Vector();
		
		vc.add("apple");

		vc.add(123);

		vc.add(3.14f);

		vc.add(true);

		vc.add('c');

		vc.add("apple");

		vc.add(123);

		vc.add(3.14f);

		vc.add(true);

		vc.add('c');

		System.out.println(vc);

		vc.add("hevco");

		System.out.println(vc);
		
	}

}
