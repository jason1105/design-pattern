package com.lvw.designpattern.headfirst.c07adaptor.user;

import com.lvw.designpattern.headfirst.c07adaptor.client.TurkeyAdapter;
import com.lvw.designpattern.headfirst.c07adaptor.frame.Duck;
import com.lvw.designpattern.headfirst.c07adaptor.frame.MallardDuck;
import com.lvw.designpattern.headfirst.c07adaptor.frame.WildTurkey;

/**
 * 模拟用户: 用户应用只能操作 {@link Duck} 接口的对象.
 */
public class T01_TestTurkeyAdapter {

    public static void main(String[] args) {
        Duck duck = null;

        // 用户的老程序, 操作 Duck 对象.
        duck = new MallardDuck();
        duck.fly();
        duck.quack();

        /*
        用户无法操作新增加的 WildTurkey 对象,
        所以我给他们做了一个适配器, 通过这个适配器,
        用户可以使用鸭子类了.
        不过, 用户感觉这只 "鸭子" 好像生病了, 叫的声音不对劲,
        而且也没有力气飞起来. (嘿嘿, 实际上这是一只野鸡)
        */
        duck = new TurkeyAdapter(new WildTurkey());
        duck.fly();
        duck.quack();
    }
}
