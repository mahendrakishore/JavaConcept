package com.lang;

public class InternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s1 = "durga";
String s2 = new String("durga");
String s3 = s2.intern();
System.out.println(s1==s3);
System.out.println(s2==s3);
*/
String si1 = new String("durga");
String si2 = si1.concat(" software");
String si3 = si2.intern();
System.out.println(si2==si3);
String si4 = "durga software";
System.out.println(si4==si3);
	}

}
