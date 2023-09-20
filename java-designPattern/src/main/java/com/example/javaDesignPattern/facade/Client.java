package com.example.javaDesignPattern.facade;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 16:01
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}