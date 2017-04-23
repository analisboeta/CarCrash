package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.RandomNum;
import org.academiadecodigo.carcrash.cars.Car;

public class Position {

    private int col;
    private int row;

    /*
    duas maneiras de construir uma posição - uma em que não sao passados argumentos e é escolhida uma
    posição ao acaso no campo gerado, outra em que designamos exatamente qual a posição que queremos ocupada.
     */
    public Position() {

        this.col = (int) (RandomNum.generateRandomNumber(Field.width));

        this.row = (int) (RandomNum.generateRandomNumber(Field.height));
    }

    public Position(int row, int col) {

        this.col = col;
        this.row = row;

    }

    // Usar o enum para selecionar um tipo de movimento!!
    public boolean move(Direction dir) {
        // Variável para evitar returns a mais no switch e para garantir o return final
        boolean toReturn = false;
        switch (dir) {
            case UP:
                toReturn = moveUp();
                break;
            case DOWN:
                toReturn = moveDown();
                break;
            case LEFT:
                toReturn = moveLeft();
                break;
            case RIGHT:
                toReturn = moveRight();
                break;
            default:
                System.out.println("something really bad");
        }

        return toReturn;
//        return this;  // com o switch escolhes uma posicao que depois é devolvida atraves da palavra THIS para o move
    }


    /*
    A posição apenas terá acesso aos quatro atos de alterar a posição (move up down left and right) e
    a um método equals to, ao qual foi feito override, de modo a ser capaz de comparar uma posição com outra posição.
     */
    public boolean moveUp() {

        if (row == 0) {
            return false;
        }
        row--;
        return true;
    }

    public boolean moveDown() {
        if (row == (Field.height-1)) {
            return false;
        }
        row++;
        return true;
    }


    public boolean moveLeft() {
        if (col == 0) {
            return false;
        }
        col--;
        return true;
    }


    public boolean moveRight() {
        if (col == (Field.width-1)) {
            return false;
        }
        col++;
        return true;
    }


    @Override
    public boolean equals(Object obj) {

        if ((this.col == ((Position) obj).getCol()) && this.row == ((Position) obj).getRow()) {
            ((Car) obj).setCrashed(true);
            return true;

        } else {
            return false;
        }
    }


     /*
     Getter and Setter methods
      */

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "Position is: " + col + ", " + row;
    }
}