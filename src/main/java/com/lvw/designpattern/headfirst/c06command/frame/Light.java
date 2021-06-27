package com.lvw.designpattern.headfirst.c06command.frame;

/**
 * 具体电器
 */
public class Light {

    public void on() {
        System.out.println("Turn light on.");
    }

    public void off() {
        System.out.println("Turn light off.");
    }
}
