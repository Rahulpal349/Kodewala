package com.kodewala.oops.inheritance.BankAccount;

public class BankAccountDriver {

	public static void main(String[] args) {
		SavingsAccount sb = new SavingsAccount("312566663", "Raj", 50000, 5);
		CurrentAccount ca = new CurrentAccount("651325115", "Jasraj", 10000, 20000);
		System.out.println("======Savings Account=====");
		sb.displayDetails();

		System.out.println("\n ---- Savings Transactions---");
		sb.doDeposit(5000);
		sb.doWithdraw(10000);
		System.out.println("Updated Savings Balance: " + sb.getBalance());

		System.out.println("======Current Account=====");
		ca.displayDetails();
		System.out.println("\n ---- Current Account Transactions---");
		ca.doWithdraw(25000);
		ca.doWithdraw(10000);
		System.out.println("Final Current Balance: " + ca.getBalance());
	}

}
