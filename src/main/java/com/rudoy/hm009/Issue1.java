package com.rudoy.hm009;

import java.util.Random;

/**
 * Created by OmEz on 28.03.2017.
 */
public class Issue1 {

    public static int[] vector(int n) {
        int[] mass = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            mass[i] = r.nextInt(50);
        }
        return mass;
    }

    public static void print(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 20;
        int[] mass = vector(20);
        print(mass);
    }
}
