package com.rudoy.hm011;

import com.rudoy.Helper;

/**
 * Created by OmEz on 02.04.2017.
 */
public class Issue2 {

    public static int[] tail(int[] vector) {
        if (vector.length < 2) return new int[0];
        int[] result = new int[vector.length - 1];
        for (int i = 1; i < vector.length; i++) {
            result[i - 1] = vector[i];
        }
        return result;
    }

    public static int[] odd(int[] source, int[] accumulator) {
        if (source.length == 0) return accumulator;
        int head = source[0];
        if (head % 2 == 1) {
            return odd(tail(source), Issue1.addElement(head, accumulator));
        } else {
            return odd(tail(source), accumulator);
        }
    }

    public static void main(String[] args) {
        int[] source = new int[]{1, 4, 5, 3, 7};
        int[] numbers = odd(source, new int[0]);
        Helper.print(numbers);
    }
}
