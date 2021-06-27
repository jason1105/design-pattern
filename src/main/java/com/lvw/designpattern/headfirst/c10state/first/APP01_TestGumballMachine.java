package com.lvw.designpattern.headfirst.c10state.first;

public class APP01_TestGumballMachine {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println("\n##" + gumballMachine.getState());

        gumballMachine.insertQuarter();
        gumballMachine.dispense();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.dispense();

        System.out.println("\n##" + gumballMachine.getState());

        gumballMachine.insertQuarter();
        gumballMachine.dispense();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.dispense();

        System.out.println("\n##" + gumballMachine.getState());

        gumballMachine.insertQuarter();
        gumballMachine.dispense();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.dispense();
    }
}
