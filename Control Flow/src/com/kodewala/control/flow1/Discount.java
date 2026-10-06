package com.kodewala.control.flow1;

import java.util.Scanner;

public class Discount {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Product Amount: ");
		double amount = scanner.nextDouble();
		
		System.out.println("Enter the Customar Type: ");
		String customarType = scanner.next();
		
		scanner.close();

		double discount = discountApply(amount, customarType);
		double finalAmount = amount - discount;
		
		System.out.println("Discount: " + discount);
		System.out.println("Final Amount: " + finalAmount);
	}

	public static double discountApply(double amount, String customarType) {

		if (amount < 1000) {
			return 0;
		}
		double discount = 0;

		switch (customarType) {

		case "Gold":
			discount = amount * 0.2;
			break;
		case "Silver":
			discount = amount * 0.1;

			break;
		case "Regular":
			discount = amount * 0.05;
			break;

		default:
			System.out.println("Please Right Details.");
			return 0;
		}
		if (discount > 2500) {
			discount = 2500;
		}
		return discount;
	}

}
