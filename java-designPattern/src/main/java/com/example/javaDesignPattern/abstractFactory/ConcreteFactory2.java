package com.example.javaDesignPattern.abstractFactory;

/**
 * 创建具体工厂类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 17:30
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
