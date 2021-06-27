package com.lvw.designpattern.headfirst.c11proxy.remoteproxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class APP02_TestGumballMonitor {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        GumballMachineRemote lookup = (GumballMachineRemote)Naming.lookup("rmi://127.0.0.1/GumballMachine");

        GumballMonitor gumballMonitor = new GumballMonitor(lookup);
        gumballMonitor.report();

    }
}
