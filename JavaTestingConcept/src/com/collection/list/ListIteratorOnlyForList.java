package com.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorOnlyForList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll = new LinkedList();
ll.add("bala");
ll.add("venki");
ll.add("chiru");
ll.add("nag");
System.out.println(ll);
ListIterator ltr = ll.listIterator();
System.out.println(ltr.getClass().getName());
while(ltr.hasNext()){
	String s = (String)ltr.next();
if(s.equals("venki")){
	ltr.remove();
}
else if(s.equals("nag")){
	ltr.add("chaitu");
}
else if(s.equals("chiru")){
	ltr.set("chrra");
}
}
System.out.println(ll);
	}

}
