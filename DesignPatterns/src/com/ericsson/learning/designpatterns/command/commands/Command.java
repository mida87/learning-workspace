package com.ericsson.learning.designpatterns.command.commands;

/**
 * COMMAND: Command - interface which all concrete comands implement
 * */
public interface Command {
    public void execute();

    public void undo();
}
