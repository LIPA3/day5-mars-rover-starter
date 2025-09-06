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
        String[] directions = {NORTH, EAST, SOUTH, WEST};
        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equals(direction)) {
                direction = directions[(i + 3) % 4];
                break;
            }
        }
    }

    private void turnRight() {
        String[] directions = {NORTH, EAST, SOUTH, WEST};
        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equals(direction)) {
                direction = directions[(i + 1) % 4];
                break;
            }
        }
    }

    private void moveForward() {
        int[] deltaX = {0, 1, 0, -1}; // N, E, S, W 对应的 x 偏移
        int[] deltaY = {1, 0, -1, 0}; // N, E, S, W 对应的 y 偏移
        String[] directions = {NORTH, EAST, SOUTH, WEST};

        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equals(direction)) {
                x += deltaX[i];
                y += deltaY[i];
                break;
            }
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
