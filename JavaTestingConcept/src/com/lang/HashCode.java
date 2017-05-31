package com.lang;

public class HashCode {
 int i ;
 
 HashCode(int i) {
	 this.i = i;
 }
/*public String toString(){
	return getClass().getName()+"..."+Integer.toHexString(i);
}*/
 public int hashCode(){
	 return i;
 } 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashCode s = new HashCode(10);
		HashCode s1 = new HashCode(11);
		HashCode s2 = new HashCode(13);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}

}
