package com.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll = new LinkedList();
ll.add("a");
ll.add(10);
ll.add("a");
System.out.println(ll);
ll.remove(2);
System.out.println(ll);
ll.addFirst(null);
ll.add(0,"A");
ll.addLast(10);
System.out.println(ll);
ll.removeLast();
System.out.println(ll);
ll.set(0, "AA");
System.out.println(ll);
	}

}
