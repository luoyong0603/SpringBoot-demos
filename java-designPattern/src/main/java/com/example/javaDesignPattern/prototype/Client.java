package com.example.javaDesignPattern.prototype;

/**
 * 客户端
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 10:22
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        Prototype clone = prototype.clone();
        System.out.println(clone);
    }
}
