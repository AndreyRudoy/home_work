package com.rudoy.hm007;

import java.util.Random;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Issue2 {
    public static int myRandom(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        Random random = new Random();
        int next = random.nextInt(max - min);
        return min + next;
    }

    public static void main(String[] args) {
        //Заполнить двумерный массив случайными числами от 10 до 100.
        // Посчитать сумму элементов отдельно в каждой строке и определить номер строки,
        // в которой эта сумма максимальна.
        int n = 10;
        int m = 7;
        int[][] mas = new int[n][m];
        int row = 0;
        int rowSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                int value = myRandom(10, 100);
                mas[i][j] = value;
                sum = sum + value;
            }
            if (sum > rowSum) {
                rowSum = sum;
                row = i;
            }
        }
        System.out.println("Row: " + row);
    }
}
