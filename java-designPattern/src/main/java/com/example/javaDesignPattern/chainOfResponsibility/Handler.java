package com.example.javaDesignPattern.chainOfResponsibility;

/**
 * 抽象处理者接口
 *
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 17:29
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}
