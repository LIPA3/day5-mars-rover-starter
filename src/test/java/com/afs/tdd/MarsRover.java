package com.afs.tdd;

public class MarsRover {
    private int y;
    private int x;
    private String command;
    private String direction;

    public MarsRover(int x, int y, String command) {
        this.x = x;
        this.y = y;
        this.command = command;
    }

    public void excuteCommand(String command) {
        if (command.equals("N")) {
            y++;
        } else if (command.equals("S")) {
            y--;
        } else if (command.equals("W")) {
            x--;
        } else if (command.equals("E")) {
            x++;
        }
    }
    public String changeDirection(String command, String direction) {
        if (command.equals("left")) {
            if (direction.equals("N")) {
                direction = "W";
            } else if (direction.equals("W")) {
                direction = "S";
            } else if (direction.equals("S")) {
                direction = "E";
            } else if (direction.equals("E")) {
                direction = "N";
            }
        } else if (command.equals("right")) {
            if (direction.equals("N")) {
                direction = "E";
            } else if (direction.equals("E")) {
                direction = "S";
            } else if (direction.equals("S")) {
                direction = "W";
            } else if (direction.equals("W")) {
                direction = "N";
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
