package com.kodewala.oops.inheritance1;

public class Manager extends Employee {
	String department;

	Manager(String name, String employeeId, int salary, String department) {
		super(name, employeeId, salary);
		this.department = department;
	}
	public void displayDetails() {
		 super.displayDetails();
		System.out.println("Department: "+department);
	}

}
