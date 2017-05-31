package com.constructor;

public class Child extends Parent {

	int roll;
	int marks;
	 public Child(String name ,int age ,int roll ,	int marks){
		 this.name = name;
		 this.age=age;
		 this.roll=roll;
		 this.marks=marks;
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child("durga",1,2,3);
		System.out.println();
	}

}
