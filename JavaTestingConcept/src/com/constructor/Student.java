package com.constructor;

public class Student {
	
	int rollnumber;
	String sname ;

	public Student(String name, int rollno){
		this.sname = name ;
		this.rollnumber = rollno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("durga",101);
		
	}

}
