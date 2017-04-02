package com.rudoy.hm011;

/**
 * Created by OmEz on 02.04.2017.
 */
public class Issue1 {

    public static int[] addElement(int value, int[] mass) {
        int[] res = new int[mass.length + 1];
        for (int i = 0; i < mass.length; i++) {
            res[i] = mass[i];
        }
        res[mass.length] = value;
        return res;
    }

    public static int[] hex(int number, int[] vector) {
        if (number < 16) {
            return addElement(number, vector);
        }
        int remainder = number % 16;
        int next = number / 16;
        int[] result = addElement(remainder, vector);
        return hex(next, result);
    }

    public static char intToChar(int v) {
        switch (v) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            default:
                return 'F';
        }
    }

    public static char[] decorate(int[] seq) {
        char[] result = new char[seq.length];
        for (int i = 0; i < seq.length; i++) {
            result[seq.length - 1 - i] = intToChar(seq[i]);
        }
        return result;
    }

    public static void print(char[] seq) {
        for (int i = 0; i < seq.length; i++) {
            System.out.print(seq[i]);
        }
    }

    public static void main(String[] args) {
        int value = 180;
        int[] result = hex(value, new int[0]);
        char[] code = decorate(result);
        print(code);
    }
}
