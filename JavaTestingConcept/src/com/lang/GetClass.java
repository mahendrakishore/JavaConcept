package com.lang;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetClass {

		// TODO Auto-generated method stub
	public static void main(String[] args) throws Throwable {
		
	/*	Object o = new String("durga");
		Class c = o.getClass();
		System.out.println(c.getName()); 
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m){
			System.out.println(m1.getName());
			}*/
		
		/*Object o1 = new Integer(10);
		Class c = o1.getClass();
		System.out.println(c.getName());
		Method[] mi = c.getDeclaredMethods();
		for(Method m1 : mi){
			System.out.println(m1.getName());
		}*/
		int count = 0;
		Object o = new Object();
		Class c = Class.forName("java.lang.Object");
		System.out.println(c.getName());
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m){
			count++;
			System.out.println(m1.getName());
		}
		System.out.println(count);
/*		
		Connection con = DriverManager.getConnection();
		System.out.println(con.getClass().getName());*/
	}

}
