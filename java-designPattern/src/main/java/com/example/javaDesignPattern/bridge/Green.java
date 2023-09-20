package com.example.javaDesignPattern.bridge;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:25
 */
public class Green implements DrawAPI {
    public void draw() {
        System.out.println("fill with green");
    }
}
