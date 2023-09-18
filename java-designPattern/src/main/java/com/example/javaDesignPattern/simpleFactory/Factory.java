package com.example.javaDesignPattern.simpleFactory;

/**
 * 工厂类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 15:41
 */
public class Factory {
    public static Product createProduct(String type) {
        //根据传入的参数type的不同来创建不同的产品对象。
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        } else {
            throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
