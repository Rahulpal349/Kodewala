package com.kodewala.oops.inheritance1;

public class VehicleDriver {

	public static void main(String[] args) {
		Car car = new Car("Hyunai", 180, 4);
		System.out.println("===Car Details===");
		car.start();
		car.displayDetails();
		car.playMusic();
		System.out.println(" ");

		Bike bike = new Bike("Royel Enfield", 120, true);
		System.out.println("===Bike Details===");
		bike.start();
		bike.displayDetails();
		bike.kickStart();

	}

}
