package com.lvw.designpattern.gof.creation.factory.client;

import com.lvw.designpattern.gof.creation.factory.maze.MazeFactory;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Maze;
import com.lvw.designpattern.gof.creation.factory.maze.default_.Room;
import com.lvw.designpattern.gof.creation.factory.maze.enchanted.EnchantedMazeFactory;

// Client source.
public class EnchantedGame<R> {

    public static void main(String[] args) {

        // omitted...
        EnchantedGame<Room> bombGame = new EnchantedGame();
        bombGame.CreateMaze(new EnchantedMazeFactory());

    }

    public Maze CreateMaze(MazeFactory factory) {

        // omitted
        return null;
    }
}
