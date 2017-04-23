package com.rudoy.hm015.Issue1;

/**
 * Created by OmEz on 23.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.maxSpeed = 120;
        transport.name = "bmw";
        transport.year = 1998;
        System.out.println(transport.toString());

        Bus bus = new Bus();
        bus.capacity = 2000;
        bus.year = 2001;
        bus.name = "Bogdan";
        bus.mark = "mercedes";
        bus.maxSpeed = 160;
        System.out.println(bus.toString());

        bus.setCapacityAndMaxSpeedAndYear(3000, 500, 2000);
        System.out.println(bus.toString());
    }
}
