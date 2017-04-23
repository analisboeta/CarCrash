package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.RandomNum;
import org.academiadecodigo.carcrash.field.Direction;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    Position pos;
    Direction dir;
    boolean crashed;


    //
    public Car() {
        this.pos = new Position();
        this.dir = Direction.getRandomDirection();
    }


    public void move() {

        chooseDirection();
        pos.move(dir); // remete para o switch da position

        boolean canMove = pos.move(dir);

        if (!canMove) {
            pos.move(Direction.getOppositeDirection(dir));
        }

    }

    public void chooseDirection() {

        int random = RandomNum.generateRandomNumber(100);

        if (random < 60) {
            this.dir = dir;
        } else {
            Direction d = Direction.getRandomDirection();

            this.dir = d;

            while (d == Direction.getOppositeDirection(dir)) {

                        // "oh direction.left, diz me ai qual e o opposite do down!
                        //Direction.LEFT.getOppositeDirection(Direction.DOWN)
                d = Direction.getRandomDirection();

                this.dir = d;
            }
            //this.dir = d;
        }

    }
                        /* para testes devolver uma direccao completamente random, depois
                        testa qualquer coisa deste genero
                        int random = random (0,100)
                        if <80
                        this.dir=dir;
                        if >80
                        Direction d = Direction.getrandomDir()
                        se d == get opposite --> choosedirection();
                        else dir == d


                       versao anterior, completamente random:
                        return Direction.getRandomDirection(); */


// getters and Setters


    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "pos=" + pos +
                ", dir=" + dir +
                ", crashed=" + crashed +
                '}';
    }
}

