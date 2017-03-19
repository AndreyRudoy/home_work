package com.rudoy.hm005;

import java.util.Random;

/**
 * Created by OmEz on 19.03.2017.
 */
public class IssueThre {
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
        //В массиве из предыдущего задания поменять порядок элементов
        // (конечный элемент сделать первым, предпоследний - вторым и т.д.).
        int n = 50;
        int mas[] = new int[n];
        int mas2[] = new int[n];
        for (int i = 0; i < n; i++) {
            int value = myRandom(-50, 50);
            mas[i] = value;
            mas2[n - i - 1] = value;
        }
        print(mas);
        print(mas2);

    }
}
