package com.kodewala.objects;

public class AccountDriver {

	public static void main(String[] args) {
		Account acc1 = new Account("98645645");
		Account acc2 = new Account("4684554");
		
		System.out.println("Staring");

		acc1.displayData();
		acc2.displayData();

	}

}
