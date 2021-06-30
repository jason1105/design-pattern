package com.lvw.designpattern.gof.factory.maze.default_;

import com.lvw.designpattern.gof.factory.maze.MazeFactory;

public class DefaultMazeFactory implements MazeFactory {

    public Maze MakeMaze() {
        return new Maze();
    }

    public Door MakeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    public Room MakeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    public Wall MakeWall() {
        return new Wall();
    }
}
