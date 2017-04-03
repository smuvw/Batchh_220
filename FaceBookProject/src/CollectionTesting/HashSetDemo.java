package CollectionTesting;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet h= new HashSet();
		
		h.add(10);
		h.add(null);
		h.add("sri");
		h.add(10.25);
		h.add(null);
		System.out.println(h.add(10));
		System.out.println(h);
		
		Iterator h1=h.iterator();
		
		System.out.println(h1.next());
		System.out.println(h1.next());
		System.out.println(h1.next());
		
	}

}
