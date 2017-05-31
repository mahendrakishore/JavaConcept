package com.constructor;

public class Test {
	
	int roll ;
	String name;
	
	public Test (int roll,String name){
		this.roll=roll;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test(101,"durga");
		Test t2 = new Test(102,"ravi");
		System.out.println(t.name+t.roll);
		System.out.println(t2.name+t2.roll);

	}

}
