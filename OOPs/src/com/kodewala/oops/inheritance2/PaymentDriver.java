package com.kodewala.oops.inheritance2;

public class PaymentDriver {

	public static void main(String[] args) {
		UPIPayment upi = new UPIPayment("UPI101",1500, "rahulpal3491@upi");
		CardPayment cp = new CardPayment("CARD102", 2500, "Rahul Pal", "1570");
		CashPayment cpt = new CashPayment("CASH103", 800, 1000);
		
		System.out.println("Total UPI Payment:");
		System.out.println("===================");
		upi.processPayment();
		upi.displayDetails();

		System.out.println("");
		System.out.println("Total Card Payment:");
		System.out.println("===================");
		cp.processPayment();
		cp.displayDetails();
		
		System.out.println("");
		System.out.println("Total Cash Payment:");
		System.out.println("===================");
		cpt.processPayment();
		cpt.displayDetails();
	}

}
