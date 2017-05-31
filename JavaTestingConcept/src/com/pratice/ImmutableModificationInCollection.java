package com.pratice;

import java.util.ArrayList;
import java.util.List;

public class ImmutableModificationInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> s = new ArrayList<String>();
s.add("alpha");
s.add("beta");
s.add("gamma");
for(String ss : s){
	ss+="change!";
	System.out.println(ss);
}
System.out.println(s);// cannot change immutable objects
	}

}
