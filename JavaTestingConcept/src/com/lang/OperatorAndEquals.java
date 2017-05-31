package com.lang;

public class OperatorAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = new String("durga");
String s2 = new String("durga");
StringBuffer sb1 = new StringBuffer("durga");
StringBuffer sb2 = new StringBuffer("durga");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(sb1==sb2);
System.out.println(sb1.equals(sb2));
//System.out.println(s1==sb1);
System.out.println(s1.equals(sb1));

Thread t = new Thread();
System.out.println(t==null);
System.out.println(t.equals(null));
	}

}
