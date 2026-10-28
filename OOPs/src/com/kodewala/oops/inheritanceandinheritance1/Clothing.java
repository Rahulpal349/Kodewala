package com.kodewala.oops.inheritanceandinheritance1;

public class Clothing extends Product {
	private String size;
	private String material;
	
	Clothing(String productId, String productName, double price, int quantity, String size, String material) {
		super(productId, productName, price, quantity);
		this.size = size;
		this.material = material;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Size: "+size);
		System.out.println("Material: "+material);
	}
	
}
