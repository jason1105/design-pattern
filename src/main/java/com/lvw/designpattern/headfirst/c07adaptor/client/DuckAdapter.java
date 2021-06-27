package com.lvw.designpattern.headfirst.c07adaptor.client;

import com.lvw.designpattern.headfirst.c07adaptor.frame.Duck;
import com.lvw.designpattern.headfirst.c07adaptor.frame.Turkey;

public class DuckAdapter implements Turkey {

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
