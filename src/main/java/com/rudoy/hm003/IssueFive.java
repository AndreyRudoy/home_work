package com.rudoy.hm003;

/**
 * Created by OmEz on 05.03.2017.
 */
public class IssueFive {
    public static void main(String[] args) {
        //Найти сумму чисел от 0 до 100 (включительно). (0+1+2+3+4+5).
        int sum = 0;
        for (int i = 0; i<101; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
