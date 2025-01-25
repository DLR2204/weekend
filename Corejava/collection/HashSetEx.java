package collection;

import java.util.HashSet;

//Set:- 

//It will not allows duplicates

//Insertion order :- Random

public class HashSetEx {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		
		hs.add("apple");

		hs.add(123);

		hs.add(3.14f);

		hs.add(true);

		hs.add('c');

		hs.add("apple");

		hs.add(123);

		hs.add(3.14f);

		hs.add(true);

		hs.add('c');

		System.out.println(hs);

		hs.add("hehso");

		System.out.println(hs);
		
	}

}
