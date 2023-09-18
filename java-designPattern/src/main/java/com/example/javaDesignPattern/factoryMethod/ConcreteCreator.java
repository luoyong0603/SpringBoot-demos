package com.example.javaDesignPattern.factoryMethod;

/**
 * 具体工厂
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 16:46
 */
public class ConcreteCreator implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
