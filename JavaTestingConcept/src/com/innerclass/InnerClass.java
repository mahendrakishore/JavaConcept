package com.innerclass;

public class InnerClass {
	
	class Inner1{
		
		void test1(){
			System.out.println(" inner class 1");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass innerclass = new InnerClass();
		
		InnerClass.Inner1 inner1 = innerclass.new Inner1();
		
		inner1.test1();
		
	
		
	}

}
