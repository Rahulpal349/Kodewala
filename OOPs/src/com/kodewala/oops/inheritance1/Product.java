package com.kodewala.oops.inheritance1;

public class Product {
 String productName;
 String description;
 int quantity;
 String colour;
 Product(String productName, String description, int quantity, String colour) {
	super();
	this.productName = productName;
	this.description = description;
	this.quantity = quantity;
	this.colour = colour;

 }
 public void displayDetails() {
	 System.out.println("Product Name: "+productName);
	 System.out.println("Product Description: " +description);
	 System.out.println("Product Quantity: " +quantity);
	 System.out.println("Product Colour: " +colour);
 }
}
