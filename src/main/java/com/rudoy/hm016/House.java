package com.rudoy.hm016;

/**
 * Created by OmEz on 01.05.2017.
 */
public class House {

    private String address;
    private int maxFlor;
    private int minFlor;
    private Elevator elevator;

    public House(String address, int maxFlor, int minFlor, Elevator elevator) {
        int totalFlors = maxFlor - minFlor;
        if(elevator.getNumberOfButtons()<totalFlors){
            System.out.println("Elevator isn't suitable for this house");
        }
        this.address = address;
        this.maxFlor = maxFlor;
        this.minFlor = minFlor;
        this.elevator = elevator;
    }

    public void callElevatorOnFlor(int flor) {
        if ((flor < minFlor) || (flor > maxFlor)) {
            System.out.println("This elevator can't be called on flor: " + flor);
        } else {
            elevator.moveOn(flor);
        }
    }

    public void goOn(int flor, int capacity) {
        if ((flor < minFlor) || (flor > maxFlor)) {
            System.out.println("This elevator can't be called on flor: " + flor);
        } else if (capacity > elevator.getCapacity()) {
            System.out.println("The elevator is overloaded");
        } else {
            elevator.moveOn(flor);
        }
    }

}

