package com.ericsson.learning.designpatterns.proxy.remote;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("USAGE: GumballMachine <name> <inventory>");
            System.exit(-1);
        }

        GumballMachineRemote machine;
        int count;

        try {
            count = Integer.parseInt(args[1]);
            machine = new GumballMachine(args[0], count);

            // starts rmi registry
            LocateRegistry.createRegistry(1099);

            Naming.rebind("//" + args[0] + "/gumballMachine", machine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
