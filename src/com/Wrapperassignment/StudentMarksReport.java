package com.Wrapperassignment;

import java.util.ArrayList;

public class StudentMarksReport {

    public static void main(String[] args) {

        Object[] rawMarks = {"85", 95, Integer.valueOf(88), "null", "abc", null, "70"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object mark : rawMarks) {

            if (mark == null) {
                continue; 
            }

            if (mark instanceof Integer) {
                
                validMarks.add((Integer) mark);
            }
            else if (mark instanceof String) {
                String str = (String) mark;

                if (str.equalsIgnoreCase("null")) {
                    continue; 
                }

                
                try {
                    validMarks.add(Integer.parseInt(str));
                } catch (NumberFormatException e) {
                   
                }
            }
        }

        
        double average = validMarks.stream()
                                   .mapToInt(Integer::intValue)
                                   .average()
                                   .orElse(0.0);

       
        System.out.println("Valid Marks: " + validMarks);
        System.out.println("Average Marks: " + average);
    }
}

