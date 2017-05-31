package com.pratice;

import java.util.HashSet;

public class UniqueCharaterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result = false ;
		String s = "string duplicate removal";
		//char[] ch = s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for(int i = 0 ; i<s.length();i++){
			result = hs.add(s.charAt(i));
			if(result==false)
			break;	}
		System.out.println(result);
	}

}
