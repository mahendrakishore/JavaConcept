package com.array;

public class ArrayConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] a = new int[-3];
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[0] = 3;
		int[] x ;
		x = new int['a'];
		int[] b ;
		//b = {10,20,30};
		int[] x1 = new int[(int) 10l];
		String[] s = {"AA","BB"};
		System.out.println(s);
		String[] ss = new String[]{"BB","CC"};
		StringBuffer[] sb = new StringBuffer[2];
		//sb[0] = "ddd";
		sb[1] = new StringBuffer("test");
		String[] sss = new String[2];
		sss[0] = new String("Test");
		sss[1] =  new String("me");
		sss[2] = "test";
		for(String ssss : sss){
			System.out.println(ssss);
		}
		
		Integer[] I = new Integer[3];
		I[0] = new Integer(10);
		I[1] = new Integer("20");
		I[2] = 30;
		//ArrayConstructor ac = new ArrayConstructor();
		
		/*for(int i = 0 ;i<a.length;i++){
		System.out.println(a[i]);
		}*/
		for(int a1 : a){
			System.out.println(a1);
		}
	}

}
