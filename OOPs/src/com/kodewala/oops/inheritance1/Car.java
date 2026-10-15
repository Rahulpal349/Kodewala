package com.kodewala.oops.inheritance1;

public class Car extends Vehicle {
	int numberOfDoor;

	Car(String brand, int speed, int numberOfDoor) {
		super(brand, speed);
		this.numberOfDoor = numberOfDoor;
	}

	public void playMusic() {
		System.out.println("Car music system is playing");
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number of Doors: "+numberOfDoor);
	}
}
