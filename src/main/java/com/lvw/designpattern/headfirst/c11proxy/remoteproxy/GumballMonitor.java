package com.lvw.designpattern.headfirst.c11proxy.remoteproxy;

import java.rmi.RemoteException;

public class GumballMonitor {

    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() throws RemoteException {
        System.out.println("\n===== Report =====");
        //System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        //System.out.println("Current inventory: " + gumballMachine.getInventory());
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
