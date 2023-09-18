package com.example.javaDesignPattern.builder;

/**
 * @Author bug菌
 * @Date 2023-09-19 0:05
 */
public class BuilderPattern {

    public static void main(String[] args) {

        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        Product product = builder.getResult();

        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
        System.out.println(product.getPartC());

        System.out.println(product.toString());
    }

}
