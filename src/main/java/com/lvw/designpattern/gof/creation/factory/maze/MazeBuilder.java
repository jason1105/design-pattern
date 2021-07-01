package com.lvw.designpattern.gof.creation.factory.maze;

import com.lvw.designpattern.gof.creation.factory.maze.default_.Maze;

public interface MazeBuilder {

    void BuildMaze();

    void BuildRoom(int roomNumber);

    void BuildDoor(int r1, int r2);

    Maze getMaze();
}
