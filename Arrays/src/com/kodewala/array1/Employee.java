package com.kodewala.array1;

public class Employee {

	String name;
	double salary;
	int yearOfExp;

	Employee(String _name, double _salary, int _yearOfExp) {
		this.name = _name;
		this.salary = _salary;
		this.yearOfExp = _yearOfExp;
	}

	void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Year of Expricence: " + yearOfExp);

	}

}
