package com.lang;

public class WrapperClassUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer("30");
        System.out.println(i.toString());
        String s = Integer.toString(10);
        System.out.println(s);
        String sc = Character.toString('c');
        System.out.println(sc);
        String sr = Integer.toString(1111, 2);
        System.out.println(sr);
        String sr1 = Integer.toBinaryString(1111);
        System.out.println(sr1);
        
         
	}

}
