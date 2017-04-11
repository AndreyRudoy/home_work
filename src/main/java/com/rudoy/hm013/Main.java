package com.rudoy.hm013;

/**
 * Created by OmEz on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        DoubleNumber doubleNumber = new DoubleNumber(5, 9);
        DoubleNumber doubleNumber2 = new DoubleNumber(8, 12);
        DoubleNumber doubleNumber3 = new DoubleNumber();
        //    doubleNumber.multiply(doubleNumber);
        DoubleNumber doubleNumber4 = doubleNumber2.multiply(doubleNumber);
        //    doubleNumber3.print();
        doubleNumber4.print();

    }
}
