package com.example.javaDesignPattern.bridge;

/**
 * Shape的实现类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:21
 */
public class Rectangle extends Shape {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        drawAPI.draw();
    }
}