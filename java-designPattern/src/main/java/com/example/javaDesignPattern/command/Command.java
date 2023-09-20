package com.example.javaDesignPattern.command;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:04
 */
public interface Command {
    void execute();
    void undo();
}