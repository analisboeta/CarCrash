package org.academiadecodigo.carcrash;

/**
 * Created by codecadet on 11/10/16.
 */
public class RandomNum {

    public static int generateRandomNumber(int max) {

        return generateRandomNumberBetween(0, max);

    }

    public static int generateRandomNumberBetween(int min, int max) {

        return (int) (Math.random() * (max - min) + min);

    }





}
