package com.lvw.designpattern.headfirst.c07adaptor.client;

import com.lvw.designpattern.headfirst.c07adaptor.frame.Duck;
import com.lvw.designpattern.headfirst.c07adaptor.frame.Turkey;

/**
 * 火鸡适配器, 意思是把火鸡包装成另外一个对象.
 * 要是 EuropeSocketAdapter 就是将欧洲插座适配成其他类型.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();

    }

    @Override
    public void fly() {
        turkey.fly();

    }
}
