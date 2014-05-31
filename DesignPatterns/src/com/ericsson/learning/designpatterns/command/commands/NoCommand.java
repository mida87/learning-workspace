package com.ericsson.learning.designpatterns.command.commands;

public class NoCommand implements Command {

    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
