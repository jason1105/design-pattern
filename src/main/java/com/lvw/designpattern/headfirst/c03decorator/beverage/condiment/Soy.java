package com.lvw.designpattern.headfirst.c03decorator.beverage.condiment;

import com.lvw.designpattern.headfirst.c03decorator.beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n + " + "soy";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
