package com.oops.overridding;

public class MethodHindingChild extends MethodHiding{


	public static void m1(){
		System.out.println("child method");
	}
	
	public int m3(int x){
		return 5;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodHiding mh= new MethodHindingChild();
		mh.m1();
		System.out.println(mh.m3());
	}

	
}
