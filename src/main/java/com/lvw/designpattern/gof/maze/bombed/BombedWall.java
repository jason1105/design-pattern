package com.lvw.designpattern.gof.maze.bombed;

import com.lvw.designpattern.gof.maze.default_.Wall;

public class BombedWall extends Wall {
    String bomb = "BombedWall";

    public String getBomb() {
        return bomb;
    }
}
