package com.rudoy;

/**
 * Created by OmEz on 22.02.2017.
 */
public class IssueFour {
    public static double equationOne(double x) {
        return 7 * x * x - 3 * x + 6;
    }

    public static double equationTwo(double a) {
        return 12 * a * a + 7 * a - 16;
    }

    public static void main(String[] args) {
        double number = 8.7;
        System.out.println("Equation one: " + equationOne(number));
        System.out.println("Equation two: " + equationTwo(number));

    }
}
