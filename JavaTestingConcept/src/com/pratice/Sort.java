package com.pratice;

public class Sort {

	public static void sort(int[] a){
		int temp ;
		for(int i = 0 ; i<a.length;i++){
			for(int j = 0; j<a.length;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i]=a[j];
				}
			}System.out.println(a[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] b = {2,4,7,6,3};
Sort.sort(b);
	}

}
