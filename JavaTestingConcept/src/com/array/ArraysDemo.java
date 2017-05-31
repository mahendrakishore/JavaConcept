package com.array;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int[] a = {90,70,10,80,30,30};
for(int a1 : a){
	System.out.println(a1);
}
Arrays.sort(a);
	*/

String[] s = {"Z","A","T","a","v","A",};
for(String s1 : s){
	System.out.println(s1);
}
Arrays.sort(s, new MyStringComparator());
	}		
}
