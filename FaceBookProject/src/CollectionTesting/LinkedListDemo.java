package CollectionTesting;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(null);
		ll.add("srini");
		ll.add(10);
		ll.add(10.23);
		System.out.println(ll);
		ll.add(2, "soft");
		ll.set(1, "M");
		ll.addFirst("Java");
		ll.addLast("selenium");
		System.out.println(ll);
		
		
	}

}
