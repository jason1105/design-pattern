package com.lvw.designpattern.gof.factory.maze.bombed;

import com.lvw.designpattern.gof.factory.maze.MazeFactory;
import com.lvw.designpattern.gof.factory.maze.default_.*;

public class BombedMazeFactory implements MazeFactory {


    @Override
    public Maze MakeMaze() {
        return new Maze();
    }

    // @Override
    // public Door MakeDoor(Room r1, Room r2) {
    //     return null;
    // }

    @Override
    public Door MakeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    @Override
    public RoomWithABomb MakeRoom(int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }

    @Override
    public BombedWall MakeWall() {
        return new BombedWall();
    }
}
