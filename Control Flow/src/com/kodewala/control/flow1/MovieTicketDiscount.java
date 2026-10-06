package com.kodewala.control.flow1;

import java.util.Scanner;

public class MovieTicketDiscount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter Ticket Amount: ");
	double ticketAmount = scanner.nextDouble();
	
	System.out.println("Enter Customar Type like Student/ Senior/Regular");
	String customerType = scanner.next();
	
	scanner.close();

	double discount= calculateDiscount(ticketAmount, customerType);
	double finalAmount = ticketAmount - discount;
	
	System.out.println("Discount: "+discount);
	System.out.println("Final Amount: "+finalAmount);
	}
	
	public static double calculateDiscount(double ticketAmount, String customerType) {
		
		if(ticketAmount<500) {
			return 0;
		}
		double discount =0;
		
		switch (customerType) {
		case "Student":
			discount = ticketAmount * 0.15;
			break;

		case "Senior":
			discount = ticketAmount * 0.20;
			break;
			
		case "Regular":
			discount = ticketAmount * 0.05;
			break;
			
		default:
			System.out.println("Invalid Type You Entered. Please Check the Customar Type.");
			break;
		}
		if (discount > 1000) {
			discount = 1000;
			
	}
		return discount;
	}

}
