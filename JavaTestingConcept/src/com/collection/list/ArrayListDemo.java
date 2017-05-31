package com.collection.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"M");
		al.add("N");
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		LinkedList ll = new LinkedList();
		System.out.println(al1 instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
		System.out.println(al1 instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
	}

}
