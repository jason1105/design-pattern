package com.lvw.designpattern.headfirst.c01strategy.behavior;

public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silent >>");
    }
}
