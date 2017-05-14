package com.rudoy.hm0017;

/**
 * Created by OmEz on 14.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Route trRoute = new TramRoute(15, new Tram(), 6);
        Route busRoute = new BusRoute(10, new Bus(), 5);
        Route trolleyRoute = new TrolleybusRoute(8, new Trolleybus(), 6);
        Route[] routes = new Route[]{trRoute, busRoute};
        TransportSystem system = new TransportSystem (routes);

    }
}
