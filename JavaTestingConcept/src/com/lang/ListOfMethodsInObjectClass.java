package com.lang;

import java.lang.reflect.Method;

public class ListOfMethodsInObjectClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		int count= 0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m){
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("the number of methods = "+count);
	}

}
