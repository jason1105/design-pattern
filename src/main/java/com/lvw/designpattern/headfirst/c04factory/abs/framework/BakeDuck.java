package com.lvw.designpattern.headfirst.c04factory.abs.framework;

import com.lvw.designpattern.headfirst.c01strategy.behavior.FlyNoWay;
import com.lvw.designpattern.headfirst.c01strategy.behavior.QuackNoWay;

/**
 * 这里用到了抽象工厂
 */
public class BakeDuck extends Duck {

    BackendFactory pkgFactory;

    public BakeDuck(BackendFactory pkgFactory) {
        super(new FlyNoWay(), new QuackNoWay());
        this.pkgFactory = pkgFactory;
    }

    @Override
    void prepare() {
        aPackage = pkgFactory.createPkg();
        coupon = pkgFactory.createCoupon();
    }

    @Override
    public void display() {
        System.out.println("北京烤鸭");
    }
}
