package com.kodewala.oops.inheritance1;

public class EmployeeDriver {

	public static void main(String[] args) {
		Manager manager1 = new Manager("Mita", "ABC1425", 69999, "SDE");
		Manager manager2 = new Manager("Gita", "ABC1549", 39999, "Tester");
		Manager manager3 = new Manager("Sita", "ABC1415", 29999, "Junior Developer");
		Manager manager4 = new Manager("Babita", "ABC1895", 9999, "Intern");
		manager1.displayDetails();
		System.out.println("====================");
		manager2.displayDetails();
		System.out.println("====================");
		manager3.displayDetails();
		System.out.println("====================");
		manager4.displayDetails();
		

	}

}
