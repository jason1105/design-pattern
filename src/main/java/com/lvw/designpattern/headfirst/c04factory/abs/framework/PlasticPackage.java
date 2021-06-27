package com.lvw.designpattern.headfirst.c04factory.abs.framework;

public class PlasticPackage extends Package {
    @Override
    public String toString() {
        return "Plastic package";
    }

    @Override
    public void packaging() {
        System.out.println("装进塑料袋");
    }
}
