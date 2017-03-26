package com.rudoy.hm007;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Issue3 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            mas[i][i] = 1;
            mas[i][n-1-i]=1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
