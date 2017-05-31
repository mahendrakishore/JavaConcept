package com.lang;

public class ShallowCloning implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
Cat c = new Cat(10);
Dog d = new Dog(c,20);
System.out.println(d.c.j+" "+d.i);
Dog d2 = (Dog)d.Clone();
d2.i = 30;
d2.c.j = 40;
System.out.println(d2.i+" "+d2.c.j);
System.out.println(d.c.j+" "+d.i);

	}

}
