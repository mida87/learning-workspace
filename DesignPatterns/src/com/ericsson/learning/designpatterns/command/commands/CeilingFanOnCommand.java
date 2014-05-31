package com.ericsson.learning.designpatterns.command.commands;

import com.ericsson.learning.designpatterns.command.appliances.CeilingFan;

/**
 * COMMAND: Concrete Command - composed of Receiver which used in execute()
 * */
public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
        else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }

    }
}
