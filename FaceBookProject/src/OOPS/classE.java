package OOPS;

public class classE extends classD{

	public static void main(String[] args) {
		
		classE e= new classE();
		e.m1();
		e.m2();
		
	}

	@Override
	public void m2() {
		System.out.println("M2");
		
	}

	@Override
	public void m3() {
		System.out.println("M3");
		
	}

}
