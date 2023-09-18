package com.example.javaDesignPattern.abstractFactory;

/**
 * 创建具体产品类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 17:31
 */
public class ConcreteProductA1 extends ProductA {
    @Override
    public void display() {
        System.out.println("ConcreteProductA1 display");
    }
}