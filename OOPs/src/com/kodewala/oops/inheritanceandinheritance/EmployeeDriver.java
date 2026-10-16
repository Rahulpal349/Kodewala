package com.kodewala.oops.inheritanceandinheritance;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp = new Employee("Rahul", "101", 25000);
		System.out.println("=== Employee Details ===");
		emp.displayDetails();
		System.out.println();

		Developer dev = new Developer("Amit", "102", 40000, "Java");

		System.out.println("=== Developer Details ===");
		dev.displayDetails();

		System.out.println();

		// Access fields through getters
		System.out.println("Developer Name: " + dev.getName());

		// Update salary through setter
		dev.setSalary(45000);

		System.out.println("Updated Salary: " + dev.getSalary());
	}
}
