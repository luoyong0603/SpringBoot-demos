package com.example.javaDesignPattern.prototype;

/**
 * 抽象原型类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 10:22
 */
public abstract class Prototype implements Cloneable {
    public abstract Prototype clone();
}
