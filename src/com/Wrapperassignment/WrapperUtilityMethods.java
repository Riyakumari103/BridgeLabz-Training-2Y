package com.Wrapperassignment;

public class WrapperUtilityMethods {
    public static void main(String[] args) {
        
        int intValue = Integer.parseInt("123");
        System.out.println("Integer.parseInt(\"123\") = " + intValue);

        
        double doubleValue = Double.parseDouble("3.14");
        System.out.println("Double.parseDouble(\"3.14\") = " + doubleValue);

        
        boolean boolValue = Boolean.parseBoolean("true");
        System.out.println("Boolean.parseBoolean(\"true\") = " + boolValue);

        
        String binary = Integer.toBinaryString(10);
        System.out.println("Integer.toBinaryString(10) = " + binary);

        
        boolean isDigit = Character.isDigit('5');
        System.out.println("Character.isDigit('5') = " + isDigit);

       
        char upper = Character.toUpperCase('a');
        System.out.println("Character.toUpperCase('a') = " + upper);
    }
}

