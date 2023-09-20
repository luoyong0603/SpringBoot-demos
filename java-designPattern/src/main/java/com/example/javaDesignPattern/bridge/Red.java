package com.example.javaDesignPattern.bridge;

/**
 * Color的实现类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:24
 */
public class Red implements DrawAPI {
    public void draw() {
        System.out.println("fill with red");
    }
}