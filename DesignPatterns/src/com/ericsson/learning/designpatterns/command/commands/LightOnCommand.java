package com.ericsson.learning.designpatterns.command.commands;

/**
 * COMMAND: Concrete Command - composed of Receiver which used in execute()
 * */
import com.ericsson.learning.designpatterns.command.appliances.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
