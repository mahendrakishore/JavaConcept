package com.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
		list.add("gamma");
		System.out.println(list);

		Object[] obj = list.toArray();
		/*for(Object o : obj){
	System.out.println(o);
}*/

		/*for (int i = 0 ; i<obj.length;i++){
	System.out.println(obj[i]);
}
System.out.println(obj.getClass().getName());
	}*/
		System.out.println(Arrays.toString(obj));

String[] string = list.toArray(new String[0]);
string[0] = "delta" ;
System.out.println(Arrays.toString(string));// change in the array
System.out.println(list);// no change in the list 
	}
}
