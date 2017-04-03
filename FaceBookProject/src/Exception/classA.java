package Exception;

public class classA {

	public static void main(String[] args) {
		
		System.out.println("welcome");
		
		try {
			System.out.println(10/0);
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		try {
			System.out.println("welcome to Java Training");
		} catch(Exception e){
			e.printStackTrace();
	
		}
		finally {
			System.out.println(" this is final statement");
		}
		

	}

}
