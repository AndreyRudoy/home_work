package com.rudoy.hm016;

/**
 * Created by OmEz on 01.05.2017.
 */
public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator(40, 60, 380, "Maximus", "China",
                "ST-12", 4, 30, 30);
        House house = new House("Road str, 21", 24, -2, elevator);

        house.callElevatorOnFlor(12);
    }

}
