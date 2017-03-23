package com.rudoy.hm006;

import java.util.Random;

/**
 * Created by OmEz on 22.03.2017.
 */
public class IssueOne {
    public static void print(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int myRandom(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        Random random = new Random();
        int next = random.nextInt(max - min);
        return min + next;
    }

    public static void main(String[] args) {

        // Создать одномерный массив, содержащий 15 элементов, заполнить его случайными
        // значениями в интервале от 1 до 200. Посчитать и вывести:
        // Сумму всех четных элементов массива.
        // Сумму всех нечетных элементов массива.
        // Сумму всех элементов массива.
        // Произведение всех элементов массива, значения которых меньше 50.
        // Произведение элементов массива с индексами от 2 и до 7.
        long prodact = 1;
        long prodact27 = 1;
        int n = 15;
        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;
        int mas[] = new int[n];
        for (int i = 0; i < n; i++) {
            int value = myRandom(1, 200);
            mas[i] = value;
            sum = sum + value;
            if (i % 2 == 0) {
                evenSum += mas[i];
            } else {
                oddSum += mas[i];
            }
            if (value < 50) {
                prodact = prodact * value;

            }
            if (i >= 2 & i < 7) {
                prodact27 = prodact27 * value;
            }

        }
        System.out.println("Сумма четных " + oddSum);
        System.out.println("Сумма не четных " + evenSum);
        System.out.println("Сумма всех елементов " + sum);
        System.out.println("Произведение всех элементов массива, значения которых меньше 50: " + prodact);
        System.out.println("Произведение элементов массива с индексами от 2 и до 7: " + prodact27);

    }
}



