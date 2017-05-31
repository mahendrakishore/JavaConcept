package com.lang;

public class WithoutTryCatch {
	int roll;
	String name;
	
	WithoutTryCatch(String name, int roll){
		this.name=name;
		this.roll=roll;
	}
	
	public boolean equals(Object obj){
		if(obj==this) 
			return true ;
		
		WithoutTryCatch s = (WithoutTryCatch)obj;
		if(obj instanceof WithoutTryCatch){
			if(name.equals(s.name)&&roll==s.roll){
			return true; }
			else{
				return false ;
				}
			}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutTryCatch s = new WithoutTryCatch("durga",101);
		WithoutTryCatch s1 = new WithoutTryCatch("durga",101);
System.out.println(s.equals(s1));
System.out.println(s.equals(null));
	}

}
