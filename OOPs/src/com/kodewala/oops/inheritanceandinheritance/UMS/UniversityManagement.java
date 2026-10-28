package com.kodewala.oops.inheritanceandinheritance.UMS;

public class UniversityManagement {

	public static void main(String[] args) {
		Student st1 = new Student("Rahul", 27, 25415412, 96);
		Student st2 = new Student("Raj", 28, 489455, 95);
		Student st3 = new Student("Baj", -28, -489455, 195);
		Teacher tr1 = new Teacher("Jasraj", 40, "Bakchodi", 5000);
		Teacher tr2 = new Teacher("Gita", 35, "Geography", 9000);
		
		System.out.println("====Universirty Management System====");
		Person[] people = {st1, st2, st3, tr1, tr2};

		for (Person person : people) {
		    System.out.println();
		    person.displayDetails();
		}
		
		
//		System.out.println("====Universirty Management System====");
//		System.out.println("Student Details:");
//		st1.displayDetails();
//		System.out.println("");
//
//		System.out.println("Student Details:");
//		st2.displayDetails();
//		System.out.println("");
//		
//		System.out.println("Student Details:");
//		st3.displayDetails();
//		System.out.println("");
//
//		System.out.println("Teacher Details:");
//		tr1.displayDetails();
//		System.out.println("");
//		
//		System.out.println("Teacher Details:");
//		tr2.displayDetails();
//		System.out.println("");
	}

}
