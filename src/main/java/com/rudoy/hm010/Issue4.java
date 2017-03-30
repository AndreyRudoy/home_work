package com.rudoy.hm010;

/**
 * Created by OmEz on 30.03.2017.
 */
public class Issue4 {
    public static int[] decomposition(int n) {
        int[] mas = new int[3];
        for (int i = 0; i < 3; i++) {
            int d = (int) Math.round(Math.pow(10, i));
            int div = n / d;
            mas[i] = div % 10;
        }
        return mas;
    }

    public static int sum(int[] vector) {
        int result = 0;
        for (int i = 0; i < vector.length; i++) {
            result = result + vector[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 123;
        System.out.println(sum(decomposition(a)));
    }
}
