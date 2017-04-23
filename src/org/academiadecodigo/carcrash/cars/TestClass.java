package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;

/**
 * Created by codecadet on 11/10/16.
 */
public class TestClass {

    public static void main(String[] args) {


        Field.init(30, 30);

        Polo car = new Polo();


        System.out.println(car);
        car.move();

    }
}

