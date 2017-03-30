package com.rudoy.hm010;

/**
 * Created by OmEz on 30.03.2017.
 */
public class Issue1 {
    public static int sum(int a1, int a2, int a3) {
        return a1 + a2 + a3;
    }

    public static int sum(byte a1, byte a2, byte a3) {
        return a1 + a2 + a3;
    }

    public static int sum(short a1, short a2, short a3) {
        return a1 + a2 + a3;
    }

    public static long sum(long a1, long a2, long a3) {
        return a1 + a2 + a3;
    }

    public static double sum(double a1, double a2, double a3) {
        return a1 + a2 + a3;
    }

    public static float sum(float a1, float a2, float a3) {
        return a1 + a2 + a3;
    }

    public static void main(String[] args) {
        // Написать метод, который считает и возвращает сумму трех цифр
        // (реализовать для всех типов данных).

        System.out.println(sum(1,3000, 0.3));

    }

}
