package com.example.javaDesignPattern.decorator;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 14:50
 */
public class ConcreteComponent implements Component {
    @Override
    public String operation() {
        return "ConcreteComponent";
    }
}