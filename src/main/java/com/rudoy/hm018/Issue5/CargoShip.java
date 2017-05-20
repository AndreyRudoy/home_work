package com.rudoy.hm018.Issue5;

/**
 * Created by OmEz on 20.05.2017.
 */
public abstract class CargoShip implements Ship {

    private String subType;
    private String name;
    private int year;

    public CargoShip(String subType, String name, int year) {
        this.subType = subType;
        this.name = name;
        this.year = year;
    }

    @Override
    public String getType() {
        return "WarShip";
    }

    @Override
    public String getSubType() {
        return subType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

}
