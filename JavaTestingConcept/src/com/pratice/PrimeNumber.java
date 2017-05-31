package com.pratice;

public class PrimeNumber {
	
	public static void prime(int n)
	{
		
		for (int i = 2 ;i<=n/2;i++){
			if(n%i==0){
				System.out.println("not a prime");
			}
			else {
				System.out.println("number is prime"+n);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(11);

	}

}
