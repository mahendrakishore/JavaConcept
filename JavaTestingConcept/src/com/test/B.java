package com.test;

public class B extends A {

	private int a =22;
	private int b =11;
	private int a1=77;
	private int b1=66;
	public void m2(int a , int b)
	{
		System.out.println("method of B");
		int sum;
		this.a=a1;
		this.b=b1;
		sum = a1+b1;
		System.out.println(sum);
	}

}
