package com.lang;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("durga");
		String s1 = new String("durga");
		s.concat("software");
		System.out.println(s);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		StringBuffer sb = new StringBuffer("durga");
		StringBuffer sb1 = new StringBuffer("durga");
		sb.append("software");
		System.out.println(sb);
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));

	}

}
