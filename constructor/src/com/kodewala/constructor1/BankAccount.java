package com.kodewala.constructor1;

public class BankAccount {

	String accountHolder;
	long accountNumber;
	double balance;

	BankAccount(String _accountHolder, long _accountNumber, double _balance) {
		this.accountHolder = _accountHolder;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
	}

	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited: "+amount);
		} else {
			System.out.println("Invaild Amount Deposit");
		}
	}

	void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawled: "+amount);
		} else {
			System.out.println("Insufficient balance or invalid amount");
		}

	}

	void displayBalance() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Current Balance: " + balance);
	}

}
