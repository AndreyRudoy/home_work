package com.rudoy.hm006;


/**
 * Created by OmEz on 23.03.2017.
 */
public class IssueFive {

    static int[] negativesOrPositives(int[] set, boolean negative) {
        int[] mas = new int[set.length];
        int k = 0;
        for (int i = 0; i < set.length; i++) {
            if ((negative & set[i] < 0) | (!negative & set[i] > 0)) {
                mas[k] = set[i];
                k++;
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = mas[i];
        }
        return result;
    }

    static int sum(int[] mas) {
        int result = 0;
        for (int i = 0; i < mas.length; i++) {
            result = result + mas[i];
        }
        return result;
    }

    static void print(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    static int nearest(int n, int[] set) {
        int result = 0;
        for (int i = 0; i < set.length; i++) {
            if (Math.abs(set[i] - n) < Math.abs(result - n)) {
                result = set[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //emulation of set
        int[] set = new int[]{1, 4, -4, 3, 9, 0, -2, 60, -25};
        int n = 100;

        int[] negative = negativesOrPositives(set, true);
        int[] positive = negativesOrPositives(set, false);

        int lowBound = sum(negative);
        int upperBound = sum(positive);
        int[] result = new int[0];
        if ((n < lowBound) & (n > upperBound)) {
            //a variant can be found
            int _nearest = nearest(n, set);
            if (_nearest == n) {
                result = new int[]{n};
            } else {

            }
        } else if (n == lowBound) {
            result = negative;
        } else if (n == upperBound) {
            result = positive;
        } else if (n == upperBound + lowBound) {
            result = set;
        }
        print(result);
    }

}
