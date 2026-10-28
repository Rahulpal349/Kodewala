package com.kodewala.oops.inheritanceandinheritance2;

public class PartTimeEmployee extends Employee{

	private int hoursWorked;
	private int hourlyRate;
	
	PartTimeEmployee(String employeeId, String name, int hoursWorked, int hourlyRate) {
		super(employeeId, name);
		 if (hoursWorked < 0 || hourlyRate <= 0) {
			 throw new IllegalArgumentException("Invalid hours worked or hourly rate");
	        }
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    @Override
    public void displayDetails() {
		super.displayDetails();
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Hourly Rate: " + hourlyRate);
		}
	
}
