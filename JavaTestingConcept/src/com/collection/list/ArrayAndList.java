package com.collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l = new ArrayList();
l.add(Integer.valueOf(10));
l.add(true);
System.out.println(l.get(1));

int[] i = new int[3];
//int[] i = {10,20};
i[0] = 10; 
System.out.println(i[0]);

String[] s = {"AA","BB"};
System.out.println(s[0]);

int[] i2 = {10,20};
System.out.println(i2);
	}

}
