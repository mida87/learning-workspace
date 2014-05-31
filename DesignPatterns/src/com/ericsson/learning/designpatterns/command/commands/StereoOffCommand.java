package com.ericsson.learning.designpatterns.command.commands;

import com.ericsson.learning.designpatterns.command.appliances.Stereo;

/**
 * COMMAND: Concrete Command - composed of Receiver which used in execute()
 * */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        //
    }
}
