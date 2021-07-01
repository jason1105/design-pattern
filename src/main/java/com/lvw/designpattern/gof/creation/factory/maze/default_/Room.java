package com.lvw.designpattern.gof.creation.factory.maze.default_;

import com.lvw.designpattern.gof.creation.factory.maze.Direction;
import com.lvw.designpattern.gof.creation.factory.maze.MapSite;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {

    int _roomNumber;

    Map<Direction, MapSite> _sides = new HashMap<>();

    public Room(int _roomNumber) {
        this._roomNumber = _roomNumber;
    }

    @Override
    public void Enter() {

    }

    public void SetSide(Direction direction, MapSite mapSite) {
        _sides.put(direction, mapSite);
    }

    public MapSite GetSide(Direction direction) {
        return _sides.get(direction);
    }



    public int get_roomNumber() {
        return _roomNumber;
    }

    public void set_roomNumber(int _roomNumber) {
        this._roomNumber = _roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "_roomNumber=" + _roomNumber +
                ", _sides=" + _sides +
                '}';
    }
}
