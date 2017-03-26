package com.rudoy;

import java.util.Random;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Helper {
    public static int myRandom(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        Random random = new Random();
        int next = random.nextInt(max - min);
        return min + next;
    }

    public static int[][] squareRandomMatrix(int n, int from, int to) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = myRandom(from, to);
            }
        }
        return matrix;
    }

    public static int[] row(int index, int[][] matrix) {
        int length = matrix[0].length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = matrix[index][i];
        }
        return result;
    }

    public static int[] column(int index, int[][] matrix) {
        int length = matrix.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = matrix[i][index];
        }
        return result;
    }

}
