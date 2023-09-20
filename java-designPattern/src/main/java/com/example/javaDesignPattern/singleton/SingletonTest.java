package com.example.javaDesignPattern.singleton;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 10:39
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
