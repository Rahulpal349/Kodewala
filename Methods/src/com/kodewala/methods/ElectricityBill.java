package com.kodewala.methods;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Total Unit");
		double unit = sc.nextDouble();

		sc.close();

		ElectricityBill elec = new ElectricityBill(); //Object Creating (Reason:Instance Variable)
		double bill = elec.calculateBill(unit);
		System.out.println("Total Bill: " + bill);

	}

	 double calculateBill(double unit) //Instance Variable
	 {

		double bill;

		if (unit <= 100) {
			bill = unit * 5;
		} else if (unit <= 200) {
			bill = (100 * 5) + ((unit - 100) * 7);
		} else {
			bill = (100 * 5) + (100 * 7) + ((unit - 200) * 10);

		}
		return bill;
	}

}
