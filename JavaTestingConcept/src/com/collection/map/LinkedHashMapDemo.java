package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map linkedhashmap = new LinkedHashMap<String,String>();
linkedhashmap.put("1", "Test1");
linkedhashmap.put("2", "Test2");
linkedhashmap.put("4", "Test3");
linkedhashmap.put("3", "Test3");
System.out.println(linkedhashmap);

Set<Entry<String,String>> es = linkedhashmap.entrySet();
for(Map.Entry<String,String> lhm : es){
	System.out.println(lhm);
}
Map hashmap = new HashMap<String,String>();
hashmap.put("1", "Test1");
hashmap.put("2", "Test2");
hashmap.put("4", "Test3");
hashmap.put("3", "Test3");
System.out.println(hashmap);


//Set eshm = hashmap.entrySet();
Set<Entry<String,String>> eshm = hashmap.entrySet();
Iterator<Entry<String,String>>  itr = eshm.iterator();
while(itr.hasNext()){
	System.out.println(itr.next().getValue());
}
/*Set<Entry> shm = hashmap.entrySet();
for( Entry hm : shm){
	String sk = (String) hm.getKey();
	System.out.println(sk);
	String sv = (String) hm.getValue();
	System.out.println(sv);*/
}

	}


