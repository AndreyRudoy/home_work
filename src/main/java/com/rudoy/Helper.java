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
}
