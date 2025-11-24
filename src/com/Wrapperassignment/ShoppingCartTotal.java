package com.Wrapperassignment;


	public class ShoppingCartTotal {
	    public static void main(String[] args) {

	        // Sample cart with valid and invalid price strings
	        String[] priceStrings = {"250", "499", "99", "abc", "150"};

	        int total = 0;

	        for (String price : priceStrings) {
	            try {
	                // Convert string to integer using wrapper class
	                int value = Integer.parseInt(price);
	                total += value;
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid price skipped: " + price);
	            }
	        }

	        System.out.println("Total Price: " + total);
	    }
	}

	


