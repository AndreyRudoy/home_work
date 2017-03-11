package com.rudoy.hm004;

/**
 * Created by OmEz on 11.03.2017.
 */
public class IssueOne {
    public static void main(String[] args) {
        // 1. Дано натуральное число n. Вычислить:
        // 1/sin1   +   1/sin1+ sin2   +   1/sin1 + sin2 + .. + sin n
        int n = 10;
        double sum = 0;
        for (int i = 1; i < n + 1; i++) {
            double denominator = 0;
            for (int j = 1; j < i + 1; j++) {
                denominator = denominator + Math.sin(j);
            }
            sum = sum + 1.0 / denominator;
        }
        System.out.println(sum);
    }
}
