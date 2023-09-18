package com.example.javaDesignPattern.factoryMethod;

/**
 * 测试用例
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 16:51
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct();
        product.doSomething();
    }
}
