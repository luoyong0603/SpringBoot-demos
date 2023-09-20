package com.example.javaDesignPattern.flyweight;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 16:15
 */
public class Bike implements Car {
    private String type;

    public Bike(String type) {
        this.type = type;
    }

    @Override
    public void drive(String location) {
        System.out.println("Drive " + type + " bike to " + location);
    }
}
