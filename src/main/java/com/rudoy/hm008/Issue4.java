package com.rudoy.hm008;

import com.rudoy.Helper;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Issue4 {
    public static void main(String[] args) {
        int n = 10;
        int[][] matrix = Helper.squareRandomMatrix(n, -10, 30);
        for (int i = 0; i < n - 1; i++) {
            if (matrix[i][n - 1 - i] > matrix[i + 1][n - 2 - i]) {
                int x = i + 1;
                int y = n - 2 - i;
                System.out.println("Coordinates: " + x + ", " + y);
                return;
            }
        }
        System.out.println("All Ok");
    }
}
