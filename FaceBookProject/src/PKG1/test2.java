package PKG1;

public class test2 {
	
	public void m2(test1 t1){
		
		t1.m1();
	}

	public static void main(String[] args) {


		test2 t2= new test2();
		
		t2.m2(new test1());
		
		t2.m2(new test1());

	
	}

}
