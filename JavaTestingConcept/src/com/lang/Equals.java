package com.lang;

public class Equals {
	int roll;
 String name;
 
 Equals (String name , int roll){
	 this.name = name;
	 this.roll= roll;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals s = new Equals("durga",11);
		Equals s1 = new Equals("ravi",13);
		Equals s2 = new Equals("durga",11);
		Equals s4 = s;
		System.out.println(s.equals(s1));
		System.out.println(s2.equals(s));
		System.out.println(s4.equals(s));
		System.out.println(s.equals("durga"));
		System.out.println(s.equals(null));
	}

}
