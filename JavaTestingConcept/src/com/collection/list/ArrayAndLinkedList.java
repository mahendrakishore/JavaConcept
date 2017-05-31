package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayAndLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("array");
		al.add("list");
		System.out.println(al);
		Iterator ali = al.iterator();
		while(ali.hasNext()){
			System.out.println(ali.next());
		}
		
		LinkedList ll = new LinkedList();
		ll.add("linked");
		ll.add("list");
		System.out.println(ll);
		Iterator lli = ll.iterator();
		while(lli.hasNext()){
			System.out.println(lli.next());		
		}

		ll.addAll(al);
		System.out.println(ll);
	}

}
