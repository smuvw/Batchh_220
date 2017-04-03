package CollectionTesting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap l=new LinkedHashMap();
		
		l.put(1, "sri");
		l.put(3, "anu");
		l.put(4, "Deepa");
		
		System.out.println(l);
		
		
		Set el=l.entrySet();
		
		Iterator i=el.iterator();
		
		
		while(i.hasNext()) {
			
			Map.Entry a=(Map.Entry)i.next();
			System.out.println(a.getKey() + "*****"+ a.getValue());
		}
	

	}

}
