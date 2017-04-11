package com.rudoy.hm013;

/**
 * Created by OmEz on 11.04.2017.
 */
public class DoubleNumber {
    private int a;
    private int b;

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return gcd(b, x);
    }

    private static int noc(int a, int b) {
        int nod = gcd(a, b);
        return a * b / nod;
    }

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

    public double toDecimal() {
        return (this.a * 1.0) / (this.b * 1.0);
    }

    public static DoubleNumber simplify(DoubleNumber doubleNumber) {
        DoubleNumber doubleNumber3 = new DoubleNumber();
        int _gcd = gcd(doubleNumber.getA(), doubleNumber.getB());
        doubleNumber3.setA(doubleNumber.getA() / _gcd);
        doubleNumber3.setB(doubleNumber.getB() / _gcd);
        return doubleNumber3;

    }

    private DoubleNumber operation(DoubleNumber doubleNumber, Boolean sum) {
        int com = noc(this.getB(), doubleNumber.getB());
        int newThisA = this.a * com / this.b;
        int newOtherA = doubleNumber.getA() * com / doubleNumber.getB();
        DoubleNumber doubleNumber3 = new DoubleNumber();
        if (sum) {
            doubleNumber3.setA(newThisA + newOtherA);
        } else {
            doubleNumber3.setA(newThisA - newOtherA);
        }
        doubleNumber3.setB(com);
        return simplify(doubleNumber3);
    }

    public DoubleNumber add(DoubleNumber doubleNumber) {
        return operation(doubleNumber, true);
    }

    public DoubleNumber difference(DoubleNumber doubleNumber) {
        return operation(doubleNumber, false);
    }

    public DoubleNumber multiply(DoubleNumber doubleNumber) {
        DoubleNumber doubleNumber3 = new DoubleNumber();
        doubleNumber3.setA(this.getA() * doubleNumber.getA());
        doubleNumber3.setB(this.getB() * doubleNumber.getB());
        return simplify(doubleNumber3);
    }

    public DoubleNumber divide(DoubleNumber doubleNumber) {
        DoubleNumber doubleNumber3 = new DoubleNumber();
        doubleNumber3.setA(this.getA() * doubleNumber.getB());
        doubleNumber3.setB(this.getB() * doubleNumber.getA());
        return simplify(doubleNumber3);
    }

    public void print() {

        System.out.println(this.a + "/" + this.b);
    }
}

