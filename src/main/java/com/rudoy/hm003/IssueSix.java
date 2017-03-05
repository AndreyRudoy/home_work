package com.rudoy.hm003;

/**
 * Created by OmEz on 05.03.2017.
 */
public class IssueSix {
    public static void main(String[] args) {
        //Задайте два числа: основание и степень.
        // С помощью цикла возведите число в степень. Напечатайте результат.
        int base = 2;
        int power = 3;
        int result = base;
        for (int i = 0; i < power - 1; i++) {
            result = result * base;
        }
        System.out.println(result);
    }
}
