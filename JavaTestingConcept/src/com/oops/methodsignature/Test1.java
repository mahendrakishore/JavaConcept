package com.oops.methodsignature;

public class Test1 {
	
	public void m1(String s){
		System.out.println("string version");
	}
	
	public void m1(Object o){
		System.out.println("object version");
	}
public static void main(String[] args) {
	Test1 t1= new Test1();
	t1.m1("string");
	t1.m1(new Object());
	t1.m1(null);
}
}
