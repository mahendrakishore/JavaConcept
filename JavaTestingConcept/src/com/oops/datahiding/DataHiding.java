package com.oops.datahiding;

import org.omg.Messaging.SyncScopeHelper;

public class DataHiding {

	private double balance ;
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataHiding dh = new DataHiding();
		dh.setBalance(10.23);
		System.out.println(dh.getBalance());
	}

}
