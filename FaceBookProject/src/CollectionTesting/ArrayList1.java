package CollectionTesting;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		test1 t1= new test1();
		  ArrayList al=new ArrayList();
		  
			  
		 
		  System.out.println(al.size());
		  al.add("A");
		  al.add(10.23);
		  al.add("srini");
		  al.add(null);
		  al.add(t1);
		  al.add(10);
		  System.out.println(al);
		  al.remove(1);
		  al.add(3, "sam");
		  System.out.println(al);
		 
		  Iterator i=al.iterator();
		  System.out.println(i.hasNext());
		  System.out.println(i.next());
		  System.out.println(i.next());
		  System.out.println(i.next());
		  System.out.println(i.next());
		  System.out.println(i.next());
		  System.out.println(i.next());
		  System.out.println(i.next());

	}

}
