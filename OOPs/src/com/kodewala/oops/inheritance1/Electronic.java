package com.kodewala.oops.inheritance1;

public class Electronic extends Product {
	boolean isWarrenty;
	int isWarrentyYear;

	Electronic(String productName, String description, int quantity, String colour, boolean isWarrenty,
			int isWarrentyYear) {
		super(productName, description, quantity, colour);
		this.isWarrenty = isWarrenty;
		this.isWarrentyYear = isWarrentyYear;
	}

	public void displayDetails() {
		 System.out.println(productName);
		 System.out.println(description);
		 System.out.println(quantity);
		 System.out.println(colour);
		System.out.println(isWarrenty);
		System.out.println(isWarrentyYear);
	}

}
