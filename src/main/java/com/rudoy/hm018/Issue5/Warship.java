package com.rudoy.hm018.Issue5;

/**
 * Created by OmEz on 20.05.2017.
 */
public abstract class Warship implements Ship {

    protected int year;
    private String country;

    public Warship (int year, String country){

        this.year = year;
        this.country = country;
    }

    @Override
    public int getYear() {
        return year;
    }

    public void setYear(int year) { this.year = year;}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
