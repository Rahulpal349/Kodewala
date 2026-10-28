package com.kodewala.oops.inheritanceandinheritance2;

public class EmployeePayrollDriver {

	public static void main(String[] args) {
		
		 Employee emp1 = new FullTimeEmployee("RD145", "Rahul", 45000, 15000);

		 Employee emp2 = new PartTimeEmployee("RD175", "Raj", 12, 8000);

		        Employee[] employees = {emp1, emp2};

		        for (Employee emp : employees) {
		            System.out.println("========================");
		            emp.displayDetails();
		            System.out.println();
		        }
		    }
	}
