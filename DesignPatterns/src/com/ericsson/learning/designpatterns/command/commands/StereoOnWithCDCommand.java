package com.ericsson.learning.designpatterns.command.commands;

import com.ericsson.learning.designpatterns.command.appliances.Stereo;

/**
 * COMMAND: Concrete Command - composed of Receiver which used in execute()
 * */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
