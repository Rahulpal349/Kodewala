package com.kodewala.oops.inheritance2;

public class UPIPayment extends Payment{
	String upiId;

	UPIPayment(String transactionId, double amount, String upiId) {
		super(transactionId, amount);
		this.upiId = upiId;
	}
	public void processPayment() {
		System.out.println("Payment through the UPI: "+upiId);
	}
	public void displayDetails() {
		super.displayDetails();
	}
}


