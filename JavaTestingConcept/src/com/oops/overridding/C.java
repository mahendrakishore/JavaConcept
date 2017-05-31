package com.oops.overridding;

public class C extends P {

	public void m1(){
		System.out.println("child");
	}
	
	public String m3(){
		return null;
	}
	
	public int d(){
		return 10;
		
	}
	
public final void m5(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  C c = new C();
  c.m1();
  
  P p = new P();
  p.m1();
  
  P p1 = new C();
  p1.m1();
  
  c.m2(10);
  c.m2(30,40);
  }

}
