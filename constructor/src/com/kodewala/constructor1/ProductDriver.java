package com.kodewala.constructor1;

public class ProductDriver {

	public static void main(String[] args) {

		Product case1 = new Product("iPhone 16", 79999, "Apple iPhone 16 with A17 Processor", 5);
		Product case2 = new Product("iPhone 16", "Apple iPhone 16 with A17 Processor");
		Product case3 = new Product();
		System.out.println("Product Name: " + case1.name + " ProductPrice: " + case1.price + " Product Description: "
				+ case1.description + " Product Quantity: " + case1.quantity);
		System.out.println("Product Name: " + case2.name + " Product Description: " + case2.description);
		System.out.println("Product Name: " + case3.name + " ProductPrice: " + case3.price + " Product Description: "
				+ case3.description + " Product Quantity: " + case3.quantity);
	}

}
