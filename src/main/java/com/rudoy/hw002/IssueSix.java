package com.rudoy.hw002;

import java.util.Scanner;

/**
 * Created by OmEz on 01.03.2017.
 */
public class IssueSix {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            m = in.nextInt();
        }
        if (in.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            n = in.nextInt();
        }
        if (n == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            if (m % n == 0) {
                int div = m / n;
                System.out.println(div);
            } else {
                System.out.println("m на n нацело не делится");
            }
        }
    }
}

