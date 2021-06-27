package com.lvw.designpattern.headfirst.c04factory.abs;

import com.lvw.designpattern.headfirst.c04factory.abs.framework.BakeDuck;
import com.lvw.designpattern.headfirst.c04factory.abs.framework.Duck;
import com.lvw.designpattern.headfirst.c04factory.abs.framework.Shop;

/**
 * 具体的商店, 继承自Shop, 实现工厂方法.
 *
 */
public class DepartmentShop extends Shop {
    
    @Override
    public Duck createDuck(String type) {

        Duck duck = null;
        if (type.toLowerCase().equals("bake")) {

            duck = new BakeDuck(new DepartmentBackendFactory());
        }

        return duck;
    }
}
