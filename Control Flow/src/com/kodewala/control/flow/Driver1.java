package com.kodewala.control.flow;
import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product amount: ");
        double amount = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter card type: ");
        String cardType = sc.nextLine();

        if (amount < 0) {
            System.out.println("Amount should not be negative.");
        }

        else {
            FlipkartDiscount obj =
                new FlipkartDiscount(amount, cardType);

            obj.calculateDiscount();

            obj.displayBill();
        }

        sc.close();
    }
}