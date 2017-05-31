package com.test;

public class Charatercount {

	public static int letterCount(String str){
		int lc=0;
		int index=0;
	while(index<str.length()){
		if(str.charAt(index)!=' '){
			lc++;
		}
	}
	System.out.println(lc);
		return lc ;
				}
	
	public static void main(String[] args) {
		
		Charatercount cc = new Charatercount();
		cc.letterCount("writtingthisstringtotest");
		
	}

}
