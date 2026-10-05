package com.kodewala.control.flow;

import java.util.Scanner;

public class Driver4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rental amount: ");
		double rentalAmount = sc.nextDouble();

		sc.nextLine();

		System.out.println("Our Car Type Option: HATCHBACK/ SEDAN /SUV.");
		System.out.print("Enter car type: ");
		String carType = sc.nextLine();
		System.out.println("Our Membership Type Option: SILVER/ GOLD /NONE.");
		System.out.print("Enter membership type: ");
		String membership = sc.nextLine();

		if (rentalAmount < 0) {

			System.out.println("Amount should not be negative.");

		}

		else {

			CarRentalDiscount obj = new CarRentalDiscount(rentalAmount, carType, membership);

			obj.calculateDiscount();

			obj.displayBill();

		}

		sc.close();

	}
}