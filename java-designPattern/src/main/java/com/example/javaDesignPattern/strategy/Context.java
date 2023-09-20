package com.example.javaDesignPattern.strategy;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:32
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
