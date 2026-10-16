package com.kodewala.oops.inheritance2;

class Invoice extends Order{
	String invoiceNumber;
	String invoiceDate;
	Invoice(String orderId, String orderDetails, String orderAddress, String invoiceNumber, String invoiceDate) {
		super(orderId, orderDetails, orderAddress);
		this.invoiceNumber = invoiceNumber;
		this.invoiceDate = invoiceDate;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Invoice Number is: "+invoiceNumber);
		System.out.println("Invoice Date: "+invoiceDate);
	}
	
}
class Order extends Flipkart{
	String orderAddress;

	Order(String orderId, String orderDetails, String orderAddress) {
		super(orderId, orderDetails);
		this.orderAddress = orderAddress;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Address is: "+orderAddress);
	}
	
}
public class Flipkart {
	String orderId;
	String orderDetails;
	Flipkart(String orderId, String orderDetails) {
		super();
		this.orderId = orderId;
		this.orderDetails = orderDetails;
	}
	
	public void displayDetails() {
		System.out.println("Order Id is: "+orderId);
		System.out.println("Order Description: "+orderDetails);
	}

}
