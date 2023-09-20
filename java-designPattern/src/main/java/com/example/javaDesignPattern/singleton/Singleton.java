package com.example.javaDesignPattern.singleton;

/**
 * 懒汉式单例模式
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 10:39
 */
public class Singleton {
    private static Singleton INSTANCE = null;

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    private Singleton() {
    }
}
