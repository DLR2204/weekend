package collection;

import java.util.ArrayList;

//(1)it's growable in nature
//
//(2)It will allows both homogenous/heterogenous elements
//
//(3)lots of utility methods.

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("apple");
		
		al.add(123);
		
		al.add(true);
		
		al.add(3.14f);
		
		al.add('c');
		
		System.out.println(al);
		
		al.add("rose");
		
		System.out.println(al);
	}

}
