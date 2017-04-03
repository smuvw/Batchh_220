package Exception;

public class classC {
	
	public static void add() throws InterruptedException  {
		domorestuff();	
	}

	public static void domorestuff() throws InterruptedException  {
		
		Thread.sleep(9000);
	}
	
	public static void main(String[] args) throws InterruptedException   {
		
		add();

	}

}
