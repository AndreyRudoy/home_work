package com.rudoy.hm014;

/**
 * Created by OmEz on 14.04.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Time time = new Time(12, 0,0);
        Time time2 = new Time(12, 30, 0);
        if(time.before(time2)){
            System.out.println("First time is earlier than second time: "+time.toString());
        }

    }
}
