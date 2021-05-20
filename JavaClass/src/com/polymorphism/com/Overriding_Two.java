package com.polymorphism.com;

public class Overriding_Two extends Overriding {
	private void account_Name() {
		System.out.println("Accountant Name is suresh");
	}
	@Override
	public void accountNumber() {
		System.out.println("Your Account Number is 7689798797667");
		
	}
	public static void main(String[] args) {
		
		Overriding_Two R=new Overriding_Two();
		R.account_Name();
		R.accountNumber();
		R.accountInterest();
				
	}
	
}
