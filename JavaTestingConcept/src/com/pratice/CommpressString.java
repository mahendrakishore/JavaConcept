package com.pratice;

public class CommpressString {
	String s = "aaabbccc";
	
	public void compress(String ss){
	char temp = ss.charAt(0);
	int count = 0;
	for(int i = 0; i<ss.length();i++){
		if(ss.charAt(i)==temp){
			count++;
		}
		else{
			System.out.println(temp+" "+count);
			temp = ss.charAt(i);
			count = 1;
		}
	}	
	
	}

}
