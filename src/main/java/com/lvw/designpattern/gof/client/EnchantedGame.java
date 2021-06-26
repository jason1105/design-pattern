package com.lvw.designpattern.gof.client;

import com.lvw.designpattern.gof.maze.MazeFactory;
import com.lvw.designpattern.gof.maze.default_.Maze;
import com.lvw.designpattern.gof.maze.default_.Room;
import com.lvw.designpattern.gof.maze.enchanted.EnchantedMazeFactory;

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
