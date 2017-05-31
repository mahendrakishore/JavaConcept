package com.array;

import java.util.Comparator;

public class MyStringComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1 = o1.toString();
		String s2 = o1.toString();
		return s2.compareTo(s1);
	}

}
