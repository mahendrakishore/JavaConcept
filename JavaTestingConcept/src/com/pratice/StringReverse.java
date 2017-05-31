package com.pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*String input ;
System.out.println("Enter the input String");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
input = br.readLine();
char[] try1 = input.toCharArray();
for(int i = try1.length ;i>0;i--){
	System.out.println(try1[i]);
}*/
		
/*    	String input = "hello my name";
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb = sb.reverse();
		//for(int i = 0 ; i<sb.length() ;i++){
		//	System.out.println(sb.charAt(i)); }
		System.out.println(sb);*/
		
/*	String input = "string reverse " ;
		char[] ch = input.toCharArray();
		List<Character> charlist = new LinkedList<Character>();
		for(char c1 : ch){
			charlist.add(c1);
			Collections.reverse(charlist);
			Iterator<Character> litr = charlist.iterator();
			while(litr.hasNext()){
				System.out.println(litr.next()); }}*/
		//System.out.println(charlist);
			
		
/*		String s = "string reverse";
		System.out.println(s);
		char[] ch = s.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			System.out.println(ch[i]);
		}*/
		//String s1 = ch.toString();
//	System.out.println(s1);
		System.out.println("Enter String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(s);
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb = sb.reverse();
		System.out.println(sb);
	}

}
