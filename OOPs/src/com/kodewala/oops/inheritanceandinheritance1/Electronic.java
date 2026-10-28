package com.kodewala.oops.inheritanceandinheritance1;

public class Electronic extends Product{

	private String brand;
	private int warrentyYear;
	
	Electronic(String productId, String productName, double price, int quantity, String brand, int warrentyYear) {
		super(productId, productName, price, quantity);
		this.brand = brand;
		this.warrentyYear = warrentyYear;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Brand Name: "+brand);
		System.out.println("Year of Warrenty: "+warrentyYear);
	}
}
