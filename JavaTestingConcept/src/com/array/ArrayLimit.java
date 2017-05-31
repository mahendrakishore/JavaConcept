package com.array;

public class ArrayLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(new int[][][]{{{10,20,30},{40,50}}});
	}

	public static void sum(int[][][] x){
		int total = 0;
		for(int[][] x1 : x){
			for(int[] x2:x1){
				for (int x3:x2){
					total = total+x3;
					System.out.println(total+"x3 block");
				}
				System.out.println(total+"x2 block");
			}
			System.out.println(total+"x1 block");
		}
		System.out.println(total+"x block");
		
		
	}
}
