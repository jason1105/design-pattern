package com.lvw.designpattern.headfirst.c03decorator.beverage;

import com.lvw.designpattern.headfirst.c03decorator.beverage.condiment.Milk;
import com.lvw.designpattern.headfirst.c03decorator.beverage.condiment.Mocha;

public class APP01_TestDecorator {

    public static void main(String[] args) {

        /*DarkRoast darkRoast = new DarkRoast();  // 咖啡
        Milk milk = new Milk("milk", darkRoast);    // 加奶
        Mocha mocha1 = new Mocha("mocha", milk);    // 加摩卡
        Mocha mocha = new Mocha("mocha", mocha1);   // 加摩卡

        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());*/

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);    // 咖啡
        darkRoast = new Mocha(darkRoast);    // 加奶
        darkRoast = new Mocha(darkRoast);    // 加摩卡

        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
    }
}
