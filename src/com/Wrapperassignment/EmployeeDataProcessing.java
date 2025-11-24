package com.Wrapperassignment;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {

    public static void main(String[] args) {
        
        int[] agesArray = {25, 42, 31, 28, 50, 37};

       
        ArrayList<Integer> agesList = new ArrayList<>();
        for (int age : agesArray) {
            agesList.add(age);
        }
        int youngest = Collections.min(agesList);
        int oldest = Collections.max(agesList);

        System.out.println("Employee ages: " + agesList);
        System.out.println("Youngest employee age: " + youngest);
        System.out.println("Oldest employee age: " + oldest);
    }
}
