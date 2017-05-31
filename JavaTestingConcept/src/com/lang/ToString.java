package com.lang;

public class ToString {

	String  name ;
	int roll ;
	
	ToString(String  name , int roll ){
		this.name = name ;
		this.roll = roll;
	}
	
/*	public String toString(){
		return getClass().getName()+"..."+Integer.toHexString(hashCode());
	}
	*/
	public String toString(){
		return name+"..."+roll;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString s = new ToString("durga",11);
		ToString s1 =  new ToString("ravi",13);
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s1);
		System.out.println(s.equals(s1));
		
	}

}
