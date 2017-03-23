package com.rudoy.hm006;

/**
 * Created by OmEz on 23.03.2017.
 */
public class IssueFour {
    public static void main(String[] args) {
        //Преобразовать массив так, чтобы сначала шли нулевые элементы,
        // а затем все остальные.
        int[] mas = new int[]{0, 2, 4, 2, 4, 0, 4, 0};
        int zero = 0;
        //нашли количество нулей
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) zero++;
        }
        int[] result = new int[mas.length];
        //заполнили массив нулями
        for (int j = 0; j < zero - 1; j++) {
            result[j] = 0;
        }
        //дозаполнили числами
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != 0) {
                result[zero] = mas[i];
                zero++;
            }
        }
        //напечатали
        for (int i = 0; i < mas.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
