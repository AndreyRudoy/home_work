package com.rudoy.hw002;

/**
 * Created by OmEz on 25.02.2017.
 */
public class IssueOne {
    public static double toKelvin(double celsius){
        return celsius - 273.15;
    }
    public static double toFahrenheit(double celsius){
        return  celsius * 1.8 + 32.0;
    }
    public static void main (String[] args) {
        double temperature = 36.6;
        System.out.println("Kelvin: " + toKelvin(temperature));
        System.out.println("Fahrenheit: " + toFahrenheit(temperature));
    }
}
