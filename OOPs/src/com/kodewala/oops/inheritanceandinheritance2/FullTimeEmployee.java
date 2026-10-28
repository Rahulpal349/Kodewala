package com.kodewala.oops.inheritanceandinheritance2;

public class FullTimeEmployee extends Employee {

	private double monthlySalary;
	private double bonus;

	FullTimeEmployee(String employeeId, String name, double monthlySalary, double bonus) {
		super(employeeId, name);
		if (monthlySalary <= 0 || bonus < 0) {
			throw new IllegalArgumentException("Invalid salary or bonus");
		}
		this.monthlySalary = monthlySalary;
		this.bonus = bonus;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public double getBonus() {
		return bonus;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary + bonus;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Monthly Salary: " + monthlySalary);
		System.out.println("Bonus: "+bonus);
	}
}
