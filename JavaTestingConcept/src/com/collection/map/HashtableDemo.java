package com.collection.map;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable ht = new Hashtable() ;
ht.put(new Temp(5),"A");
ht.put(new Temp(2), "B");
ht.put(new Temp(6), "C");
ht.put(new Temp(15), "D");
ht.put(new Temp(23), "E");
ht.put(new Temp(16), "F");
//ht.put(new Temp(0),null);
System.out.println(ht);
	}

}
