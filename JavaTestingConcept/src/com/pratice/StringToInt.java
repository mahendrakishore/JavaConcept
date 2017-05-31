package com.pratice;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String intstring = "123456";
System.out.println("string before conversion = "+intstring);
int output = stringToint(intstring);
System.out.println("int value as output = "+output);

	}

	 static int stringToint(String str) {
		// TODO Auto-generated method stub
		 int i = 0 , number = 0;
		 boolean isNegative = false;
		 int len = str.length();
		 if (str.charAt(0)=='-'){
			 isNegative = true;
		 }
		 while(i<len){
			 number*=10;
			 number+=(str.charAt(i++)-'0');
			// number+=str.charAt(i++);
		 }
		 if(isNegative)
			 number = -number;
			 return number;
		 
	}

}
