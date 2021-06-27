package com.lvw.designpattern.headfirst.c04factory.abs.framework;

public abstract class Goods {

    protected Package aPackage;
    protected double price;
    protected String description;
    protected String manufacturer;
    protected Coupon coupon;

    void packing() {
        this.aPackage.packaging();
    }

    void showCoupon() {
        System.out.println(coupon);
    }
}
