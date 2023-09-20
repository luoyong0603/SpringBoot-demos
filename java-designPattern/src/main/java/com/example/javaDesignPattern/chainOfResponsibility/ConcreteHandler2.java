package com.example.javaDesignPattern.chainOfResponsibility;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 17:30
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("request2")) {
            System.out.println("ConcreteHandler2 handles request: " + request);
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
