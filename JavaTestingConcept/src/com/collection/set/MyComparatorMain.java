package com.collection.set;

import java.util.TreeSet;

public class MyComparatorMain {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyComparator());
		//TreeSet ts = new TreeSet();
	     ts.add(10);
	     ts.add(0);
	     ts.add(15);
	     ts.add(20);
	     ts.add(20);
	     System.out.println(ts);
		
	}
	
}
