
public class test7 {

	
	String City="Chicago"; //instance 
	
	static int price;

	
	public void m2(){
		
		String name="Sri"; //local 
		System.out.println(City);
		System.out.println(price);
	}
	
	public static void m3(){
		int i=10;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;
		
		test7 t7= new test7();
		System.out.println(t7.City);
		
		System.out.println(price);
	}

}
