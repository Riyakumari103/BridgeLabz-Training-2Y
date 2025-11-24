package com.Wrapperassignment;

import java.util.ArrayList;

public class SensorLogger {

    private static ArrayList<Double> temperatureLog = new ArrayList<>();

    
    public static void logTemperature(double temp) {
        temperatureLog.add(temp);  
    }

   
    public static void logTemperature(Double temp) {
        temperatureLog.add(temp);   
    }

   
    public static void printTemperatures() {
        for (Double t : temperatureLog) {
            double value = t;  
            System.out.println("Recorded temperature: " + value);
        }
    }

    public static void main(String[] args) {

        
        logTemperature(22.5);   

       
        logTemperature(Double.valueOf(23.1)); 

        logTemperature(24.0); 
        printTemperatures();
    }
}

