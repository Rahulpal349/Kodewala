package com.kodewala.oops.inheritance1;

public class Vehicle {
	String brand;
	int speed;

	Vehicle(String brand, int speed) {
		super();
		this.brand = brand;
		this.speed = speed;
	}

public void start() {
	System.out.println(brand+ " is starting...");
}
	public void displayDetails() {
		System.out.println("Brand Name: "+brand);
		System.out.println("Speed: "+speed+ " km/h");
	}
}
