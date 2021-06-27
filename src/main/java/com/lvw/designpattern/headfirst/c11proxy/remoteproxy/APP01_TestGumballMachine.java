package com.lvw.designpattern.headfirst.c11proxy.remoteproxy;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class APP01_TestGumballMachine {

    public static void main(String[] args) throws RemoteException, MalformedURLException {


//        if (args.length < 2) {
//            System.out.println("GumballMachine <location> <inventory>");
//            System.exit(1);
//        }

        String location = "ShangDi";
        int inventory = 3;

        GumballMachine gumballMachine = new GumballMachine(location, inventory);

        Naming.rebind("//127.0.0.1/GumballMachine", gumballMachine);

//        System.out.println("\n## " + gumballMachine.toString());
//        System.out.println("\n## " + gumballMachine.getState());
//        System.out.println("## 糖果数量: " + gumballMachine.getInventory());
//
//        gumballMachine.insertQuarter();
//        gumballMachine.dispense();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//        gumballMachine.dispense();
//
//        System.out.println("\n## " + gumballMachine.getState());
//        System.out.println("## 糖果数量: " + gumballMachine.getInventory());
//
//        gumballMachine.insertQuarter();
//        gumballMachine.dispense();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//        gumballMachine.dispense();
//
//        System.out.println("\n## " + gumballMachine.getState());
//        System.out.println("## 糖果数量: " + gumballMachine.getInventory());
//
//        gumballMachine.insertQuarter();
//        gumballMachine.dispense();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//        gumballMachine.dispense();
//        gumballMachine.refill();
//
//        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
//        gumballMonitor.report();
    }
}
