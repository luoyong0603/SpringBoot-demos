package com.example.javaDesignPattern.mediator;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:48
 */
public class User extends Colleague {

    public User(String userId) {
        super(userId);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("用户" + getUserId() + "收到消息：" + message);
    }
}