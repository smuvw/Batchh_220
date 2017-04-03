package CollectionTesting;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayList2 {

	public static void main(String[] args) {
		
		
		test1 t1= new test1();
		
		ArrayList a= new ArrayList();
		a.add("sri");
		a.add(10);
		a.add(t1);
		
		//System.out.println(a);
		a.get(1);
		//System.out.println(a.get(1));
		//System.out.println(a.get(2));
		
		ArrayList a1= new ArrayList();
		
		a1.addAll(a);
		a1.add("Deepa");
		
		System.out.println(a1);
		ArrayList a2= new ArrayList(40);
		

	

	
	}

}
