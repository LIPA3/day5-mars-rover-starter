package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_y_when_command_M_direction_N(){
        String direction = "N";
        String command = "M";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_y_when_command_M_direction_S(){
        String direction = "S";
        String command = "M";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(-1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }
    @Test
    public void should_return_x_when_command_M_direction_W(){
        String direction = "W";
        String command = "M";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(-1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_x_when_command_M_direction_E(){
        String direction = "E";
        String command = "M";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_x1_y1_W_when_x1_y1_left_N(){
        String direction = "N";
        String command = "L";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }
    @Test
    public void should_return_x1_y1_E_when_x1_y1_left_S(){
        String direction = "S";
        String command = "L";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }
    @Test
    public void should_return_x1_y1_N_when_x1_y1_left_E(){
        String direction = "E";
        String command = "L";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }
    @Test
    public void should_return_x1_y1_S_when_x1_y1_left_W(){
        String direction = "W";
        String command = "L";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }
    @Test
    public void should_return_x1_y1_E_when_x1_y1_right_N(){
        String direction = "N";
        String command = "R";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }
    @Test
    public void should_return_x1_y1_S_when_x1_y1_right_E(){
        String direction = "E";
        String command = "R";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }
    @Test
    public void should_return_x1_y1_W_when_x1_y1_right_S(){
        String direction = "S";
        String command = "R";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }
    @Test
    public void should_return_x1_y1_N_when_x1_y1_right_W(){
        String direction = "W";
        String command = "R";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_x1_y0_N_when_x1_y1_command_B_direction_N(){
        String direction = "N";
        String command = "B";
        int x = 1;
        int y = 1;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_x0_y0_S_when_x0_y1_command_B_direction_S(){
        String direction = "S";
        String command = "B";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_x1_y0_W_when_x0_y0_command_B_direction_W(){
        String direction = "W";
        String command = "B";
        int x = 0;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_x0_y0_E_when_x1_y0_command_B_direction_E(){
        String direction = "E";
        String command = "B";
        int x = 1;
        int y = 0;
        MarsRover marsRover = new MarsRover(x, y, direction);

        marsRover.executeCommand(command);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }
}
