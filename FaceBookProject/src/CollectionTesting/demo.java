package CollectionTesting;

public class demo {
	
	int a;
	
	public void m1(){
		
	}
	
	//1.Create constructor with Private 
	private demo(){
		
		System.out.println("this is from Demo");
	}
	
	//2.Create object 
	
	 private static demo instance=new demo();
	 
	//3.Create method  
	 public static demo getInstance(){
		 
		 return instance;
	 }
	 
	 

}
