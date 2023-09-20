package com.example.javaDesignPattern.adapter;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:02
 */
public class Client {
    public static void main(String[] args) {
        OldServiceImpl oldServiceImpl = new OldServiceImpl();
        NewService newService = new Adapter(oldServiceImpl);
        newService.newMethod();
    }
}
