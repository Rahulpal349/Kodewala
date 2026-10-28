package com.kodewala.oops.inheritanceandinheritance2;

public abstract class Employee {

	private String employeeId;
	private String name;

	Employee(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public abstract double calculateSalary();

	public void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + calculateSalary());
	}
}
