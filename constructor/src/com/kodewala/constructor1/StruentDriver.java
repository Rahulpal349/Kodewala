package com.kodewala.constructor1;

public class StruentDriver {

	public static void main(String[] args) {

		Student stu1 = new Student("Rahul", 101, 85.5);
		Student stu2 = new Student("Raj", 102, 90);

		stu1.displayDetails();

		System.out.println();

		stu2.displayDetails();

	}
}