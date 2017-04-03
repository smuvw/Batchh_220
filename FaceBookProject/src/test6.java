
public class test6 {
	
	int c=30;  //instance variables 
	String name="sri"; //instance variables
	
	static String City="Chicago"; // static variable 
	
  //instance method 
	public void m1(){
		System.out.println(c);
		System.out.println(name);
		System.out.println(City);
	}

	//static method
	public static  void m2(){
		test6 t6= new test6();
		System.out.println(t6.c);
		System.out.println(t6.name);
	}
	
	//static method 
	public static void main(String[] args) {
		int a=10; // local variables 
		int b=20; //local variables 
		
		test6 t6= new test6();
		
		System.out.println(t6.c);
		System.out.println(t6.name);
		
		System.out.println(City);
		System.out.println(test6.City);
	}
	
	
	

}
