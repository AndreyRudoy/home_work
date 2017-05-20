package com.rudoy.hm018.Issue5;

/**
 * Created by OmEz on 20.05.2017.
 */
public abstract class CargoShip implements Ship {

    protected int maxWeight;
    private String typeOfCargo;

    public CargoShip(int maxWeight, String typeOfCargo){

        this.maxWeight = maxWeight;
        this.typeOfCargo = typeOfCargo;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) { this.maxWeight = maxWeight;}

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }
}
