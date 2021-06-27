package com.lvw.designpattern.headfirst.c10state.second;

/**
 * 这个是真正的状态模式
 */
public class APP01_TestGumballMachine {

    public static void main(String[] args) {


//        if (args.length < 2) {
//            System.out.println("GumballMachine <location> <inventory>");
//            System.exit(1);
//        }

        String location = "ShangDi";
        int inventory = 3;

        GumballMachine gumballMachine = new GumballMachine(location, inventory);

        System.out.println("\n## " + gumballMachine.toString());
        System.out.println("\n## " + gumballMachine.getState());
        System.out.println("## 糖果数量: " + gumballMachine.getInventory());

        gumballMachine.insertQuarter();
        gumballMachine.dispense();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.dispense();

        System.out.println("\n## " + gumballMachine.getState());
        System.out.println("## 糖果数量: " + gumballMachine.getInventory());

        gumballMachine.insertQuarter();
        gumballMachine.dispense();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.dispense();

        System.out.println("\n## " + gumballMachine.getState());
        System.out.println("## 糖果数量: " + gumballMachine.getInventory());

        gumballMachine.insertQuarter();
        gumballMachine.dispense();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        gumballMachine.dispense();
        gumballMachine.refill();


    }
}
