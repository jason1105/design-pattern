package com.lvw.designpattern.headfirst.c10state.second.state;

import com.lvw.designpattern.headfirst.c10state.second.GumballMachine;

/**
 * 当前是未投币的状态, 下面的方法都是基于这个状态来处理的.
 */
public class NoQuarter extends State {

    @Override
    public void insertQuarter(GumballMachine gumballMachine) {
        System.out.println("你投了25分钱.");
        gumballMachine.state = gumballMachine.hasQuarter;

    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("退钱? 你还没投钱呢!!!");

    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("你还没投钱呢, 投25分钱就可以.");

    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        System.out.println("没有投钱还想吃糖? 你是不是作弊了?");

    }

    @Override
    public void refill(GumballMachine gumballMachine) {
        System.out.println("你确定现在没有糖了????");
    }

    public String toString() {
        return "等待投币";
    }
}
