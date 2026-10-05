package com.kodewala.constructor1;

public class BankAccountDriver {

	public static void main(String[] args) {
		BankAccount user1 = new BankAccount("Rahul", 123456789, 10000);
		user1.displayBalance();
		System.out.println("============");
		user1.deposit(5000);
		System.out.println("Current Balance: " + user1.balance);
		System.out.println("============");
		user1.withdraw(3000);
		System.out.println("Current Balance: " + user1.balance);
	}

}
