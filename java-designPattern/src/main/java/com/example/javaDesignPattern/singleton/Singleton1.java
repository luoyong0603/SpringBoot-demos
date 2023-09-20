package com.example.javaDesignPattern.singleton;

/**
 * 饿汉式单例模式
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 10:39
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    private Singleton1() {
    }
}
