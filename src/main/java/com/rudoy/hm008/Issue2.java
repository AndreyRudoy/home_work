package com.rudoy.hm008;

import com.rudoy.Helper;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Issue2 {

    public static boolean isMinimal(int value, int[] row) {
        boolean result = true;
        for (int i = 0; i < row.length; i++) {
            if (row[i] < value) {
                return false;
            }
        }
        return result;
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


    public static void main(String[] args) {
        int n = 10;
        int[][] mas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                mas[i][j] = Helper.myRandom(-10, 30);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int[] row = row(i, mas);
                int[] column = column(i, mas);
                boolean isMinimalByRow = isMinimal(mas[i][j], row);
                boolean isMinimalByColumn = isMinimal(mas[i][j], column);
                if (isMinimalByColumn & isMinimalByRow){
                    System.out.println("Minimal: "+mas[i][j]+", row: "+i+", column: "+j);
                }
            }
        }
    }
}
