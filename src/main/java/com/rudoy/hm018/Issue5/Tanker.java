package com.rudoy.hm018.Issue5;

/**
 * Created by OmEz on 20.05.2017.
 */
public class Tanker extends CargoShip {


    public Tanker(int maxWeight, String typeOfCargo) {
        super(maxWeight, typeOfCargo);
    }

    @Override
    public int getYear() {
        return 1989;
    }
}
