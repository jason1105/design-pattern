package com.lvw.designpattern.headfirst.c06command.frame;

/**
 * 具体电器
 */
public class TV {


    public void on() {
        System.out.println("Turn TV on.");
    }


    public void off() {
        System.out.println("Turn TV off.");
    }

    public void increaseVolume() {
        System.out.println("Increase TV volume.");
    }

    public void decreaseVolume() {

        System.out.println("Decrease TV volume.");
    }

}
