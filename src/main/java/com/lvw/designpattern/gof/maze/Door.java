package com.lvw.designpattern.gof.maze;

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
}
