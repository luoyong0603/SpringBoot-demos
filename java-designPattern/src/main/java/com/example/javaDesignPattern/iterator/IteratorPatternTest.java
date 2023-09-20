package com.example.javaDesignPattern.iterator;

/**
 * @Author bug菌
 * @Date 2023-09-19 22:33
 */
public class IteratorPatternTest {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("aaa");
        aggregate.add("bbb");
        aggregate.add("ccc");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
