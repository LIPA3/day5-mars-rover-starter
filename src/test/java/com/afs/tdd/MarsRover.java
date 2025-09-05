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
    public int GetY() {
        return y;
    }

    public int GetX() {
        return x;
    }
}
