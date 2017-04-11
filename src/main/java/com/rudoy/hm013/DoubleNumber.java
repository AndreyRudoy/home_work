package com.rudoy.hm013;

/**
 * Created by OmEz on 11.04.2017.
 */
public class DoubleNumber {
    private int a;
    private int b;

    public DoubleNumber() {
        a = 1;
        b = 1;
    }

    public DoubleNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {

        this.a = a;
    }

    public int getB() {

        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public DoubleNumber multiply(DoubleNumber doubleNumber) {
        DoubleNumber doubleNumber3 = new DoubleNumber();
        doubleNumber3.setA((this.getA() * doubleNumber.getA()));
        doubleNumber3.setB((this.getB() * doubleNumber.getB()));
        return doubleNumber3;
    }

    public void print() {

        System.out.println(this.a + "/" + this.b);
    }
}

