package com.pratice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		String[] s = new String[3];
		s[0] = new String("hi"); 
		s[1] = "hello";
		s[2] ="yelo";
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("array");
		al.add("list");
		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(al);

	}

}
