package com.rudoy.hm015.Issue1;

/**
 * Created by OmEz on 23.04.2017.
 */
public class Bus extends Transport{
    String mark;
    int capacity;

    public void setNameAndMark(String name, String mark){
        super.setName(name);
        this.mark = mark;
    }
    public void setCapacityAndMaxSpeedAndYear(int capacity, int maxSpeed, int year){
        super.setMaxSpeedAndYear(maxSpeed, year);
        this.capacity = capacity;
    }
    public String toString(){
        return "bus: name = "+name+", maxSpeed = "+maxSpeed+", year = "+year+", mark = "+mark+", capacity = "+ capacity;
    }
}
