package com.example.javaDesignPattern.builder;

/**
 * 具体建造者(ConcreteBuilder )
 *
 * @Author bug菌
 * @Date 2023-09-19 0:03
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public void buildPartA() {
        product.setPartA("A");
    }

    public void buildPartB() {
        product.setPartB("B");
    }

    public void buildPartC() {
        product.setPartC("C");
    }

    public Product getResult() {
        return product;
    }
}