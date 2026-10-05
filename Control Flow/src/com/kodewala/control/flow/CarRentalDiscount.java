package com.kodewala.control.flow;

public class CarRentalDiscount {
	double rentalAmount;
	String carType;
	String membership;

	double carDiscount;
	double membershipDiscount;

	CarRentalDiscount(double _rentalAmount, String _carType, String _membership) {
		this.rentalAmount = _rentalAmount;
		this.carType = _carType;
		this.membership = _membership;
	}

	void calculateDiscount() {
		if (rentalAmount < 0) {
			System.out.println("Amount should not be negative.");
		} else if (rentalAmount <= 5000) {
			carDiscount = 0;
			membershipDiscount = 0;
		} else if (rentalAmount > 5000 && rentalAmount <= 10000) {
			if (carType.equals("HATCHBACK")) {

				carDiscount = rentalAmount * 5 / 100;

			}

			else if (carType.equals("SEDAN")) {

				carDiscount = rentalAmount * 7 / 100;

			}

			else if (carType.equals("SUV")) {

				carDiscount = rentalAmount * 10 / 100;

			}

			else {

				System.out.println("Invalid car type");
				return;

			}

			// Membership Discount

			double amountAfterCarDiscount = rentalAmount - carDiscount;

			if (membership.equals("SILVER")) {

				membershipDiscount = amountAfterCarDiscount * 3 / 100;

			}

			else if (membership.equals("GOLD")) {

				membershipDiscount = amountAfterCarDiscount * 5 / 100;

			}

			else if (membership.equals("NONE")) {

				membershipDiscount = 0;

			}

			else {

				System.out.println("Invalid membership type");
				return;

			}

		}

		// ₹10,000 - ₹20,000
		else if (rentalAmount > 10000 && rentalAmount <= 20000) {

			// Car Discount

			if (carType.equals("HATCHBACK")) {

				carDiscount = rentalAmount * 8 / 100;

			}

			else if (carType.equals("SEDAN")) {

				carDiscount = rentalAmount * 10 / 100;

			}

			else if (carType.equals("SUV")) {

				carDiscount = rentalAmount * 12 / 100;

			}

			else {

				System.out.println("Invalid car type");
				return;

			}

			// Membership Discount

			double amountAfterCarDiscount = rentalAmount - carDiscount;

			if (membership.equals("SILVER")) {

				membershipDiscount = amountAfterCarDiscount * 5 / 100;

				if (membershipDiscount > 500) {

					membershipDiscount = 500;

				}

			}

			else if (membership.equals("GOLD")) {

				membershipDiscount = amountAfterCarDiscount * 7 / 100;

				if (membershipDiscount > 1000) {

					membershipDiscount = 1000;

				}

			}

			else if (membership.equals("NONE")) {

				membershipDiscount = 0;

			}

			else {

				System.out.println("Invalid membership type");
				return;

			}

		}

		// Above ₹20,000
		else {

			// Car Discount

			if (carType.equals("HATCHBACK")) {

				carDiscount = rentalAmount * 10 / 100;

			}

			else if (carType.equals("SEDAN")) {

				carDiscount = rentalAmount * 12 / 100;

			}

			else if (carType.equals("SUV")) {

				carDiscount = rentalAmount * 15 / 100;

			}

			else {

				System.out.println("Invalid car type");
				return;

			}

			// Membership Discount

			double amountAfterCarDiscount = rentalAmount - carDiscount;

			if (membership.equals("SILVER")) {

				membershipDiscount = amountAfterCarDiscount * 5 / 100;

				if (membershipDiscount > 750) {

					membershipDiscount = 750;

				}

			}

			else if (membership.equals("GOLD")) {

				membershipDiscount = amountAfterCarDiscount * 10 / 100;

				if (membershipDiscount > 2000) {

					membershipDiscount = 2000;

				}

			}

			else if (membership.equals("NONE")) {

				membershipDiscount = 0;

			}

			else {

				System.out.println("Invalid membership type");
				return;

			}

		}

	}

	// Total Discount
	double getTotalDiscount() {

		return carDiscount + membershipDiscount;

	}

	// Final Amount
	double getFinalAmount() {

		return rentalAmount - getTotalDiscount();

	}

	// Display Bill
	void displayBill() {

		System.out.println();
		System.out.println("========== CAR RENTAL BILL ==========");

		System.out.println("Rental Amount        : ₹" + rentalAmount);
		System.out.println("Car Type             : " + carType);
		System.out.println("Membership           : " + membership);

		System.out.println("-------------------------------------");

		System.out.println("Car Discount         : ₹" + carDiscount);
		System.out.println("Membership Discount  : ₹" + membershipDiscount);

		System.out.println("-------------------------------------");

		System.out.println("Total Discount       : ₹" + getTotalDiscount());
		System.out.println("Final Amount         : ₹" + getFinalAmount());

		System.out.println("=====================================");

	}
}
