package com.rudoy.hw002;

/**
 * Created by OmEz on 26.02.2017.
 */
public class IssueThree {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 4;
        int result = (number1 % number2) * (number2 % number1) + 1;
        System.out.println("result = " + result);

    }
}
