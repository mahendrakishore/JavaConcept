package com.test;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		B b = new B();
		b.m1();
		b.m2(55,44);
		A a1 = new B();
		a1.m1();
		
		
	}
	
}
