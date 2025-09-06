package com.afs.tdd;

public class MarsRover {
    private int y;
    private int x;
    private String command;
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String SOUTH = "S";
    public static final String EAST = "E";

    public MarsRover(int x, int y, String command) {
        this.x = x;
        this.y = y;
        this.command = command;
    }

    public void excuteCommand(String command) {

        if (command.equals(NORTH)) {
            y++;
        } else if (command.equals(SOUTH)) {
            y--;
        } else if (command.equals(WEST)) {
            x--;
        } else if (command.equals(EAST)) {
            x++;
        }
    }
    public String changeDirection(String command, String direction) {
        if (command.equals("left")) {
            if (direction.equals(NORTH)) {
                direction = WEST;
            } else if (direction.equals(WEST)) {
                direction = SOUTH;
            } else if (direction.equals(SOUTH)) {
                direction = EAST;
            } else if (direction.equals(EAST)) {
                direction = NORTH;
            }
        } else if (command.equals("right")) {
            if (direction.equals(NORTH)) {
                direction = EAST;
            } else if (direction.equals(EAST)) {
                direction = SOUTH;
            } else if (direction.equals(SOUTH)) {
                direction = WEST;
            } else if (direction.equals(WEST)) {
                direction = NORTH;
            }
        }
        return direction;
    }
    public int GetY() {
        return y;
    }

    public int GetX() {
        return x;
    }
}
