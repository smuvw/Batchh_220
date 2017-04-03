package Exception;

public class classB {
	
	
	public static void validate (int a){
		
		if (a<18 )
		throw new ArithmeticException("you are not valided voter ");
		//System.out.println("less than 18");
		else
			 System.out.println( " you can vote");
		
		
		
	}

	public static void main(String[] args) {
		
		validate(16);
	}

}
