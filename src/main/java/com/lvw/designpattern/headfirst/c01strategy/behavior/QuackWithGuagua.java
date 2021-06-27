package com.lvw.designpattern.headfirst.c01strategy.behavior;

public class QuackWithGuagua implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Gua gua ~~");
    }
}
