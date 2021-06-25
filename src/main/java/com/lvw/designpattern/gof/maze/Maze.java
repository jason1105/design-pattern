package com.lvw.designpattern.gof.maze;

import java.util.HashMap;
import java.util.Map;

public class Maze {

    Map<Integer, Room> rooms = new HashMap<>();

    public Maze() {

    }

    public void AddRoom(Room room) {
        rooms.put(room._roomNumber, room);
    }

    Room RoomNumber(int roomNumber) {
        return rooms.get(roomNumber);
    }
}
