package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm = new HashMap();
hm.put("test",2);
hm.put("java", 1);
hm.put("hungry",3);
hm.put("java", 4);//replace
hm.remove("java");
Iterator i  = hm.keySet().iterator();
while(i.hasNext()){
	String hmkey = (String) i.next();
	System.out.println(hm.get(hmkey));
}
	}

}
