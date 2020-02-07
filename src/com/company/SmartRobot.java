package com.company;

public class SmartRobot extends Robot {
    public SmartRobot(){
        super(Direction.UP, 0,0);
    }
    public void moveTo(int toX, int toY){
        //System.out.println(getDirection().toString());
        System.out.print("Путь робота:");

        if (getX() < toX){
            while (getDirection() != Direction.RIGHT) {
                turnRight();
            }

            System.out.print(" вправо ");
        }
        if (getX() > toX) {
            while (direction != Direction.LEFT) {
                turnLeft();
            }
            System.out.print(" влево ");
        }
        while (getX() != toX){
            stepForward();
            System.out.print(" вперёд ");
        }

        if (getY() < toY){
            while (direction != Direction.UP) {
                turnLeft();
            }
            System.out.print(" вверх ");
        }
        if (getY() > toY){
            while (direction != Direction.DOWN) {
                turnRight();
            }
            System.out.print(" вниз ");
        }
        while (getY() != toY){
            stepForward();
            System.out.print(" вперёд ");
        }
    }
}
