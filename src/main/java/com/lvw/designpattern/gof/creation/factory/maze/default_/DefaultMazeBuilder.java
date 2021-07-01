package com.lvw.designpattern.gof.creation.factory.maze.default_;

import com.lvw.designpattern.gof.creation.factory.maze.Direction;
import com.lvw.designpattern.gof.creation.factory.maze.MazeBuilder;
import com.lvw.designpattern.gof.creation.factory.maze.MazeFactory;

import java.util.HashMap;
import java.util.Map;

public class DefaultMazeBuilder implements MazeBuilder {

    MazeFactory factory = new DefaultMazeFactory();
    Maze maze;
    Map<Integer, Room> rooms = new HashMap<>();

    public DefaultMazeBuilder() {
    }

    @Override
    public void BuildMaze() {
        maze = factory.MakeMaze();
    }

    @Override
    public void BuildRoom(int roomNumber) {
        Room room = factory.MakeRoom(roomNumber);
        rooms.put(roomNumber, room);
        maze.AddRoom(room);
    }

    @Override
    public void BuildDoor(int r1, int r2) {

        Room room1 = rooms.get(r1);
        Room room2 = rooms.get(r2);
        Door door = factory.MakeDoor(room1, room2);

        room1.SetSide(Direction.East, door);
        room1.SetSide(Direction.West, factory.MakeWall());
        room1.SetSide(Direction.South, factory.MakeWall());
        room1.SetSide(Direction.North, factory.MakeWall());

        room2.SetSide(Direction.East, factory.MakeWall());
        room2.SetSide(Direction.West, door);
        room2.SetSide(Direction.South, factory.MakeWall());
        room2.SetSide(Direction.North, factory.MakeWall());
    }

    @Override
    public Maze getMaze() {
        return maze;
    }

    /*public Maze CreateMaze(MazeFactory factory) {

        r1.SetSide(Direction.East, door);
        r1.SetSide(Direction.West, factory.MakeWall());
        r1.SetSide(Direction.South, factory.MakeWall());
        r1.SetSide(Direction.North, factory.MakeWall());

        r2.SetSide(Direction.East, factory.MakeWall());
        r2.SetSide(Direction.West, door);
        r2.SetSide(Direction.South, factory.MakeWall());
        r2.SetSide(Direction.North, factory.MakeWall());


        return maze;
    }*/
}
