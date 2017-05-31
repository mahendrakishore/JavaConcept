package com.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {
/*	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
	String  s = br.readLine();*/
	String s = "bhanupartapsingh";
	public void findDuplicate(String str){
	
		char[] ch = str.toCharArray();
		Map<Character,Integer> charmap = new HashMap<Character,Integer>();
		for(Character c : ch){
			if(charmap.containsKey(c)){
				charmap.put(c,charmap.get(c)+1);
			}
			else{
				charmap.put(c, 1);
			}
			
			Set<Character> keyset = charmap.keySet();
			for(Character ch1 : keyset){
				if(charmap.get(ch1)>1){
					System.out.println(ch1+""+charmap.get(ch1));
				}
		
			}
		}
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharInString ds = new DuplicateCharInString();
		ds.findDuplicate(ds.s);
	}

}
