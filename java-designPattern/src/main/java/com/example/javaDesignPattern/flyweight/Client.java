package com.example.javaDesignPattern.flyweight;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 16:16
 */
public class Client {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("Sport");
        car1.drive("New York");

        Car car2 = CarFactory.getCar("Sport");
        car2.drive("San Francisco");

        Car car3 = CarFactory.getCar("Economy");
        car3.drive("Los Angeles");
    }
}