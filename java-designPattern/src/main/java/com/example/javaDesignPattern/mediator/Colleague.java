package com.example.javaDesignPattern.mediator;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:47
 */
public abstract class Colleague {

    private final String userId;
    private Mediator mediator;

    public Colleague(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public abstract void receiveMessage(String message);
}
