package com.lvw.designpattern.headfirst.c03decorator.beverage;

public class DarkRoast extends Beverage {


    private String description;

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double cost() {
        return .99;
    }
}

