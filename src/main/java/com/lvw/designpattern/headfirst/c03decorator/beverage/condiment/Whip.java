package com.lvw.designpattern.headfirst.c03decorator.beverage.condiment;

import com.lvw.designpattern.headfirst.c03decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n + " + "whip";
    }

    @Override
    public double cost() {
        return 0.7 + beverage.cost();
    }
}
