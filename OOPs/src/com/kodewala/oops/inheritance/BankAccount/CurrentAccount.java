package com.kodewala.oops.inheritance.BankAccount;

public class CurrentAccount extends BankAccount {
	private double overdraftLimit;

	CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
		super(accountNumber, accountHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}
@Override
public void doWithdraw(double amount) {
	if(amount>0 && amount<=getBalance() + overdraftLimit) {
		changeBalance(-amount);
		System.out.println("Amount Withdrawn: "+amount);
		System.out.println("Current Balance: "+getBalance());
	}
	else {
		System.out.println("Invaild amount or overdraft limit exceeed");
	}
}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Overdraft Limit: "+overdraftLimit);
	}
}
