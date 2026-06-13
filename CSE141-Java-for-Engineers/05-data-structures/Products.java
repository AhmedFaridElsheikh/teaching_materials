package com.ahmed;

import java.util.Hashtable;

public class Products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// store product name and quantities
		Hashtable<String, Integer> products = new Hashtable <String, Integer> ();
		products.put("DC motor",12);
		products.put("Resistors",4);
		products.put("Phones",0);
		products.put("Resistorss",101);
		for (int value : products.values()) {
			 if (value > 100) {          // Stop processing
			        System.out.println("Quantity > 100 found");
			        break;
			    }
			    if (value == 0) {           // Skip absent products
			        System.out.println("Skipping  (out of stock)");
			        continue;
		}
		
		
	}

}
}
