package com.lvw.designpattern.headfirst.c01strategy;

import com.lvw.designpattern.headfirst.c01strategy.behavior.FlyBehavior;
import com.lvw.designpattern.headfirst.c01strategy.behavior.QuackBehavior;

public abstract class Duck {

    private FlyBehavior fly;
    private QuackBehavior quack;

    public Duck(FlyBehavior fly, QuackBehavior quack) {
        this.fly = fly;
        this.quack = quack;
    }

    public FlyBehavior getFly() {
        return fly;
    }

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }

    public QuackBehavior getQuack() {
        return quack;
    }

    public void setQuack(QuackBehavior quack) {
        this.quack = quack;
    }

    public abstract void display();

    public void performQuack() {
        quack.quack();
    }

    public void performFly() {
        fly.fly();
    }
}
