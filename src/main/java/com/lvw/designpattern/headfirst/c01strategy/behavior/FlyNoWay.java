package com.lvw.designpattern.headfirst.c01strategy.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("<< Can't fly >>");
    }
}
