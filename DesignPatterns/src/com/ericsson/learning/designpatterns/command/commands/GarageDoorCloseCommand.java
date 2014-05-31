package com.ericsson.learning.designpatterns.command.commands;

import com.ericsson.learning.designpatterns.command.appliances.GarageDoor;

/**
 * COMMAND: Concrete Command - composed of Receiver which used in execute()
 * */
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.lightOff();
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
