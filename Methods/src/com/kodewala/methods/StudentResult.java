package com.kodewala.methods;

import java.util.Scanner;

public class StudentResult {
	public static void main(String arg[]) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Student's Marks: ");
		int marks = scanner.nextInt();
		
		scanner.close();

		String result = calculateResult( marks);
		System.out.println("Grade: " +result);

	}
	
	public static String calculateResult(int marks) {
		if(marks<0 || marks>100) {
			return "Please Enter Vaild Marks.";
		}
		else if(marks>=90) 
		{
			return "A";
		}else if(marks>=75) 
		{
			return "B";
		}else if(marks>=60) 
		{
			return "C";
		}else if(marks>=40) 
		{
			return "D";
		}else if(marks<40) 
		{
			return "Fail";
		}
		return null;
	} 

}