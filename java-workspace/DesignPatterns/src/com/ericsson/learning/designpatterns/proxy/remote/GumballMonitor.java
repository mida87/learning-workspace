package com.ericsson.learning.designpatterns.proxy.remote;

import java.rmi.RemoteException;

/**
 * PROXY: Client
 * */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount());
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException re) {
            re.printStackTrace();
        }
    }
}
