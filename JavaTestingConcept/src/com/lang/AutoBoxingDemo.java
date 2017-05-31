package com.lang;

public class AutoBoxingDemo {
	
	static Integer I = 10;
	
	public static void m(Integer K){
		int m = K;
		System.out.println(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Integer i = 10;
System.out.println(i);
Integer si = new Integer("11");
int pi = i;
double d = si.doubleValue();
System.out.println(pi);
System.out.println(d);
*/
int ii = I;
m(11);


	}
}

