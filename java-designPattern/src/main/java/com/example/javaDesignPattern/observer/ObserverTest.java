package com.example.javaDesignPattern.observer;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/20 14:52
 */
public class ObserverTest {
    public static void main(String[] args) {
        OrderSubject orderSubject = new OrderSubject();
        OrderObserver orderObserver1 = new OrderObserver();
        OrderObserver orderObserver2 = new OrderObserver();
        orderSubject.attach(orderObserver1);
        orderSubject.attach(orderObserver2);

        orderSubject.setState(1);
        orderSubject.detach(orderObserver1);
        orderSubject.setState(0);
    }
}
