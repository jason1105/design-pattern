package com.lvw.designpattern.gof.client;

import com.lvw.designpattern.gof.maze.*;
import com.lvw.designpattern.gof.maze.bombed.BombedMazeFactory;
import com.lvw.designpattern.gof.maze.default_.*;

// Client source.
public class MazeGame {

    public static void main(String[] args) {

        // use abstract factory to create various game of type
        MazeGame game = new MazeGame();
        Maze maze = game.CreateMaze(new DefaultMazeBuilder());
        System.out.println(maze);

    }

    public Maze CreateMaze(MazeBuilder builder) { // use interface instead of concrete class

        builder.BuildMaze();
        builder.BuildRoom(1);
        builder.BuildRoom(2);
        builder.BuildDoor(1,2);

        return builder.getMaze();
    }
}
