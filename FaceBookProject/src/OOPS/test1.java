package OOPS;

public class test1 implements iTest1,iTest2 {

	public static void main(String[] args) {
		
		test1 t1=new test1();
		t1.m10();
		t1.m11();
		t1.m12();
		t1.m13();
		t1.m14();
		t1.m15();

	}

	@Override
	public void m10() {
		System.out.println("this is M10");
		
	}

	@Override
	public void m11() {
		System.out.println("this is M11");
		
	}

	@Override
	public void m12() {
		System.out.println("this is M12");
		
	}

	@Override
	public void m13() {
		System.out.println("this is M13");
		
	}

	@Override
	public void m14() {
		System.out.println("this is M14");
		
	}

	@Override
	public void m15() {
		System.out.println("this is M15");
		
	}

}
