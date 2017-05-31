package com.lang;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = new String("durga");
String s2 = new String("durga");
System.out.println(s1.equals(s2));
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s1.hashCode()==s2.hashCode());

StringBuffer sb1 = new StringBuffer("durga");
StringBuffer sb2 = new StringBuffer("durga");
System.out.println(sb1.equals(sb2));
System.out.println(sb1.hashCode());
System.out.println(sb2.hashCode());
System.out.println(sb1.hashCode()==sb2.hashCode());
	}

}
