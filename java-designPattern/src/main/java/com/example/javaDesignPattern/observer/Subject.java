package com.example.javaDesignPattern.observer;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 14:53
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
