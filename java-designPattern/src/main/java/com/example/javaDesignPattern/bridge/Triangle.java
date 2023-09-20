package com.example.javaDesignPattern.bridge;

/**
 * Shape的实现类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:22
 */
public class Triangle extends Shape {
    private int x1, y1, x2, y2, x3, y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, DrawAPI drawAPI) {
        super(drawAPI);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void draw() {
        drawAPI.draw();
    }
}
