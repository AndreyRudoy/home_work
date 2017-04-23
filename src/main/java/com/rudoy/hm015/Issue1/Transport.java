package com.rudoy.hm015.Issue1;

/**
 * Created by OmEz on 23.04.2017.
 */
public class Transport {
    String name;
    int maxSpeed;
    int year;

    public void setName(String name){
        this.name = name;
    }
    public void setMaxSpeedAndYear(int maxSpeed, int year){
        this.maxSpeed = maxSpeed;
        this.year = year;
    }
    public String toString(){
        return "transport: name = "+name+", maxSpeed = "+maxSpeed+", year = "+year;
    }
}

