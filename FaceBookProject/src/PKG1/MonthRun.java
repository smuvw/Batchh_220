package PKG1;

public class MonthRun {
	//possible create enum within class or outside of the class 
	//inside enum is called innerclass 
	
	public enum Month1 {

		JAN1,FEB,MAR;
	}


	public static void main(String[] args) {
		Month m= Month.JAN;
		System.out.println(m);
		
		Month1 m1= Month1.JAN1;
		System.out.println(m1);
		

	}

}
