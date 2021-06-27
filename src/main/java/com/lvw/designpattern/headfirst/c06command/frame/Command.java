package com.lvw.designpattern.headfirst.c06command.frame;

/**
 * 命令接口, 实现此接口的对象都是一个命令.
 */
public interface Command {

    void execute();
    void undo();
}
