package com.lvw.designpattern.headfirst.c01strategy.behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with wings.");
    }
}
