package com.rudoy.hm004;

/**
 * Created by OmEz on 11.03.2017.
 */
public class Issue3 {
    public static void main(String[] args) {
        int hight = 10;
        int width = 10;
        for (int x = 0; x < hight; x++) {
            if (x == 0 | x == hight - 1) {
                for (int y = 0; y < width; y++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int y = 0; y < width - 2; y++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
