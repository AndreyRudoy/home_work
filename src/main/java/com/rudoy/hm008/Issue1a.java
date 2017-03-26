package com.rudoy.hm008;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Issue1a {
    public static void main(String[] args) {
        int n = 7;
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            mas[i][i] = 1;
            mas[i][n - 1 - i] = 1;
            mas[i][3] = 1;
            mas[3][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

