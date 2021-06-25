package com.lvw.designpattern.gof.client;

import com.lvw.designpattern.gof.maze.*;

// Client source.
public class MazeGame {

    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        mazeGame.CreateMaze();
    }

    public Maze CreateMaze() {

        /*
        There is a problem below:
        should not use concrete class, in other words,
        there should be not use 'new'.
        */
        Maze maze = new Maze();

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door door = new Door(r1, r2);

        r1.SetSide(Direction.East, door);
        r1.SetSide(Direction.West, new Wall());
        r1.SetSide(Direction.South, new Wall());
        r1.SetSide(Direction.North, new Wall());

        r2.SetSide(Direction.East, new Wall());
        r2.SetSide(Direction.West, door);
        r2.SetSide(Direction.South, new Wall());
        r2.SetSide(Direction.North, new Wall());

        maze.AddRoom(r1);
        maze.AddRoom(r2);

        return maze;
    }
}
