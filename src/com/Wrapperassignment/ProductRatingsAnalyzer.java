package com.Wrapperassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRatingsAnalyzer {

    public static void main(String[] args) {

       
        int[] primitiveRatings = {5, 4, 3, 5};

        
        ArrayList<Integer> wrapperRatings = new ArrayList<>();
        wrapperRatings.add(4);
        wrapperRatings.add(null);   
        wrapperRatings.add(5);
        wrapperRatings.add(2);

       
        List<Integer> allRatings = new ArrayList<>();

        for (int r : primitiveRatings) {
            allRatings.add(r); 
        }

        
        allRatings.addAll(wrapperRatings);

        
        List<Integer> validRatings = allRatings.stream()
                                               .filter(Objects::nonNull)
                                               .toList();

        double average = validRatings.stream()
                                     .mapToInt(Integer::intValue)
                                     .average()
                                     .orElse(0.0);

       
        System.out.println("All Ratings (with nulls): " + allRatings);
        System.out.println("Valid Ratings: " + validRatings);
        System.out.println("Average Rating: " + average);
    }
}

