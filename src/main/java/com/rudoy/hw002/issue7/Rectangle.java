package com.rudoy.hw002.issue7;

/**
 * Created by OmEz on 01.03.2017.
 */
public class Rectangle {

    private final Coordinate _leftAndDown;
    private final Coordinate _rightAndUp;

    public Rectangle(Coordinate leftAndDown, Coordinate rightAndUp) {
        _leftAndDown = leftAndDown;
        _rightAndUp = rightAndUp;
    }

    public boolean contains(Rectangle other) {
        boolean conditionOne = this._leftAndDown.isDown(other._leftAndDown) | this._leftAndDown.notUpOrDown(other._leftAndDown);
        boolean conditionTwo = this._leftAndDown.isLeft(other._leftAndDown) | this._leftAndDown.notRightOrLeft(other._leftAndDown);
        boolean conditionThree = this._rightAndUp.isUp(other._rightAndUp) | this._rightAndUp.notUpOrDown(other._rightAndUp);
        boolean conditionFour = this._rightAndUp.isRight(other._rightAndUp) | this._rightAndUp.notRightOrLeft(other._rightAndUp);
        return conditionOne & conditionTwo & conditionThree & conditionFour;
    }
}
