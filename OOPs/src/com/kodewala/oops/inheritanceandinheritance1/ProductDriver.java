package com.kodewala.oops.inheritanceandinheritance1;

public class ProductDriver {

	public static void main(String[] args) {
		Product pd = new Product("EX1424", "iphone 18", 79000, 5);
		Clothing ct = new Clothing("PM485","Puma Tshirt", 799, 2, "XL","Cotton");
		Electronic et = new Electronic("DC48154", "43- inch TV", 19999, 1, "LG", 5);
		

		System.out.println("====Product Details:====");
		System.out.println("========================");
		pd.displayDetails();
		System.out.println("");

		System.out.println("=====Cloth Details:=====");
		System.out.println("========================");
		ct.displayDetails();
		System.out.println("");

		System.out.println("====Electronics Product Details:====");
		System.out.println("====================================");
		et.displayDetails();
		
		System.out.println("\n=== Update Product ===");
		System.out.println("========================");
		System.out.println("Updated Cloth Price: ");
        ct.setPrice(699);
        System.out.println("Updated Cloth Quantity: ");
        ct.setQuantity(4);

        System.out.println("Updated Total Value: " + ct.calculateTotalValue());
	}

}
