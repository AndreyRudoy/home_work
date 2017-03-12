package com.rudoy.hm004;

/**
 * Created by OmEz on 12.03.2017.
 */
public class Issue7 {
    public static void main(String[] args) {
        int height = 10;
        int width = 10;
        char contour ='*';
        char filling = '/';
        for (int x = 0; x < height; x++) {
            if (x == 0 | x == height - 1) {
                for (int y = 0; y < width; y++) {
                    System.out.print(contour);
                }
            } else {
                System.out.print(contour);
                for (int y = 0; y < width - 2; y++) {
                    System.out.print(filling);
                }
                System.out.print(contour);
            }
            System.out.println();
        }
    }
}