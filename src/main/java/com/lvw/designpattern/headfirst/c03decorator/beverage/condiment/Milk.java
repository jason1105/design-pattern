package com.lvw.designpattern.headfirst.c03decorator.beverage.condiment;

import com.lvw.designpattern.headfirst.c03decorator.beverage.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n + " + "milk";
    }

    @Override
    public double cost() {
        return 0.9 + beverage.cost();
    }
}
