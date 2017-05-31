package com.pratice;

public class Ditinct {
	
	int[] num = {3,5,6,7,7,6,8,9};
	public void disctinct(int[] in){
		boolean isDuplicate = false;
	for(int i = 0;i<in.length;i++){
		for(int j=0;j<i;j++){
			if (num[i]==num[j]){
				isDuplicate = true;
				break;
			}
		}
			if(!isDuplicate){
				System.out.println(num[i]);
		
		}
	}
	}

}
