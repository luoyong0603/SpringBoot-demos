package com.example.javaDesignPattern.builder;

/**
 * 指挥者(Director)
 *
 * @Author bug菌
 * @Date 2023-09-19 0:03
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}