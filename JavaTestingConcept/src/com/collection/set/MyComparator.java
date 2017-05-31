package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer) obj1 ;
		Integer I2 = (Integer) obj2 ;
	/*	if(I1<I2){
			return  +1;
		}
		else if (I1>I2){
			return  -1;
			}
		else {
			return  0;
		}*/
		
		//return I1.compareTo(I2);
		//return -I1.compareTo(I2);
		//return I2.compareTo(I1);
		//return -I2.compareTo(I1);
		//return +1;
		//return -1;
		return 0;
		}
	}

	
