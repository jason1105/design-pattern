package com.lvw.designpattern.gof.maze.bombed;

import com.lvw.designpattern.gof.maze.default_.Room;

public class RoomWithABomb extends Room {

    String bomb = "bomb";

    public RoomWithABomb(int _roomNumber) {
        super(_roomNumber);
    }

    public String getBomb() {
        return bomb;
    }
}
