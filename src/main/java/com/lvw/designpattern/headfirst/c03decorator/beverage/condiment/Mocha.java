package com.lvw.designpattern.headfirst.c03decorator.beverage.condiment;

import com.lvw.designpattern.headfirst.c03decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n + " + "mocha";
    }

    @Override
    public double cost() {
        return 0.7 + beverage.cost();
    }

}
