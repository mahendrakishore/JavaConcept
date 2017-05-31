package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayRetain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l = new ArrayList<Integer>();

l.add("test");
l.add("test2");
l.add("test3");

System.out.println(l);

List l2 = new ArrayList<>();
l2.add("TEST");
l2.add("test");

System.out.println(l2);

l.addAll(l2);

System.out.println(l);

l.retainAll(l2);
System.out.println(l);
	}

}
