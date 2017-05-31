package com.lang;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i = new Integer(10);
Integer ii = new Integer("10");
//Integer iii = new Integer("string");
System.out.println(i);
System.out.println(ii);
Character c  = new Character('a');
System.out.println(c);
/*Short s = new Short("A");
System.out.println(s);*/
Float f = new Float(10.22);
System.out.println(f);

Boolean b = new Boolean(true);
Boolean bb = new Boolean("false");
System.out.println(b);
System.out.println(bb);
Boolean bb1 = new Boolean("true");
Boolean bb2 = new Boolean("True");
System.out.println(bb1.equals(bb2)); 
//System.out.println(b.equals(bb1));
System.out.println(bb1.equals(bb));
Double dd = Double.valueOf("10.45");
System.out.println(dd);
Integer ib = Integer.valueOf("1111", 2);
System.out.println(ib);
Integer ic  = new Integer(130);
System.out.println(ic.intValue());
System.out.println(ic.byteValue());
System.out.println(ic.doubleValue());
Character cv = Character.valueOf('c');
System.out.println(cv);
Boolean bc = new Boolean("true");
System.out.println(bc.booleanValue());
System.out.println(cv.charValue());

	}

}
