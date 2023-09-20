package com.example.javaDesignPattern.composite;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 14:32
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display();
}
