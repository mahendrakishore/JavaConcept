package com.constructor;

import org.omg.Messaging.SyncScopeHelper;

public class OverloadedConstructor {
	
	OverloadedConstructor(int n){
		
		System.out.println("int");
		
	}

	OverloadedConstructor(double d) {
		// TODO Auto-generated constructor stub
		
		System.out.println("double");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadedConstructor oc = new OverloadedConstructor(10);
		OverloadedConstructor oc1 = new OverloadedConstructor(11.22);
		
	}

}
