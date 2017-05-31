package com.home.flowcontrol.itarativestatments.forloop;

public class ForEachLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] x={{10,20,30},{40,50,60}};
for(int[] r : x){
	for(int c : r){
		System.out.println(c);
	}
}
	}

}
