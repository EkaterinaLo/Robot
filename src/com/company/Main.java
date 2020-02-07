package com.company;

public class Main {

    public static void main(String[] args) {
	SmartRobot mySmartRobot = new SmartRobot();
	mySmartRobot.moveTo(3, 0);
        System.out.println(mySmartRobot);

    }

}
class Robot {
    int x;
    int y;
    Direction direction = Direction.UP;
    public enum Direction {UP, DOWN, LEFT, RIGHT}

    public Robot(Direction directionTo, int toX, int toY) {
        direction = directionTo;
        x = toX;
        y = toY;
    }

    public Robot() {
        direction = Direction.UP;
        x = 0;
        y = 0;
    }

    public Direction getDirection() { // текущее направление взгляда
        return direction;
    }

    public int getX() { // текущая координата X
        return x;
    }

    public int getY() { // текущая координата Y
        return y;
    }

    public void turnLeft() { // повернуться на 90 градусов против часовой стрелки
        if (direction == Direction.UP) {
            direction = Direction.LEFT;
            return;
        }
        if (direction == Direction.LEFT) {
            direction = Direction.DOWN;
            return;
        }
        if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;
            return;
        }
        if (direction == Direction.RIGHT) {
            direction = Direction.UP;
            return;
        }


    }

    public void turnRight() {  // повернуться на 90 градусов по часовой стрелке
       if (direction == Direction.UP) {
           direction = Direction.RIGHT;
           return;
       }
       if (direction == Direction.RIGHT) {
           direction = Direction.DOWN;
           return;
       }
       if (direction == Direction.DOWN) {
           direction = Direction.LEFT;
           return;
       }
       if (direction == Direction.LEFT) {
           direction = Direction.UP;
           return;
        }
    }

    public void stepForward() {// шаг в направлении взгляда за один шаг робот изменяет одну свою координату на единицу
        if (direction == Direction.UP) {
            y++;
        }
        if (direction == Direction.RIGHT) {
           x++;
        }
        if (direction == Direction.DOWN) {
            y--;
        }
        if (direction == Direction.LEFT) {
            x--;
        }

    }

    @Override
    public String toString() {
        return "\n Координаты робота: " + "x = " + x + " " + "y = " + y;
    }
}



