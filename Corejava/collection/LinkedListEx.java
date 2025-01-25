package collection;

import java.util.LinkedList;

//(1)it's growable in nature
//
//(2)It will allows both homogenous/heterogenous elements
//
//(3)lots of utility methods.

//List :- 
//
//(4)It will allows duplicates
//
//(5)stores the inserting order

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("apple");

		ll.add(123);

		ll.add(3.14f);

		ll.add(true);

		ll.add('c');

		ll.add("apple");

		ll.add(123);

		ll.add(3.14f);

		ll.add(true);

		ll.add('c');

		System.out.println(ll);

		ll.add("hello");

		System.out.println(ll);
	}

}
