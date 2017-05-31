package com.lang;

public class OverridenEqulas {

	int roll;
	String name;
	OverridenEqulas(String name, int roll){
		this.name = name ;
		this.roll = roll;
	}
	
	public boolean equals(Object obj){
		try {String name1 = this.name ;
		int roll1 = this.roll;
		OverridenEqulas s = (OverridenEqulas)obj;
		String name2 = s.name;
		int roll2 = s.roll;
		if(name1.equals(name2)&&roll1==roll2){
			return true;
		}
		else{
			return false;
		}}
		catch(ClassCastException e){
			return false;
		}
		catch(NullPointerException e){
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridenEqulas s = new OverridenEqulas("durga",101);
		OverridenEqulas s1 = new OverridenEqulas("durga",101);
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals("durga"));
		System.out.println(s.equals(null));
	}

}
