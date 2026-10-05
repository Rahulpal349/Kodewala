package com.kodewala.control.flow;

public class HotelDiscount {

	double roomPrice;
	String roomType;
	String membershipType;

	double roomDiscount = 0;
	double membershipDiscount = 0;

	HotelDiscount(double _roomPrice, String _roomType, String _membershipType){
		this.roomPrice = _roomPrice;
		this.roomType = _roomType;
		this.membershipType = _membershipType;
	}

	void calculateDiscount() {

		if (roomPrice < 0) {
			System.out.println("Amount should not be negative.");
		} else if (roomPrice <= 5000) {
			roomDiscount = 0;
			membershipDiscount = 0;
		}

		// ₹5,000 - ₹10,000
		else if (roomPrice > 5000 && roomPrice <= 10000) {

			// Room Discount
			if (roomType.equals("DELUXE")) {
				roomDiscount = roomPrice * 5 / 100;
			}

			else if (roomType.equals("PREMIUM")) {
				roomDiscount = roomPrice * 7 / 100;
			}

			else if (roomType.equals("SUITE")) {
				roomDiscount = roomPrice * 10 / 100;
			}

			else {
				System.out.println("Invalid room type");
				return;
			}

			// Membership Discount
			double afterRoomDiscount = roomPrice - roomDiscount;

			if (membershipType.equals("GOLD")) {
				membershipDiscount = afterRoomDiscount * 3 / 100;
			}

			else if (membershipType.equals("PLATINUM")) {
				membershipDiscount = afterRoomDiscount * 5 / 100;
			}

			else if (membershipType.equals("NONE")) {
				membershipDiscount = 0;
			}

			else {
				System.out.println("Invalid membership type");
				return;
			}
		}

		// ₹10,000 - ₹20,000
		else if (roomPrice > 10000 && roomPrice <= 20000) {

			// Room Discount
			if (roomType.equals("DELUXE")) {
				roomDiscount = roomPrice * 8 / 100;
			}

			else if (roomType.equals("PREMIUM")) {
				roomDiscount = roomPrice * 10 / 100;
			}

			else if (roomType.equals("SUITE")) {
				roomDiscount = roomPrice * 12 / 100;
			}

			else {
				System.out.println("Invalid room type");
				return;
			}

			// Membership Discount
			double afterRoomDiscount = roomPrice - roomDiscount;

			if (membershipType.equals("GOLD")) {

				membershipDiscount = afterRoomDiscount * 5 / 100;

				if (membershipDiscount > 500) {
					membershipDiscount = 500;
				}
			}

			else if (membershipType.equals("PLATINUM")) {

				membershipDiscount = afterRoomDiscount * 7 / 100;

				if (membershipDiscount > 1000) {
					membershipDiscount = 1000;
				}
			}

			else if (membershipType.equals("NONE")) {
				membershipDiscount = 0;
			}

			else {
				System.out.println("Invalid membership type");
				return;
			}
		}

		// Above ₹20,000
		else {

			// Room Discount
			if (roomType.equals("DELUXE")) {
				roomDiscount = roomPrice * 10 / 100;
			}

			else if (roomType.equals("PREMIUM")) {
				roomDiscount = roomPrice * 12 / 100;
			}

			else if (roomType.equals("SUITE")) {
				roomDiscount = roomPrice * 15 / 100;
			}

			else {
				System.out.println("Invalid room type");
				return;
			}

			// Membership Discount
			double afterRoomDiscount = roomPrice - roomDiscount;

			if (membershipType.equals("GOLD")) {

				membershipDiscount = afterRoomDiscount * 5 / 100;

				if (membershipDiscount > 750) {
					membershipDiscount = 750;
				}
			}

			else if (membershipType.equals("PLATINUM")) {

				membershipDiscount = afterRoomDiscount * 10 / 100;

				if (membershipDiscount > 2000) {
					membershipDiscount = 2000;
				}
			}

			else if (membershipType.equals("NONE")) {
				membershipDiscount = 0;
			}

			else {
				System.out.println("Invalid membership type");
				return;
			}
		}
	}

	double getTotalDiscount() {
		return roomDiscount + membershipDiscount;
	}

	double getFinalAmount() {
		return roomPrice - getTotalDiscount();
	}

	void displayBill() {

		System.out.println();
		System.out.println("========== HOTEL BILL ==========");

		System.out.println("Booking Amount       : ₹" + roomPrice);
		System.out.println("Room Type            : " + roomType);
		System.out.println("Membership           : " + membershipType);

		System.out.println("--------------------------------");

		System.out.println("Room Discount        : ₹" + roomDiscount);
		System.out.println("Membership Discount  : ₹" + membershipDiscount);

		System.out.println("--------------------------------");

		System.out.println("Total Discount       : ₹" + getTotalDiscount());
		System.out.println("Final Amount         : ₹" + getFinalAmount());

		System.out.println("==================================");
	}
}
