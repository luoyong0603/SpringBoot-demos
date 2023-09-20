package com.example.javaDesignPattern.observer;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 14:52
 */
public class OrderObserver implements Observer {
    private int state;

    @Override
    public void update(Subject subject) {
        state = ((OrderSubject) subject).getState();
        System.out.println("订单状态发生变化，新状态为：" + state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}