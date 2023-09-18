package com.example.javaDesignPattern.simpleFactory;

/**
 * 客户端
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/18 15:42
 */
public class Client {

    public static void main(String[] args) {
        Product productA = Factory.createProduct("A");
        Product productB = Factory.createProduct("B");

        productA.execute();
        productB.execute();
    }
}
