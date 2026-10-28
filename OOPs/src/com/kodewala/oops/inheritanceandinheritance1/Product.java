package com.kodewala.oops.inheritanceandinheritance1;

public class Product {

	private String productId;
	private String productName;
	private double price;
	private int quantity;
	
	Product(String productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		
	}
	//Getter
	public String getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	//Setter
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
	        System.out.println(this.price);
		}
		else {
			throw new IllegalArgumentException("Price can not be Negative");
		}
	}
	
	public void setQuantity(int quantity) {
		if(quantity >= 0) {
			this.quantity = quantity;
	        System.out.println(this.quantity);
		}
		else {
			throw new IllegalArgumentException("Quantity can not be Negative");
		}
	}
	public double calculateTotalValue() {
		return price * quantity;
	}
	
	public void displayDetails() {
		System.out.println("The Product Id: "+productId);
		System.out.println("The Product Name: "+productName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
	}
}
