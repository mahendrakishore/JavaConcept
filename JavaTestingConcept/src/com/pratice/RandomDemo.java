package com.pratice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list = new ArrayList();
Random random = new Random();
for(int i = 0 ; i<=10;i++){
	/*list.add(i);
	System.out.println(list);*/
	list.add(new Integer(random.nextInt(10)));
}

System.out.println(list);
//System.out.println(list);

Iterator itr = list.iterator();
while(itr.hasNext()){
	int i = ((Integer)itr.next()).intValue();
	System.out.println(i);
}
	}

}
