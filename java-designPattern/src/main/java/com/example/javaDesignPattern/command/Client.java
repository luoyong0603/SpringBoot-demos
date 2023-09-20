package com.example.javaDesignPattern.command;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:05
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
        invoker.undoCommand();
    }
}