package com.lvw.designpattern.headfirst.c11proxy.remoteproxy;

import com.lvw.designpattern.headfirst.c11proxy.remoteproxy.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    State getState() throws RemoteException;
}
