package com.lang;

public class StringHeapScp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("durga");
		s1.concat("software");
		String s2= s1.concat("solution");
		s1 = s1.concat("soft");
		System.out.println(s1);
		System.out.println(s2);
	}

}
