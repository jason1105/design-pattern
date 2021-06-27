package com.lvw.designpattern.headfirst.c08templatemethod;

public abstract class CaffeineAbstract {

    /**
     * 模板方法, 提供算法结构
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiment();
        }
    }

    boolean customerWantCondiments() {
        return true;
    }


    abstract void brew();

    abstract void addCondiment();


    void boilWater() {
        System.out.println("Boil water.");

    }

    void pourInCup() {
        System.out.println("Pour in cup.");
    }


}
