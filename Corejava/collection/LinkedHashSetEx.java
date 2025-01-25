package collection;

import java.util.LinkedHashSet;

//Set:- 

//It will not allows duplicates

//Insertion order :- Insertion Order

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		
		lhs.add("apple");

		lhs.add(123);

		lhs.add(3.14f);

		lhs.add(true);

		lhs.add('c');

		lhs.add("apple");

		lhs.add(123);

		lhs.add(3.14f);

		lhs.add(true);

		lhs.add('c');

		System.out.println(lhs);

		lhs.add("hello");

		System.out.println(lhs);
	}

}
