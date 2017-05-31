package com.lang;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final StringBuffer s = new StringBuffer("durga");
		StringBuffer s1 = s ;
		s1 = new StringBuffer("heloo");
		StringBuffer s2 = s.append("software");
		System.out.println(s1);
		System.out.println(s);
		StringBuffer s3 = s1.append("soft");
		 s = new StringBuffer("string");
	}

}
