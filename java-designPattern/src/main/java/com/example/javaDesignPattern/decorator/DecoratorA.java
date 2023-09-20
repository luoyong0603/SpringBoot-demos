package com.example.javaDesignPattern.decorator;

/**
 * 具体的装饰器类DecoratorA
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 14:50
 */
public class DecoratorA extends Decorator {
    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        return "DecoratorA " + component.operation();
    }
}
