package com.lang;

public final class ImmutableDemo {

	private int i ;
	

	 ImmutableDemo (int i){
		this.i=i;
	}
	 
	
	
	public ImmutableDemo modify(int i){
		if(this.i==i){
			return this;
		}
		else {
			return new ImmutableDemo(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableDemo i = new ImmutableDemo(10);
		ImmutableDemo i2 = i.modify(20);
		ImmutableDemo i3 = i.modify(10);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i);
	}

}
