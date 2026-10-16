package com.kodewala.oops.inheritance2;

public class CardPayment extends Payment {
	String cardHolderName;
	String lastFourDigits;

	CardPayment(String transactionId, double amount, String cardHolderName, String lastFourDigits) {
		super(transactionId, amount);
		this.cardHolderName = cardHolderName;
		this.lastFourDigits = lastFourDigits;
	}

	public void processPayment() {
		System.out.println("Payment through the Card.");
	}

	public void displayDetails() {

		super.displayDetails();
		System.out.println("Card Holder Name: "+cardHolderName);
		System.out.println("Last Four Digit of Card: "+lastFourDigits);
	}
}
