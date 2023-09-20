package com.example.javaDesignPattern.chainOfResponsibility;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 17:29
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("request1")) {
            System.out.println("ConcreteHandler1 handles request: " + request);
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
