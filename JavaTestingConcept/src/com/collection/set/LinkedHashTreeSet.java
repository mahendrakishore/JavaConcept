package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Set<Object> hs = new HashSet<Object>(); 
hs.add(2);
hs.add(3);
hs.add(1);
hs.add(null);
hs.add(null);
hs.add(null);
System.out.println(hs);
Iterator itr = hs.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}*/

/*Set<Object> lhs = new LinkedHashSet<Object>(); 
lhs.add(2);
lhs.add(3);
lhs.add(1);
lhs.add(null);
lhs.add(null);
lhs.add(null);
System.out.println(lhs);
Iterator itr1 = lhs.iterator();
while(itr1.hasNext()){
	System.out.println(itr1.next());
}*/



Set<Object> ts = new TreeSet<Object>(); 
ts.add(null);
/*ts.add(2);
ts.add(3);
ts.add(1);*/
System.out.println(ts);
Iterator itr2 = ts.iterator();
while(itr2.hasNext()){
	System.out.println(itr2.next());
}

	}

}
