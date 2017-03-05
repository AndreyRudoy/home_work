package com.rudoy.hm003;

/**
 * Created by OmEz on 05.03.2017.
 */
public class IssueEight {
    public static void main(String[] args) {
        //С помощью цикла вывести произведение чисел от 1 до 50.
        long result = 1;
        for (int i = 1; i < 50; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
