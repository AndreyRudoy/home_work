package com.rudoy.hm0017;

/**
 * Created by OmEz on 14.05.2017.
 */
public abstract class Route {

    private final int interval;
    private final Transport transport;
    private final int total;

    public Route(int interval, Transport transport, int total) {
        this.interval = interval;
        this.transport = transport;
        this.total = total;
    }


}
