package com.kodewala.oops.inheritance.BankAccount;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	BankAccount(String accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public void doDeposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit Ammout: " + amount);
			System.out.println("Current Balance: " + balance);
		} else {
			System.err.println("Enter a vaild amount.");
		}
	}

	public void doWithdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawl Ammout: " + amount);
			System.out.println("Current Balance: " + balance);
		} else {
			System.err.println("Invaild amount or Insufficient balance.");
		}
	}

	public double getBalance() {
		return balance;
	}

	protected void changeBalance(double amount) {
		balance = balance + amount;
	}

	public void displayDetails() {
		System.out.println("Account Holder Name: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
	}
}
