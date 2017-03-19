package com.rudoy.hm005;

import java.util.Random;

/**
 * Created by OmEz on 19.03.2017.
 */
public class IssueTwo {

    public static int myRandom(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        Random random = new Random();
        int next = random.nextInt(max - min);
        return min + next;
    }

    public static void main(String[] args) {
        //Создать массив из 50 элементов, заполненный случайными числами в промежутке (-50; 50).
        // Найти сумму положительных элементов (элемент>0) и отдельно сумму отрицательных (элемент<0),
        // нулевые элементы игнорировать.
        // Сравнить суммы по модулю и поменять знаки тех элементов на противоположные,
        // модуль суммы которых окажется больше. Если суммы равны, поменять знак всех элементов в массиве.
        // Например, дан массив {10, -5, -1, 9, 2, -11, 0}. Сумма положительных элементов равна 10+9+2=21,
        // отрицательных -5-1-11=-17. Сравнивая их по модулю, мы видим,
        // что сумма положительных элементов больше ( |21| > |-17| ).
        // Следовательно, всем отрицательным элементам знак, в результате получаем {10, 5, 1, 9, 2, 11, 0}.
        int positive = 0;
        int negative = 0;
        int n = 50;
        int mas[] = new int[n];
        for (int i = 0; i < n; i++) {
            int value = myRandom(-50, 50);
            mas[i] = value;
            if (value < 0) {
                negative = negative + value;
            } else {
                positive = positive + value;
            }
            System.out.print(value);
            System.out.print(" ");

        }
        System.out.println();
        int aPos = Math.abs(positive);
        int aNeg = Math.abs(negative);
        for (int i = 0; i < n; i++) {
            int value = mas[i];
            if (aPos > aNeg) {
                if (value > 0) {
                    mas[i] = -value;
                }
            }
            if (aPos < aNeg) {
                if (value < 0) {
                    mas[i] = -value;
                }
            }
            System.out.print(mas[i]);
            System.out.print(" ");
        }

    }
}
