package com.lvw.designpattern.gof.client;

import com.lvw.designpattern.gof.maze.Direction;
import com.lvw.designpattern.gof.maze.MazeBuilder;
import com.lvw.designpattern.gof.maze.MazeFactory;
import com.lvw.designpattern.gof.maze.bombed.BombedMazeBuilder;
import com.lvw.designpattern.gof.maze.bombed.BombedMazeFactory;
import com.lvw.designpattern.gof.maze.bombed.BombedWall;
import com.lvw.designpattern.gof.maze.bombed.RoomWithABomb;
import com.lvw.designpattern.gof.maze.default_.Door;
import com.lvw.designpattern.gof.maze.default_.Maze;
import com.lvw.designpattern.gof.maze.default_.Room;

// Client source.
public class MazeGameBomb<R> {

    public static void main(String[] args) {

        // use abstract factory to create various game of type
        MazeGameBomb<Room> bombGame = new MazeGameBomb();
        Maze maze = bombGame.CreateMaze(new BombedMazeBuilder()); // use builder
        System.out.println(maze);

    }

    public Maze CreateMaze(MazeBuilder builder) { // use interface instead of concrete class

        builder.BuildMaze();
        builder.BuildRoom(1);
        builder.BuildRoom(2);
        builder.BuildDoor(1,2);

        return builder.getMaze();
    }

    /*public Maze CreateMaze(MazeFactory factory) {

        *//*
        Use simple factory instead of 'new'.
        *//*
        Maze maze = factory.MakeMaze();

        RoomWithABomb r1 = (RoomWithABomb)factory.MakeRoom(1);
        RoomWithABomb r2 = (RoomWithABomb)factory.MakeRoom(2);
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

        System.out.println(r1.getBomb());
        System.out.println(((BombedWall) r1.GetSide(Direction.North)).getBomb());

        return maze;
    }*/
}
