package com.lvw.designpattern.headfirst.c01strategy;

import com.lvw.designpattern.headfirst.c01strategy.behavior.FlyNoWay;
import com.lvw.designpattern.headfirst.c01strategy.behavior.QuackNoWay;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new QuackNoWay());
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭.");
    }

}
