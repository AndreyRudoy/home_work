package com.rudoy.hm016;

/**
 * Created by OmEz on 01.05.2017.
 */
public class Elevator extends Equipment {

    private int capacity;
    private int numberOfButtons;
    private int flor;
    private double speed;
    private boolean busy;
    private boolean broken;
    private boolean closedDoor;

    public void moveOn(int flor) {
        if (this.broken) {
            System.out.println("This elevator is broken");
        } else if (this.busy) {
            System.out.println("This elevator is busy");
        } else if (this.flor == flor) {
            this.closedDoor = false;
        } else {
            this.flor = flor;
            this.closedDoor = true;
            System.out.println("The elevator has arrived on flor: " + flor);
        }
    }

    public Elevator(int height,
                    int width,
                    int weight,
                    String name,
                    String manufacturer,
                    String model,
                    int capacity,
                    int numberOfButtons,
                    double speed) {
        super(height, width, weight, name, manufacturer, model, "elevator");
        this.capacity = capacity;
        this.numberOfButtons = numberOfButtons;
        this.speed = speed;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public int getFlor() {
        return flor;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isBusy() {
        return busy;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setFlor(int flor) {
        this.flor = flor;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public boolean isClosedDoor() {
        return closedDoor;
    }

    public void setClosedDoor(boolean closedDoor) {
        this.closedDoor = closedDoor;
    }
}
