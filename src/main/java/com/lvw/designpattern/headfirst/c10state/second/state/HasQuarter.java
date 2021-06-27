package com.lvw.designpattern.headfirst.c10state.second.state;

import com.lvw.designpattern.headfirst.c10state.second.GumballMachine;

import java.util.Random;

/**
 * 当前是已投币的状态, 下面的方法都是基于这个状态来处理的.
 */
public class HasQuarter extends State {

    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("已经投过钱了, 来挑一个.");

    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("退还25分钱.");
        gumballMachine.state = gumballMachine.noQuarter;

    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {

        System.out.println("哗啦啦, 转了一大波糖果.");

        if (new Random().nextBoolean()) {

            gumballMachine.state = gumballMachine.winner;  // 注意这样的写法已经产生耦合, 使用get和set比较好
        } else {

            gumballMachine.state = gumballMachine.sold;
        }

    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        System.out.println("先摇一摇呗, 不一样口味, 祝你好运!");

    }

    @Override
    public void refill(GumballMachine gumballMachine) {
        System.out.println("我正忙呢, 待会装!");
    }

    public String toString() {
        return "等待转糖果";
    }
}
