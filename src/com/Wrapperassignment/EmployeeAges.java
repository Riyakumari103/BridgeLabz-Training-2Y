package com.Wrapperassignment;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAges {
    public static void main(String[] args) {

        int[] ageArray = {45, 32, 28, 50, 41, 29};

        
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ageArray) {
            ageList.add(age);   
        }


        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

      
        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Oldest Age: " + oldest);
    }
}

