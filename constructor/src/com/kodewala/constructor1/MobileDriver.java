package com.kodewala.constructor1;

public class MobileDriver {

	public static void main(String[] args) {

		Mobile mob1 = new Mobile("Samsung", "Galaxy S24",75000, 8);
		Mobile mob2 = new Mobile(" OnePlus", "Nord 4",30000.0, 12);
		Mobile mob3 = new Mobile("iQOO", "Z9",20000.0, 8);
		
		mob1.displayDetails();

		System.out.println();

		mob2.displayDetails();

		System.out.println();
		
		mob3.displayDetails();
	}

}
