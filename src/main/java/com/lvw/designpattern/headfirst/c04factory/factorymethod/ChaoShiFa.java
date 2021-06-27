package com.lvw.designpattern.headfirst.c04factory.factorymethod;

import com.lvw.designpattern.headfirst.c01strategy.Duck;
import com.lvw.designpattern.headfirst.c01strategy.YellowDuck;
import com.lvw.designpattern.headfirst.c04factory.factorymethod.framework.Shop;

/**
 * 具体的商店, 继承自Shop, 实现工厂方法
 */
public class ChaoShiFa extends Shop {

    @Override
    public Duck createDuck(String type) {

        Duck duck = null;
        if (type.toLowerCase().equals("yellow")) {

            duck = new YellowDuck();
        }

        return duck;
    }
}
