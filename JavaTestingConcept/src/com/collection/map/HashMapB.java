package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> hm = new HashMap<Integer,String>();
 hm.put(1, "Test1");
 hm.put(null, "Tes5");
 hm.put(1, "Test2");
 hm.put(2, "Test3");
 hm.put(2, "Test4");
 System.out.println(hm);
 System.out.println(hm.get(2));
 ///////////////////////////////////////////////
 Set<Integer> ks = hm.keySet();//set is there in the 
 Iterator itr = ks.iterator();
 while(itr.hasNext()){
	 System.out.println(hm.get(itr.next())); 
 }
 //////////////////////////////////////////////////
 for(Map.Entry<Integer, String> mapentry : hm.entrySet()){
	 System.out.println(mapentry);
 }
 
	}

}
