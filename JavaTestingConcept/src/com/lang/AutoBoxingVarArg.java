package com.lang;

public class AutoBoxingVarArg {
	
	public static void m(int...x){
		System.out.println("var-arg");
	}

	public static void m(Integer I){
		System.out.println("autoboxing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 10 ;
m(x);



	}

}
