package com.example.javaDesignPattern.facade;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 16:00
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public void method() {
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
