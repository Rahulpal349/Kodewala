package com.kodewala.control.flow;

import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter booking amount: ");
		double roomPrice = sc.nextDouble();

		sc.nextLine();

		System.out.print("Enter room type: ");
		String roomType = sc.nextLine();

		System.out.print("Enter membership type: ");
		String membershipType = sc.nextLine();

		if (roomPrice < 0) {

			System.out.println("Amount should not be negative.");

		}

		else {

			HotelDiscount obj = new HotelDiscount(roomPrice, roomType, membershipType);

			obj.calculateDiscount();

			obj.displayBill();
		}

		sc.close();
	}
}