package com.rudoy.hm005;

import java.util.Random;

/**
 * Created by OmEz on 19.03.2017.
 */
public class IssueFive {
    public static void print(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static int myRandom(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        Random random = new Random();
        int next = random.nextInt(max - min);
        return min + next;
    }

    public static void main(String[] args) {
        //Программа должна создать массив из 12 случайных
        // целых чисел из отрезка [-10;10] таким образом,
        // чтобы отрицательных и положительных элементов там было поровну и не было нулей.
        // При этом порядок следования элементов должен быть случаен
        // (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных,
        // а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
        // Вывести полученный массив на экран.
        int n = 12;
        int[] mas = new int[n];
        int positive = 0;
        int negative = 0;
        int i = 0;
        while (i < n ) {
            int value = myRandom(-10, 10);
            int diff = Math.abs(positive - negative);
            int free = n - 1 - i;
            if (value != 0) {
                if (diff < free) {
                    mas[i] = value;
                    if (value > 0) {
                        positive++;
                    } else {
                        negative++;
                    }
                    i++;
                } else {
                    if (((positive < negative) & (value > 0)) | ((positive > negative) & (value < 0))) {
                        mas[i] = value;
                        i++;
                    }
                }
            }
        }
        print(mas);
    }
}
