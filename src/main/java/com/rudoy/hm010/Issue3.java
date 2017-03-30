package com.rudoy.hm010;

/**
 * Created by OmEz on 30.03.2017.
 */
public class Issue3 {
    public static long factorial(int n) {
        long result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double s = (2*factorial(5)+3*factorial(8))/(factorial(6)+factorial(4));
        System.out.println(s);
    }
}
