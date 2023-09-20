package com.example.javaDesignPattern.iterator;

import java.util.List;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:32
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list;
    private int index = 0;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    public Object next() {
        if (hasNext()) {
            return list.get(index++);
        }
        return null;
    }

    public boolean hasNext() {
        return index < list.size();
    }
}