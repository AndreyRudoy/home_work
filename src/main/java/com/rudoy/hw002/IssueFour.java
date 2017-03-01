package com.rudoy.hw002;

/**
 * Created by OmEz on 26.02.2017.
 */
public class IssueFour {
    public static void main(String[] args) {
        boolean x, y;
        x = true;
        y = false;
        //а) не (X и не Y) или X;
        //б) Y и не X или не Y;
        //в) не Y и не X или Y.
        boolean a = !(x & (! y)) | x;
        boolean b = y & (! x) | (! y);
        boolean c = ! y & (! x) | y;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
