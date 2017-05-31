package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDataRetrival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(10, "10");
hm.put(20, "20");
hm.put(30, "30");
hm.put(40, "40");
hm.put(50, "50");
hm.put(00, "");
Set<Entry<Integer,String>> es = hm.entrySet();
Iterator<Entry<Integer,String>> itr = es.iterator();
while(itr.hasNext()){
	System.out.println(itr.next().getValue());
}
	}

}
