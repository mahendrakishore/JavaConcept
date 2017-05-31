package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Object> hs = new HashSet<Object>();
hs.add(3);
hs.add("hash");
hs.add("set");
hs.add(3);
System.out.println(hs);
Iterator i = hs.iterator();
while(i.hasNext()){
	System.out.println(i.next());
}
	}

}
