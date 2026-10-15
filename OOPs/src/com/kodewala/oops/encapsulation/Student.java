package com.kodewala.oops.encapsulation;

public class Student {

	private String name;
	private String rollNumber;
	private int marks;
	

	Student(String _name, String _rollNumber) {
		super();
		this.name = _name;
		this.rollNumber = _rollNumber;
	}
		 // Getter for name
	    public String getName(String name) {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for rollNumber
	    public String getRollNumber() {
	        return rollNumber;
	    }

	    // Setter for rollNumber
	    public void setRollNumber(String rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    // Getter for marks
	    public int getMarks() {
	        return marks;
	    }

	    public void setMarks(int marks) {
	        if (marks >= 0 && marks <= 100) {
	            this.marks = marks;
	        } else {
	            System.out.println("Invalid marks! Marks must be between 0 and 100.");
	        }
	    }
	    public void displayDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	    }

		
}
