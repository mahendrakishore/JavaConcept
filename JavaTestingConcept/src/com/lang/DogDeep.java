package com.lang;

public class DogDeep {

	int i ;
	Cat  c;
	
	DogDeep(Cat c, int i){
		this.c = c;
		this.i = i ;
	}
	
	public Object Clone() throws CloneNotSupportedException{
		Cat c1 = new Cat(c.j);
		Dog d3 = new Dog(c1,i);
		return d3 ;
	}
}
