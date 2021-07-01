package com.lvw.designpattern.gof.creation.factory.maze.enchanted;

import com.lvw.designpattern.gof.creation.factory.maze.default_.Door;
import com.lvw.designpattern.gof.creation.factory.maze.MazeFactory;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Maze;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Room;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Wall;

// omitted implements
public class EnchantedMazeFactory implements MazeFactory {

    @Override
    public Maze MakeMaze() {
        return null;
    }

    @Override
    public Door MakeDoor(Room r1, Room r2) {
        return null;
    }

    @Override
    public Room MakeRoom(int roomNumber) {
        return null;
    }

    @Override
    public Wall MakeWall() {
        return null;
    }
}
