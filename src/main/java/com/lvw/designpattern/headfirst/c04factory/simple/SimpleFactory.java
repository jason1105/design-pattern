package com.lvw.designpattern.headfirst.c04factory.simple;

import com.lvw.designpattern.headfirst.c01strategy.*;

public class SimpleFactory {

    public static Duck createDuck(String type) {

        Duck duck = null;
        if (type.toLowerCase().equals("mallard")) {
            duck = new MallardDuck();
        } else if (type.toLowerCase().equals("rubber")) {
            duck = new RubberDuck();
        } else if (type.toLowerCase().equals("model")) {
            duck = new ModelDuck();
        } else if (type.toLowerCase().equals("yellow")) {
            duck = new YellowDuck();
        }
        return duck;
    }
}
