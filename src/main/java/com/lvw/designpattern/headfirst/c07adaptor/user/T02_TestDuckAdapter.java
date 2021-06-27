package com.lvw.designpattern.headfirst.c07adaptor.user;

import com.lvw.designpattern.headfirst.c07adaptor.client.DuckAdapter;
import com.lvw.designpattern.headfirst.c07adaptor.frame.MallardDuck;
import com.lvw.designpattern.headfirst.c07adaptor.frame.Turkey;
import com.lvw.designpattern.headfirst.c07adaptor.frame.WildTurkey;

/**
 * 模拟用户: 用户应用只能操作 {@link Turkey Turkey} 接口的对象.
 */
public class T02_TestDuckAdapter {

    public static void main(String[] args) {
        Turkey turkey = null;

        // 用户的老程序, 操作 Turkey 对象.
        turkey = new WildTurkey();
        turkey.fly();
        turkey.gobble();

        /*
        用户无法操作新增加的 Duck 对象,
        所以我给他们做了一个适配器, 通过这个适配器,
        用户可以使用鸭子类了.
        不过, 用户感觉这只 "火鸡" 好像打鸡血了, 叫的声音不对劲,
        一飞冲天. (嘿嘿, 实际上这是一只鸭子)
        */
        turkey = new DuckAdapter(new MallardDuck());
        turkey.fly();
        turkey.gobble();
    }
}
