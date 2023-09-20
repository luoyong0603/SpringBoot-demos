package com.example.javaDesignPattern.iterator;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:31
 */
public interface Aggregate {
    public void add(Object obj);

    public void remove(Object obj);

    public ConcreteIterator getIterator();
}