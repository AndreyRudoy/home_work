package com.rudoy.hm007;

import java.util.Random;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Issue1 {
    public static void main(String[] args) {
        // Сформировать матрицу из чисел от 0 до 999,
        // вывести ее на экран. Посчитать количество двузначных чисел в ней.
        // Вывести главную диагональ на экран.
        int count = 0;
        int value = 0;
        int m = 5;
        int n = 7;
        int[][] mas = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                value = random.nextInt(999);
                mas[i][j] = value;
                if (value > 9 & value < 100) {
                    count++;
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println("Кол. двухзначных: " + count);
        System.out.println("Гл. диагональ:");
        int min = Math.min(n, m);
        for (int i = 0; i < min; i++) {
            System.out.print(mas[i][i] + " ");
        }
    }
}
