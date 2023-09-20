package com.example.javaDesignPattern.proxy;

/**
 * @author bug菌
 * @version 1.0
 * @date 2023/9/19 16:32
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // 代理对象和被代理对象都会调用display()方法
        image.display();

        ImageProxy imageProxy = new ProxyImage("test.jpg");

        // 只有代理对象才有showImageInfo()方法
        imageProxy.showImageInfo();
    }
}
