package com.variable;

public class Variable2 {

	static  int x  = 10;
	int y = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variable2  var = new Variable2();
		var.x = 888;
		var.y = 999;
		Variable2 var2 = new Variable2();
		System.out.println(var2.x+" "+var2.y);
	}

}
