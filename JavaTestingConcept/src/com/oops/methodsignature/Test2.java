package com.oops.methodsignature;

public class Test2 {
	
	public void m1(String s){
		System.out.println("string version");
	}

	public void m1(StringBuffer sb){
		System.out.println("stringbuffer version");
	}
	
	public void m2(int i , float f){
		System.out.println("int float version");
	}
	
	public void m2(float f,int i ){
		System.out.println(" float int version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		t2.m1(new String());
		t2.m1(new StringBuffer());
		t2.m1(null);
		t2.m2(10, 10.23f);
		t2.m2(20.23f, 7);
		t2.m2(10, 10);
		t2.m2(10.34f, 21.87f);
	}

}
