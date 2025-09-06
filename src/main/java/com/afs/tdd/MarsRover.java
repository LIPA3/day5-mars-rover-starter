package com.afs.tdd;

public class MarsRover {
    private int y;
    private int x;
    private String command;
    public static final String LEFT_COMMAND = "L";
    public static final String RIGHT_COMMAND = "R";
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void executeCommand(String command) {
        switch (command) {
            case LEFT_COMMAND:
                turnLeft();
                break;
            case RIGHT_COMMAND:
                turnRight();
                break;
            default:
                moveForward();
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case EAST:
                direction = NORTH;
                break;
            default:
                direction = SOUTH;
                break;
        }
    }

    private void turnRight() {
        switch (direction) {
            case NORTH:
                direction = EAST;
                break;
            case SOUTH:
                direction = WEST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            default:
                direction = NORTH;
                break;
        }
    }

    private void moveForward() {
        switch (direction) {
            case NORTH:
                ++y;
                break;
            case EAST:
                ++x;
                break;
            case SOUTH:
                --y;
                break;
            default:
                --x;
                break;
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public String getDirection() {
        return direction;
    }

}
