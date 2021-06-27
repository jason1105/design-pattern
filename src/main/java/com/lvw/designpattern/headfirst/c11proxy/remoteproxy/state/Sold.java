package com.lvw.designpattern.headfirst.c11proxy.remoteproxy.state;

import com.lvw.designpattern.headfirst.c11proxy.remoteproxy.GumballMachine;

/**
 * 当前是待取状态, 下面的方法都是基于这个状态来处理的.
 */
public class Sold extends State {

    @Override
    public void insertQuarter(GumballMachine gumballMachine) {

        System.out.println("稍等, 正在输出.");
    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {
        System.out.println("这个时候了退钱? 有一颗糖果等着你呢, 快拿.");

    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("请稍等, 正在输出, 拿走这个再继续呗.");

    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        System.out.println("给你一颗糖果.");

        gumballMachine.inventory--;
        if (gumballMachine.inventory == 0) {
            gumballMachine.state = gumballMachine.soldOut;
        } else {

            gumballMachine.state = gumballMachine.noQuarter;
        }


    }

    @Override
    public void refill(GumballMachine gumballMachine) {
        System.out.println("我正忙呢, 待会装!");
    }

    public String toString() {
        return "准备输出糖果";
    }
}
