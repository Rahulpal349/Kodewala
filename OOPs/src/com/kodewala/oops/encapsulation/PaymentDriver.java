package com.kodewala.oops.encapsulation;

public class PaymentDriver {

	public static void main(String[] args) {
		Payment payment = new Payment(10000);
		System.out.println("Current Balance: " + payment.getBalance());
		payment.doCredit(200);
		System.out.println("Current Balance: " + payment.getBalance());
		payment.doDebit(500);
		System.out.println("Current Balance: " + payment.getBalance());
	}
}
