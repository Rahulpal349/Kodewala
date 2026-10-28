package com.kodewala.oops.inheritanceandinheritance.UMS;

public class Teacher extends Person {

	private String subject;
	private double monthlySalary;

	Teacher(String name, int age, String subject, double monthlySalary) {
		super(name, age);
		 setName(name);
		 setAge(age);
	}

	public String getSubject() {
		return subject;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setSubject(String subject) {
		if(subject!=null) {
			this.subject = subject ;
		}
	}
	public void setMonthlySalary(double monthlySalary){
		if (monthlySalary>0) {
			this.monthlySalary = monthlySalary;
		}
	}
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Subject: "+subject);
		System.out.println("Monthly Salary: "+monthlySalary);
		
	}
}
