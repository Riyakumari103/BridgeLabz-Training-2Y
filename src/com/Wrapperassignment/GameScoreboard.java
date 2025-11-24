package com.Wrapperassignment;

public class GameScoreboard {

    public static void main(String[] args) {

      
        Integer[] scores = {10, null, 25, 40, null, 5, null};

        int notPlayedCount = 0;
        int totalScore = 0;

        for (Integer score : scores) {

            if (score == null) {
                notPlayedCount++;
            } else {
                totalScore += score; 
            }
        }

        System.out.println("Players who haven't played: " + notPlayedCount);
        System.out.println("Total valid score: " + totalScore);
    }
}

