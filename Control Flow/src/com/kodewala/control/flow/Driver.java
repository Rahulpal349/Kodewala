package com.kodewala.control.flow;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter your total fare: ");
        double totalFare = scanner.nextDouble();

     
        MakeMyTrip makeMyTrip = new MakeMyTrip();

        
        double discount = makeMyTrip.calculateDiscount(totalFare);

        
        double finalFare = totalFare - discount;

        // Displaying
        System.out.println("Total Fare: ₹" + totalFare);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Fare: ₹" + finalFare);

        scanner.close();
    }
}

