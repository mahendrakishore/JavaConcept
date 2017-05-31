package com.lang;

public class AutoBoxingForEmpty {
static Integer I;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int i = I;
System.out.println(i);*/
/*Integer X = 10 ;
Integer Y = X;
X++;
System.out.println(X);
System.out.println(Y);
System.out.println(X.equals(Y));*/
		
    	Integer X1= new Integer(10);
		Integer Y1 = new Integer(10);
		System.out.println(X1==Y1);
		
		Integer X2 = new Integer(10);
		Integer Y2 = 10;
		System.out.println(X2==Y2);
		
		Integer X3 = 10;
		Integer Y3 = 10;
		System.out.println(X3==Y3);
		
		Integer X4 = 100;
		Integer Y4 = 100;
		System.out.println(X4==Y4);
		
		Integer X5 = 1000;
		Integer Y5 = 1000;
		System.out.println(X5==Y5);
		
		Boolean b1 = true ;
		Boolean b2 = true;
		System.out.println(b1==b2);
		
		Character c1 = 'x';
		Character c2 = 'x';
		System.out.println(c1==c2);
		
		Byte by1 = 10;
		Byte by2 = 10;
		System.out.println(by1==by2);
		
/*		byte c = 'A';
		System.out.println(c);*/
		
		Integer X6 = 128;
		Integer Y6 = 128;
		System.out.println(X6==Y6);
		
		Float f1 = 10.0f;
		Float f2 = 10.0f;
		System.out.println(f1==f2);
	}

}
