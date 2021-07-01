package com.lvw.designpattern.gof.creation.factory.maze.default_;

import java.util.HashMap;
import java.util.Map;

public class Maze {

    Map<Integer, Room> rooms = new HashMap<>();

    public Maze() {

    }

    public void AddRoom(Room room) {
        rooms.put(room.get_roomNumber(), room);
    }

    Room RoomNumber(int roomNumber) {
        return rooms.get(roomNumber);
    }

    @Override
    public String toString() {
        return "Maze{" +
                "rooms=" + rooms +
                '}';
    }
}
