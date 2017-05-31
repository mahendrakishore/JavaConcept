package com.collection.list;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer s1 = (Integer)obj1;
		Integer s2 = (Integer)obj2;
		return s2.compareTo(s1);
	}

}
