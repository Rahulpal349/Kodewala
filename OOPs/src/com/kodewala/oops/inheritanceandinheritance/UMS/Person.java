package com.kodewala.oops.inheritanceandinheritance.UMS;

public class Person {

	private String name;
	private int age;
	
	Person(String name, int age) {
		super();
		setAge(age);
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		if (name!=null) {
			this.name = name;
		}
	}
	public void setAge(int age) {
		if (age>0) {
			this.age =age;
		}
		
	}
	
	public void displayDetails() {
		System.out.println("The Name is: "+name);
		System.out.println("The age is: "+age);
	}
}
