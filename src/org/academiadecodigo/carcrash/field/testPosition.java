package org.academiadecodigo.carcrash.field;



/**
 * Created by codecadet on 11/10/16.
 */
public class testPosition {

    public static void main(String[] args) {

        Position p1 = new Position(10,10);

        System.out.println(p1);
        p1.move(Direction.DOWN);
        System.out.println(p1);
        p1.move(Direction.UP);
        System.out.println(p1);
        p1.move(Direction.LEFT);
        System.out.println(p1);
        p1.move(Direction.RIGHT);
        System.out.println(p1);


    }
}
