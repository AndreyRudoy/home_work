package com.rudoy.hm006;

import java.util.Random;

/**
 * Created by OmEz on 22.03.2017.
 */
public class IssueTwo {
    public static int myRandom(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        Random random = new Random();
        int next = random.nextInt(max - min);
        return min + next;
    }

    static boolean exist(int number, int[] mas) {
        boolean result = false;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Удалить в массиве все числа, которые повторяются более двух раз.
        int n = 20   ;
        int mas[] = new int[n];
        int mas2[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int value = myRandom(1, 200);
            mas[i] = value;
            if (!exist(value, mas2)){
                mas2[k] = value;
                k++;
            }
        }
        for (int y=0; y<k; y++){
            System.out.print(mas2[y] + " ");
        }

    }
}
