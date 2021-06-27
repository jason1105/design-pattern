package com.lvw.designpattern.headfirst.c01strategy.behavior;

public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with 20000Km/h");
    }
}
