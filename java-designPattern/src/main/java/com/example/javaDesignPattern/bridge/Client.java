package com.example.javaDesignPattern.bridge;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 11:15
 */
public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle(100,100, 10, new Red());
        circle.draw();

        Shape rectangle = new Rectangle(50, 50, 20, 30, new Green());
        rectangle.draw();

        Shape triangle = new Triangle(10, 20, 30, 40, 50, 60, new Blue());
        triangle.draw();
    }

}
