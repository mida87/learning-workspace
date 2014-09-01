package com.ericsson.learning.designpatterns.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        /*String[] locations = {"rmi://santafe.mightygumball.com/gumballmachine",
            "rmi://boulder.mightygumball.com/gumballmachine",
            "rmi://seattle.mightygumball.com/gumballmachine"};*/

        String[] locations = {"rmi://localhost/gumballMachine"};

        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitors.length; i++) {
            monitors[i].report();
        }
    }
}
