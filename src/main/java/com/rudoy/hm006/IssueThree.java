package com.rudoy.hm006;

import java.util.Random;

/**
 * Created by OmEz on 23.03.2017.
 */
public class IssueThree {
    public static int myRandom(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        Random random = new Random();
        int next = random.nextInt(max - min);
        return min + next;
    }

    public static void main(String[] args) {
        //Найдите произведение элементов массива с нечетными номерами.
        int n = 20;
        int mas[] = new int[n];
        long p = 1;
        for (int i = 0; i < n; i++) {
            int value = myRandom(1, 10);
            mas[i] = value;
            if (i % 2 == 1) {
                p = p * value;
            }
        }
        System.out.println("Произведение элементов массива с нечетными номерами: " + p);
    }
}
