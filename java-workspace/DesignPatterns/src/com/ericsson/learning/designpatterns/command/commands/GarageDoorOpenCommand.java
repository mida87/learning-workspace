package com.ericsson.learning.designpatterns.command.commands;

import com.ericsson.learning.designpatterns.command.appliances.GarageDoor;

/**
 * COMMAND: Concrete Command - composed of Receiver which used in execute()
 * */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
        garageDoor.down();
    }
}
