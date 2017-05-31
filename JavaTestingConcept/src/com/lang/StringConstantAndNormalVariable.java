package com.lang;

public class StringConstantAndNormalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "you cannot change me";	
String s2 = "you cannot"+" change me";
System.out.println(s1==s2);
final String s3 = "you cannot";
String s4 = s3 +" change me";
System.out.println(s4==s1);

	}

}
