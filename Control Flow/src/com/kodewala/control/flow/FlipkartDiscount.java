package com.kodewala.control.flow;

public class FlipkartDiscount {

    double amount;
    String cardType;

    double discount = 0;
    double cashback = 0;

    FlipkartDiscount(double amount, String cardType) {
        this.amount = amount;
        this.cardType = cardType;
    }

    void calculateDiscount() {

        if (amount < 0) {
            System.out.println("Amount should not be negative.");
        }

        else if (amount <= 5000) {
            discount = 0;
            cashback = 0;
        }

        // ₹5,000 - ₹10,000
        else if (amount > 5000 && amount <= 10000) {

            if (cardType.equals("SBI CC")) {
                discount = amount * 7.5 / 100;
            }

            else if (cardType.equals("AXIS CC")) {
                discount = amount * 10 / 100;
            }

            else if (cardType.equals("SBI CASHBACK CC")) {
                discount = amount * 7.5 / 100;
                cashback = (amount - discount) * 5 / 100;

                if (cashback > 250) {
                    cashback = 250;
                }
            }

            else {
                System.out.println("Invalid card type");
            }
        }

        // ₹10,000 - ₹20,000
        else if (amount > 10000 && amount <= 20000) {

            if (cardType.equals("SBI CC")) {
                discount = amount * 10 / 100;
            }

            else if (cardType.equals("SBI CASHBACK CC")) {

                discount = amount * 10 / 100;

                cashback = (amount - discount) * 5 / 100;

                if (cashback > 250) {
                    cashback = 250;
                }
            }

            else if (cardType.equals("AXIS CC")) {
                System.out.println("Invalid card type");
            }

            else {
                System.out.println("Invalid card type");
            }
        }

        // Above ₹20,000
        else {

            if (cardType.equals("AXIS CC")) {
                discount = amount * 15 / 100;
            }

            else if (cardType.equals("SBI CC")) {
                discount = amount * 15 / 100;
            }

            else if (cardType.equals("SBI CASHBACK CC")) {

                discount = amount * 15 / 100;

                cashback = (amount - discount) * 5 / 100;

                if (cashback > 500) {
                    cashback = 500;
                }
            }

            else {
                System.out.println("Invalid card type");
            }
        }
    }

    double getTotalDiscount() {
        return discount + cashback;
    }

    double getFinalAmount() {
        return amount - getTotalDiscount();
    }

    void displayBill() {

        System.out.println("\n========== FLIPKART BILL ==========");
        System.out.println("Product Amount : ₹" + amount);
        System.out.println("Card Type      : " + cardType);
        System.out.println("-----------------------------------");
        System.out.println("Card Discount  : ₹" + discount);
        System.out.println("Cashback       : ₹" + cashback);
        System.out.println("-----------------------------------");
        System.out.println("Total Discount : ₹" + getTotalDiscount());
        System.out.println("Final Amount   : ₹" + getFinalAmount());
        System.out.println("===================================");
    }
}