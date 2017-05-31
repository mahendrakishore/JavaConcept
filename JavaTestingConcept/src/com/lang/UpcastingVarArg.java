package com.lang;

public class UpcastingVarArg {
	
	public static void m(long l){
		System.out.println("upcasting");
	}
	
	public static void m(int...x){
		System.out.println("var-arg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
       m(x);
	}

}
