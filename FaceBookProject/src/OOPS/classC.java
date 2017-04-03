package OOPS;

public class classC extends classB {
	
	classC(){
		System.out.println("This constructor logic");
	}
	
	void m1(){
		System.out.println("this is m1 method");
	}

	public static void main(String[] args) {
		
		classC c= new classC();
		c.a=30;
		System.out.println(c.a);
		c.name="Deepa";
		System.out.println(c.name);
		c.display();
		c.add();
		c.m1();
		

	}

}
