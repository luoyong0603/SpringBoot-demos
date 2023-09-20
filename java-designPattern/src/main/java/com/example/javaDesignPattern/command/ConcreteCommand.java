package com.example.javaDesignPattern.command;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:04
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.action();
    }

    public void undo() {
        receiver.undo();
    }
}