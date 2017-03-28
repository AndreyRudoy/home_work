package com.rudoy.hm009;

/**
 * Created by OmEz on 28.03.2017.
 */
public class Issue3 {
    public static int[] decomposition(int n) {
        int[] mas = new int[3];
        for (int i = 0; i < 3; i++) {
            mas[i]=(n/(10^i))%10;
        }
        return mas;
    }
}