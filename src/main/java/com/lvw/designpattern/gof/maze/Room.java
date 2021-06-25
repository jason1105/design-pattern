package com.lvw.designpattern.gof.maze;

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

    MapSite GetSide(Direction direction) {
        return _sides.get(direction);
    }


}
