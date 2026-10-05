package com.kodewala.constructor1;

public class Product {

	String name;
	double price;
	String description;
	int quantity;
	
	Product(String _name, double _price, String _description, int _quantity) {
		this.name = _name;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
		
	}

	Product(String name, String description) {
		this.name = name;
		this.description = description;
	}

	Product() {
		
	}
	
}
