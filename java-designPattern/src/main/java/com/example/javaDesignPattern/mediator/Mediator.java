package com.example.javaDesignPattern.mediator;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:47
 */
public interface Mediator {
    void sendMessage(String message, Colleague user);
}
