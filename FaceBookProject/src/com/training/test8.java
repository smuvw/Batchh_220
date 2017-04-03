package com.training;

public class test8 {
	
	test8(){
		System.out.println("open Browser");
	}
	
	test8(int a){
		System.out.println(a);
	}
	test8(int a,int b){
		System.out.println(a +" "+ b);
	}
	
	public void  Login() {
		System.out.println("Login");
		}


		public void Logout() {
			System.out.println("Logout");
		}
	
		public static void main(String[] args) {
			
			test8 t8= new test8();
			t8.Login();
			t8.Logout();
		}
		
}
