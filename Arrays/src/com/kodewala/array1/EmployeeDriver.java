package com.kodewala.array1;

public class EmployeeDriver {
	public static void main(String arg[]) {

		Employee emp1 = new Employee("Rahul", 45000, 2);
		Employee emp2 = new Employee("Raj", 50000, 3);
		Employee emp3 = new Employee("Jayita", 55000, 4);

		emp1.displayDetails();
		emp2.displayDetails();
		emp3.displayDetails();
		//System.out.println(emp3.yearOfExp);

	}

}
