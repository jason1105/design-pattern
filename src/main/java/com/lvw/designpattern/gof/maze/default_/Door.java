package com.lvw.designpattern.gof.maze.default_;

import com.lvw.designpattern.gof.maze.MapSite;

public class Door implements MapSite {

    Room _room1, _room2;
    boolean _isOpen;

    public Door(Room _room1, Room _room2) {
        this._room1 = _room1;
        this._room2 = _room2;
    }

    @Override
    public void Enter() {

    }

    @Override
    public String toString() {
        return "Door{" +
                "_room1=" + _room1.get_roomNumber() +
                ", _room2=" + _room2.get_roomNumber() +
                ", _isOpen=" + _isOpen +
                '}';
    }
}
