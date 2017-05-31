package com.constructor;

public class StudenChild extends PersonParent{

	int rollnumber;
	static int marks ;


	public StudenChild(String name,int age ,int marks, int rollno){
		super(name,age);
		StudenChild.marks = marks ;
		this.rollnumber = rollno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudenChild s = new StudenChild("durga",101,50,1);
		PersonParent p = new StudenChild("soft",13,51,10);
		System.out.println(s.age+s.name+s.marks+s.rollnumber);
		System.out.println(p.name+p.age);
		System.out.println(s.hashCode());
		System.out.println(p.hashCode());
	}
}
