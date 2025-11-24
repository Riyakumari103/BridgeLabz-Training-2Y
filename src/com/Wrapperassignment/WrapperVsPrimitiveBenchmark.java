package com.Wrapperassignment;


import java.util.ArrayList;

public class WrapperVsPrimitiveBenchmark {

    public static void main(String[] args) {

        final int SIZE = 1_000_000;

        long startAL = System.nanoTime();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);  // auto-boxing
        }

        long sumAL = 0;
        for (Integer value : list) {
            sumAL += value;  
        }

        long endAL = System.nanoTime();
        long timeList = endAL - startAL;

        long startArr = System.nanoTime();

        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = i;
        }

        long sumArr = 0;
        for (int value : arr) {
            sumArr += value;
        }

        long endArr = System.nanoTime();
        long timeArray = endArr - startArr;

        System.out.println("Sum (ArrayList<Integer>): " + sumAL);
        System.out.println("Time (ArrayList<Integer>): " + timeList / 1_000_000.0 + " ms\n");

        System.out.println("Sum (int[]): " + sumArr);
        System.out.println("Time (int[]): " + timeArray / 1_000_000.0 + " ms");
    }
}
