package com.lvw.designpattern.headfirst.c01strategy;

import com.lvw.designpattern.headfirst.c01strategy.behavior.FlyWithRocket;

public class Application {

    public static void main(String[] args) {

        Duck rubberDuck = new RubberDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        Duck yellowDuck = new YellowDuck();
        yellowDuck.display();
        yellowDuck.performFly();
        yellowDuck.performQuack();


        Duck modelDuck = new ModelDuck();

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFly(new FlyWithRocket());
        modelDuck.performFly();
    }
}
