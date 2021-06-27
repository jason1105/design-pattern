package com.lvw.designpattern.headfirst.c10state.second.state;


import com.lvw.designpattern.headfirst.c10state.second.GumballMachine;

public abstract class State {

    // 如果多个context共享State的对象, 请不要在这里定义context,
    // 而应该定义在每个具体方法的参数列表中.
    //GumballMachine gumballMachine;

    //public State(GumballMachine gumballMachine) {
    //    this.gumballMachine = gumballMachine;
    //}

    public abstract void insertQuarter(GumballMachine gumballMachine);

    public abstract void ejectQuarter(GumballMachine gumballMachine);

    public abstract void turnCrank(GumballMachine gumballMachine);

    public abstract  void dispense(GumballMachine gumballMachine);

    public abstract void refill(GumballMachine gumballMachine);
}
