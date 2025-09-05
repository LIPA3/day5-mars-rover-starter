package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_y_when_command_M_direction_N(){
        String command="N";
        MarsRover marsRover=new MarsRover(0,0,command);
        marsRover.excuteCommand(command);
        assertEquals(1,marsRover.GetY());
    }

    @Test
    public void should_return_y_when_command_M_direction_S(){
        String command="S";
        MarsRover marsRover=new MarsRover(0,0,command);
        marsRover.excuteCommand(command);
        assertEquals(-1,marsRover.GetY());
    }
    @Test
    public void should_return_x_when_command_M_direction_W(){
        String command="W";
        MarsRover marsRover=new MarsRover(0,0,command);
        marsRover.excuteCommand(command);
        assertEquals(-1,marsRover.GetX());
    }

    @Test
    public void should_return_x_when_command_M_direction_E(){
        String command="E";
        MarsRover marsRover=new MarsRover(0,0,command);
        marsRover.excuteCommand(command);
        assertEquals(1,marsRover.GetX());
    }

    @Test
    public void should_return_x1_y2_N_when_x1_y1_move_N(){
        String command="N";
        MarsRover marsRover=new MarsRover(1,1,command);
        marsRover.excuteCommand(command);
        assertEquals(1,marsRover.GetX());
        assertEquals(2,marsRover.GetY());
    }
    @Test
    public void should_return_x1_y0_N_when_x1_y1_move_S(){
        String command="S";
        MarsRover marsRover=new MarsRover(1,1,command);
        marsRover.excuteCommand(command);
        assertEquals(1,marsRover.GetX());
        assertEquals(0,marsRover.GetY());
    }
    @Test
    public void should_return_x0_y1_W_when_x1_y1_move_W(){
        String command="W";
        MarsRover marsRover=new MarsRover(1,1,command);
        marsRover.excuteCommand(command);
        assertEquals(0,marsRover.GetX());
        assertEquals(1,marsRover.GetY());
    }

    @Test
    public void should_return_x2_y1_S_when_x1_y1_move_E(){
        String command="E";
        MarsRover marsRover=new MarsRover(1,1,command);
        marsRover.excuteCommand(command);
        assertEquals(2,marsRover.GetX());
        assertEquals(1,marsRover.GetY());
    }
}
