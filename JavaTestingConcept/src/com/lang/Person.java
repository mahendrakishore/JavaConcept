package com.lang;

public class Person {
	
	 int roll ;
	 String name;
	Person(String name, int roll){
		this.name = name;
		this.roll =roll;
	}
	
	public boolean equals(Object o){
		if(o instanceof Person){
		Person p = (Person)o;
		if(name.equals(p.name)&&roll==p.roll){
			return true;
		}
		else{return false;}
		}
		else{return false ;}
	}
	
	public int hashCode(){
		return name.hashCode()+roll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("durga",10);
		Person p2 = new Person("durga",10);
		System.out.println(p1);
		System.out.println(p2);
System.out.println(p1.equals(p2));		
	}

}
