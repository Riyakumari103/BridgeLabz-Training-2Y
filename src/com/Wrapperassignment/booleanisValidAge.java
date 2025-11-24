package com.Wrapperassignment;

public static booleanisValidAge(String ageInput) {
    try {
        int age = Integer.parseInt(ageInput); 

        // Check age requirement
        return age >= 18;

    } catch (NumberFormatException e) {
        
        return false;
    }
}

