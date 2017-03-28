package com.rudoy.hm009;

/**
 * Created by OmEz on 28.03.2017.
 */
public class Issue4 {
    public static long[] getTime(int days) {
        long[] mas = new long[3];
        mas[0] = days * 24;
        mas[1] = mas[0]*60;
        mas[2] = mas[1]*60;
        return mas;
    }
}
