package com.lang;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb = new StringBuffer();
System.out.println(sb.capacity());
sb.append("abcdefghijklmopqrstuvwxyz");
System.out.println(sb.capacity());
sb = new StringBuffer("abcdefghijklmop");
System.out.println(sb.capacity());
StringBuffer sb1 = new StringBuffer(10);
System.out.println(sb1.capacity());
StringBuffer sb2 = new StringBuffer("durga");
System.out.println(sb2.capacity());
System.out.println(sb2.charAt(3));
//System.out.println(sb2.charAt(30));
//System.out.println(sb2.setCharAt(1,'x'));
StringBuffer sbe = new StringBuffer();
sbe.append("durga");
sbe.append(10);
sbe.append('d');
sbe.append(true);
sbe.append(sb);
System.out.println(sbe);
sbe.insert(0, true);
System.out.println(sbe);
sbe.delete(0, 4);
System.out.println(sbe);
sbe.deleteCharAt(0);
System.out.println(sbe);
sbe.reverse();
System.out.println(sbe);
//String sr = "durga";
sbe.setLength(4);
System.out.println(sbe);
System.out.println(sbe.capacity());
StringBuffer sbq = new StringBuffer();
System.out.println(sbq.capacity());
sb.ensureCapacity(10000);
System.out.println(sbq.capacity());
StringBuffer sbs = new StringBuffer(1001);
System.out.println(sbs.capacity());
sbs.append("abc");
System.out.println(sbs.capacity());
sbs.trimToSize();
System.out.println(sbs.capacity());
StringBuffer mc = new StringBuffer();
mc.append("durga").append("solution").insert(10,"heloo").reverse().delete(0, 4);
System.out.println(mc);
	}

}
