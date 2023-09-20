package com.example.javaDesignPattern.prototype;

/**
 * 具体原型类
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 10:22
 */
public class ConcretePrototype extends Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype();
    }
}
