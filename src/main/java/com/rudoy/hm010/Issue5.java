package com.rudoy.hm010;

/**
 * Created by OmEz on 30.03.2017.
 */
public class Issue5 {
    public static void main(String[] args) {
        for (int i = 100000; i < 1000000; i++) {
            int upper = i / 1000;
            int low = i % 1000;
            int sumUpper = Issue4.sum(Issue4.decomposition(upper));
            int sumLow = Issue4.sum(Issue4.decomposition(low));
            if (sumLow == sumUpper) {
                System.out.println("Lucky number: " + i);
            }

        }
    }
}
