package com.lvw.designpattern.gof.client;

import com.lvw.designpattern.gof.maze.*;
import com.lvw.designpattern.gof.maze.bombed.BombedMazeFactory;
import com.lvw.designpattern.gof.maze.default_.DefaultMazeFactory;
import com.lvw.designpattern.gof.maze.default_.Door;
import com.lvw.designpattern.gof.maze.default_.Maze;
import com.lvw.designpattern.gof.maze.default_.Room;

// Client source.
public class MazeGame {

    public static void main(String[] args) {

        // use abstract factory to create various game of type
        MazeGame game = new MazeGame();
        Maze maze = game.CreateMaze(new DefaultMazeFactory());
        System.out.println(maze);

    }

    public Maze CreateMaze(MazeFactory factory) {

        /*
        Use simple factory instead of 'new'.
        */
        Maze maze = factory.MakeMaze();

        Room r1 = factory.MakeRoom(1);
        Room r2 = factory.MakeRoom(2);
        Door door = factory.MakeDoor(r1, r2);

        r1.SetSide(Direction.East, door);
        r1.SetSide(Direction.West, factory.MakeWall());
        r1.SetSide(Direction.South, factory.MakeWall());
        r1.SetSide(Direction.North, factory.MakeWall());

        r2.SetSide(Direction.East, factory.MakeWall());
        r2.SetSide(Direction.West, door);
        r2.SetSide(Direction.South, factory.MakeWall());
        r2.SetSide(Direction.North, factory.MakeWall());

        maze.AddRoom(r1);
        maze.AddRoom(r2);

        return maze;
    }
}
