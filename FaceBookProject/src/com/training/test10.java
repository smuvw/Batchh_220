package com.training;

public class test10 {
	
	//instance block
	{
		System.out.println(" this is instance block");
	}
	/*{
		System.out.println(" this is second instance block");
	}*/
	
	static {
		System.out.println(" this is static  block");
	}

	test10(){
		System.out.println(" welcome");
	}
	test10(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		test10 t10= new test10();
		test10 t11= new test10(100);
		

	}
}
