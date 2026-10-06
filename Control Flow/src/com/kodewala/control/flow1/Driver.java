package com.kodewala.control.flow1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Day Number: ");
		int day = scanner.nextInt();
		
		Driver dri = new Driver();
		dri.dayFinder(day);
		scanner.close();
	}
		
		public void dayFinder(int day) {
			switch (day) {
			case 1:
				System.out.println("Mon");
				break;

			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4:
				System.out.println("THurs");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("SAT");
				break;
			case 7:
				System.out.println("Sun");
				
			
			default:
				System.out.println("Invaild Input. Please Enter between 1 to 7.");
				break;
				
				
			}
			
		}
	}
