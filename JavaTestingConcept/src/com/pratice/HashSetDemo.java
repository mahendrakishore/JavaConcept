package com.pratice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("hash");
		hs.add("set");
		System.out.println(hs);
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("tree");
		ts.add("set");
		System.out.println(ts);
		Iterator it2 = ts.iterator();
		while(it.hasNext()){
			System.out.println(it2.next());
		}
	}

}
