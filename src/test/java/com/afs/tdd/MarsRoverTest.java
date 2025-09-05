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

}
