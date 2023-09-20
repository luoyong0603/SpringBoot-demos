package com.example.javaDesignPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 16:16
 */
public class CarFactory {
    private static Map<String, Car> carPool = new HashMap<>();

    public static Car getCar(String type) {
        Car car = carPool.get(type);

        if (car == null) {
            car = new Bike(type);
            carPool.put(type, car);
            System.out.println("Create new car of type " + type);
        }
        return car;
    }
}
