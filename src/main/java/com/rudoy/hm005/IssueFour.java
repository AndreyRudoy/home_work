package com.rudoy.hm005;

import java.util.Random;

/**
 * Created by OmEz on 19.03.2017.
 */
public class IssueFour {
    public static int myRandom(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        Random random = new Random();
        int next = random.nextInt(max - min);
        return min + next;
    }

    public static void print(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //В массиве из 7 задания найти одинаковые элемент и посчитать,
        //сколько раз они встречаются в массиве.
        int n = 50;
        int mas[] = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = myRandom(-50, 50);
        }
        print(mas);
        for (int m = 0; m < n; m++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (mas[m] == mas[j]) {
                    count++;
                }
            }
            System.out.println("Value: " + mas[m] + ", count: " + count);
        }
    }
}
