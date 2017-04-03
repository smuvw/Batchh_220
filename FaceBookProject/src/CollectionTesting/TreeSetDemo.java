package CollectionTesting;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("D");
		t.add("C");
		
		t.add(null);
		System.out.println(t);

	}

}
