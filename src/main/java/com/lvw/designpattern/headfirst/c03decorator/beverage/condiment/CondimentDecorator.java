package com.lvw.designpattern.headfirst.c03decorator.beverage.condiment;

import com.lvw.designpattern.headfirst.c03decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

//    public abstract double getPrice();

//    public String getDescription() {
//        return beverage.getDescription() + "\n + " + getDesc();
//    }

//    public abstract String getDesc();

//    @Override
//    public double cost() {
//        return this.getPrice() + beverage.cost();
//    }
}
