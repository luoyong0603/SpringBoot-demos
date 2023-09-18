package com.example.javaDesignPattern.abstractFactory;

/**
 * 抽象工厂类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 17:29
 */
public abstract class AbstractFactory {
    public abstract ProductA createProductA();
    public abstract ProductB createProductB();
}
