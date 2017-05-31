package com.lang;

public class Dog implements Cloneable {
	
	int i ;
	Cat c;
	Dog(Cat c , int i){
		this.c = c;
		this.i = i;
	}
	
	public Object Clone() throws CloneNotSupportedException{
		 return super.clone();
	}
	
	

}
