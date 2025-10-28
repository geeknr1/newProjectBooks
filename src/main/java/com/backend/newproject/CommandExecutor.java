package com.backend.newproject;

public class CommandExecutor {
    private int command;
    public CommandExecutor(int command) {
        this.command = command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public void execute() {
        System.out.println("Executing command: " + command);
    }

}
