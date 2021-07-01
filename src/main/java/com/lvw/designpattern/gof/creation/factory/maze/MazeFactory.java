package com.lvw.designpattern.gof.creation.factory.maze;

import com.lvw.designpattern.gof.creation.factory.maze.default_.Door;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Maze;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Room;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Wall;

// abstract factory
// defined a set of method to generate classes associated.
public interface MazeFactory {

    public Maze MakeMaze();

    public Door MakeDoor(Room r1, Room r2);

    public Room MakeRoom(int roomNumber);

    public Wall MakeWall();
}
