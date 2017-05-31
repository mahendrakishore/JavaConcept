package com.lang;

import java.util.ArrayList;

public class ToStringForWrraperClass {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("durga");
		System.out.println(s);
		Integer i = new Integer(10);
		System.out.println(i);
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		System.out.println(al);
		ToStringForWrraperClass nonwrapperclassrefrence = new ToStringForWrraperClass();
		System.out.println(nonwrapperclassrefrence);
	}

}
