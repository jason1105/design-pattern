package com.lvw.designpattern.headfirst.c06command.frame;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No action.");
    }

    @Override
    public void undo() {
        System.out.println("No action.");
    }
}
