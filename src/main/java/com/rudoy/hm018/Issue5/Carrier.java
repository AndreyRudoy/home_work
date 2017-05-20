package com.rudoy.hm018.Issue5;

/**
 * Created by OmEz on 20.05.2017.
 */
public class Carrier extends Warship {


    public Carrier(int year, String country) {
        super(year, country);
    }

    @Override
    public int getMaxWeight() {
        return 600000;
    }
}
