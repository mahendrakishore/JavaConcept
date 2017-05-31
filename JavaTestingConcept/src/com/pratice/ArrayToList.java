package com.pratice;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] string = new String[] {"alpha","beta","gamma"};

List<String> list = Arrays.asList(string);
System.out.println(list);

string[0]+="88";
list.set(2, list.get(2)+"99");
System.out.println(Arrays.toString(string));
System.out.println(list);

List<Integer> Integerlist = Arrays.asList(22,44,11,33);
System.out.println(Integerlist);
	}

}
