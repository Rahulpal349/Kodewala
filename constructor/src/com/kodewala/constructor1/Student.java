package com.kodewala.constructor1;

public class Student {
	
	String name;
	int rollNumber;
	double marks;
	
	Student(String _name, int _rollNumber, double _marks) {
		this.name = _name;
		this.rollNumber = _rollNumber;
		this.marks = _marks;
	}

	 void displayDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Roll No: " + rollNumber);
	        System.out.println("Marks: " + marks);
	    }
}
