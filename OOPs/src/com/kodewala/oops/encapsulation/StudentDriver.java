package com.kodewala.oops.encapsulation;

public class StudentDriver {

	public static void main(String[] args) {

		Student s1 = new Student("Rahul", "ST101");

        s1.setMarks(85);

        s1.displayDetails();
        
        s1.setMarks(120);

        System.out.println("Marks after validation: " + s1.getMarks());

	}

}
