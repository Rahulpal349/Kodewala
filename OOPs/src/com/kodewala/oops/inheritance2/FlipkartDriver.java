package com.kodewala.oops.inheritance2;

public class FlipkartDriver {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("ORD165185", "Iphone 18", "Kolkata,700102", "#INV2684", "12.10.2026");
		System.out.println("Full Order Details:");
		System.out.println("===================");
		invoice.displayDetails();
	}

}
