package com.kodewala.oops.inheritance.BankAccount;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
		super(accountNumber, accountHolder, balance);
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return (getBalance() * interestRate)/100;
		
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Interest Rate: "+interestRate+ "%");
		System.out.println("Annual Interest: "+calculateInterest());
	}
}
