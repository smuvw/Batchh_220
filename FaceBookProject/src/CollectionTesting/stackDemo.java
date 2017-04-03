package CollectionTesting;

import java.util.Stack;

public class stackDemo {

	public static void main(String[] args) {
	
		Stack a=new Stack();
		a.push("A");
		a.push(10);
		a.push(20);
		System.out.println(a);
		
		System.out.println(a.search("A"));
		System.out.println(a.search("K"));
		System.out.println(a.peek());
	}

}
