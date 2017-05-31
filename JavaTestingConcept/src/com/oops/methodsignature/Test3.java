package com.oops.methodsignature;

public class Test3 {
	
	public void m1(Animal a){
		System.out.println("animal version");
	}
	
	public void m1(Monkey m){
		System.out.println("monkey version");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t3 = new Test3();
		Animal a = new Animal();
		t3.m1(a);
		
		Monkey m = new Monkey();
		t3.m1(m);
		
		Animal a1 = new Monkey();
		t3.m1(a1);
		
		
	}

}
