package OOPS;

public class classB extends classA {
	
	
	public void add(){
		
		System.out.println("this is from classB - Add Method");
	}

  public void add(int a){
		
		System.out.println(a);
	}
	public static void main(String[] args) {
	
		
		classB b= new classB();
		b.a=100;
		System.out.println(b.a);
		b.name="sri";
		System.out.println(b.name);
		b.display();
		b.add();
		b.add(100);
	

	}

}
