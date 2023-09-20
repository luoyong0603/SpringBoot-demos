package com.example.javaDesignPattern.bridge;/**
 * @author  bug菌
 * @date  2023/9/19 11:25
 * @version 1.0
 */
public class Blue implements DrawAPI {
    public void draw() {
        System.out.println("fill with blue");
    }
}
