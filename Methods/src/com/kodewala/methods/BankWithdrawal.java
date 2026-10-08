package com.kodewala.methods;

import java.util.Scanner;

public class BankWithdrawal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Balance: ");
		double balance = scanner.nextDouble();
		System.out.println("Enter Withdrawal Amount: ");
		double amount = scanner.nextDouble();

		scanner.close();
		double newBalance = withdraw(balance, amount);
		System.out.println("Remaining Balance: " + newBalance);
	}

	public static double withdraw(double balance, double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount.");
			return balance;
		}
		if (amount > balance) {
			System.out.println("Insufficient balance.");
			return balance;

		}
		double newBalance = balance - amount;
		if (newBalance < 500) {
			System.out.println("Minimum balance of ₹500 must be maintained.");
			return balance;
		}
		return newBalance;

	}
}
