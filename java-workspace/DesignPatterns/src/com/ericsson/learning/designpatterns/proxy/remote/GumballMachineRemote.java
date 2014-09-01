package com.ericsson.learning.designpatterns.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * PROXY: Subject <interface>, client is seeing subject interface
 * Proxy in this case is RMI stub generated automatically
 * */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
