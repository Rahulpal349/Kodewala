package com.kodewala.constructors2;

class Invoice extends Object {

	static int gst = 18;

	int amount;
	String name;
	String billingAddress;
	String customarId;
	String customarName;

	Invoice(int _amount, String _name, String _billingAddress, String _customarId, String _customarName) {
		this.amount = _amount;
		this.name = _name;
		this.billingAddress = _billingAddress;
		this.customarId = _customarId;
		this.customarName = _customarName;
	}

	void displayDetils() {
		System.out.println("Product Price: "+amount);
		System.out.println("Product Name: "+name);
		System.out.println("Address: "+billingAddress);
		System.out.println("Customar Id: "+customarId);
		System.out.println("Customar Name: "+customarName);
		System.out.println("Gst: "+gst);
	}
}

public class Driver {
	public static void main(String args[]) {

		Invoice inv = new Invoice(100000, "iphone 18", "SCL ROYEL PG", "AMZ145", "RAHUL");
		Invoice inv1 = new Invoice(10000, "iphone 12", "SCL ROYEL PG", "AMZ1425", "RAJ");

		System.out.println("First Invoice Details");
		System.out.println("=====================");
		inv.displayDetils();
		System.out.println();
		System.out.println("Second Invoice Details");
		System.out.println("=====================");
		inv1.displayDetils();
	}

}
