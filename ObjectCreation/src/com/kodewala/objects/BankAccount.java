package com.kodewala.objects;

public class BankAccount {


    static String bankName1 = "State Bank";

    int balance1 = 1000;

    // Static initialization block
    static {
        System.out.println("Bank system initialized");
    }

    // Instance initialization block
    {
        balance1 += 500;
        System.out.println("Initial balance: " + balance1);
    }

    // Instance method
    void displayBalance() {
        System.out.println(bankName1 + " - Final balance: " + balance1);
    }
    static String bankName = "State Bank";

    int balance = 1000;

    // Static initialization block
    static {
        System.out.println("Bank system initialized");
    }

    // Instance initialization block
    {
        balance1 += 500;
        System.out.println("Initial balance: " + balance1);
    }

    // Constructor
    BankAccount(int deposit) {
        balance1 += deposit;
    }

    // Instance method
    void displayBalance1() {
        System.out.println(bankName1 + " - Final balance: " + balance1);
    }
	public static void main(String[] args) {
		 BankAccount account1 = new BankAccount(200);
	        BankAccount account2 = new BankAccount(500);

	        account1.displayBalance();
	        account2.displayBalance();
	}

}
