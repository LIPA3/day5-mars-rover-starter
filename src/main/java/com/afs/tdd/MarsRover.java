package com.afs.tdd;

import java.util.stream.IntStream;

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
        String[] directions = {NORTH, EAST, SOUTH, WEST};
        IntStream.range(0, directions.length)
                .filter(i -> directions[i].equals(direction))
                .findFirst()
                .ifPresent(i -> direction = directions[(i + 3) % 4]);
    }

    private void turnRight() {
        String[] directions = {NORTH, EAST, SOUTH, WEST};
        IntStream.range(0, directions.length)
                .filter(i -> directions[i].equals(direction))
                .findFirst()
                .ifPresent(i -> direction = directions[(i + 1) % 4]);
    }

    private void moveForward() {
        int[] deltaX = {0, 1, 0, -1};
        int[] deltaY = {1, 0, -1, 0};
        String[] directions = {NORTH, EAST, SOUTH, WEST};

        IntStream.range(0, directions.length)
                .filter(i -> directions[i].equals(direction))
                .findFirst()
                .ifPresent(i -> {
                    x += deltaX[i];
                    y += deltaY[i];
                });
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
