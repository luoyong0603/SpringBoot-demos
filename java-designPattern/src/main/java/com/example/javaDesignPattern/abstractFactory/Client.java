package com.example.javaDesignPattern.abstractFactory;

/**
 * 创建客户端
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 17:33
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
        productA1.display();
        productB1.show();

        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        productA2.display();
        productB2.show();
    }
}
