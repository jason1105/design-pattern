package com.lvw.designpattern.headfirst.c04factory.abs.framework;

import com.lvw.designpattern.headfirst.c01strategy.behavior.FlyBehavior;
import com.lvw.designpattern.headfirst.c01strategy.behavior.QuackBehavior;

public abstract class Duck extends Goods {

    private FlyBehavior fly;
    private QuackBehavior quack;

    public Duck(FlyBehavior fly, QuackBehavior quack) {
        this.fly = fly;
        this.quack = quack;
    }

    abstract void prepare();

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
