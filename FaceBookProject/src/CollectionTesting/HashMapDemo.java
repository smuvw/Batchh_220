package CollectionTesting;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap m= new HashMap();
		//Hashmap  m= new Hashmap(75,0.50)
				
		m.put(1, "sri");
		m.put(2, "sam");
		m.put(3, "Laskhmi");
		System.out.println(m);
		
	/*	Set s1=m.keySet();
		
		System.out.println(s1);
		
	    Collection s2= m.values();
		
		System.out.println(s2);*/
		
		Set s1=m.entrySet();
		
		Iterator s2=s1.iterator();
		
		while( s2.hasNext() ) {
			
			Map.Entry a=(Map.Entry)s2.next();
			
			System.out.println(a.getKey() +"*******" + a.getValue());
			s2.hasNext();
		}
	
		
	}

}
