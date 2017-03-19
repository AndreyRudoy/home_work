package com.rudoy.hm005;

import java.util.Random;

/**
 * Created by OmEz on 19.03.2017.
 */
public class IssueOne {

    public static double mean(int[] m) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i];
        }
        return sum / m.length;
    }

    public static void print(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Создать 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
        // вывести массивы на экран в двух отдельных строках.
        // Посчитать среднее арифметическое элементов каждого массива и сообщить,
        // для какого из массивов это значение оказалось больше
        // (либо сообщить, что их средние арифметические равны).

        int n = 5;
        int[] mas = new int[n];
        int[] mas2 = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(5);
            mas2[i] = random.nextInt(5);
        }

        print(mas);
        print(mas2);

        double m1 = mean(mas);
        double m2 = mean(mas2);
        if (m1 > m2) {
            System.out.println("Average of first array is greater");
        } else if (m1 < m2) {
            System.out.println("Average of second array is greater");
        } else {
            System.out.println("Averages are equals");
        }
    }
}

