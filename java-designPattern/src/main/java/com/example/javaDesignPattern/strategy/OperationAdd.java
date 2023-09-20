package com.example.javaDesignPattern.strategy;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 15:32
 */
public class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
