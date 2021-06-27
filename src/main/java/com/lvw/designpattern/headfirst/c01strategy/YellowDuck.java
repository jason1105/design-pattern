package com.lvw.designpattern.headfirst.c01strategy;

import com.lvw.designpattern.headfirst.c01strategy.behavior.FlyWithWings;
import com.lvw.designpattern.headfirst.c01strategy.behavior.QuackWithGuagua;

public class YellowDuck extends Duck {

    public YellowDuck() {
        super(new FlyWithWings(), new QuackWithGuagua());
    }

    @Override
    public void display() {
        System.out.println("三黄鸭.");
    }
}
