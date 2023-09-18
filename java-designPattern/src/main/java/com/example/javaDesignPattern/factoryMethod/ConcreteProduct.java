package com.example.javaDesignPattern.factoryMethod;

/**
 * 具体产品
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 16:51
 */
public class ConcreteProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("具体产品做了某些事情");
    }
}
