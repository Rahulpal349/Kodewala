package com.kodewala.oops.inheritanceandinheritance;

public class Developer extends Employee{
	private String programmingLanguage;

	Developer(String name, String employeeId, int salary, String programmingLanguage) {
		super(name, employeeId, salary);
		this.programmingLanguage = programmingLanguage;
	}
	  public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Programming Language: " + programmingLanguage);
	    }
}
