package com.example.javaDesignPattern.decorator;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 14:51
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decoratedComponent = new DecoratorA(component);
        System.out.println(decoratedComponent.operation());
    }
}
