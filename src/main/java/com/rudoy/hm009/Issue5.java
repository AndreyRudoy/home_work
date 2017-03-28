package com.rudoy.hm009;

/**
 * Created by OmEz on 28.03.2017.
 */
public class Issue5 {
    public static double function(int[] mass) {
        double result = 0.0;
        for (int i = 0; i < mass.length; i++) {
            result = result + (Math.sqrt(mass[i]) + mass[i]) / 2.0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] vector = {6, 13, 21};
        double result = function(vector);
        System.out.println("Result: " + result);
    }
}
