package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> tm = new TreeMap<String,String>();
tm.put("x", "test3");
tm.put("a", "test1");
tm.put("d", "test2");
//tm.put(null, "test4");
tm.put("e", null);
System.out.println(tm);

for(Map.Entry<String, String> etm : tm.entrySet()){
	System.out.println(etm);
}

Map<String, String> hm = new HashMap<>();
hm.put("x", "test3");
hm.put("a", "test1");
hm.put("d", "test2");
System.out.println(hm);
Set<Entry<String,String>> hme = hm.entrySet();
Iterator<Entry<String,String>> itr = hme.iterator();
while(itr.hasNext()){
	System.out.println(itr.next().getKey());
}
	}

}
