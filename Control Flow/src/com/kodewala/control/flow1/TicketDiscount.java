package com.kodewala.control.flow1;

import java.util.Scanner;

public class TicketDiscount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Ticket Amount: ");
        double ticketAmount = scanner.nextDouble();

        // Check amount before asking customer type
        
        if (ticketAmount < 500) {

            System.out.println("No discount available.");
            System.out.println("Final Amount: " + ticketAmount);

        } else {

            System.out.println("Enter Customer Type like Student/Senior/Regular");
            String customerType = scanner.next();

            double discount = calculateDiscount(ticketAmount, customerType);
            double finalAmount = ticketAmount - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Amount: " + finalAmount);
        }

        scanner.close();
    }

    public static double calculateDiscount(double ticketAmount, String customerType) {

        double discount = 0;

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
            System.out.println("Invalid Type You Entered.");
            return 0;
        }

        // Maximum discount ₹1000
        
        if (discount > 1000) 
        {
            discount = 1000;
        }

        return discount;
    }
}