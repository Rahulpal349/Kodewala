package com.kodewala.constructor1;

public class Mobile {
	
	String brand;
	String model;
	double price;
	int ram;
	
	Mobile(String _brand, String _model, double _price, int _ram) {
		this.brand = _brand;
		this.model = _model;
		this.price = _price;
		this.ram = _ram;
	}
	void displayDetails(){
			System.out.println("Brand: " +brand);
			System.out.println("Model: "+model);
			System.out.println("Price: "+price);
			System.out.println("ram: " +ram);
			
	}
}
