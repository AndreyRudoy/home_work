package com.rudoy.hm015.Issue3;

/**
 * Created by OmEz on 23.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processorFrequency = 23.5;
        computer.processor = "Pentium";
        computer.wiFi = true;
        System.out.println(computer.toString());

        Laptop laptop = new Laptop();
        laptop.setDiagonal(15);
        laptop.setFirmAndProcessor("acer", "pentium");
        System.out.println(laptop.toString());
    }
}
