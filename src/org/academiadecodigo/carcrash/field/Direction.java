package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.RandomNum;

/**
 * Created by codecadet on 10/10/16.
 */
public enum Direction {

    UP,
    DOWN,
    LEFT,
    RIGHT;


    // This method will choose a single method in the enum,
    public static Direction getRandomDirection() {
        return Direction.values()[RandomNum.generateRandomNumberBetween(0, 3)];
    }


    public static Direction getOppositeDirection(Direction dir) {

        switch (dir) {
            case UP:
                return DOWN;
            case DOWN:
                return UP;
            case LEFT:
                return RIGHT;
            case RIGHT:
                return LEFT;
            default:
                System.out.println("something really bad happened");
                return null;
        }
    }
}

