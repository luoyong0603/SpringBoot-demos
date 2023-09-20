package com.example.javaDesignPattern.decorator;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 14:50
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return component.operation();
    }
}
