package com.kodewala.oops.encapsulation;

public class FundTransfer {

	private String accountHolderName;
	private String accountNumber;
	private int balance;

	FundTransfer(String _accountHolderName, String _accountNumber, int _balance) {
		
		this.accountHolderName = _accountHolderName;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
	}

	public void doDebit(int _amount) {
		if (_amount > balance && _amount>0) {
			// modifying the data
			balance = balance - _amount;
			System.out.println("Amount Debited: " + _amount);
			System.out.println("Now Current Balance: " + getBalance());
		} else {
			System.err.println("Entered amount out of Balance");
		}
	}

	public void doCredit(int _amount) {
		if (_amount > 0) {
			// Modifying the data
			balance = balance + _amount;
			System.out.println("Amount Credited: " + _amount);
			System.out.println("Now Current Balance: " + getBalance());
		} else {
			System.err.println("Please Enter a positive Amount");
		}
	}

	public int getBalance() {
		return balance;
	}
	public void doDisplay() {
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
	}
}
