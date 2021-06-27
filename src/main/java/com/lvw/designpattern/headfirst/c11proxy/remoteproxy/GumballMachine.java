package com.lvw.designpattern.headfirst.c11proxy.remoteproxy;

import com.lvw.designpattern.headfirst.c11proxy.remoteproxy.state.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {


    public int inventory;
    public State state;  //  糖果机当前的状态对象
    public int refillCount = 10;  // 可填充糖果的数量
    // 糖果机可能的状态.
    // 如果是多个context, 可以将这一部分定义到静态类中.
    public State soldOut = new SoldOut();
    public State noQuarter = new NoQuarter();
    public State hasQuarter = new HasQuarter();
    public State sold = new Sold();
    public State winner = new Winner();
    private String location;

    public GumballMachine(String location, int inventory) throws RemoteException {
        this.inventory = inventory;
        this.location = location;
        if (this.inventory > 0) {
            state = noQuarter;
        }
    }

    public int getRefillCount() {
        return this.refillCount;
    }

    @Override
    public State getState() {
        return state;
    }

    public String getLocation() {
        return this.location;
    }

    void insertQuarter() {
        state.insertQuarter(this);
    }

    void ejectQuarter() {
        state.ejectQuarter(this);
    }

    void turnCrank() {
        state.turnCrank(this);
    }

    void dispense() {
        state.dispense(this);
    }

    void refill() {
        state.refill(this);
    }

    public int getInventory() {
        return this.inventory;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + inventory + " gumball");
        if (inventory != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
