package PKG1;

import java.util.ArrayList;

public class test5 {

	public static void main(String[] args) {
	
		test4 t4= new test4();
		t4.m1();
		ArrayList l= new ArrayList();
		
		l.add("A");
		l.add(t4);
		
		System.out.println(l);
		
		
		

	}

}
