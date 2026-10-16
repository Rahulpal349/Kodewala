package com.kodewala.oops.inheritanceandinheritance;

public class Employee {
	private String name;
	private String employeeId;
	private int salary;

	Employee(String name, String employeeId, int salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary!");
		}
	}

	public void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Salary: " + salary);
	}
}
