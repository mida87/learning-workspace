package com.ericsson.learning.designpatterns.command.commands;

import com.ericsson.learning.designpatterns.command.appliances.Light;

/**
 * COMMAND: Concrete Command - composed of Receiver which used in execute()
 * */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

