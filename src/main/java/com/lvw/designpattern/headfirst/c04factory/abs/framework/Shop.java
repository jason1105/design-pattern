package com.lvw.designpattern.headfirst.c04factory.abs.framework;


/**
 * 当我们在设计业务的时候, 遇到了目前还不知道如何创建对象, 留待以后
 * 由具体的类实现的逻辑, 这种情况通常会写一个 abstract 方法, 这个方法
 * 就是工厂模板方法.
 *
 * <br>
 *     例如, 设计了一个商店, 客人说出鸭子的类型, 展示具体信息. 这个商店可以是
 *     卖熟食的超市, 也可以是卖玩具的商店.
 *
 *
 */
public abstract class Shop {

    /**
     * 无论是超市还是商店, 共通的部分是展示部分.
     *
     * @param type
     */
    public void showDuck(String type){

        // 究竟会拿出来什么样的鸭子, 由每个具体的商店自己决定.
        // 这个方法会被具体的商店所实装.
        Duck duck = createDuck(type); // 使用模板方法, ReentrantLock 的 tryAcquire 也使用这个设计模式.

        if (duck == null) {
            System.out.println("不支持的类型.");
            return;
        }

        duck.display();
        duck.performQuack();
        duck.performFly();
        duck.prepare(); // 准备 包装袋 和 点卡
        duck.packing();
        duck.showCoupon();

    }

    /**
     * 抽象工厂方法, 留给子类实现.
     *
     * @param type
     * @return
     */
    protected abstract Duck createDuck(String type);
}
