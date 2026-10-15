package com.kodewala.oops.inheritance1;

public class Clothing extends Product {
	String metrialType;
	String size;

	Clothing(String productName, String description, int quantity, String colour, String metrialType, String size) {
		super(productName, description, quantity, colour);
		this.metrialType = metrialType;
		this.size = size;
	}

	public void displayDetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(colour);
		System.out.println(metrialType);
		System.out.println(size);
	}

}
