package com.example.javaDesignPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:32
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public ConcreteIterator getIterator() {
        return new ConcreteIterator(list);
    }
}