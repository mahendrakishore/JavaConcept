package com.oops.overridding;

public class P {
	
	public void m1(){
		System.out.println("parent");
	}

	public void m2(int...i){
		System.out.println("var arg");
	}
	
	public final void m5(){
		
	}
	
	public void m2(int x){
		System.out.println("integer");
	}	
		public Object m3(){
			return null;
		}
		
		public double d(){
			return 10.00;
			
		}
	}

