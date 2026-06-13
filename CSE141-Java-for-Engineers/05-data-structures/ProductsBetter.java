package com.ahmed;
import java.util.*;

public class ProductsBetter {
    public static void main(String[] args) {

        Hashtable<String, Integer> products = new Hashtable<String, Integer>();
        products.put("DC motor", 12);
        products.put("Resistors", 4);
        products.put("Phones", 0);
        products.put("Resistorss", 101);

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            String name = entry.getKey();
            int quantity = entry.getValue();

            if (quantity > 100) {
                System.out.println("Stopping at: " + name + " -> " + quantity);
                break;
            }
            if (quantity == 0) {
                System.out.println("Skipping: " + name + " (out of stock)");
                continue;
            }
            System.out.println("Processing: " + name + " -> " + quantity);
        }
    }
}