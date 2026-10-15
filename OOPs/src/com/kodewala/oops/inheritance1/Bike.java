package com.kodewala.oops.inheritance1;

public class Bike extends Vehicle{
	boolean hasCarrier;

	Bike(String brand, int speed, boolean hasCarrier) {
		super(brand, speed);
		this.hasCarrier = hasCarrier;
	}
	public void kickStart() {
		System.out.println("Bike is kick-started.");
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Has Carrier: "+hasCarrier);
		
	}
}
