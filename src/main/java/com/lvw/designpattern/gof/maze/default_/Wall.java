package com.lvw.designpattern.gof.maze.default_;

import com.lvw.designpattern.gof.maze.MapSite;

public class Wall implements MapSite {

    public Wall() {
    }

    @Override
    public void Enter() {

    }

    public static class DoorNeedingSpell extends Door {
        public DoorNeedingSpell(Room _room1, Room _room2) {
            super(_room1, _room2);
        }
    }
}
