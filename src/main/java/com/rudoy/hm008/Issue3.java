package com.rudoy.hm008;

import java.util.Random;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Issue3 {
    public static void main(String[] args) {
        int n = 25;
        int m = 36;
        Random r = new Random();
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = r.nextInt(1000) % 2;
            }
        }
        int sumMax = 0;
        int rowMax = -1;
        int sumMin = m + 1;
        int rowMin = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum = sum + mas[i][j];
            }
            if (sum < sumMin) {
                sumMin = sum;
                rowMin = i;
            }
            if (sum > sumMax) {
                sumMax = sum;
                rowMax = i;
            }
        }
        System.out.println("Макс. " + rowMax);
        System.out.println("Мин. " + rowMin);
    }
}
