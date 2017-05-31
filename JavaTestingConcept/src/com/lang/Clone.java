package com.lang;

public class Clone implements Cloneable{
	
	int i = 10;
	int j = 10;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Clone t1 = new Clone();
		Clone t2 = (Clone) t1.clone();
		t2.i = 888;
		t2.j = 999;
		System.out.println(t1.i+" "+t1.j);
		System.out.println(t2.i+" "+t2.j);
	}

}
