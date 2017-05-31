package com.oops.inheritance;

public class Child extends Parent{

	/*public void m1(){
		System.out.println("child");
	}*/
	
	public void m2(){
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		Parent p = new Parent();
		Parent pc = new Child();
		//Child cp = (Child) new Parent();
		//c.m1(); polymorphism//overridding
		//c.m2();
		//p.m1();
		pc.m1();
		
	
		
		
	}

}
