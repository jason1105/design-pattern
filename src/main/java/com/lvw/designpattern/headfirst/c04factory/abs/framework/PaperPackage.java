package com.lvw.designpattern.headfirst.c04factory.abs.framework;

public class PaperPackage extends Package {
    @Override
    public String toString() {
        return "Paper package";
    }

    @Override
    public void packaging() {
        System.out.println("装进纸袋");
    }
}
