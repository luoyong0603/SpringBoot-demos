package com.example.javaDesignPattern.strategy;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:32
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}