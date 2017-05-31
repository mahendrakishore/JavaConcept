package com.lang;

import java.lang.reflect.Method;

public  class StringConstructorDemo   {

	String s ;


StringConstructorDemo( ){

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = new String();
System.out.println(s1);
//String s2 = new String(String literal);
//String s3 = new String(StrinBuffer sb);
//String s4 = new String(char[] ch);
char[] ch = {'a','b','c','d'};
String s = new String(ch);
System.out.println(s);
byte[] b = {100,101,102,103};
String s5 = new String(b);
System.out.println(s5);
String sc= "hello";
String chs = "abcdef";
System.out.println(chs.charAt(3));
//sc.charAt(1);

String sei = "JAVA";
System.out.println(sei.equals("java"));
System.out.println(sei.equalsIgnoreCase("java"));

//StringConstructorDemo ss = "durga"; only possible for Sting 
String ss = "abcdefghi";
System.out.println(ss.substring(2));
System.out.println(ss.substring(2,7));

String sl = "durga";
 System.out.println(s.length());
Integer sb = 10;

String sr = "abbccd";
System.out.println(sr.replace('b', 'd'));

System.out.println(sr.toUpperCase());

String t = " hydrabad ";
System.out.println(t.trim());

String t1 = " hydrabad ";
System.out.println(t1.indexOf('d'));
/*Object o = new String();
Class c = o.getClass();
Method[] m = c.getDeclaredMethods();
for(Method m1:m){
	System.out.println(m1.getName());*/

String scr = new String("durga");
String scr1 = scr.toUpperCase();
String scr2 = scr.toLowerCase();
System.out.println(scr==scr1);
System.out.println(scr==scr2);
String scr4 = scr1.toLowerCase();
System.out.println(scr==scr4);

String scp = "durga";
String scp1 = scp.toString();
System.out.println(scp==scp1);
String scp2 = scp.toLowerCase();
System.out.println(scp2==scp);
String scp4=s.toUpperCase();
System.out.println(scp4==scp);
String scp5 = scp4.toLowerCase();
System.out.println(scp5==scp);
	}
	}


