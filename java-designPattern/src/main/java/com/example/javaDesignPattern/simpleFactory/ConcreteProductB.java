package com.example.javaDesignPattern.simpleFactory;

/**
 * 具体产品类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 15:37
 */
public class ConcreteProductB implements Product {
    @Override
    public void execute() {
        System.out.println("执行具体产品B的方法");
    }
}
