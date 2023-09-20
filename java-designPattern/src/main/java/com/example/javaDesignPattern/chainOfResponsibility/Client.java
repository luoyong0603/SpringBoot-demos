package com.example.javaDesignPattern.chainOfResponsibility;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 17:32
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);

        handler1.handleRequest("request1");
        handler1.handleRequest("request2");
    }
}