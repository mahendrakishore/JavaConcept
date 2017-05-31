package com.pratice;

public class CommonElements {
	
	int[] a = {4,7,3,2,9};
	int[] b = {1,4,6,9,9,0,6};

	public void common(int[] x , int[] y){
		for(int i = 0 ; i<x.length;i++){
			for(int j = 0 ;j<y.length;j++){
				if(x[i]==y[j]){
					System.out.println("common elements = "+x[i]);
				}
				
				}
			}
		}
	}

