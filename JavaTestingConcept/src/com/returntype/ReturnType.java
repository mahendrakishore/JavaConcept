package com.returntype;

import org.omg.Messaging.SyncScopeHelper;

public class ReturnType {

	public void m1(){
		System.out.println("void");
	}
	
	public ReturnType m2(){
		System.out.println("class object");
		return new ReturnType();
	}
	
	public ReturnType m3(){
		System.out.println("current class");
		return this;
	}
	
	public int m4(){
		System.out.println("int");
		return 5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType rt = new ReturnType();
		rt.m1();
		 ReturnType o = rt.m2();
		 ReturnType o1 = rt.m3();
		rt.m4();
		System.out.println(o);
	}

}
