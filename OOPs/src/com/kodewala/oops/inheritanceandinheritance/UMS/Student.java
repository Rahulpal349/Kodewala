package com.kodewala.oops.inheritanceandinheritance.UMS;

public class Student extends Person{

	private int rollNumber;
	private double marks;

	Student(String name, int age, int rollNumber, double marks) {
		super(name, age);
		setRollNumber(rollNumber);
	    setMarks(marks);
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	public void setRollNumber(int rollNumber) {
		if (rollNumber > 0) {
			this.rollNumber = rollNumber;
		}
	}
	public void setMarks(double marks) {
		if (marks >= 0 && marks <=100) {
			this.marks = marks;
		}
	}
	public String calculateGrade() {
		if (marks >= 90) {
			return "A";
		} else if (marks >= 75) {
			return "B";
			
		}else if (marks >= 60) {
			return "C";
			
		} else if (marks >= 40) {
			return "D";
			
		} else {
			return "F";
			}
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("The RollNumber: "+rollNumber);
		System.out.println("Total Marks: "+marks);
		System.out.println("Grade: " + calculateGrade());
		}
	}
