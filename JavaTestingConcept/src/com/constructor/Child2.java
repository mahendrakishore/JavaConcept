package com.constructor;

public class Child2 extends Parent{
	
int sal ;
String sub ;

public Child2(String name ,int age,int sal ,String sub ){
	this.name=name;
	this.age=age;
	this.sal=sal;
	this.sub=sub;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2("duraga",4,5,"soft");
		System.out.println();
	}

}
