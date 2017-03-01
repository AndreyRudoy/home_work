package com.rudoy.hw002.issue7;

/**
 * Created by OmEz on 01.03.2017.
 */
public class IssueSeven {

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(
                new Coordinate(1.0, 2.0),
                new Coordinate(2.0, 3.5)
        );

        Rectangle rec2 = new Rectangle(
                new Coordinate(1.0, 2.0),
                new Coordinate(2.0, 3.0)
        );

        System.out.println(rec1.contains(rec2));

    }
}
