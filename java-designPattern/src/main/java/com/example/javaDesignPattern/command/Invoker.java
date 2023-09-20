package com.example.javaDesignPattern.command;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:05
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
    public void undoCommand() {
        command.undo();
    }
}