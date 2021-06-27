package com.lvw.designpattern.headfirst.c01strategy;

import com.lvw.designpattern.headfirst.c01strategy.behavior.FlyNoWay;
import com.lvw.designpattern.headfirst.c01strategy.behavior.QuackWithGuagua;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyNoWay(), new QuackWithGuagua());
    }

    @Override
    public void display() {
        System.out.println("An mallard");
    }

    class abc {
        int x;
        int y;
        public abc(int x, int y) {

        }
    }
}
