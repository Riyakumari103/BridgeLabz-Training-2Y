package com.Wrapperassignment;

import java.util.Scanner;

public class AgeValidator {

    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = scanner.nextLine();

        int age = safeParseInt(input);

        if (age == -1) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
        } else if (age < 18) {
            System.out.println("You must be 18 or older to sign up.");
        } else {
            System.out.println("Age accepted. Welcome!");
        }

        scanner.close();
    }
}
