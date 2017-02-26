package com.rudoy.hw002;

import java.util.Scanner;

/**
 * Created by OmEz on 26.02.2017.
 */
public class IssueTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            int number = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            int low = number % 10;
            int up = number / 10;
            System.out.println(low + "" + up);
        } else {
            System.out.println("Вы ввели не целое число");
        }

    }

}
