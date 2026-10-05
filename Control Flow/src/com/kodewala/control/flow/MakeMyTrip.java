package com.kodewala.control.flow;

public class MakeMyTrip {

	public double calculateDiscount(double totalFare) {

		double discount = 0;
		if (totalFare <= 5000) // For fare of 5000 or below
		{
			discount = 0;
		}

		else if (totalFare <= 10000) // For fare above 5000 and up to 10000
		{
			discount = totalFare * 10 / 100;
		}

		else // For fare above 10000
		{
			discount = totalFare * 15 / 100;
		}

		if (discount > 1250) // Maximum discount 1250
		{
			discount = 1250;
		}

		return discount;
	}
}
