package com.example.javaDesignPattern.builder;

/**
 * 抽象建造者(Builder)
 *
 * @Author bug菌
 * @Date 2023-09-19 0:03
 */
public interface Builder {
    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getResult();
}