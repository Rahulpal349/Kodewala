package com.kodewala.oops.inheritance1;

public class ProductDriver {

	public static void main(String[] args) {
		
		Product product = new Product("T-Shirt", "This is a T-shirt by Puma", 5, "Black");
		product.displayDetails();
		
		System.out.println("-------------------------------");
		System.out.println("Actual Clothes Product Details: ");
		System.out.println("-------------------------------");
		Clothing clothing = new Clothing("T-Shirt", "This is a T-shirt by Puma", 5, "Black", "Cotton", "L");
		clothing.displayDetails();
		
		System.out.println("-----------------------------------");
		System.out.println("Actucal Elcetronic Product Details: ");
		System.out.println("-----------------------------------");
		Electronic ep = new Electronic("Iphone 128", "This is an iphone by Apple",5, "Orange",true,2);
		ep.displayDetails();
		
	}
}
