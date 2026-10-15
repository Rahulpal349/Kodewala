package com.kodewala.oops.inheritance1;

public class Employee {
	String name;
	String employeeId;
	int salary;

	Employee(String name, String employeeId, int salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Employee Salary: " + salary);
	}
}
