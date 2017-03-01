package com.rudoy.hw002.issue7;

/**
 * Created by OmEz on 01.03.2017.
 */
public class Coordinate {

    private final double _x;
    private final double _y;

    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }

    public Coordinate(double x, double y) {
        _x = x;
        _y = y;
    }

    public boolean isLeft(Coordinate other) {
        return other.getX() > this._x;
    }

    public boolean isRight(Coordinate other) {
        return other.getX() < this._x;
    }

    public boolean notRightOrLeft(Coordinate other) {
        return other.getX() == this._x;
    }

    public boolean isDown(Coordinate other) {
        return other.getY() > this._y;
    }

    public boolean isUp(Coordinate other) {
        return other.getY() < this._y;
    }

    public boolean notUpOrDown(Coordinate other) {
        return other.getY() == this._y;
    }
}
