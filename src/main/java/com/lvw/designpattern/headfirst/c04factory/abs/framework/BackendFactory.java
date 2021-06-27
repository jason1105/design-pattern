package com.lvw.designpattern.headfirst.c04factory.abs.framework;

public abstract class BackendFactory {

    protected abstract Package createPkg();
    protected abstract Coupon createCoupon();

}
