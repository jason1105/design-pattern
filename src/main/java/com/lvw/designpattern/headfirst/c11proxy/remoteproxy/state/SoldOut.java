package com.lvw.designpattern.headfirst.c11proxy.remoteproxy.state;

import com.lvw.designpattern.headfirst.c11proxy.remoteproxy.GumballMachine;

/**
 * 当前是已售罄状态, 下面的方法都是基于这个状态来处理的.
 */
public class SoldOut extends State {

    @Override
    public void insertQuarter(GumballMachine gumballMachine) {

        System.out.println("啊哈, 已经售罄了..., 钱退给你.");
    }

    @Override
    public void ejectQuarter(GumballMachine gumballMachine) {

        System.out.println("来来来, 你先投钱, 看我退不退给你.");
    }

    @Override
    public void turnCrank(GumballMachine gumballMachine) {
        System.out.println("售罄啦, 转也没有用.");

    }

    @Override
    public void dispense(GumballMachine gumballMachine) {
        System.out.println("没有糖果了, 你是不是作弊了?");

    }

    @Override
    public void refill(GumballMachine gumballMachine) {
        System.out.println("来来, 赶紧装满!" + " 一共装了" + gumballMachine.getRefillCount() + "个");
    }

    public String toString() {
        return "已售罄";
    }
}
