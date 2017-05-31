package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListBinarySerach  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l = new ArrayList();
/*l.add("Z");
l.add("A");
l.add("M");
l.add("K");
l.add("a");*/
l.add(10);
l.add(15);
l.add(0);
l.add(20);
l.add(10);
l.add(20);
System.out.println(l);

Collections.sort(l,new MyComparator());//sorted
System.out.println(l);
Collections.reverse(l);
//int i = Collections.binarySearch(l, "Z");
int i = Collections.binarySearch(l,10,new MyComparator());
System.out.println(i);
	}

}
