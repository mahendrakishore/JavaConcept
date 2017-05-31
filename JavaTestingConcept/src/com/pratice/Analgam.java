package com.pratice;

public class Analgam {
	
	String s1 = "abc";
    String s2 = "cab";
    
    public boolean amalgamMethod(String a1 , String a2){
    	
    	char[] chars = a1.toCharArray();
    	StringBuilder sb = new StringBuilder(a2);
    	for(char ch :chars){
    		int index  = sb.indexOf(""+ch);
    		System.out.println(index);
    		if(index!=-1){
    			sb.deleteCharAt(index);
    		} }
    		if(sb.length()==0){
    			return true;
    		}
    		else{
    			return false ;
    		}
    	}
    
    
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Analgam  a = new Analgam();
		boolean alamgam = a.amalgamMethod(a.s1, a.s2);
		System.out.println(alamgam);
	}

}
