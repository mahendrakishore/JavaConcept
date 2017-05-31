package com.collection.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(10,"ten");
hm.put(11,"eleven");
hm.put(12, "twelve");
hm.put(13, "thirteen");
Set<Entry<Integer,String>> es = hm.entrySet();
for(Entry<Integer, String> hm1 : es){
	System.out.println(hm1.getKey()+" "+hm1.getValue());
	
}

	}

}
