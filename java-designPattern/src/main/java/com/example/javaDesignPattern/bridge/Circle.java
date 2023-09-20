package com.example.javaDesignPattern.bridge;

/**
 * Shape的实现类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:20
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.draw();
    }
}
