package com.lvw.designpattern.gof.creation.factory.maze.bombed;

import com.lvw.designpattern.gof.creation.factory.maze.Direction;
import com.lvw.designpattern.gof.creation.factory.maze.MazeBuilder;
import com.lvw.designpattern.gof.creation.factory.maze.MazeFactory;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Door;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Maze;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Room;

import java.util.HashMap;
import java.util.Map;

public class BombedMazeBuilder implements MazeBuilder {

    MazeFactory factory = new BombedMazeFactory();
    Maze maze;
    Map<Integer, RoomWithABomb> rooms = new HashMap<>();

    public BombedMazeBuilder() {
    }

    @Override
    public void BuildMaze() {
        maze = factory.MakeMaze();
    }

    @Override
    public void BuildRoom(int roomNumber) {
        RoomWithABomb room = (RoomWithABomb)factory.MakeRoom(roomNumber);
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
