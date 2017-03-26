package com.rudoy.hm008;

import com.rudoy.Helper;

/**
 * Created by OmEz on 26.03.2017.
 */
public class Issue5 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = Helper.squareRandomMatrix(n, -10, 30);
        int oddColumn = n + 1;
        int more10Column = n + 1;
        for (int i = 0; i < n; i++) {
            int[] column = Helper.column(i, matrix);
            boolean odd = true;
            for (int j = 0; j < n; j++) {
                if (column[j] % 2 == 1) {
                    odd = false;
                    break;
                }
            }
            if (odd) {
                oddColumn = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            int[] column = Helper.column(i, matrix);
            boolean more = true;
            for (int j = 0; j < n; j++) {
                if (column[j] <= 10) {
                    more = false;
                    break;
                }
            }
            if (more) {
                more10Column = i;
                break;
            }
        }
        System.out.println(oddColumn);
        System.out.println(more10Column);
    }
}
