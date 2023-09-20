package com.example.javaDesignPattern.bridge;

/**
 * 抽象类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:19
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
