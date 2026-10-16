package com.kodewala.oops.inheritance2;

public class Payment {

	String transactionId;
	double amount;
	Payment(String transactionId, double amount) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
	}
	public void processPayment() {
		System.out.println("Payment Processing");
	}
	public void displayDetails() {
		System.out.println("Transaction Id: "+transactionId);
		System.out.println("Transaction amount: "+amount);
	}
}
