package com.lang;

public class AutoBoxingUpcasting {
	
	public static void m(Integer I){
		System.out.println("AutoBoxing");
	}
	public static void m(long l){
		System.out.println("implicit casting");
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x = 10;
		m(x);
	}

}
