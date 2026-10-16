package com.kodewala.oops.inheritance2;

public class CashPayment extends Payment{
	double cashReceived;

	CashPayment(String transactionId, double amount, double cashReceived) {
		super(transactionId, amount);
		this.cashReceived = cashReceived;
	}
	@Override
	public void processPayment() {
		if (cashReceived >= amount) {
		    System.out.println("Payment successful");

		    double change = cashReceived - amount;
		    System.out.println("Return change: " + change);

		} else {
		    System.out.println("Insufficient cash");
		}
	}
	

}
