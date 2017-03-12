package com.rudoy.hm004;

/**
 * Created by OmEz on 12.03.2017.
 */
public class Issue6 {
    public static int countDividers(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 100;
        int max = 0;
        int min = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            int dividers = countDividers(i);
            if (dividers > count) {
                max = i;
                min = i;
                count = dividers;
            }
            if (dividers == count) {
                max = i;
            }
        }
        if (max == min) {
            System.out.println("Single value: " + max);
        } else {
            System.out.println("Min value: " + min);
            System.out.println("Max value: " + max);
        }
        System.out.println("Dividers: " + count);
    }
}
